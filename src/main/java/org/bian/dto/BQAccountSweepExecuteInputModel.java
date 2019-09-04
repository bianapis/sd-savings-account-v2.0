package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAccountSweepExecuteInputModelAccountSweepInstanceRecord;
import org.bian.dto.BQServiceFeesExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * BQAccountSweepExecuteInputModel
 */
public class BQAccountSweepExecuteInputModel   {
  private String savingsAccountFulfillmentArrangementInstanceReference = null;

  private String accountSweepInstanceReference = null;

  private BQAccountSweepExecuteInputModelAccountSweepInstanceRecord accountSweepInstanceRecord = null;

  private Object accountSweepExecuteActionTaskRecord = null;

  private BQServiceFeesExecuteInputModelExecuteRecordType executeRecordType = null;


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

  public BQAccountSweepExecuteInputModelAccountSweepInstanceRecord getAccountSweepInstanceRecord() {
    return accountSweepInstanceRecord;
  }

  public void setAccountSweepInstanceRecord(BQAccountSweepExecuteInputModelAccountSweepInstanceRecord accountSweepInstanceRecord) {
    this.accountSweepInstanceRecord = accountSweepInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return accountSweepExecuteActionTaskRecord
  **/

  public Object getAccountSweepExecuteActionTaskRecord() {
    return accountSweepExecuteActionTaskRecord;
  }

  public void setAccountSweepExecuteActionTaskRecord(Object accountSweepExecuteActionTaskRecord) {
    this.accountSweepExecuteActionTaskRecord = accountSweepExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public BQServiceFeesExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(BQServiceFeesExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

