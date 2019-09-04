package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQIssuedDeviceUpdateOutputModel
 */
public class BQIssuedDeviceUpdateOutputModel   {
  private BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecord issuedDeviceInstanceRecord = null;

  private String issuedDeviceUpdateActionTaskReference = null;

  private Object issuedDeviceUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return issuedDeviceUpdateActionTaskReference
  **/

  public String getIssuedDeviceUpdateActionTaskReference() {
    return issuedDeviceUpdateActionTaskReference;
  }

  public void setIssuedDeviceUpdateActionTaskReference(String issuedDeviceUpdateActionTaskReference) {
    this.issuedDeviceUpdateActionTaskReference = issuedDeviceUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return issuedDeviceUpdateActionTaskRecord
  **/

  public Object getIssuedDeviceUpdateActionTaskRecord() {
    return issuedDeviceUpdateActionTaskRecord;
  }

  public void setIssuedDeviceUpdateActionTaskRecord(Object issuedDeviceUpdateActionTaskRecord) {
    this.issuedDeviceUpdateActionTaskRecord = issuedDeviceUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

