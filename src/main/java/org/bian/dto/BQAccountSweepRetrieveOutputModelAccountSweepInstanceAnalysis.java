package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAccountSweepRetrieveOutputModelAccountSweepInstanceAnalysis
 */
public class BQAccountSweepRetrieveOutputModelAccountSweepInstanceAnalysis   {
  private Object accountSweepInstanceAnalysisRecord = null;

  private String accountSweepInstanceAnalysisReportType = null;

  private String accountSweepInstanceAnalysisParameters = null;

  private Object accountSweepInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return accountSweepInstanceAnalysisRecord
  **/

  public Object getAccountSweepInstanceAnalysisRecord() {
    return accountSweepInstanceAnalysisRecord;
  }

  public void setAccountSweepInstanceAnalysisRecord(Object accountSweepInstanceAnalysisRecord) {
    this.accountSweepInstanceAnalysisRecord = accountSweepInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return accountSweepInstanceAnalysisReportType
  **/

  public String getAccountSweepInstanceAnalysisReportType() {
    return accountSweepInstanceAnalysisReportType;
  }

  public void setAccountSweepInstanceAnalysisReportType(String accountSweepInstanceAnalysisReportType) {
    this.accountSweepInstanceAnalysisReportType = accountSweepInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return accountSweepInstanceAnalysisParameters
  **/

  public String getAccountSweepInstanceAnalysisParameters() {
    return accountSweepInstanceAnalysisParameters;
  }

  public void setAccountSweepInstanceAnalysisParameters(String accountSweepInstanceAnalysisParameters) {
    this.accountSweepInstanceAnalysisParameters = accountSweepInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return accountSweepInstanceAnalysisReport
  **/

  public Object getAccountSweepInstanceAnalysisReport() {
    return accountSweepInstanceAnalysisReport;
  }

  public void setAccountSweepInstanceAnalysisReport(Object accountSweepInstanceAnalysisReport) {
    this.accountSweepInstanceAnalysisReport = accountSweepInstanceAnalysisReport;
  }


}

