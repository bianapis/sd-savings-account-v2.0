package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAccountSweepInitiateOutputModelAccountSweepInstanceRecord
 */
public class BQAccountSweepInitiateOutputModelAccountSweepInstanceRecord   {
  private String accountSweepDefinition = null;

  private String accountSweepApplicationSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Definition of the type of sweep 
   * @return accountSweepDefinition
  **/

  public String getAccountSweepDefinition() {
    return accountSweepDefinition;
  }

  public void setAccountSweepDefinition(String accountSweepDefinition) {
    this.accountSweepDefinition = accountSweepDefinition;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Sweep processing guidelines and scheduling rules 
   * @return accountSweepApplicationSchedule
  **/

  public String getAccountSweepApplicationSchedule() {
    return accountSweepApplicationSchedule;
  }

  public void setAccountSweepApplicationSchedule(String accountSweepApplicationSchedule) {
    this.accountSweepApplicationSchedule = accountSweepApplicationSchedule;
  }


}

