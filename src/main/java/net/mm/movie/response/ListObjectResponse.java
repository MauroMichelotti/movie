package net.mm.movie.response;

import java.util.List;

/**
 * 
 * @author mauro
 *
 * @param <T>
 */
public class ListObjectResponse<T> extends SuccessResponse {

  private List<T> objects;

  public ListObjectResponse() {
    super();
  }

  public List<T> getObjects() {
    return objects;
  }

  public void setObjects(List<T> objects) {
    this.objects = objects;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("ObjectListResponse [").append(super.toString());
    builder.append(", objects=").append(objects);
    builder.append("]");
    return builder.toString();
  }

}
