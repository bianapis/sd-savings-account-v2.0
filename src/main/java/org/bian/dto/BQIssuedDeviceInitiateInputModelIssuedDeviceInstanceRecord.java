package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecordIssuedDeviceProperty;

import javax.validation.Valid;
  
/**
 * BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecord
 */
public class BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecord   {
  private String issuedDeviceType = null;

  private String issuedDeviceDescription = null;

  private String issuedDeviceOptionDefinition = null;

  private String issuedDeviceOptionSetting = null;

  private BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecordIssuedDeviceProperty issuedDeviceProperty = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of issued device/inventory (e.g. checkbook, pay-in slip) 
   * @return issuedDeviceType
  **/

  public String getIssuedDeviceType() {
    return issuedDeviceType;
  }

  public void setIssuedDeviceType(String issuedDeviceType) {
    this.issuedDeviceType = issuedDeviceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Definition of the inventory item, including processing and handling guidelines and rules 
   * @return issuedDeviceDescription
  **/

  public String getIssuedDeviceDescription() {
    return issuedDeviceDescription;
  }

  public void setIssuedDeviceDescription(String issuedDeviceDescription) {
    this.issuedDeviceDescription = issuedDeviceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Definition of the processing option and impact (e.g. lost check handling) 
   * @return issuedDeviceOptionDefinition
  **/

  public String getIssuedDeviceOptionDefinition() {
    return issuedDeviceOptionDefinition;
  }

  public void setIssuedDeviceOptionDefinition(String issuedDeviceOptionDefinition) {
    this.issuedDeviceOptionDefinition = issuedDeviceOptionDefinition;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The processing option setting  
   * @return issuedDeviceOptionSetting
  **/

  public String getIssuedDeviceOptionSetting() {
    return issuedDeviceOptionSetting;
  }

  public void setIssuedDeviceOptionSetting(String issuedDeviceOptionSetting) {
    this.issuedDeviceOptionSetting = issuedDeviceOptionSetting;
  }


  /**
   * Get issuedDeviceProperty
   * @return issuedDeviceProperty
  **/

  public BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecordIssuedDeviceProperty getIssuedDeviceProperty() {
    return issuedDeviceProperty;
  }

  public void setIssuedDeviceProperty(BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecordIssuedDeviceProperty issuedDeviceProperty) {
    this.issuedDeviceProperty = issuedDeviceProperty;
  }


}

