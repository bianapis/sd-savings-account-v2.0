package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAccountLienInitiateOutputModelAccountLienInstanceRecord;
import org.bian.dto.BQAccountLienInitiateOutputModelSavingsAccountFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAccountLienInitiateOutputModel
 */
public class BQAccountLienInitiateOutputModel   {
  private BQAccountLienInitiateOutputModelSavingsAccountFulfillmentArrangementInstanceRecord savingsAccountFulfillmentArrangementInstanceRecord = null;

  private String accountLienInstanceReference = null;

  private String accountLienInitiateActionReference = null;

  private Object accountLienInitiateActionRecord = null;

  private String accountLienInstanceStatus = null;

  private BQAccountLienInitiateOutputModelAccountLienInstanceRecord accountLienInstanceRecord = null;


  /**
   * Get savingsAccountFulfillmentArrangementInstanceRecord
   * @return savingsAccountFulfillmentArrangementInstanceRecord
  **/

  public BQAccountLienInitiateOutputModelSavingsAccountFulfillmentArrangementInstanceRecord getSavingsAccountFulfillmentArrangementInstanceRecord() {
    return savingsAccountFulfillmentArrangementInstanceRecord;
  }

  public void setSavingsAccountFulfillmentArrangementInstanceRecord(BQAccountLienInitiateOutputModelSavingsAccountFulfillmentArrangementInstanceRecord savingsAccountFulfillmentArrangementInstanceRecord) {
    this.savingsAccountFulfillmentArrangementInstanceRecord = savingsAccountFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Account Lien instance 
   * @return accountLienInstanceReference
  **/

  public String getAccountLienInstanceReference() {
    return accountLienInstanceReference;
  }

  public void setAccountLienInstanceReference(String accountLienInstanceReference) {
    this.accountLienInstanceReference = accountLienInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return accountLienInitiateActionReference
  **/

  public String getAccountLienInitiateActionReference() {
    return accountLienInitiateActionReference;
  }

  public void setAccountLienInitiateActionReference(String accountLienInitiateActionReference) {
    this.accountLienInitiateActionReference = accountLienInitiateActionReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Account Lien instance (e.g. initialised, pending, active) 
   * @return accountLienInstanceStatus
  **/

  public String getAccountLienInstanceStatus() {
    return accountLienInstanceStatus;
  }

  public void setAccountLienInstanceStatus(String accountLienInstanceStatus) {
    this.accountLienInstanceStatus = accountLienInstanceStatus;
  }


  /**
   * Get accountLienInstanceRecord
   * @return accountLienInstanceRecord
  **/

  public BQAccountLienInitiateOutputModelAccountLienInstanceRecord getAccountLienInstanceRecord() {
    return accountLienInstanceRecord;
  }

  public void setAccountLienInstanceRecord(BQAccountLienInitiateOutputModelAccountLienInstanceRecord accountLienInstanceRecord) {
    this.accountLienInstanceRecord = accountLienInstanceRecord;
  }


}

