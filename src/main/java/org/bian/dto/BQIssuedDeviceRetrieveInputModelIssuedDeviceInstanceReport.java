package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQIssuedDeviceRetrieveInputModelIssuedDeviceInstanceReport
 */
public class BQIssuedDeviceRetrieveInputModelIssuedDeviceInstanceReport   {
  private String issuedDeviceInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return issuedDeviceInstanceReportReference
  **/

  public String getIssuedDeviceInstanceReportReference() {
    return issuedDeviceInstanceReportReference;
  }

  public void setIssuedDeviceInstanceReportReference(String issuedDeviceInstanceReportReference) {
    this.issuedDeviceInstanceReportReference = issuedDeviceInstanceReportReference;
  }


}

