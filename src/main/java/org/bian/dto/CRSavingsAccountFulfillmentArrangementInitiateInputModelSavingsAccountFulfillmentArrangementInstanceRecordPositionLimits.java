package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSavingsAccountFulfillmentArrangementInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecordPositionLimits
 */
public class CRSavingsAccountFulfillmentArrangementInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecordPositionLimits   {
  private String positionLimitSettings = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The position definition, associated limit settings and rules 
   * @return positionLimitSettings
  **/

  public String getPositionLimitSettings() {
    return positionLimitSettings;
  }

  public void setPositionLimitSettings(String positionLimitSettings) {
    this.positionLimitSettings = positionLimitSettings;
  }


}

