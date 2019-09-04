package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecord;
import org.bian.dto.BQIssuedDeviceRetrieveOutputModelIssuedDeviceInstanceAnalysis;
import org.bian.dto.BQIssuedDeviceRetrieveOutputModelIssuedDeviceInstanceReport;

import javax.validation.Valid;
  
/**
 * BQIssuedDeviceRetrieveOutputModel
 */
public class BQIssuedDeviceRetrieveOutputModel   {
  private BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecord issuedDeviceInstanceRecord = null;

  private String issuedDeviceRetrieveActionTaskReference = null;

  private Object issuedDeviceRetrieveActionTaskRecord = null;

  private String issuedDeviceRetrieveActionResponse = null;

  private BQIssuedDeviceRetrieveOutputModelIssuedDeviceInstanceReport issuedDeviceInstanceReport = null;

  private BQIssuedDeviceRetrieveOutputModelIssuedDeviceInstanceAnalysis issuedDeviceInstanceAnalysis = null;


  /**
   * Get issuedDeviceInstanceRecord
   * @return issuedDeviceInstanceRecord
  **/

  public BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecord getIssuedDeviceInstanceRecord() {
    return issuedDeviceInstanceRecord;
  }

  public void setIssuedDeviceInstanceRecord(BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecord issuedDeviceInstanceRecord) {
    this.issuedDeviceInstanceRecord = issuedDeviceInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Issued Device instance retrieve service call 
   * @return issuedDeviceRetrieveActionTaskReference
  **/

  public String getIssuedDeviceRetrieveActionTaskReference() {
    return issuedDeviceRetrieveActionTaskReference;
  }

  public void setIssuedDeviceRetrieveActionTaskReference(String issuedDeviceRetrieveActionTaskReference) {
    this.issuedDeviceRetrieveActionTaskReference = issuedDeviceRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return issuedDeviceRetrieveActionResponse
  **/

  public String getIssuedDeviceRetrieveActionResponse() {
    return issuedDeviceRetrieveActionResponse;
  }

  public void setIssuedDeviceRetrieveActionResponse(String issuedDeviceRetrieveActionResponse) {
    this.issuedDeviceRetrieveActionResponse = issuedDeviceRetrieveActionResponse;
  }


  /**
   * Get issuedDeviceInstanceReport
   * @return issuedDeviceInstanceReport
  **/

  public BQIssuedDeviceRetrieveOutputModelIssuedDeviceInstanceReport getIssuedDeviceInstanceReport() {
    return issuedDeviceInstanceReport;
  }

  public void setIssuedDeviceInstanceReport(BQIssuedDeviceRetrieveOutputModelIssuedDeviceInstanceReport issuedDeviceInstanceReport) {
    this.issuedDeviceInstanceReport = issuedDeviceInstanceReport;
  }


  /**
   * Get issuedDeviceInstanceAnalysis
   * @return issuedDeviceInstanceAnalysis
  **/

  public BQIssuedDeviceRetrieveOutputModelIssuedDeviceInstanceAnalysis getIssuedDeviceInstanceAnalysis() {
    return issuedDeviceInstanceAnalysis;
  }

  public void setIssuedDeviceInstanceAnalysis(BQIssuedDeviceRetrieveOutputModelIssuedDeviceInstanceAnalysis issuedDeviceInstanceAnalysis) {
    this.issuedDeviceInstanceAnalysis = issuedDeviceInstanceAnalysis;
  }


}

