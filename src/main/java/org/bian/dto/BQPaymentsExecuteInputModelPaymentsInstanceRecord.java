package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPaymentsExecuteInputModelPaymentsInstanceRecordPaymentTransaction;

import javax.validation.Valid;
  
/**
 * BQPaymentsExecuteInputModelPaymentsInstanceRecord
 */
public class BQPaymentsExecuteInputModelPaymentsInstanceRecord   {
  private BQPaymentsExecuteInputModelPaymentsInstanceRecordPaymentTransaction paymentTransaction = null;


  /**
   * Get paymentTransaction
   * @return paymentTransaction
  **/

  public BQPaymentsExecuteInputModelPaymentsInstanceRecordPaymentTransaction getPaymentTransaction() {
    return paymentTransaction;
  }

  public void setPaymentTransaction(BQPaymentsExecuteInputModelPaymentsInstanceRecordPaymentTransaction paymentTransaction) {
    this.paymentTransaction = paymentTransaction;
  }


}

