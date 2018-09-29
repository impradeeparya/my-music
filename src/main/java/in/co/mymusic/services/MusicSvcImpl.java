package in.co.mymusic.services;

import static in.co.mymusic.utils.Messages.FOUND_MSG;
import static in.co.mymusic.utils.Messages.NOT_FOUND_MSG;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import in.co.mymusic.dto.ApplicationResponse;
import in.co.mymusic.dto.CoverArtResponse;
import in.co.mymusic.dto.MusicBrainzReleaseGroup;
import in.co.mymusic.dto.MusicBrainzResponse;
import in.co.mymusic.proxies.CoverArtProxy;
import in.co.mymusic.proxies.MusicBrainzProxy;
import in.co.mymusic.utils.DefaultCreator;
import in.co.mymusic.utils.ResponseParser;

@Service
public class MusicSvcImpl implements MusicSvc {

  @Autowired
  private MusicBrainzProxy musicBrainzProxy;

  @Autowired
  private CoverArtProxy coverArtProxy;

  @Override
  public ApplicationResponse musicByMbid(String mbid) {
    MusicBrainzResponse musicBrainzResponse = musicBrainzProxy.fetchByMbid(mbid);

    ApplicationResponse applicationResponse;
    if (musicBrainzResponse == null) {
      applicationResponse =
          DefaultCreator.applicationResponse.apply(NOT_FOUND_MSG, HttpStatus.NOT_FOUND.value());
    } else {
      applicationResponse =
          DefaultCreator.applicationResponse.apply(FOUND_MSG, HttpStatus.OK.value());
      List<CoverArtResponse> coverArtResponses = new ArrayList<>();
      musicBrainzResponse.getReleaseGroups().forEach(releaseGroup -> {

      });

      for (MusicBrainzReleaseGroup group : musicBrainzResponse.getReleaseGroups()) {
        CoverArtResponse coverArtResponse = coverArtProxy.fetchByMbid(group.getId());
        if (coverArtResponse != null) {
          coverArtResponse.setTitle(group.getTitle());
          coverArtResponses.add(coverArtResponse);
        }
        if (coverArtResponses.size() > 5) {
          break;
        }
      }
      applicationResponse
          .setPayload(ResponseParser.populateMusicInfo(musicBrainzResponse, coverArtResponses));
    }
    return applicationResponse;
  }

}
