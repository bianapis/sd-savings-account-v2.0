package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAccountSweepInitiateOutputModelAccountSweepInstanceRecord;
import org.bian.dto.BQServiceFeesInitiateOutputModelSavingsAccountFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAccountSweepInitiateOutputModel
 */
public class BQAccountSweepInitiateOutputModel   {
  private BQServiceFeesInitiateOutputModelSavingsAccountFulfillmentArrangementInstanceRecord savingsAccountFulfillmentArrangementInstanceRecord = null;

  private String accountSweepInstanceReference = null;

  private String accountSweepInitiateActionReference = null;

  private Object accountSweepInitiateActionRecord = null;

  private String accountSweepInstanceStatus = null;

  private BQAccountSweepInitiateOutputModelAccountSweepInstanceRecord accountSweepInstanceRecord = null;


  /**
   * Get savingsAccountFulfillmentArrangementInstanceRecord
   * @return savingsAccountFulfillmentArrangementInstanceRecord
  **/

  public BQServiceFeesInitiateOutputModelSavingsAccountFulfillmentArrangementInstanceRecord getSavingsAccountFulfillmentArrangementInstanceRecord() {
    return savingsAccountFulfillmentArrangementInstanceRecord;
  }

  public void setSavingsAccountFulfillmentArrangementInstanceRecord(BQServiceFeesInitiateOutputModelSavingsAccountFulfillmentArrangementInstanceRecord savingsAccountFulfillmentArrangementInstanceRecord) {
    this.savingsAccountFulfillmentArrangementInstanceRecord = savingsAccountFulfillmentArrangementInstanceRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return accountSweepInitiateActionReference
  **/

  public String getAccountSweepInitiateActionReference() {
    return accountSweepInitiateActionReference;
  }

  public void setAccountSweepInitiateActionReference(String accountSweepInitiateActionReference) {
    this.accountSweepInitiateActionReference = accountSweepInitiateActionReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Account Sweep instance (e.g. initialised, pending, active) 
   * @return accountSweepInstanceStatus
  **/

  public String getAccountSweepInstanceStatus() {
    return accountSweepInstanceStatus;
  }

  public void setAccountSweepInstanceStatus(String accountSweepInstanceStatus) {
    this.accountSweepInstanceStatus = accountSweepInstanceStatus;
  }


  /**
   * Get accountSweepInstanceRecord
   * @return accountSweepInstanceRecord
  **/

  public BQAccountSweepInitiateOutputModelAccountSweepInstanceRecord getAccountSweepInstanceRecord() {
    return accountSweepInstanceRecord;
  }

  public void setAccountSweepInstanceRecord(BQAccountSweepInitiateOutputModelAccountSweepInstanceRecord accountSweepInstanceRecord) {
    this.accountSweepInstanceRecord = accountSweepInstanceRecord;
  }


}

