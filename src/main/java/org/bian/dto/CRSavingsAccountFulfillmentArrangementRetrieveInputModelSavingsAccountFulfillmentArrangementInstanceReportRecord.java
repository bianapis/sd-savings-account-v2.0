package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSavingsAccountFulfillmentArrangementRetrieveInputModelSavingsAccountFulfillmentArrangementInstanceReportRecord
 */
public class CRSavingsAccountFulfillmentArrangementRetrieveInputModelSavingsAccountFulfillmentArrangementInstanceReportRecord   {
  private String savingsAccountFulfillmentArrangementInstanceReportReference = null;

  private String savingsAccountFulfillmentArrangementInstanceReportType = null;

  private String savingsAccountFulfillmentArrangementInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return savingsAccountFulfillmentArrangementInstanceReportReference
  **/

  public String getSavingsAccountFulfillmentArrangementInstanceReportReference() {
    return savingsAccountFulfillmentArrangementInstanceReportReference;
  }

  public void setSavingsAccountFulfillmentArrangementInstanceReportReference(String savingsAccountFulfillmentArrangementInstanceReportReference) {
    this.savingsAccountFulfillmentArrangementInstanceReportReference = savingsAccountFulfillmentArrangementInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return savingsAccountFulfillmentArrangementInstanceReportType
  **/

  public String getSavingsAccountFulfillmentArrangementInstanceReportType() {
    return savingsAccountFulfillmentArrangementInstanceReportType;
  }

  public void setSavingsAccountFulfillmentArrangementInstanceReportType(String savingsAccountFulfillmentArrangementInstanceReportType) {
    this.savingsAccountFulfillmentArrangementInstanceReportType = savingsAccountFulfillmentArrangementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return savingsAccountFulfillmentArrangementInstanceReportParameters
  **/

  public String getSavingsAccountFulfillmentArrangementInstanceReportParameters() {
    return savingsAccountFulfillmentArrangementInstanceReportParameters;
  }

  public void setSavingsAccountFulfillmentArrangementInstanceReportParameters(String savingsAccountFulfillmentArrangementInstanceReportParameters) {
    this.savingsAccountFulfillmentArrangementInstanceReportParameters = savingsAccountFulfillmentArrangementInstanceReportParameters;
  }


}

