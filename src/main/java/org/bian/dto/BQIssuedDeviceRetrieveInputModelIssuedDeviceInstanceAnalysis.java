package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQIssuedDeviceRetrieveInputModelIssuedDeviceInstanceAnalysis
 */
public class BQIssuedDeviceRetrieveInputModelIssuedDeviceInstanceAnalysis   {
  private String issuedDeviceInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return issuedDeviceInstanceAnalysisReference
  **/

  public String getIssuedDeviceInstanceAnalysisReference() {
    return issuedDeviceInstanceAnalysisReference;
  }

  public void setIssuedDeviceInstanceAnalysisReference(String issuedDeviceInstanceAnalysisReference) {
    this.issuedDeviceInstanceAnalysisReference = issuedDeviceInstanceAnalysisReference;
  }


}

