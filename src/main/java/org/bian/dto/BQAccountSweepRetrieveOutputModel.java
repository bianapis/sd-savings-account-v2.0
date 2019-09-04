package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAccountSweepRetrieveOutputModelAccountSweepInstanceAnalysis;
import org.bian.dto.BQAccountSweepRetrieveOutputModelAccountSweepInstanceReport;
import org.bian.dto.BQAccountSweepUpdateInputModelAccountSweepInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAccountSweepRetrieveOutputModel
 */
public class BQAccountSweepRetrieveOutputModel   {
  private BQAccountSweepUpdateInputModelAccountSweepInstanceRecord accountSweepInstanceRecord = null;

  private String accountSweepRetrieveActionTaskReference = null;

  private Object accountSweepRetrieveActionTaskRecord = null;

  private String accountSweepRetrieveActionResponse = null;

  private BQAccountSweepRetrieveOutputModelAccountSweepInstanceReport accountSweepInstanceReport = null;

  private BQAccountSweepRetrieveOutputModelAccountSweepInstanceAnalysis accountSweepInstanceAnalysis = null;


  /**
   * Get accountSweepInstanceRecord
   * @return accountSweepInstanceRecord
  **/

  public BQAccountSweepUpdateInputModelAccountSweepInstanceRecord getAccountSweepInstanceRecord() {
    return accountSweepInstanceRecord;
  }

  public void setAccountSweepInstanceRecord(BQAccountSweepUpdateInputModelAccountSweepInstanceRecord accountSweepInstanceRecord) {
    this.accountSweepInstanceRecord = accountSweepInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Account Sweep instance retrieve service call 
   * @return accountSweepRetrieveActionTaskReference
  **/

  public String getAccountSweepRetrieveActionTaskReference() {
    return accountSweepRetrieveActionTaskReference;
  }

  public void setAccountSweepRetrieveActionTaskReference(String accountSweepRetrieveActionTaskReference) {
    this.accountSweepRetrieveActionTaskReference = accountSweepRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return accountSweepRetrieveActionResponse
  **/

  public String getAccountSweepRetrieveActionResponse() {
    return accountSweepRetrieveActionResponse;
  }

  public void setAccountSweepRetrieveActionResponse(String accountSweepRetrieveActionResponse) {
    this.accountSweepRetrieveActionResponse = accountSweepRetrieveActionResponse;
  }


  /**
   * Get accountSweepInstanceReport
   * @return accountSweepInstanceReport
  **/

  public BQAccountSweepRetrieveOutputModelAccountSweepInstanceReport getAccountSweepInstanceReport() {
    return accountSweepInstanceReport;
  }

  public void setAccountSweepInstanceReport(BQAccountSweepRetrieveOutputModelAccountSweepInstanceReport accountSweepInstanceReport) {
    this.accountSweepInstanceReport = accountSweepInstanceReport;
  }


  /**
   * Get accountSweepInstanceAnalysis
   * @return accountSweepInstanceAnalysis
  **/

  public BQAccountSweepRetrieveOutputModelAccountSweepInstanceAnalysis getAccountSweepInstanceAnalysis() {
    return accountSweepInstanceAnalysis;
  }

  public void setAccountSweepInstanceAnalysis(BQAccountSweepRetrieveOutputModelAccountSweepInstanceAnalysis accountSweepInstanceAnalysis) {
    this.accountSweepInstanceAnalysis = accountSweepInstanceAnalysis;
  }


}

