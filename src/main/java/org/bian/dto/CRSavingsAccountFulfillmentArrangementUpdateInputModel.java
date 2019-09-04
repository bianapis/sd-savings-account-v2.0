package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSavingsAccountFulfillmentArrangementUpdateInputModelSavingsAccountFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRSavingsAccountFulfillmentArrangementUpdateInputModel
 */
public class CRSavingsAccountFulfillmentArrangementUpdateInputModel   {
  private String savingsAccountServicingSessionReference = null;

  private String savingsAccountFulfillmentArrangementInstanceReference = null;

  private CRSavingsAccountFulfillmentArrangementUpdateInputModelSavingsAccountFulfillmentArrangementInstanceRecord savingsAccountFulfillmentArrangementInstanceRecord = null;

  private Object savingsAccountFulfillmentArrangementUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get savingsAccountFulfillmentArrangementInstanceRecord
   * @return savingsAccountFulfillmentArrangementInstanceRecord
  **/

  public CRSavingsAccountFulfillmentArrangementUpdateInputModelSavingsAccountFulfillmentArrangementInstanceRecord getSavingsAccountFulfillmentArrangementInstanceRecord() {
    return savingsAccountFulfillmentArrangementInstanceRecord;
  }

  public void setSavingsAccountFulfillmentArrangementInstanceRecord(CRSavingsAccountFulfillmentArrangementUpdateInputModelSavingsAccountFulfillmentArrangementInstanceRecord savingsAccountFulfillmentArrangementInstanceRecord) {
    this.savingsAccountFulfillmentArrangementInstanceRecord = savingsAccountFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return savingsAccountFulfillmentArrangementUpdateActionTaskRecord
  **/

  public Object getSavingsAccountFulfillmentArrangementUpdateActionTaskRecord() {
    return savingsAccountFulfillmentArrangementUpdateActionTaskRecord;
  }

  public void setSavingsAccountFulfillmentArrangementUpdateActionTaskRecord(Object savingsAccountFulfillmentArrangementUpdateActionTaskRecord) {
    this.savingsAccountFulfillmentArrangementUpdateActionTaskRecord = savingsAccountFulfillmentArrangementUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

