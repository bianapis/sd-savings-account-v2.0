package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSavingsAccountFulfillmentArrangementInitiateOutputModelSavingsAccountFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRSavingsAccountFulfillmentArrangementInitiateOutputModel
 */
public class CRSavingsAccountFulfillmentArrangementInitiateOutputModel   {
  private String savingsAccountFulfillmentArrangementInstanceReference = null;

  private String savingsAccountFulfillmentArrangementInitiateActionReference = null;

  private Object savingsAccountFulfillmentArrangementInitiateActionRecord = null;

  private String savingsAccountFulfillmentArrangementInstanceStatus = null;

  private CRSavingsAccountFulfillmentArrangementInitiateOutputModelSavingsAccountFulfillmentArrangementInstanceRecord savingsAccountFulfillmentArrangementInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return savingsAccountFulfillmentArrangementInitiateActionReference
  **/

  public String getSavingsAccountFulfillmentArrangementInitiateActionReference() {
    return savingsAccountFulfillmentArrangementInitiateActionReference;
  }

  public void setSavingsAccountFulfillmentArrangementInitiateActionReference(String savingsAccountFulfillmentArrangementInitiateActionReference) {
    this.savingsAccountFulfillmentArrangementInitiateActionReference = savingsAccountFulfillmentArrangementInitiateActionReference;
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

  public CRSavingsAccountFulfillmentArrangementInitiateOutputModelSavingsAccountFulfillmentArrangementInstanceRecord getSavingsAccountFulfillmentArrangementInstanceRecord() {
    return savingsAccountFulfillmentArrangementInstanceRecord;
  }

  public void setSavingsAccountFulfillmentArrangementInstanceRecord(CRSavingsAccountFulfillmentArrangementInitiateOutputModelSavingsAccountFulfillmentArrangementInstanceRecord savingsAccountFulfillmentArrangementInstanceRecord) {
    this.savingsAccountFulfillmentArrangementInstanceRecord = savingsAccountFulfillmentArrangementInstanceRecord;
  }


}

