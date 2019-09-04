package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPaymentsInitiateOutputModelPaymentsInstanceRecord;
import org.bian.dto.BQPaymentsInitiateOutputModelSavingsAccountFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPaymentsInitiateOutputModel
 */
public class BQPaymentsInitiateOutputModel   {
  private BQPaymentsInitiateOutputModelSavingsAccountFulfillmentArrangementInstanceRecord savingsAccountFulfillmentArrangementInstanceRecord = null;

  private String paymentsInstanceReference = null;

  private String paymentsInitiateActionReference = null;

  private Object paymentsInitiateActionRecord = null;

  private String paymentsInstanceStatus = null;

  private BQPaymentsInitiateOutputModelPaymentsInstanceRecord paymentsInstanceRecord = null;


  /**
   * Get savingsAccountFulfillmentArrangementInstanceRecord
   * @return savingsAccountFulfillmentArrangementInstanceRecord
  **/

  public BQPaymentsInitiateOutputModelSavingsAccountFulfillmentArrangementInstanceRecord getSavingsAccountFulfillmentArrangementInstanceRecord() {
    return savingsAccountFulfillmentArrangementInstanceRecord;
  }

  public void setSavingsAccountFulfillmentArrangementInstanceRecord(BQPaymentsInitiateOutputModelSavingsAccountFulfillmentArrangementInstanceRecord savingsAccountFulfillmentArrangementInstanceRecord) {
    this.savingsAccountFulfillmentArrangementInstanceRecord = savingsAccountFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Payments instance 
   * @return paymentsInstanceReference
  **/

  public String getPaymentsInstanceReference() {
    return paymentsInstanceReference;
  }

  public void setPaymentsInstanceReference(String paymentsInstanceReference) {
    this.paymentsInstanceReference = paymentsInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return paymentsInitiateActionReference
  **/

  public String getPaymentsInitiateActionReference() {
    return paymentsInitiateActionReference;
  }

  public void setPaymentsInitiateActionReference(String paymentsInitiateActionReference) {
    this.paymentsInitiateActionReference = paymentsInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return paymentsInitiateActionRecord
  **/

  public Object getPaymentsInitiateActionRecord() {
    return paymentsInitiateActionRecord;
  }

  public void setPaymentsInitiateActionRecord(Object paymentsInitiateActionRecord) {
    this.paymentsInitiateActionRecord = paymentsInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Payments instance (e.g. initialised, pending, active) 
   * @return paymentsInstanceStatus
  **/

  public String getPaymentsInstanceStatus() {
    return paymentsInstanceStatus;
  }

  public void setPaymentsInstanceStatus(String paymentsInstanceStatus) {
    this.paymentsInstanceStatus = paymentsInstanceStatus;
  }


  /**
   * Get paymentsInstanceRecord
   * @return paymentsInstanceRecord
  **/

  public BQPaymentsInitiateOutputModelPaymentsInstanceRecord getPaymentsInstanceRecord() {
    return paymentsInstanceRecord;
  }

  public void setPaymentsInstanceRecord(BQPaymentsInitiateOutputModelPaymentsInstanceRecord paymentsInstanceRecord) {
    this.paymentsInstanceRecord = paymentsInstanceRecord;
  }


}

