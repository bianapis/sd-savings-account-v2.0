package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAccountSweepRetrieveInputModelAccountSweepInstanceAnalysis;
import org.bian.dto.BQAccountSweepRetrieveInputModelAccountSweepInstanceReport;

import javax.validation.Valid;
  
/**
 * BQAccountSweepRetrieveInputModel
 */
public class BQAccountSweepRetrieveInputModel   {
  private Object accountSweepRetrieveActionTaskRecord = null;

  private String accountSweepRetrieveActionRequest = null;

  private BQAccountSweepRetrieveInputModelAccountSweepInstanceReport accountSweepInstanceReport = null;

  private BQAccountSweepRetrieveInputModelAccountSweepInstanceAnalysis accountSweepInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return accountSweepRetrieveActionTaskRecord
  **/

  public Object getAccountSweepRetrieveActionTaskRecord() {
    return accountSweepRetrieveActionTaskRecord;
  }

  public void setAccountSweepRetrieveActionTaskRecord(Object accountSweepRetrieveActionTaskRecord) {
    this.accountSweepRetrieveActionTaskRecord = accountSweepRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return accountSweepRetrieveActionRequest
  **/

  public String getAccountSweepRetrieveActionRequest() {
    return accountSweepRetrieveActionRequest;
  }

  public void setAccountSweepRetrieveActionRequest(String accountSweepRetrieveActionRequest) {
    this.accountSweepRetrieveActionRequest = accountSweepRetrieveActionRequest;
  }


  /**
   * Get accountSweepInstanceReport
   * @return accountSweepInstanceReport
  **/

  public BQAccountSweepRetrieveInputModelAccountSweepInstanceReport getAccountSweepInstanceReport() {
    return accountSweepInstanceReport;
  }

  public void setAccountSweepInstanceReport(BQAccountSweepRetrieveInputModelAccountSweepInstanceReport accountSweepInstanceReport) {
    this.accountSweepInstanceReport = accountSweepInstanceReport;
  }


  /**
   * Get accountSweepInstanceAnalysis
   * @return accountSweepInstanceAnalysis
  **/

  public BQAccountSweepRetrieveInputModelAccountSweepInstanceAnalysis getAccountSweepInstanceAnalysis() {
    return accountSweepInstanceAnalysis;
  }

  public void setAccountSweepInstanceAnalysis(BQAccountSweepRetrieveInputModelAccountSweepInstanceAnalysis accountSweepInstanceAnalysis) {
    this.accountSweepInstanceAnalysis = accountSweepInstanceAnalysis;
  }


}

