package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSavingsAccountFulfillmentArrangementRetrieveInputModelSavingsAccountFulfillmentArrangementInstanceAnalysis
 */
public class CRSavingsAccountFulfillmentArrangementRetrieveInputModelSavingsAccountFulfillmentArrangementInstanceAnalysis   {
  private String savingsAccountFulfillmentArrangementInstanceAnalysisReference = null;

  private String savingsAccountFulfillmentArrangementInstanceAnalysisReportType = null;

  private String savingsAccountFulfillmentArrangementInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return savingsAccountFulfillmentArrangementInstanceAnalysisReference
  **/

  public String getSavingsAccountFulfillmentArrangementInstanceAnalysisReference() {
    return savingsAccountFulfillmentArrangementInstanceAnalysisReference;
  }

  public void setSavingsAccountFulfillmentArrangementInstanceAnalysisReference(String savingsAccountFulfillmentArrangementInstanceAnalysisReference) {
    this.savingsAccountFulfillmentArrangementInstanceAnalysisReference = savingsAccountFulfillmentArrangementInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return savingsAccountFulfillmentArrangementInstanceAnalysisParameters
  **/

  public String getSavingsAccountFulfillmentArrangementInstanceAnalysisParameters() {
    return savingsAccountFulfillmentArrangementInstanceAnalysisParameters;
  }

  public void setSavingsAccountFulfillmentArrangementInstanceAnalysisParameters(String savingsAccountFulfillmentArrangementInstanceAnalysisParameters) {
    this.savingsAccountFulfillmentArrangementInstanceAnalysisParameters = savingsAccountFulfillmentArrangementInstanceAnalysisParameters;
  }


}

