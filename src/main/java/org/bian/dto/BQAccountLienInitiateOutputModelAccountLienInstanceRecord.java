package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAccountLienInitiateOutputModelAccountLienInstanceRecord
 */
public class BQAccountLienInitiateOutputModelAccountLienInstanceRecord   {
  private String lienDefinition = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Definition of the type of lien including processing guidelines 
   * @return lienDefinition
  **/

  public String getLienDefinition() {
    return lienDefinition;
  }

  public void setLienDefinition(String lienDefinition) {
    this.lienDefinition = lienDefinition;
  }


}

