package in.co.mymusic.utils;

import java.util.function.BiFunction;

import in.co.mymusic.dto.ApplicationResponse;

public class DefaultCreator {

  public static BiFunction<String, Integer, ApplicationResponse> applicationResponse =
      (msg, status) -> new ApplicationResponse().setMessage(msg).setStatus(status);

}
