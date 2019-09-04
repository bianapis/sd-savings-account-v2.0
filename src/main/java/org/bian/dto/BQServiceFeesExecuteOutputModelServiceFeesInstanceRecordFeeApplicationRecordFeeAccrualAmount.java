package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount
 */
public class BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount   {
  private String accrualFeeType = null;

  private String accrualFeeCharge = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The fee or penalty type being tracked 
   * @return accrualFeeType
  **/

  public String getAccrualFeeType() {
    return accrualFeeType;
  }

  public void setAccrualFeeType(String accrualFeeType) {
    this.accrualFeeType = accrualFeeType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The accrued amount of fees and penalties 
   * @return accrualFeeCharge
  **/

  public String getAccrualFeeCharge() {
    return accrualFeeCharge;
  }

  public void setAccrualFeeCharge(String accrualFeeCharge) {
    this.accrualFeeCharge = accrualFeeCharge;
  }


}

