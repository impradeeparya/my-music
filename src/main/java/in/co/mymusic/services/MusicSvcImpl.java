package in.co.mymusic.services;

import static in.co.mymusic.utils.Messages.FOUND_MSG;
import static in.co.mymusic.utils.Messages.NOT_FOUND_MSG;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import in.co.mymusic.dto.ApplicationResponse;
import in.co.mymusic.dto.MusicBrainzResponse;
import in.co.mymusic.proxies.MusicBrainzProxy;
import in.co.mymusic.utils.DefaultCreator;

@Service
public class MusicSvcImpl implements MusicSvc {

  @Autowired
  private MusicBrainzProxy musicBrainzProxy;

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
      applicationResponse.setPayload(musicBrainzResponse);
    }
    return applicationResponse;
  }
}
