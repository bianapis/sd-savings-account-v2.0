package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPaymentsExecuteOutputModelPaymentsInstanceRecordPaymentTransaction
 */
public class BQPaymentsExecuteOutputModelPaymentsInstanceRecordPaymentTransaction   {
  private String paymentTransactionDate = null;

  private String paymentTransactionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The various key dates and times associated with the payment transaction 
   * @return paymentTransactionDate
  **/

  public String getPaymentTransactionDate() {
    return paymentTransactionDate;
  }

  public void setPaymentTransactionDate(String paymentTransactionDate) {
    this.paymentTransactionDate = paymentTransactionDate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The processing status of the transaction (e.g. captured, approved, initiated, confirmed, settled) 
   * @return paymentTransactionStatus
  **/

  public String getPaymentTransactionStatus() {
    return paymentTransactionStatus;
  }

  public void setPaymentTransactionStatus(String paymentTransactionStatus) {
    this.paymentTransactionStatus = paymentTransactionStatus;
  }


}

