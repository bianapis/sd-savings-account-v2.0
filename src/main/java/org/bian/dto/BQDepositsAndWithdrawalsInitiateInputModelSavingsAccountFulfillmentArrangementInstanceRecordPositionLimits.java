package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDepositsAndWithdrawalsInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecordPositionLimits
 */
public class BQDepositsAndWithdrawalsInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecordPositionLimits   {
  private String positionLimitType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of position maintained for the account (e.g. transaction credit/debit, netting, position) 
   * @return positionLimitType
  **/

  public String getPositionLimitType() {
    return positionLimitType;
  }

  public void setPositionLimitType(String positionLimitType) {
    this.positionLimitType = positionLimitType;
  }


}

