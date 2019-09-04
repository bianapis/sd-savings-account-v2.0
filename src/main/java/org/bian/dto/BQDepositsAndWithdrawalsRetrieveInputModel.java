package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDepositsAndWithdrawalsRetrieveInputModelDepositsAndWithdrawalsInstanceAnalysis;
import org.bian.dto.BQDepositsAndWithdrawalsRetrieveInputModelDepositsAndWithdrawalsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQDepositsAndWithdrawalsRetrieveInputModel
 */
public class BQDepositsAndWithdrawalsRetrieveInputModel   {
  private Object depositsAndWithdrawalsRetrieveActionTaskRecord = null;

  private String depositsAndWithdrawalsRetrieveActionRequest = null;

  private BQDepositsAndWithdrawalsRetrieveInputModelDepositsAndWithdrawalsInstanceReport depositsAndWithdrawalsInstanceReport = null;

  private BQDepositsAndWithdrawalsRetrieveInputModelDepositsAndWithdrawalsInstanceAnalysis depositsAndWithdrawalsInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return depositsAndWithdrawalsRetrieveActionRequest
  **/

  public String getDepositsAndWithdrawalsRetrieveActionRequest() {
    return depositsAndWithdrawalsRetrieveActionRequest;
  }

  public void setDepositsAndWithdrawalsRetrieveActionRequest(String depositsAndWithdrawalsRetrieveActionRequest) {
    this.depositsAndWithdrawalsRetrieveActionRequest = depositsAndWithdrawalsRetrieveActionRequest;
  }


  /**
   * Get depositsAndWithdrawalsInstanceReport
   * @return depositsAndWithdrawalsInstanceReport
  **/

  public BQDepositsAndWithdrawalsRetrieveInputModelDepositsAndWithdrawalsInstanceReport getDepositsAndWithdrawalsInstanceReport() {
    return depositsAndWithdrawalsInstanceReport;
  }

  public void setDepositsAndWithdrawalsInstanceReport(BQDepositsAndWithdrawalsRetrieveInputModelDepositsAndWithdrawalsInstanceReport depositsAndWithdrawalsInstanceReport) {
    this.depositsAndWithdrawalsInstanceReport = depositsAndWithdrawalsInstanceReport;
  }


  /**
   * Get depositsAndWithdrawalsInstanceAnalysis
   * @return depositsAndWithdrawalsInstanceAnalysis
  **/

  public BQDepositsAndWithdrawalsRetrieveInputModelDepositsAndWithdrawalsInstanceAnalysis getDepositsAndWithdrawalsInstanceAnalysis() {
    return depositsAndWithdrawalsInstanceAnalysis;
  }

  public void setDepositsAndWithdrawalsInstanceAnalysis(BQDepositsAndWithdrawalsRetrieveInputModelDepositsAndWithdrawalsInstanceAnalysis depositsAndWithdrawalsInstanceAnalysis) {
    this.depositsAndWithdrawalsInstanceAnalysis = depositsAndWithdrawalsInstanceAnalysis;
  }


}

