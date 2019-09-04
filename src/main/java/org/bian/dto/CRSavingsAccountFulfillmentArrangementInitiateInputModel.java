package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSavingsAccountFulfillmentArrangementInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRSavingsAccountFulfillmentArrangementInitiateInputModel
 */
public class CRSavingsAccountFulfillmentArrangementInitiateInputModel   {
  private String savingsAccountServicingSessionReference = null;

  private Object savingsAccountFulfillmentArrangementInitiateActionRecord = null;

  private String savingsAccountFulfillmentArrangementInstanceStatus = null;

  private CRSavingsAccountFulfillmentArrangementInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecord savingsAccountFulfillmentArrangementInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return savingsAccountFulfillmentArrangementInitiateActionRecord
  **/

  public Object getSavingsAccountFulfillmentArrangementInitiateActionRecord() {
    return savingsAccountFulfillmentArrangementInitiateActionRecord;
  }

  public void setSavingsAccountFulfillmentArrangementInitiateActionRecord(Object savingsAccountFulfillmentArrangementInitiateActionRecord) {
    this.savingsAccountFulfillmentArrangementInitiateActionRecord = savingsAccountFulfillmentArrangementInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Savings Account Fulfillment Arrangement instance (e.g. initialised, pending, active) 
   * @return savingsAccountFulfillmentArrangementInstanceStatus
  **/

  public String getSavingsAccountFulfillmentArrangementInstanceStatus() {
    return savingsAccountFulfillmentArrangementInstanceStatus;
  }

  public void setSavingsAccountFulfillmentArrangementInstanceStatus(String savingsAccountFulfillmentArrangementInstanceStatus) {
    this.savingsAccountFulfillmentArrangementInstanceStatus = savingsAccountFulfillmentArrangementInstanceStatus;
  }


  /**
   * Get savingsAccountFulfillmentArrangementInstanceRecord
   * @return savingsAccountFulfillmentArrangementInstanceRecord
  **/

  public CRSavingsAccountFulfillmentArrangementInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecord getSavingsAccountFulfillmentArrangementInstanceRecord() {
    return savingsAccountFulfillmentArrangementInstanceRecord;
  }

  public void setSavingsAccountFulfillmentArrangementInstanceRecord(CRSavingsAccountFulfillmentArrangementInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecord savingsAccountFulfillmentArrangementInstanceRecord) {
    this.savingsAccountFulfillmentArrangementInstanceRecord = savingsAccountFulfillmentArrangementInstanceRecord;
  }


}

