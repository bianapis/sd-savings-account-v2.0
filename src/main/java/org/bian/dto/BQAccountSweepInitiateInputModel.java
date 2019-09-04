package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAccountSweepInitiateInputModelAccountSweepInstanceRecord;
import org.bian.dto.BQAccountSweepInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAccountSweepInitiateInputModel
 */
public class BQAccountSweepInitiateInputModel   {
  private BQAccountSweepInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecord savingsAccountFulfillmentArrangementInstanceRecord = null;

  private String savingsAccountFulfillmentArrangementInstanceReference = null;

  private Object accountSweepInitiateActionRecord = null;

  private BQAccountSweepInitiateInputModelAccountSweepInstanceRecord accountSweepInstanceRecord = null;


  /**
   * Get savingsAccountFulfillmentArrangementInstanceRecord
   * @return savingsAccountFulfillmentArrangementInstanceRecord
  **/

  public BQAccountSweepInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecord getSavingsAccountFulfillmentArrangementInstanceRecord() {
    return savingsAccountFulfillmentArrangementInstanceRecord;
  }

  public void setSavingsAccountFulfillmentArrangementInstanceRecord(BQAccountSweepInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecord savingsAccountFulfillmentArrangementInstanceRecord) {
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
   * @return accountSweepInitiateActionRecord
  **/

  public Object getAccountSweepInitiateActionRecord() {
    return accountSweepInitiateActionRecord;
  }

  public void setAccountSweepInitiateActionRecord(Object accountSweepInitiateActionRecord) {
    this.accountSweepInitiateActionRecord = accountSweepInitiateActionRecord;
  }


  /**
   * Get accountSweepInstanceRecord
   * @return accountSweepInstanceRecord
  **/

  public BQAccountSweepInitiateInputModelAccountSweepInstanceRecord getAccountSweepInstanceRecord() {
    return accountSweepInstanceRecord;
  }

  public void setAccountSweepInstanceRecord(BQAccountSweepInitiateInputModelAccountSweepInstanceRecord accountSweepInstanceRecord) {
    this.accountSweepInstanceRecord = accountSweepInstanceRecord;
  }


}

