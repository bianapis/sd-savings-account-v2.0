package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAccountLienUpdateInputModelAccountLienInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAccountLienUpdateInputModel
 */
public class BQAccountLienUpdateInputModel   {
  private String savingsAccountFulfillmentArrangementInstanceReference = null;

  private String accountLienInstanceReference = null;

  private BQAccountLienUpdateInputModelAccountLienInstanceRecord accountLienInstanceRecord = null;

  private Object accountLienUpdateActionTaskRecord = null;

  private String accountLienUpdateActionRequest = null;


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
   * Get accountLienInstanceRecord
   * @return accountLienInstanceRecord
  **/

  public BQAccountLienUpdateInputModelAccountLienInstanceRecord getAccountLienInstanceRecord() {
    return accountLienInstanceRecord;
  }

  public void setAccountLienInstanceRecord(BQAccountLienUpdateInputModelAccountLienInstanceRecord accountLienInstanceRecord) {
    this.accountLienInstanceRecord = accountLienInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return accountLienUpdateActionTaskRecord
  **/

  public Object getAccountLienUpdateActionTaskRecord() {
    return accountLienUpdateActionTaskRecord;
  }

  public void setAccountLienUpdateActionTaskRecord(Object accountLienUpdateActionTaskRecord) {
    this.accountLienUpdateActionTaskRecord = accountLienUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return accountLienUpdateActionRequest
  **/

  public String getAccountLienUpdateActionRequest() {
    return accountLienUpdateActionRequest;
  }

  public void setAccountLienUpdateActionRequest(String accountLienUpdateActionRequest) {
    this.accountLienUpdateActionRequest = accountLienUpdateActionRequest;
  }


}

