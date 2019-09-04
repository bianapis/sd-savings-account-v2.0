package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeProjectionsandCommitments
 */
public class BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeProjectionsandCommitments   {
  private String projectedTransactionFeeType = null;

  private String projectedTransactionFeeCharge = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The fee or penalty type 
   * @return projectedTransactionFeeType
  **/

  public String getProjectedTransactionFeeType() {
    return projectedTransactionFeeType;
  }

  public void setProjectedTransactionFeeType(String projectedTransactionFeeType) {
    this.projectedTransactionFeeType = projectedTransactionFeeType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The anticipated fee or penalty amount 
   * @return projectedTransactionFeeCharge
  **/

  public String getProjectedTransactionFeeCharge() {
    return projectedTransactionFeeCharge;
  }

  public void setProjectedTransactionFeeCharge(String projectedTransactionFeeCharge) {
    this.projectedTransactionFeeCharge = projectedTransactionFeeCharge;
  }


}

