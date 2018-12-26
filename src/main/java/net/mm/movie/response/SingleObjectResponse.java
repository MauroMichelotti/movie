package net.mm.movie.response;

public class SingleObjectResponse<T> extends SuccessResponse {

  private T object;

  public SingleObjectResponse() {
    super();
  }

  public SingleObjectResponse(T object) {
    super();
    this.object = object;
  }

  public T getObject() {
    return object;
  }

  public void setObject(T object) {
    this.object = object;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("ObjectListResponse [").append(super.toString());
    builder.append(", object=").append(object);
    builder.append("]");
    return builder.toString();
  }

}
