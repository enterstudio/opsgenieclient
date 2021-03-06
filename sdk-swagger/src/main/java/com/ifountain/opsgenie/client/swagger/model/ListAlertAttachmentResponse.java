/*
 * OpsGenie REST API
 * OpsGenie API Description
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ifountain.opsgenie.client.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.ObjectUtils;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * ListAlertAttachmentResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-13T16:12:27.505+03:00")
public class ListAlertAttachmentResponse {
    @JsonProperty("requestId")
    private String requestId = null;

    @JsonProperty("took")
    private Float took = 0.0f;

    @JsonProperty("data")
    private List<AlertAttachmentMeta> data = new ArrayList<AlertAttachmentMeta>();

    public ListAlertAttachmentResponse requestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get requestId
     *
     * @return requestId
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "")
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListAlertAttachmentResponse took(Float took) {
        this.took = took;
        return this;
    }

    /**
     * Get took
     *
     * @return took
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "")
    public Float getTook() {
        return took;
    }

    public void setTook(Float took) {
        this.took = took;
    }

    public ListAlertAttachmentResponse data(List<AlertAttachmentMeta> data) {
        this.data = data;
        return this;
    }

    public ListAlertAttachmentResponse addDataItem(AlertAttachmentMeta dataItem) {
        this.data.add(dataItem);
        return this;
    }

    /**
     * Get data
     *
     * @return data
     **/
    @ApiModelProperty(value = "")
    public List<AlertAttachmentMeta> getData() {
        return data;
    }

    public void setData(List<AlertAttachmentMeta> data) {
        this.data = data;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAlertAttachmentResponse listAlertAttachmentResponse = (ListAlertAttachmentResponse) o;
        return ObjectUtils.equals(this.requestId, listAlertAttachmentResponse.requestId) &&
                ObjectUtils.equals(this.took, listAlertAttachmentResponse.took) &&
                ObjectUtils.equals(this.data, listAlertAttachmentResponse.data);
    }

    @Override
    public int hashCode() {
        return ObjectUtils.hashCodeMulti(requestId, took, data);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlertAttachmentResponse {\n");

        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    took: ").append(toIndentedString(took)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

