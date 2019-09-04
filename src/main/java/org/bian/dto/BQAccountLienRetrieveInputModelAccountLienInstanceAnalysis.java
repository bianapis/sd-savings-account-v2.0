package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAccountLienRetrieveInputModelAccountLienInstanceAnalysis
 */
public class BQAccountLienRetrieveInputModelAccountLienInstanceAnalysis   {
  private String accountLienInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return accountLienInstanceAnalysisReference
  **/

  public String getAccountLienInstanceAnalysisReference() {
    return accountLienInstanceAnalysisReference;
  }

  public void setAccountLienInstanceAnalysisReference(String accountLienInstanceAnalysisReference) {
    this.accountLienInstanceAnalysisReference = accountLienInstanceAnalysisReference;
  }


}

