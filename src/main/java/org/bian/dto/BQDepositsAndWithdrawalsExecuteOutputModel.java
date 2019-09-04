package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDepositsAndWithdrawalsExecuteOutputModelDepositsWithdrawalsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDepositsAndWithdrawalsExecuteOutputModel
 */
public class BQDepositsAndWithdrawalsExecuteOutputModel   {
  private BQDepositsAndWithdrawalsExecuteOutputModelDepositsWithdrawalsInstanceRecord depositsWithdrawalsInstanceRecord = null;

  private String depositsAndWithdrawalsExecuteActionTaskReference = null;

  private Object depositsAndWithdrawalsExecuteActionTaskRecord = null;

  private String depositsAndWithdrawalsExecuteRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get depositsWithdrawalsInstanceRecord
   * @return depositsWithdrawalsInstanceRecord
  **/

  public BQDepositsAndWithdrawalsExecuteOutputModelDepositsWithdrawalsInstanceRecord getDepositsWithdrawalsInstanceRecord() {
    return depositsWithdrawalsInstanceRecord;
  }

  public void setDepositsWithdrawalsInstanceRecord(BQDepositsAndWithdrawalsExecuteOutputModelDepositsWithdrawalsInstanceRecord depositsWithdrawalsInstanceRecord) {
    this.depositsWithdrawalsInstanceRecord = depositsWithdrawalsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Deposits And Withdrawals instance execute service call 
   * @return depositsAndWithdrawalsExecuteActionTaskReference
  **/

  public String getDepositsAndWithdrawalsExecuteActionTaskReference() {
    return depositsAndWithdrawalsExecuteActionTaskReference;
  }

  public void setDepositsAndWithdrawalsExecuteActionTaskReference(String depositsAndWithdrawalsExecuteActionTaskReference) {
    this.depositsAndWithdrawalsExecuteActionTaskReference = depositsAndWithdrawalsExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return depositsAndWithdrawalsExecuteActionTaskRecord
  **/

  public Object getDepositsAndWithdrawalsExecuteActionTaskRecord() {
    return depositsAndWithdrawalsExecuteActionTaskRecord;
  }

  public void setDepositsAndWithdrawalsExecuteActionTaskRecord(Object depositsAndWithdrawalsExecuteActionTaskRecord) {
    this.depositsAndWithdrawalsExecuteActionTaskRecord = depositsAndWithdrawalsExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Deposits And Withdrawals execute transaction/record 
   * @return depositsAndWithdrawalsExecuteRecordReference
  **/

  public String getDepositsAndWithdrawalsExecuteRecordReference() {
    return depositsAndWithdrawalsExecuteRecordReference;
  }

  public void setDepositsAndWithdrawalsExecuteRecordReference(String depositsAndWithdrawalsExecuteRecordReference) {
    this.depositsAndWithdrawalsExecuteRecordReference = depositsAndWithdrawalsExecuteRecordReference;
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

