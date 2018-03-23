/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.8.11
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.models.V1beta1JSONSchemaProps;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * JSONSchemaPropsOrStringArray represents a JSONSchemaProps or a string array.
 */
@ApiModel(description = "JSONSchemaPropsOrStringArray represents a JSONSchemaProps or a string array.")

public class V1beta1JSONSchemaPropsOrStringArray {
  @SerializedName("Property")
  private List<String> property = new ArrayList<String>();

  @SerializedName("Schema")
  private V1beta1JSONSchemaProps schema = null;

  public V1beta1JSONSchemaPropsOrStringArray property(List<String> property) {
    this.property = property;
    return this;
  }

  public V1beta1JSONSchemaPropsOrStringArray addPropertyItem(String propertyItem) {
    this.property.add(propertyItem);
    return this;
  }

   /**
   * Get property
   * @return property
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getProperty() {
    return property;
  }

  public void setProperty(List<String> property) {
    this.property = property;
  }

  public V1beta1JSONSchemaPropsOrStringArray schema(V1beta1JSONSchemaProps schema) {
    this.schema = schema;
    return this;
  }

   /**
   * Get schema
   * @return schema
  **/
  @ApiModelProperty(required = true, value = "")
  public V1beta1JSONSchemaProps getSchema() {
    return schema;
  }

  public void setSchema(V1beta1JSONSchemaProps schema) {
    this.schema = schema;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1JSONSchemaPropsOrStringArray v1beta1JSONSchemaPropsOrStringArray = (V1beta1JSONSchemaPropsOrStringArray) o;
    return Objects.equals(this.property, v1beta1JSONSchemaPropsOrStringArray.property) &&
        Objects.equals(this.schema, v1beta1JSONSchemaPropsOrStringArray.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(property, schema);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1JSONSchemaPropsOrStringArray {\n");
    
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

