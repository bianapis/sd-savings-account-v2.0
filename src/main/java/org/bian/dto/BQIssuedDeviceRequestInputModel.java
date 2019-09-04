package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQIssuedDeviceRequestInputModelIssuedDeviceInstanceRecord;
import org.bian.dto.BQIssuedDeviceRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQIssuedDeviceRequestInputModel
 */
public class BQIssuedDeviceRequestInputModel   {
  private String savingsAccountFulfillmentArrangementInstanceReference = null;

  private String issuedDeviceInstanceReference = null;

  private BQIssuedDeviceRequestInputModelIssuedDeviceInstanceRecord issuedDeviceInstanceRecord = null;

  private Object issuedDeviceRequestActionTaskRecord = null;

  private BQIssuedDeviceRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Savings Account Fulfillment Arrangement instance 
   * @return savingsAccountFulfillmentArrangementInstanceReference
  **/

  public String getSavingsAccountFulfillmentArrangementInstanceReference() {
    return savingsAccountFulfillmentArrangementInstanceReference;
  }

  public void setSavingsAccountFulfillmentArrangementInstanceReference(String savingsAccountFulfillmentArrangementInstanceReference) {
    this.savingsAccountFulfillmentArrangementInstanceReference = savingsAccountFulfillmentArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Issued Device instance 
   * @return issuedDeviceInstanceReference
  **/

  public String getIssuedDeviceInstanceReference() {
    return issuedDeviceInstanceReference;
  }

  public void setIssuedDeviceInstanceReference(String issuedDeviceInstanceReference) {
    this.issuedDeviceInstanceReference = issuedDeviceInstanceReference;
  }


  /**
   * Get issuedDeviceInstanceRecord
   * @return issuedDeviceInstanceRecord
  **/

  public BQIssuedDeviceRequestInputModelIssuedDeviceInstanceRecord getIssuedDeviceInstanceRecord() {
    return issuedDeviceInstanceRecord;
  }

  public void setIssuedDeviceInstanceRecord(BQIssuedDeviceRequestInputModelIssuedDeviceInstanceRecord issuedDeviceInstanceRecord) {
    this.issuedDeviceInstanceRecord = issuedDeviceInstanceRecord;
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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public BQIssuedDeviceRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(BQIssuedDeviceRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

