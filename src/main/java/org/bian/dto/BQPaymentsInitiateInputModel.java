package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPaymentsInitiateInputModelPaymentsInstanceRecord;
import org.bian.dto.BQPaymentsInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPaymentsInitiateInputModel
 */
public class BQPaymentsInitiateInputModel   {
  private BQPaymentsInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecord savingsAccountFulfillmentArrangementInstanceRecord = null;

  private String savingsAccountFulfillmentArrangementInstanceReference = null;

  private Object paymentsInitiateActionRecord = null;

  private BQPaymentsInitiateInputModelPaymentsInstanceRecord paymentsInstanceRecord = null;


  /**
   * Get savingsAccountFulfillmentArrangementInstanceRecord
   * @return savingsAccountFulfillmentArrangementInstanceRecord
  **/

  public BQPaymentsInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecord getSavingsAccountFulfillmentArrangementInstanceRecord() {
    return savingsAccountFulfillmentArrangementInstanceRecord;
  }

  public void setSavingsAccountFulfillmentArrangementInstanceRecord(BQPaymentsInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecord savingsAccountFulfillmentArrangementInstanceRecord) {
    this.savingsAccountFulfillmentArrangementInstanceRecord = savingsAccountFulfillmentArrangementInstanceRecord;
  }


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
   * Get paymentsInstanceRecord
   * @return paymentsInstanceRecord
  **/

  public BQPaymentsInitiateInputModelPaymentsInstanceRecord getPaymentsInstanceRecord() {
    return paymentsInstanceRecord;
  }

  public void setPaymentsInstanceRecord(BQPaymentsInitiateInputModelPaymentsInstanceRecord paymentsInstanceRecord) {
    this.paymentsInstanceRecord = paymentsInstanceRecord;
  }


}

