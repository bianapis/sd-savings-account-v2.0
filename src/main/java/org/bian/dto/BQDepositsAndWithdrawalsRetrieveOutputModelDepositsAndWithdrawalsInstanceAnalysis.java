package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceAnalysis
 */
public class BQDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceAnalysis   {
  private Object depositsAndWithdrawalsInstanceAnalysisRecord = null;

  private String depositsAndWithdrawalsInstanceAnalysisReportType = null;

  private String depositsAndWithdrawalsInstanceAnalysisParameters = null;

  private Object depositsAndWithdrawalsInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return depositsAndWithdrawalsInstanceAnalysisRecord
  **/

  public Object getDepositsAndWithdrawalsInstanceAnalysisRecord() {
    return depositsAndWithdrawalsInstanceAnalysisRecord;
  }

  public void setDepositsAndWithdrawalsInstanceAnalysisRecord(Object depositsAndWithdrawalsInstanceAnalysisRecord) {
    this.depositsAndWithdrawalsInstanceAnalysisRecord = depositsAndWithdrawalsInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return depositsAndWithdrawalsInstanceAnalysisReportType
  **/

  public String getDepositsAndWithdrawalsInstanceAnalysisReportType() {
    return depositsAndWithdrawalsInstanceAnalysisReportType;
  }

  public void setDepositsAndWithdrawalsInstanceAnalysisReportType(String depositsAndWithdrawalsInstanceAnalysisReportType) {
    this.depositsAndWithdrawalsInstanceAnalysisReportType = depositsAndWithdrawalsInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return depositsAndWithdrawalsInstanceAnalysisParameters
  **/

  public String getDepositsAndWithdrawalsInstanceAnalysisParameters() {
    return depositsAndWithdrawalsInstanceAnalysisParameters;
  }

  public void setDepositsAndWithdrawalsInstanceAnalysisParameters(String depositsAndWithdrawalsInstanceAnalysisParameters) {
    this.depositsAndWithdrawalsInstanceAnalysisParameters = depositsAndWithdrawalsInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return depositsAndWithdrawalsInstanceAnalysisReport
  **/

  public Object getDepositsAndWithdrawalsInstanceAnalysisReport() {
    return depositsAndWithdrawalsInstanceAnalysisReport;
  }

  public void setDepositsAndWithdrawalsInstanceAnalysisReport(Object depositsAndWithdrawalsInstanceAnalysisReport) {
    this.depositsAndWithdrawalsInstanceAnalysisReport = depositsAndWithdrawalsInstanceAnalysisReport;
  }


}

