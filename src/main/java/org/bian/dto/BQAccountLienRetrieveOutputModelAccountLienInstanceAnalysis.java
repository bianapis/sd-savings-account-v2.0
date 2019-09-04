package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAccountLienRetrieveOutputModelAccountLienInstanceAnalysis
 */
public class BQAccountLienRetrieveOutputModelAccountLienInstanceAnalysis   {
  private Object accountLienInstanceAnalysisRecord = null;

  private String accountLienInstanceAnalysisReportType = null;

  private String accountLienInstanceAnalysisParameters = null;

  private Object accountLienInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return accountLienInstanceAnalysisRecord
  **/

  public Object getAccountLienInstanceAnalysisRecord() {
    return accountLienInstanceAnalysisRecord;
  }

  public void setAccountLienInstanceAnalysisRecord(Object accountLienInstanceAnalysisRecord) {
    this.accountLienInstanceAnalysisRecord = accountLienInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return accountLienInstanceAnalysisReportType
  **/

  public String getAccountLienInstanceAnalysisReportType() {
    return accountLienInstanceAnalysisReportType;
  }

  public void setAccountLienInstanceAnalysisReportType(String accountLienInstanceAnalysisReportType) {
    this.accountLienInstanceAnalysisReportType = accountLienInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return accountLienInstanceAnalysisParameters
  **/

  public String getAccountLienInstanceAnalysisParameters() {
    return accountLienInstanceAnalysisParameters;
  }

  public void setAccountLienInstanceAnalysisParameters(String accountLienInstanceAnalysisParameters) {
    this.accountLienInstanceAnalysisParameters = accountLienInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return accountLienInstanceAnalysisReport
  **/

  public Object getAccountLienInstanceAnalysisReport() {
    return accountLienInstanceAnalysisReport;
  }

  public void setAccountLienInstanceAnalysisReport(Object accountLienInstanceAnalysisReport) {
    this.accountLienInstanceAnalysisReport = accountLienInstanceAnalysisReport;
  }


}

