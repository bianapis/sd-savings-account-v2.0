package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSavingsAccountFulfillmentArrangementControlOutputModel
 */
public class CRSavingsAccountFulfillmentArrangementControlOutputModel   {
  private String savingsAccountFulfillmentArrangementControlActionTaskReference = null;

  private Object savingsAccountFulfillmentArrangementControlActionTaskRecord = null;

  private String savingsAccountFulfillmentArrangementControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Savings Account Fulfillment Arrangement instance control processing service call 
   * @return savingsAccountFulfillmentArrangementControlActionTaskReference
  **/

  public String getSavingsAccountFulfillmentArrangementControlActionTaskReference() {
    return savingsAccountFulfillmentArrangementControlActionTaskReference;
  }

  public void setSavingsAccountFulfillmentArrangementControlActionTaskReference(String savingsAccountFulfillmentArrangementControlActionTaskReference) {
    this.savingsAccountFulfillmentArrangementControlActionTaskReference = savingsAccountFulfillmentArrangementControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return savingsAccountFulfillmentArrangementControlActionTaskRecord
  **/

  public Object getSavingsAccountFulfillmentArrangementControlActionTaskRecord() {
    return savingsAccountFulfillmentArrangementControlActionTaskRecord;
  }

  public void setSavingsAccountFulfillmentArrangementControlActionTaskRecord(Object savingsAccountFulfillmentArrangementControlActionTaskRecord) {
    this.savingsAccountFulfillmentArrangementControlActionTaskRecord = savingsAccountFulfillmentArrangementControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return savingsAccountFulfillmentArrangementControlActionResponse
  **/

  public String getSavingsAccountFulfillmentArrangementControlActionResponse() {
    return savingsAccountFulfillmentArrangementControlActionResponse;
  }

  public void setSavingsAccountFulfillmentArrangementControlActionResponse(String savingsAccountFulfillmentArrangementControlActionResponse) {
    this.savingsAccountFulfillmentArrangementControlActionResponse = savingsAccountFulfillmentArrangementControlActionResponse;
  }


}

