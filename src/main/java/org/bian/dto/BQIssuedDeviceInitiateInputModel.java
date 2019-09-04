package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecord;
import org.bian.dto.BQIssuedDeviceInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQIssuedDeviceInitiateInputModel
 */
public class BQIssuedDeviceInitiateInputModel   {
  private BQIssuedDeviceInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecord savingsAccountFulfillmentArrangementInstanceRecord = null;

  private String savingsAccountFulfillmentArrangementInstanceReference = null;

  private Object issuedDeviceInitiateActionRecord = null;

  private BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecord issuedDeviceInstanceRecord = null;


  /**
   * Get savingsAccountFulfillmentArrangementInstanceRecord
   * @return savingsAccountFulfillmentArrangementInstanceRecord
  **/

  public BQIssuedDeviceInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecord getSavingsAccountFulfillmentArrangementInstanceRecord() {
    return savingsAccountFulfillmentArrangementInstanceRecord;
  }

  public void setSavingsAccountFulfillmentArrangementInstanceRecord(BQIssuedDeviceInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecord savingsAccountFulfillmentArrangementInstanceRecord) {
    this.savingsAccountFulfillmentArrangementInstanceRecord = savingsAccountFulfillmentArrangementInstanceRecord;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return issuedDeviceInitiateActionRecord
  **/

  public Object getIssuedDeviceInitiateActionRecord() {
    return issuedDeviceInitiateActionRecord;
  }

  public void setIssuedDeviceInitiateActionRecord(Object issuedDeviceInitiateActionRecord) {
    this.issuedDeviceInitiateActionRecord = issuedDeviceInitiateActionRecord;
  }


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


}

