package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAccountSweepRetrieveInputModelAccountSweepInstanceAnalysis
 */
public class BQAccountSweepRetrieveInputModelAccountSweepInstanceAnalysis   {
  private String accountSweepInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return accountSweepInstanceAnalysisReference
  **/

  public String getAccountSweepInstanceAnalysisReference() {
    return accountSweepInstanceAnalysisReference;
  }

  public void setAccountSweepInstanceAnalysisReference(String accountSweepInstanceAnalysisReference) {
    this.accountSweepInstanceAnalysisReference = accountSweepInstanceAnalysisReference;
  }


}

