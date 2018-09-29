package in.co.mymusic.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.co.mymusic.dto.ApplicationResponse;
import in.co.mymusic.services.MusicSvc;

@RestController
@RequestMapping("/music/")
public class MusicController {


  @Autowired
  private MusicSvc musicSvc;

  @GetMapping("mbid/{mbid}")
  public ResponseEntity<ApplicationResponse> musicMbidInfo(@PathVariable("mbid") String mbid) {
    return new ResponseEntity<>(musicSvc.musicByMbid(mbid), HttpStatus.OK);
  }
}
