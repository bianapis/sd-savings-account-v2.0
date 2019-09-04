package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSavingsAccountFulfillmentArrangementControlInputModelSavingsAccountFulfillmentArrangementControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRSavingsAccountFulfillmentArrangementControlInputModel
 */
public class CRSavingsAccountFulfillmentArrangementControlInputModel   {
  private String savingsAccountServicingSessionReference = null;

  private String savingsAccountFulfillmentArrangementInstanceReference = null;

  private Object savingsAccountFulfillmentArrangementControlActionTaskRecord = null;

  private CRSavingsAccountFulfillmentArrangementControlInputModelSavingsAccountFulfillmentArrangementControlActionRequest savingsAccountFulfillmentArrangementControlActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return savingsAccountServicingSessionReference
  **/

  public String getSavingsAccountServicingSessionReference() {
    return savingsAccountServicingSessionReference;
  }

  public void setSavingsAccountServicingSessionReference(String savingsAccountServicingSessionReference) {
    this.savingsAccountServicingSessionReference = savingsAccountServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Savings Account Fulfillment Arrangement instance 
   * @return savingsAccountFulfillmentArrangementInstanceReference
  **/

  public String getSavingsAccountFulfillmentArrangementInstanceReference() {
    return savingsAccountFulfillmentArrangementInstanceReference;
  }

  public void setSavingsAccountFulfillmentArrangementInstanceReference(String savingsAccountFulfillmentArrangementInstanceReference) {
    this.savingsAccountFulfillmentArrangementInstanceReference = savingsAccountFulfillmentArrangementInstanceReference;
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
   * Get savingsAccountFulfillmentArrangementControlActionRequest
   * @return savingsAccountFulfillmentArrangementControlActionRequest
  **/

  public CRSavingsAccountFulfillmentArrangementControlInputModelSavingsAccountFulfillmentArrangementControlActionRequest getSavingsAccountFulfillmentArrangementControlActionRequest() {
    return savingsAccountFulfillmentArrangementControlActionRequest;
  }

  public void setSavingsAccountFulfillmentArrangementControlActionRequest(CRSavingsAccountFulfillmentArrangementControlInputModelSavingsAccountFulfillmentArrangementControlActionRequest savingsAccountFulfillmentArrangementControlActionRequest) {
    this.savingsAccountFulfillmentArrangementControlActionRequest = savingsAccountFulfillmentArrangementControlActionRequest;
  }


}

