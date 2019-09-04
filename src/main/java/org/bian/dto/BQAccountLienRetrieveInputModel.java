package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAccountLienRetrieveInputModelAccountLienInstanceAnalysis;
import org.bian.dto.BQAccountLienRetrieveInputModelAccountLienInstanceReport;

import javax.validation.Valid;
  
/**
 * BQAccountLienRetrieveInputModel
 */
public class BQAccountLienRetrieveInputModel   {
  private Object accountLienRetrieveActionTaskRecord = null;

  private String accountLienRetrieveActionRequest = null;

  private BQAccountLienRetrieveInputModelAccountLienInstanceReport accountLienInstanceReport = null;

  private BQAccountLienRetrieveInputModelAccountLienInstanceAnalysis accountLienInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return accountLienRetrieveActionTaskRecord
  **/

  public Object getAccountLienRetrieveActionTaskRecord() {
    return accountLienRetrieveActionTaskRecord;
  }

  public void setAccountLienRetrieveActionTaskRecord(Object accountLienRetrieveActionTaskRecord) {
    this.accountLienRetrieveActionTaskRecord = accountLienRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return accountLienRetrieveActionRequest
  **/

  public String getAccountLienRetrieveActionRequest() {
    return accountLienRetrieveActionRequest;
  }

  public void setAccountLienRetrieveActionRequest(String accountLienRetrieveActionRequest) {
    this.accountLienRetrieveActionRequest = accountLienRetrieveActionRequest;
  }


  /**
   * Get accountLienInstanceReport
   * @return accountLienInstanceReport
  **/

  public BQAccountLienRetrieveInputModelAccountLienInstanceReport getAccountLienInstanceReport() {
    return accountLienInstanceReport;
  }

  public void setAccountLienInstanceReport(BQAccountLienRetrieveInputModelAccountLienInstanceReport accountLienInstanceReport) {
    this.accountLienInstanceReport = accountLienInstanceReport;
  }


  /**
   * Get accountLienInstanceAnalysis
   * @return accountLienInstanceAnalysis
  **/

  public BQAccountLienRetrieveInputModelAccountLienInstanceAnalysis getAccountLienInstanceAnalysis() {
    return accountLienInstanceAnalysis;
  }

  public void setAccountLienInstanceAnalysis(BQAccountLienRetrieveInputModelAccountLienInstanceAnalysis accountLienInstanceAnalysis) {
    this.accountLienInstanceAnalysis = accountLienInstanceAnalysis;
  }


}

