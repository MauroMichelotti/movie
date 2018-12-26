package net.mm.movie.controller.beans;

import java.util.Objects;

public class Request<T> {

  private T object;

  public Request() {
  }

  public T getObject() {
    return object;
  }

  public void setObject(T object) {
    this.object = object;
  }

  public boolean check() {
    return Objects.nonNull(this.object);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Request [object=").append(object == null ? "null" : object.toString());
    builder.append("]");
    return builder.toString();
  }

}
