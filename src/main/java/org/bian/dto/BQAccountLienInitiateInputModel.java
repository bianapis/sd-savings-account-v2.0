package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAccountLienInitiateInputModelAccountLienInstanceRecord;
import org.bian.dto.BQAccountLienInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAccountLienInitiateInputModel
 */
public class BQAccountLienInitiateInputModel   {
  private BQAccountLienInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecord savingsAccountFulfillmentArrangementInstanceRecord = null;

  private String savingsAccountFulfillmentArrangementInstanceReference = null;

  private Object accountLienInitiateActionRecord = null;

  private BQAccountLienInitiateInputModelAccountLienInstanceRecord accountLienInstanceRecord = null;


  /**
   * Get savingsAccountFulfillmentArrangementInstanceRecord
   * @return savingsAccountFulfillmentArrangementInstanceRecord
  **/

  public BQAccountLienInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecord getSavingsAccountFulfillmentArrangementInstanceRecord() {
    return savingsAccountFulfillmentArrangementInstanceRecord;
  }

  public void setSavingsAccountFulfillmentArrangementInstanceRecord(BQAccountLienInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecord savingsAccountFulfillmentArrangementInstanceRecord) {
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
   * @return accountLienInitiateActionRecord
  **/

  public Object getAccountLienInitiateActionRecord() {
    return accountLienInitiateActionRecord;
  }

  public void setAccountLienInitiateActionRecord(Object accountLienInitiateActionRecord) {
    this.accountLienInitiateActionRecord = accountLienInitiateActionRecord;
  }


  /**
   * Get accountLienInstanceRecord
   * @return accountLienInstanceRecord
  **/

  public BQAccountLienInitiateInputModelAccountLienInstanceRecord getAccountLienInstanceRecord() {
    return accountLienInstanceRecord;
  }

  public void setAccountLienInstanceRecord(BQAccountLienInitiateInputModelAccountLienInstanceRecord accountLienInstanceRecord) {
    this.accountLienInstanceRecord = accountLienInstanceRecord;
  }


}

