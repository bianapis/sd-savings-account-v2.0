package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAccountSweepUpdateInputModelAccountSweepInstanceRecordSweepApplicationRecord
 */
public class BQAccountSweepUpdateInputModelAccountSweepInstanceRecordSweepApplicationRecord   {
  private String accountSweepTargetAccount = null;

  private String accountSweepAmount = null;

  private String accountSweepExecutionDate = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The facility that the sweep is made to/from 
   * @return accountSweepTargetAccount
  **/

  public String getAccountSweepTargetAccount() {
    return accountSweepTargetAccount;
  }

  public void setAccountSweepTargetAccount(String accountSweepTargetAccount) {
    this.accountSweepTargetAccount = accountSweepTargetAccount;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The amount transferred to or from the account 
   * @return accountSweepAmount
  **/

  public String getAccountSweepAmount() {
    return accountSweepAmount;
  }

  public void setAccountSweepAmount(String accountSweepAmount) {
    this.accountSweepAmount = accountSweepAmount;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date and time the sweep is initiated 
   * @return accountSweepExecutionDate
  **/

  public String getAccountSweepExecutionDate() {
    return accountSweepExecutionDate;
  }

  public void setAccountSweepExecutionDate(String accountSweepExecutionDate) {
    this.accountSweepExecutionDate = accountSweepExecutionDate;
  }


}

