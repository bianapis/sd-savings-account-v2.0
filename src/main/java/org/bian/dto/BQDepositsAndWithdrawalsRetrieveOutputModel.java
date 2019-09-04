package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceAnalysis;
import org.bian.dto.BQDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceReport;
import org.bian.dto.BQDepositsAndWithdrawalsRetrieveOutputModelDepositsWithdrawalsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDepositsAndWithdrawalsRetrieveOutputModel
 */
public class BQDepositsAndWithdrawalsRetrieveOutputModel   {
  private BQDepositsAndWithdrawalsRetrieveOutputModelDepositsWithdrawalsInstanceRecord depositsWithdrawalsInstanceRecord = null;

  private String depositsAndWithdrawalsRetrieveActionTaskReference = null;

  private Object depositsAndWithdrawalsRetrieveActionTaskRecord = null;

  private String depositsAndWithdrawalsRetrieveActionResponse = null;

  private BQDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceReport depositsAndWithdrawalsInstanceReport = null;

  private BQDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceAnalysis depositsAndWithdrawalsInstanceAnalysis = null;


  /**
   * Get depositsWithdrawalsInstanceRecord
   * @return depositsWithdrawalsInstanceRecord
  **/

  public BQDepositsAndWithdrawalsRetrieveOutputModelDepositsWithdrawalsInstanceRecord getDepositsWithdrawalsInstanceRecord() {
    return depositsWithdrawalsInstanceRecord;
  }

  public void setDepositsWithdrawalsInstanceRecord(BQDepositsAndWithdrawalsRetrieveOutputModelDepositsWithdrawalsInstanceRecord depositsWithdrawalsInstanceRecord) {
    this.depositsWithdrawalsInstanceRecord = depositsWithdrawalsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Deposits And Withdrawals instance retrieve service call 
   * @return depositsAndWithdrawalsRetrieveActionTaskReference
  **/

  public String getDepositsAndWithdrawalsRetrieveActionTaskReference() {
    return depositsAndWithdrawalsRetrieveActionTaskReference;
  }

  public void setDepositsAndWithdrawalsRetrieveActionTaskReference(String depositsAndWithdrawalsRetrieveActionTaskReference) {
    this.depositsAndWithdrawalsRetrieveActionTaskReference = depositsAndWithdrawalsRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return depositsAndWithdrawalsRetrieveActionTaskRecord
  **/

  public Object getDepositsAndWithdrawalsRetrieveActionTaskRecord() {
    return depositsAndWithdrawalsRetrieveActionTaskRecord;
  }

  public void setDepositsAndWithdrawalsRetrieveActionTaskRecord(Object depositsAndWithdrawalsRetrieveActionTaskRecord) {
    this.depositsAndWithdrawalsRetrieveActionTaskRecord = depositsAndWithdrawalsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return depositsAndWithdrawalsRetrieveActionResponse
  **/

  public String getDepositsAndWithdrawalsRetrieveActionResponse() {
    return depositsAndWithdrawalsRetrieveActionResponse;
  }

  public void setDepositsAndWithdrawalsRetrieveActionResponse(String depositsAndWithdrawalsRetrieveActionResponse) {
    this.depositsAndWithdrawalsRetrieveActionResponse = depositsAndWithdrawalsRetrieveActionResponse;
  }


  /**
   * Get depositsAndWithdrawalsInstanceReport
   * @return depositsAndWithdrawalsInstanceReport
  **/

  public BQDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceReport getDepositsAndWithdrawalsInstanceReport() {
    return depositsAndWithdrawalsInstanceReport;
  }

  public void setDepositsAndWithdrawalsInstanceReport(BQDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceReport depositsAndWithdrawalsInstanceReport) {
    this.depositsAndWithdrawalsInstanceReport = depositsAndWithdrawalsInstanceReport;
  }


  /**
   * Get depositsAndWithdrawalsInstanceAnalysis
   * @return depositsAndWithdrawalsInstanceAnalysis
  **/

  public BQDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceAnalysis getDepositsAndWithdrawalsInstanceAnalysis() {
    return depositsAndWithdrawalsInstanceAnalysis;
  }

  public void setDepositsAndWithdrawalsInstanceAnalysis(BQDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceAnalysis depositsAndWithdrawalsInstanceAnalysis) {
    this.depositsAndWithdrawalsInstanceAnalysis = depositsAndWithdrawalsInstanceAnalysis;
  }


}

