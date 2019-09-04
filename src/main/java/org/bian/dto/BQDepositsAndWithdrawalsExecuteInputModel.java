package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDepositsAndWithdrawalsExecuteInputModelDepositsWithdrawalsInstanceRecord;
import org.bian.dto.BQServiceFeesExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * BQDepositsAndWithdrawalsExecuteInputModel
 */
public class BQDepositsAndWithdrawalsExecuteInputModel   {
  private String savingsAccountFulfillmentArrangementInstanceReference = null;

  private String depositsAndWithdrawalsInstanceReference = null;

  private BQDepositsAndWithdrawalsExecuteInputModelDepositsWithdrawalsInstanceRecord depositsWithdrawalsInstanceRecord = null;

  private Object depositsAndWithdrawalsExecuteActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Deposits And Withdrawals instance 
   * @return depositsAndWithdrawalsInstanceReference
  **/

  public String getDepositsAndWithdrawalsInstanceReference() {
    return depositsAndWithdrawalsInstanceReference;
  }

  public void setDepositsAndWithdrawalsInstanceReference(String depositsAndWithdrawalsInstanceReference) {
    this.depositsAndWithdrawalsInstanceReference = depositsAndWithdrawalsInstanceReference;
  }


  /**
   * Get depositsWithdrawalsInstanceRecord
   * @return depositsWithdrawalsInstanceRecord
  **/

  public BQDepositsAndWithdrawalsExecuteInputModelDepositsWithdrawalsInstanceRecord getDepositsWithdrawalsInstanceRecord() {
    return depositsWithdrawalsInstanceRecord;
  }

  public void setDepositsWithdrawalsInstanceRecord(BQDepositsAndWithdrawalsExecuteInputModelDepositsWithdrawalsInstanceRecord depositsWithdrawalsInstanceRecord) {
    this.depositsWithdrawalsInstanceRecord = depositsWithdrawalsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return depositsAndWithdrawalsExecuteActionTaskRecord
  **/

  public Object getDepositsAndWithdrawalsExecuteActionTaskRecord() {
    return depositsAndWithdrawalsExecuteActionTaskRecord;
  }

  public void setDepositsAndWithdrawalsExecuteActionTaskRecord(Object depositsAndWithdrawalsExecuteActionTaskRecord) {
    this.depositsAndWithdrawalsExecuteActionTaskRecord = depositsAndWithdrawalsExecuteActionTaskRecord;
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

