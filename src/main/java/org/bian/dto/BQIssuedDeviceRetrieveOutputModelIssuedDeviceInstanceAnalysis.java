package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQIssuedDeviceRetrieveOutputModelIssuedDeviceInstanceAnalysis
 */
public class BQIssuedDeviceRetrieveOutputModelIssuedDeviceInstanceAnalysis   {
  private Object issuedDeviceInstanceAnalysisRecord = null;

  private String issuedDeviceInstanceAnalysisReportType = null;

  private String issuedDeviceInstanceAnalysisParameters = null;

  private Object issuedDeviceInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return issuedDeviceInstanceAnalysisRecord
  **/

  public Object getIssuedDeviceInstanceAnalysisRecord() {
    return issuedDeviceInstanceAnalysisRecord;
  }

  public void setIssuedDeviceInstanceAnalysisRecord(Object issuedDeviceInstanceAnalysisRecord) {
    this.issuedDeviceInstanceAnalysisRecord = issuedDeviceInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return issuedDeviceInstanceAnalysisReportType
  **/

  public String getIssuedDeviceInstanceAnalysisReportType() {
    return issuedDeviceInstanceAnalysisReportType;
  }

  public void setIssuedDeviceInstanceAnalysisReportType(String issuedDeviceInstanceAnalysisReportType) {
    this.issuedDeviceInstanceAnalysisReportType = issuedDeviceInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return issuedDeviceInstanceAnalysisParameters
  **/

  public String getIssuedDeviceInstanceAnalysisParameters() {
    return issuedDeviceInstanceAnalysisParameters;
  }

  public void setIssuedDeviceInstanceAnalysisParameters(String issuedDeviceInstanceAnalysisParameters) {
    this.issuedDeviceInstanceAnalysisParameters = issuedDeviceInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return issuedDeviceInstanceAnalysisReport
  **/

  public Object getIssuedDeviceInstanceAnalysisReport() {
    return issuedDeviceInstanceAnalysisReport;
  }

  public void setIssuedDeviceInstanceAnalysisReport(Object issuedDeviceInstanceAnalysisReport) {
    this.issuedDeviceInstanceAnalysisReport = issuedDeviceInstanceAnalysisReport;
  }


}

