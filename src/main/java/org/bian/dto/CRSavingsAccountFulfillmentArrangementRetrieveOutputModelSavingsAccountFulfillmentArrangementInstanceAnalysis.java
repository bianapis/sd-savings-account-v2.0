package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSavingsAccountFulfillmentArrangementRetrieveOutputModelSavingsAccountFulfillmentArrangementInstanceAnalysis
 */
public class CRSavingsAccountFulfillmentArrangementRetrieveOutputModelSavingsAccountFulfillmentArrangementInstanceAnalysis   {
  private String savingsAccountFulfillmentArrangementInstanceAnalysisData = null;

  private String savingsAccountFulfillmentArrangementInstanceAnalysisReportType = null;

  private Object savingsAccountFulfillmentArrangementInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return savingsAccountFulfillmentArrangementInstanceAnalysisData
  **/

  public String getSavingsAccountFulfillmentArrangementInstanceAnalysisData() {
    return savingsAccountFulfillmentArrangementInstanceAnalysisData;
  }

  public void setSavingsAccountFulfillmentArrangementInstanceAnalysisData(String savingsAccountFulfillmentArrangementInstanceAnalysisData) {
    this.savingsAccountFulfillmentArrangementInstanceAnalysisData = savingsAccountFulfillmentArrangementInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return savingsAccountFulfillmentArrangementInstanceAnalysisReportType
  **/

  public String getSavingsAccountFulfillmentArrangementInstanceAnalysisReportType() {
    return savingsAccountFulfillmentArrangementInstanceAnalysisReportType;
  }

  public void setSavingsAccountFulfillmentArrangementInstanceAnalysisReportType(String savingsAccountFulfillmentArrangementInstanceAnalysisReportType) {
    this.savingsAccountFulfillmentArrangementInstanceAnalysisReportType = savingsAccountFulfillmentArrangementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return savingsAccountFulfillmentArrangementInstanceAnalysisReport
  **/

  public Object getSavingsAccountFulfillmentArrangementInstanceAnalysisReport() {
    return savingsAccountFulfillmentArrangementInstanceAnalysisReport;
  }

  public void setSavingsAccountFulfillmentArrangementInstanceAnalysisReport(Object savingsAccountFulfillmentArrangementInstanceAnalysisReport) {
    this.savingsAccountFulfillmentArrangementInstanceAnalysisReport = savingsAccountFulfillmentArrangementInstanceAnalysisReport;
  }


}

