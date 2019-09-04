package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount;
import org.bian.dto.BQServiceFeesRetrieveOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeProjectionsandCommitments;
import org.bian.dto.BQServiceFeesRetrieveOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction;

import javax.validation.Valid;
  
/**
 * BQServiceFeesRetrieveOutputModelServiceFeesInstanceRecordFeeApplicationRecord
 */
public class BQServiceFeesRetrieveOutputModelServiceFeesInstanceRecordFeeApplicationRecord   {
  private BQServiceFeesRetrieveOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction feeTransaction = null;

  private BQServiceFeesRetrieveOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeProjectionsandCommitments feeProjectionsandCommitments = null;

  private BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount feeAccrualAmount = null;


  /**
   * Get feeTransaction
   * @return feeTransaction
  **/

  public BQServiceFeesRetrieveOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction getFeeTransaction() {
    return feeTransaction;
  }

  public void setFeeTransaction(BQServiceFeesRetrieveOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction feeTransaction) {
    this.feeTransaction = feeTransaction;
  }


  /**
   * Get feeProjectionsandCommitments
   * @return feeProjectionsandCommitments
  **/

  public BQServiceFeesRetrieveOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeProjectionsandCommitments getFeeProjectionsandCommitments() {
    return feeProjectionsandCommitments;
  }

  public void setFeeProjectionsandCommitments(BQServiceFeesRetrieveOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeProjectionsandCommitments feeProjectionsandCommitments) {
    this.feeProjectionsandCommitments = feeProjectionsandCommitments;
  }


  /**
   * Get feeAccrualAmount
   * @return feeAccrualAmount
  **/

  public BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount getFeeAccrualAmount() {
    return feeAccrualAmount;
  }

  public void setFeeAccrualAmount(BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount feeAccrualAmount) {
    this.feeAccrualAmount = feeAccrualAmount;
  }


}

