package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAccountSweepUpdateInputModelAccountSweepInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAccountSweepUpdateInputModel
 */
public class BQAccountSweepUpdateInputModel   {
  private String savingsAccountFulfillmentArrangementInstanceReference = null;

  private String accountSweepInstanceReference = null;

  private BQAccountSweepUpdateInputModelAccountSweepInstanceRecord accountSweepInstanceRecord = null;

  private Object accountSweepUpdateActionTaskRecord = null;

  private String accountSweepUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Account Sweep instance 
   * @return accountSweepInstanceReference
  **/

  public String getAccountSweepInstanceReference() {
    return accountSweepInstanceReference;
  }

  public void setAccountSweepInstanceReference(String accountSweepInstanceReference) {
    this.accountSweepInstanceReference = accountSweepInstanceReference;
  }


  /**
   * Get accountSweepInstanceRecord
   * @return accountSweepInstanceRecord
  **/

  public BQAccountSweepUpdateInputModelAccountSweepInstanceRecord getAccountSweepInstanceRecord() {
    return accountSweepInstanceRecord;
  }

  public void setAccountSweepInstanceRecord(BQAccountSweepUpdateInputModelAccountSweepInstanceRecord accountSweepInstanceRecord) {
    this.accountSweepInstanceRecord = accountSweepInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return accountSweepUpdateActionTaskRecord
  **/

  public Object getAccountSweepUpdateActionTaskRecord() {
    return accountSweepUpdateActionTaskRecord;
  }

  public void setAccountSweepUpdateActionTaskRecord(Object accountSweepUpdateActionTaskRecord) {
    this.accountSweepUpdateActionTaskRecord = accountSweepUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return accountSweepUpdateActionRequest
  **/

  public String getAccountSweepUpdateActionRequest() {
    return accountSweepUpdateActionRequest;
  }

  public void setAccountSweepUpdateActionRequest(String accountSweepUpdateActionRequest) {
    this.accountSweepUpdateActionRequest = accountSweepUpdateActionRequest;
  }


}

