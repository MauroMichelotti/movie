package net.mm.movie.response;

import net.mm.movie.controller.beans.Response;

public class SuccessResponse extends Response {

  public SuccessResponse() {
    super.setResult(Boolean.TRUE);
  }

}
