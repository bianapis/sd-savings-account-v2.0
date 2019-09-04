package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAccountLienExchangeInputModelAccountLienExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQAccountLienExchangeInputModel
 */
public class BQAccountLienExchangeInputModel   {
  private String savingsAccountFulfillmentArrangementInstanceReference = null;

  private String accountLienInstanceReference = null;

  private Object accountLienExchangeActionTaskRecord = null;

  private BQAccountLienExchangeInputModelAccountLienExchangeActionRequest accountLienExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return accountLienExchangeActionTaskRecord
  **/

  public Object getAccountLienExchangeActionTaskRecord() {
    return accountLienExchangeActionTaskRecord;
  }

  public void setAccountLienExchangeActionTaskRecord(Object accountLienExchangeActionTaskRecord) {
    this.accountLienExchangeActionTaskRecord = accountLienExchangeActionTaskRecord;
  }


  /**
   * Get accountLienExchangeActionRequest
   * @return accountLienExchangeActionRequest
  **/

  public BQAccountLienExchangeInputModelAccountLienExchangeActionRequest getAccountLienExchangeActionRequest() {
    return accountLienExchangeActionRequest;
  }

  public void setAccountLienExchangeActionRequest(BQAccountLienExchangeInputModelAccountLienExchangeActionRequest accountLienExchangeActionRequest) {
    this.accountLienExchangeActionRequest = accountLienExchangeActionRequest;
  }


}

