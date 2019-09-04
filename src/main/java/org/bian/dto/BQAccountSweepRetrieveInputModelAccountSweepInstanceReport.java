package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAccountSweepRetrieveInputModelAccountSweepInstanceReport
 */
public class BQAccountSweepRetrieveInputModelAccountSweepInstanceReport   {
  private String accountSweepInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return accountSweepInstanceReportReference
  **/

  public String getAccountSweepInstanceReportReference() {
    return accountSweepInstanceReportReference;
  }

  public void setAccountSweepInstanceReportReference(String accountSweepInstanceReportReference) {
    this.accountSweepInstanceReportReference = accountSweepInstanceReportReference;
  }


}

