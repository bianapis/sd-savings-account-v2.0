package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDepositsAndWithdrawalsUpdateInputModelDepositsWithdrawalsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDepositsAndWithdrawalsUpdateInputModel
 */
public class BQDepositsAndWithdrawalsUpdateInputModel   {
  private String savingsAccountFulfillmentArrangementInstanceReference = null;

  private String depositsAndWithdrawalsInstanceReference = null;

  private BQDepositsAndWithdrawalsUpdateInputModelDepositsWithdrawalsInstanceRecord depositsWithdrawalsInstanceRecord = null;

  private Object depositsAndWithdrawalsUpdateActionTaskRecord = null;

  private String depositsAndWithdrawalsUpdateActionRequest = null;


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

  public BQDepositsAndWithdrawalsUpdateInputModelDepositsWithdrawalsInstanceRecord getDepositsWithdrawalsInstanceRecord() {
    return depositsWithdrawalsInstanceRecord;
  }

  public void setDepositsWithdrawalsInstanceRecord(BQDepositsAndWithdrawalsUpdateInputModelDepositsWithdrawalsInstanceRecord depositsWithdrawalsInstanceRecord) {
    this.depositsWithdrawalsInstanceRecord = depositsWithdrawalsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return depositsAndWithdrawalsUpdateActionTaskRecord
  **/

  public Object getDepositsAndWithdrawalsUpdateActionTaskRecord() {
    return depositsAndWithdrawalsUpdateActionTaskRecord;
  }

  public void setDepositsAndWithdrawalsUpdateActionTaskRecord(Object depositsAndWithdrawalsUpdateActionTaskRecord) {
    this.depositsAndWithdrawalsUpdateActionTaskRecord = depositsAndWithdrawalsUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return depositsAndWithdrawalsUpdateActionRequest
  **/

  public String getDepositsAndWithdrawalsUpdateActionRequest() {
    return depositsAndWithdrawalsUpdateActionRequest;
  }

  public void setDepositsAndWithdrawalsUpdateActionRequest(String depositsAndWithdrawalsUpdateActionRequest) {
    this.depositsAndWithdrawalsUpdateActionRequest = depositsAndWithdrawalsUpdateActionRequest;
  }


}

