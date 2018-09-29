package in.co.mymusic.services;

import in.co.mymusic.dto.ApplicationResponse;

public interface MusicSvc {

  ApplicationResponse musicByMbid(String mbid);
}
