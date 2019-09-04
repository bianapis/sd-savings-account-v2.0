package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDepositsAndWithdrawalsInitiateOutputModelSavingsAccountFulfillmentArrangementInstanceRecordPositionLimits;
import org.bian.dto.CRSavingsAccountFulfillmentArrangementInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecordDateType;

import javax.validation.Valid;
  
/**
 * BQDepositsAndWithdrawalsInitiateOutputModelSavingsAccountFulfillmentArrangementInstanceRecord
 */
public class BQDepositsAndWithdrawalsInitiateOutputModelSavingsAccountFulfillmentArrangementInstanceRecord   {
  private BQDepositsAndWithdrawalsInitiateOutputModelSavingsAccountFulfillmentArrangementInstanceRecordPositionLimits positionLimits = null;

  private CRSavingsAccountFulfillmentArrangementInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecordDateType dateType = null;


  /**
   * Get positionLimits
   * @return positionLimits
  **/

  public BQDepositsAndWithdrawalsInitiateOutputModelSavingsAccountFulfillmentArrangementInstanceRecordPositionLimits getPositionLimits() {
    return positionLimits;
  }

  public void setPositionLimits(BQDepositsAndWithdrawalsInitiateOutputModelSavingsAccountFulfillmentArrangementInstanceRecordPositionLimits positionLimits) {
    this.positionLimits = positionLimits;
  }


  /**
   * Get dateType
   * @return dateType
  **/

  public CRSavingsAccountFulfillmentArrangementInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(CRSavingsAccountFulfillmentArrangementInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecordDateType dateType) {
    this.dateType = dateType;
  }


}

