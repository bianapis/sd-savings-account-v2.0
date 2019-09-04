package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAccountSweepInitiateInputModelAccountSweepInstanceRecordAccountSweepConfiguration
 */
public class BQAccountSweepInitiateInputModelAccountSweepInstanceRecordAccountSweepConfiguration   {
  private String targetAccount = null;

  private String sweepMandate = null;

  private String sweepProcessingSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The facility that the sweep is made to/from 
   * @return targetAccount
  **/

  public String getTargetAccount() {
    return targetAccount;
  }

  public void setTargetAccount(String targetAccount) {
    this.targetAccount = targetAccount;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Confirmation that the sweep processing is sanctioned as necessary 
   * @return sweepMandate
  **/

  public String getSweepMandate() {
    return sweepMandate;
  }

  public void setSweepMandate(String sweepMandate) {
    this.sweepMandate = sweepMandate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Timing and or triggers for initiating sweep transaction 
   * @return sweepProcessingSchedule
  **/

  public String getSweepProcessingSchedule() {
    return sweepProcessingSchedule;
  }

  public void setSweepProcessingSchedule(String sweepProcessingSchedule) {
    this.sweepProcessingSchedule = sweepProcessingSchedule;
  }


}

