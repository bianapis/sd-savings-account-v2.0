package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPaymentsExecuteOutputModelPaymentsInstanceRecordPaymentTransaction;

import javax.validation.Valid;
  
/**
 * BQPaymentsExecuteOutputModelPaymentsInstanceRecord
 */
public class BQPaymentsExecuteOutputModelPaymentsInstanceRecord   {
  private BQPaymentsExecuteOutputModelPaymentsInstanceRecordPaymentTransaction paymentTransaction = null;


  /**
   * Get paymentTransaction
   * @return paymentTransaction
  **/

  public BQPaymentsExecuteOutputModelPaymentsInstanceRecordPaymentTransaction getPaymentTransaction() {
    return paymentTransaction;
  }

  public void setPaymentTransaction(BQPaymentsExecuteOutputModelPaymentsInstanceRecordPaymentTransaction paymentTransaction) {
    this.paymentTransaction = paymentTransaction;
  }


}

