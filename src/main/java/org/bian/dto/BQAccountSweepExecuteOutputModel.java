package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAccountSweepExecuteOutputModel
 */
public class BQAccountSweepExecuteOutputModel   {
  private String accountSweepExecuteActionTaskReference = null;

  private Object accountSweepExecuteActionTaskRecord = null;

  private String accountSweepExecuteRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Account Sweep instance execute service call 
   * @return accountSweepExecuteActionTaskReference
  **/

  public String getAccountSweepExecuteActionTaskReference() {
    return accountSweepExecuteActionTaskReference;
  }

  public void setAccountSweepExecuteActionTaskReference(String accountSweepExecuteActionTaskReference) {
    this.accountSweepExecuteActionTaskReference = accountSweepExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return accountSweepExecuteActionTaskRecord
  **/

  public Object getAccountSweepExecuteActionTaskRecord() {
    return accountSweepExecuteActionTaskRecord;
  }

  public void setAccountSweepExecuteActionTaskRecord(Object accountSweepExecuteActionTaskRecord) {
    this.accountSweepExecuteActionTaskRecord = accountSweepExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Account Sweep execute transaction/record 
   * @return accountSweepExecuteRecordReference
  **/

  public String getAccountSweepExecuteRecordReference() {
    return accountSweepExecuteRecordReference;
  }

  public void setAccountSweepExecuteRecordReference(String accountSweepExecuteRecordReference) {
    this.accountSweepExecuteRecordReference = accountSweepExecuteRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

