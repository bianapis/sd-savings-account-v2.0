package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDepositsAndWithdrawalsExecuteInputModelDepositsWithdrawalsInstanceRecordDepositTransaction;
import org.bian.dto.BQDepositsAndWithdrawalsExecuteInputModelDepositsWithdrawalsInstanceRecordWithdrawalTransaction;

import javax.validation.Valid;
  
/**
 * BQDepositsAndWithdrawalsExecuteInputModelDepositsWithdrawalsInstanceRecord
 */
public class BQDepositsAndWithdrawalsExecuteInputModelDepositsWithdrawalsInstanceRecord   {
  private BQDepositsAndWithdrawalsExecuteInputModelDepositsWithdrawalsInstanceRecordDepositTransaction depositTransaction = null;

  private BQDepositsAndWithdrawalsExecuteInputModelDepositsWithdrawalsInstanceRecordWithdrawalTransaction withdrawalTransaction = null;


  /**
   * Get depositTransaction
   * @return depositTransaction
  **/

  public BQDepositsAndWithdrawalsExecuteInputModelDepositsWithdrawalsInstanceRecordDepositTransaction getDepositTransaction() {
    return depositTransaction;
  }

  public void setDepositTransaction(BQDepositsAndWithdrawalsExecuteInputModelDepositsWithdrawalsInstanceRecordDepositTransaction depositTransaction) {
    this.depositTransaction = depositTransaction;
  }


  /**
   * Get withdrawalTransaction
   * @return withdrawalTransaction
  **/

  public BQDepositsAndWithdrawalsExecuteInputModelDepositsWithdrawalsInstanceRecordWithdrawalTransaction getWithdrawalTransaction() {
    return withdrawalTransaction;
  }

  public void setWithdrawalTransaction(BQDepositsAndWithdrawalsExecuteInputModelDepositsWithdrawalsInstanceRecordWithdrawalTransaction withdrawalTransaction) {
    this.withdrawalTransaction = withdrawalTransaction;
  }


}

