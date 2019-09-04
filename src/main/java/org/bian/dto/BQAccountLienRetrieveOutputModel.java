package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAccountLienInitiateInputModelAccountLienInstanceRecord;
import org.bian.dto.BQAccountLienRetrieveOutputModelAccountLienInstanceAnalysis;
import org.bian.dto.BQAccountLienRetrieveOutputModelAccountLienInstanceReport;

import javax.validation.Valid;
  
/**
 * BQAccountLienRetrieveOutputModel
 */
public class BQAccountLienRetrieveOutputModel   {
  private BQAccountLienInitiateInputModelAccountLienInstanceRecord accountLienInstanceRecord = null;

  private String accountLienRetrieveActionTaskReference = null;

  private Object accountLienRetrieveActionTaskRecord = null;

  private String accountLienRetrieveActionResponse = null;

  private BQAccountLienRetrieveOutputModelAccountLienInstanceReport accountLienInstanceReport = null;

  private BQAccountLienRetrieveOutputModelAccountLienInstanceAnalysis accountLienInstanceAnalysis = null;


  /**
   * Get accountLienInstanceRecord
   * @return accountLienInstanceRecord
  **/

  public BQAccountLienInitiateInputModelAccountLienInstanceRecord getAccountLienInstanceRecord() {
    return accountLienInstanceRecord;
  }

  public void setAccountLienInstanceRecord(BQAccountLienInitiateInputModelAccountLienInstanceRecord accountLienInstanceRecord) {
    this.accountLienInstanceRecord = accountLienInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Account Lien instance retrieve service call 
   * @return accountLienRetrieveActionTaskReference
  **/

  public String getAccountLienRetrieveActionTaskReference() {
    return accountLienRetrieveActionTaskReference;
  }

  public void setAccountLienRetrieveActionTaskReference(String accountLienRetrieveActionTaskReference) {
    this.accountLienRetrieveActionTaskReference = accountLienRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return accountLienRetrieveActionResponse
  **/

  public String getAccountLienRetrieveActionResponse() {
    return accountLienRetrieveActionResponse;
  }

  public void setAccountLienRetrieveActionResponse(String accountLienRetrieveActionResponse) {
    this.accountLienRetrieveActionResponse = accountLienRetrieveActionResponse;
  }


  /**
   * Get accountLienInstanceReport
   * @return accountLienInstanceReport
  **/

  public BQAccountLienRetrieveOutputModelAccountLienInstanceReport getAccountLienInstanceReport() {
    return accountLienInstanceReport;
  }

  public void setAccountLienInstanceReport(BQAccountLienRetrieveOutputModelAccountLienInstanceReport accountLienInstanceReport) {
    this.accountLienInstanceReport = accountLienInstanceReport;
  }


  /**
   * Get accountLienInstanceAnalysis
   * @return accountLienInstanceAnalysis
  **/

  public BQAccountLienRetrieveOutputModelAccountLienInstanceAnalysis getAccountLienInstanceAnalysis() {
    return accountLienInstanceAnalysis;
  }

  public void setAccountLienInstanceAnalysis(BQAccountLienRetrieveOutputModelAccountLienInstanceAnalysis accountLienInstanceAnalysis) {
    this.accountLienInstanceAnalysis = accountLienInstanceAnalysis;
  }


}

