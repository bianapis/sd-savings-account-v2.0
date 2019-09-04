package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServiceFeesInitiateInputModelServiceFeesInstanceRecordFeeConfigurationProfile
 */
public class BQServiceFeesInitiateInputModelServiceFeesInstanceRecordFeeConfigurationProfile   {
  private String feeType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The fee or penalty type applied 
   * @return feeType
  **/

  public String getFeeType() {
    return feeType;
  }

  public void setFeeType(String feeType) {
    this.feeType = feeType;
  }


}

