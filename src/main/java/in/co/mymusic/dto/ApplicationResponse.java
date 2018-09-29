package in.co.mymusic.dto;

public class ApplicationResponse {

  private Object payload;
  private String message;
  private int status;

  public Object getPayload() {
    return payload;
  }

  public ApplicationResponse setPayload(Object payload) {
    this.payload = payload;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public ApplicationResponse setMessage(String message) {
    this.message = message;
    return this;
  }

  public int getStatus() {
    return status;
  }

  public ApplicationResponse setStatus(int status) {
    this.status = status;
    return this;
  }
}
