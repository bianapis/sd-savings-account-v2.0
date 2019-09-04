package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDepositsAndWithdrawalsRetrieveInputModelDepositsAndWithdrawalsInstanceAnalysis
 */
public class BQDepositsAndWithdrawalsRetrieveInputModelDepositsAndWithdrawalsInstanceAnalysis   {
  private String depositsAndWithdrawalsInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return depositsAndWithdrawalsInstanceAnalysisReference
  **/

  public String getDepositsAndWithdrawalsInstanceAnalysisReference() {
    return depositsAndWithdrawalsInstanceAnalysisReference;
  }

  public void setDepositsAndWithdrawalsInstanceAnalysisReference(String depositsAndWithdrawalsInstanceAnalysisReference) {
    this.depositsAndWithdrawalsInstanceAnalysisReference = depositsAndWithdrawalsInstanceAnalysisReference;
  }


}

