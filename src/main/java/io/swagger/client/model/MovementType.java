/*
 * Robot Wars API
 * Eine Api für das Spiel Robot Wars
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.v3.oas.annotations.media.Schema;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * ATTACK,MOVE,ALIGN,END
 */
@JsonAdapter(MovementType.Adapter.class)
public enum MovementType {
  @SerializedName("ATTACK")
  ATTACK("ATTACK"),
  @SerializedName("MOVE")
  MOVE("MOVE"),
  @SerializedName("ALIGN")
  ALIGN("ALIGN"),
  @SerializedName("END")
  END("END");

  private String value;

  MovementType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MovementType fromValue(String input) {
    for (MovementType b : MovementType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<MovementType> {
    @Override
    public void write(final JsonWriter jsonWriter, final MovementType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public MovementType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return MovementType.fromValue((String)(value));
    }
  }
}
