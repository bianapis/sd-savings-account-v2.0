package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQIssuedDeviceInitiateOutputModelIssuedDeviceInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQIssuedDeviceRequestOutputModel
 */
public class BQIssuedDeviceRequestOutputModel   {
  private BQIssuedDeviceInitiateOutputModelIssuedDeviceInstanceRecord issuedDeviceInstanceRecord = null;

  private String issuedDeviceRequestActionTaskReference = null;

  private Object issuedDeviceRequestActionTaskRecord = null;

  private String issuedDeviceRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get issuedDeviceInstanceRecord
   * @return issuedDeviceInstanceRecord
  **/

  public BQIssuedDeviceInitiateOutputModelIssuedDeviceInstanceRecord getIssuedDeviceInstanceRecord() {
    return issuedDeviceInstanceRecord;
  }

  public void setIssuedDeviceInstanceRecord(BQIssuedDeviceInitiateOutputModelIssuedDeviceInstanceRecord issuedDeviceInstanceRecord) {
    this.issuedDeviceInstanceRecord = issuedDeviceInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Issued Device instance request service call 
   * @return issuedDeviceRequestActionTaskReference
  **/

  public String getIssuedDeviceRequestActionTaskReference() {
    return issuedDeviceRequestActionTaskReference;
  }

  public void setIssuedDeviceRequestActionTaskReference(String issuedDeviceRequestActionTaskReference) {
    this.issuedDeviceRequestActionTaskReference = issuedDeviceRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return issuedDeviceRequestActionTaskRecord
  **/

  public Object getIssuedDeviceRequestActionTaskRecord() {
    return issuedDeviceRequestActionTaskRecord;
  }

  public void setIssuedDeviceRequestActionTaskRecord(Object issuedDeviceRequestActionTaskRecord) {
    this.issuedDeviceRequestActionTaskRecord = issuedDeviceRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Issued Device service request record 
   * @return issuedDeviceRequestRecordReference
  **/

  public String getIssuedDeviceRequestRecordReference() {
    return issuedDeviceRequestRecordReference;
  }

  public void setIssuedDeviceRequestRecordReference(String issuedDeviceRequestRecordReference) {
    this.issuedDeviceRequestRecordReference = issuedDeviceRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

