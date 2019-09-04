package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecordIssuedDevicePropertyIssuedDevicePropertyType;

import javax.validation.Valid;
  
/**
 * BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecordIssuedDeviceProperty
 */
public class BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecordIssuedDeviceProperty   {
  private BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecordIssuedDevicePropertyIssuedDevicePropertyType issuedDevicePropertyType = null;

  private String issuedDeviceStatus = null;


  /**
   * Get issuedDevicePropertyType
   * @return issuedDevicePropertyType
  **/

  public BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecordIssuedDevicePropertyIssuedDevicePropertyType getIssuedDevicePropertyType() {
    return issuedDevicePropertyType;
  }

  public void setIssuedDevicePropertyType(BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecordIssuedDevicePropertyIssuedDevicePropertyType issuedDevicePropertyType) {
    this.issuedDevicePropertyType = issuedDevicePropertyType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The tracked status of the device/inventory item (e.g. active, suspended, cancelled) 
   * @return issuedDeviceStatus
  **/

  public String getIssuedDeviceStatus() {
    return issuedDeviceStatus;
  }

  public void setIssuedDeviceStatus(String issuedDeviceStatus) {
    this.issuedDeviceStatus = issuedDeviceStatus;
  }


}

