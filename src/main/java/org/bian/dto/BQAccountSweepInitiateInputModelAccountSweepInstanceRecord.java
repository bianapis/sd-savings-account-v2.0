package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAccountSweepInitiateInputModelAccountSweepInstanceRecordAccountSweepConfiguration;

import javax.validation.Valid;
  
/**
 * BQAccountSweepInitiateInputModelAccountSweepInstanceRecord
 */
public class BQAccountSweepInitiateInputModelAccountSweepInstanceRecord   {
  private String accountSweepType = null;

  private String accountSweepApplicationSchedule = null;

  private BQAccountSweepInitiateInputModelAccountSweepInstanceRecordAccountSweepConfiguration accountSweepConfiguration = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of sweep (e.g. periodic, threshold) 
   * @return accountSweepType
  **/

  public String getAccountSweepType() {
    return accountSweepType;
  }

  public void setAccountSweepType(String accountSweepType) {
    this.accountSweepType = accountSweepType;
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


  /**
   * Get accountSweepConfiguration
   * @return accountSweepConfiguration
  **/

  public BQAccountSweepInitiateInputModelAccountSweepInstanceRecordAccountSweepConfiguration getAccountSweepConfiguration() {
    return accountSweepConfiguration;
  }

  public void setAccountSweepConfiguration(BQAccountSweepInitiateInputModelAccountSweepInstanceRecordAccountSweepConfiguration accountSweepConfiguration) {
    this.accountSweepConfiguration = accountSweepConfiguration;
  }


}

