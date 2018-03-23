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
import io.kubernetes.client.models.V1Preconditions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DeleteOptions may be provided when deleting an API object.
 */
@ApiModel(description = "DeleteOptions may be provided when deleting an API object.")

public class V1DeleteOptions {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("gracePeriodSeconds")
  private Long gracePeriodSeconds = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("orphanDependents")
  private Boolean orphanDependents = null;

  @SerializedName("preconditions")
  private V1Preconditions preconditions = null;

  @SerializedName("propagationPolicy")
  private String propagationPolicy = null;

  public V1DeleteOptions apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
   * @return apiVersion
  **/
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public V1DeleteOptions gracePeriodSeconds(Long gracePeriodSeconds) {
    this.gracePeriodSeconds = gracePeriodSeconds;
    return this;
  }

   /**
   * The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately.
   * @return gracePeriodSeconds
  **/
  @ApiModelProperty(value = "The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately.")
  public Long getGracePeriodSeconds() {
    return gracePeriodSeconds;
  }

  public void setGracePeriodSeconds(Long gracePeriodSeconds) {
    this.gracePeriodSeconds = gracePeriodSeconds;
  }

  public V1DeleteOptions kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
   * @return kind
  **/
  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1DeleteOptions orphanDependents(Boolean orphanDependents) {
    this.orphanDependents = orphanDependents;
    return this;
  }

   /**
   * Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both.
   * @return orphanDependents
  **/
  @ApiModelProperty(value = "Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \"orphan\" finalizer will be added to/removed from the object's finalizers list. Either this field or PropagationPolicy may be set, but not both.")
  public Boolean isOrphanDependents() {
    return orphanDependents;
  }

  public void setOrphanDependents(Boolean orphanDependents) {
    this.orphanDependents = orphanDependents;
  }

  public V1DeleteOptions preconditions(V1Preconditions preconditions) {
    this.preconditions = preconditions;
    return this;
  }

   /**
   * Must be fulfilled before a deletion is carried out. If not possible, a 409 Conflict status will be returned.
   * @return preconditions
  **/
  @ApiModelProperty(value = "Must be fulfilled before a deletion is carried out. If not possible, a 409 Conflict status will be returned.")
  public V1Preconditions getPreconditions() {
    return preconditions;
  }

  public void setPreconditions(V1Preconditions preconditions) {
    this.preconditions = preconditions;
  }

  public V1DeleteOptions propagationPolicy(String propagationPolicy) {
    this.propagationPolicy = propagationPolicy;
    return this;
  }

   /**
   * Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy.
   * @return propagationPolicy
  **/
  @ApiModelProperty(value = "Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy.")
  public String getPropagationPolicy() {
    return propagationPolicy;
  }

  public void setPropagationPolicy(String propagationPolicy) {
    this.propagationPolicy = propagationPolicy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1DeleteOptions v1DeleteOptions = (V1DeleteOptions) o;
    return Objects.equals(this.apiVersion, v1DeleteOptions.apiVersion) &&
        Objects.equals(this.gracePeriodSeconds, v1DeleteOptions.gracePeriodSeconds) &&
        Objects.equals(this.kind, v1DeleteOptions.kind) &&
        Objects.equals(this.orphanDependents, v1DeleteOptions.orphanDependents) &&
        Objects.equals(this.preconditions, v1DeleteOptions.preconditions) &&
        Objects.equals(this.propagationPolicy, v1DeleteOptions.propagationPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, gracePeriodSeconds, kind, orphanDependents, preconditions, propagationPolicy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1DeleteOptions {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    gracePeriodSeconds: ").append(toIndentedString(gracePeriodSeconds)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    orphanDependents: ").append(toIndentedString(orphanDependents)).append("\n");
    sb.append("    preconditions: ").append(toIndentedString(preconditions)).append("\n");
    sb.append("    propagationPolicy: ").append(toIndentedString(propagationPolicy)).append("\n");
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

