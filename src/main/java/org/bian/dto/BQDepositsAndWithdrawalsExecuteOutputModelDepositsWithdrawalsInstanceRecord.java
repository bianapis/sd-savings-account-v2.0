package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDepositsAndWithdrawalsExecuteOutputModelDepositsWithdrawalsInstanceRecordDepositTransaction;
import org.bian.dto.BQDepositsAndWithdrawalsExecuteOutputModelDepositsWithdrawalsInstanceRecordWithdrawalTransaction;

import javax.validation.Valid;
  
/**
 * BQDepositsAndWithdrawalsExecuteOutputModelDepositsWithdrawalsInstanceRecord
 */
public class BQDepositsAndWithdrawalsExecuteOutputModelDepositsWithdrawalsInstanceRecord   {
  private BQDepositsAndWithdrawalsExecuteOutputModelDepositsWithdrawalsInstanceRecordDepositTransaction depositTransaction = null;

  private BQDepositsAndWithdrawalsExecuteOutputModelDepositsWithdrawalsInstanceRecordWithdrawalTransaction withdrawalTransaction = null;


  /**
   * Get depositTransaction
   * @return depositTransaction
  **/

  public BQDepositsAndWithdrawalsExecuteOutputModelDepositsWithdrawalsInstanceRecordDepositTransaction getDepositTransaction() {
    return depositTransaction;
  }

  public void setDepositTransaction(BQDepositsAndWithdrawalsExecuteOutputModelDepositsWithdrawalsInstanceRecordDepositTransaction depositTransaction) {
    this.depositTransaction = depositTransaction;
  }


  /**
   * Get withdrawalTransaction
   * @return withdrawalTransaction
  **/

  public BQDepositsAndWithdrawalsExecuteOutputModelDepositsWithdrawalsInstanceRecordWithdrawalTransaction getWithdrawalTransaction() {
    return withdrawalTransaction;
  }

  public void setWithdrawalTransaction(BQDepositsAndWithdrawalsExecuteOutputModelDepositsWithdrawalsInstanceRecordWithdrawalTransaction withdrawalTransaction) {
    this.withdrawalTransaction = withdrawalTransaction;
  }


}

