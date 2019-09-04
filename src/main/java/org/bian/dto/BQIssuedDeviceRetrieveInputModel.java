package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQIssuedDeviceRetrieveInputModelIssuedDeviceInstanceAnalysis;
import org.bian.dto.BQIssuedDeviceRetrieveInputModelIssuedDeviceInstanceReport;

import javax.validation.Valid;
  
/**
 * BQIssuedDeviceRetrieveInputModel
 */
public class BQIssuedDeviceRetrieveInputModel   {
  private Object issuedDeviceRetrieveActionTaskRecord = null;

  private String issuedDeviceRetrieveActionRequest = null;

  private BQIssuedDeviceRetrieveInputModelIssuedDeviceInstanceReport issuedDeviceInstanceReport = null;

  private BQIssuedDeviceRetrieveInputModelIssuedDeviceInstanceAnalysis issuedDeviceInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return issuedDeviceRetrieveActionTaskRecord
  **/

  public Object getIssuedDeviceRetrieveActionTaskRecord() {
    return issuedDeviceRetrieveActionTaskRecord;
  }

  public void setIssuedDeviceRetrieveActionTaskRecord(Object issuedDeviceRetrieveActionTaskRecord) {
    this.issuedDeviceRetrieveActionTaskRecord = issuedDeviceRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return issuedDeviceRetrieveActionRequest
  **/

  public String getIssuedDeviceRetrieveActionRequest() {
    return issuedDeviceRetrieveActionRequest;
  }

  public void setIssuedDeviceRetrieveActionRequest(String issuedDeviceRetrieveActionRequest) {
    this.issuedDeviceRetrieveActionRequest = issuedDeviceRetrieveActionRequest;
  }


  /**
   * Get issuedDeviceInstanceReport
   * @return issuedDeviceInstanceReport
  **/

  public BQIssuedDeviceRetrieveInputModelIssuedDeviceInstanceReport getIssuedDeviceInstanceReport() {
    return issuedDeviceInstanceReport;
  }

  public void setIssuedDeviceInstanceReport(BQIssuedDeviceRetrieveInputModelIssuedDeviceInstanceReport issuedDeviceInstanceReport) {
    this.issuedDeviceInstanceReport = issuedDeviceInstanceReport;
  }


  /**
   * Get issuedDeviceInstanceAnalysis
   * @return issuedDeviceInstanceAnalysis
  **/

  public BQIssuedDeviceRetrieveInputModelIssuedDeviceInstanceAnalysis getIssuedDeviceInstanceAnalysis() {
    return issuedDeviceInstanceAnalysis;
  }

  public void setIssuedDeviceInstanceAnalysis(BQIssuedDeviceRetrieveInputModelIssuedDeviceInstanceAnalysis issuedDeviceInstanceAnalysis) {
    this.issuedDeviceInstanceAnalysis = issuedDeviceInstanceAnalysis;
  }


}

