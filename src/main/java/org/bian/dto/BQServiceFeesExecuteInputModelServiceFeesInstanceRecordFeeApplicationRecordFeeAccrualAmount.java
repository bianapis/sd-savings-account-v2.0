package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServiceFeesExecuteInputModelServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount
 */
public class BQServiceFeesExecuteInputModelServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount   {
  private String accrualFeeType = null;


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


}

