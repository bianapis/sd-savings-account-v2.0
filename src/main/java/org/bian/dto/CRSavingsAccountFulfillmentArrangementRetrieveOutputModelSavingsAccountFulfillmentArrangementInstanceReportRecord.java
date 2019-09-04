package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSavingsAccountFulfillmentArrangementRetrieveOutputModelSavingsAccountFulfillmentArrangementInstanceReportRecord
 */
public class CRSavingsAccountFulfillmentArrangementRetrieveOutputModelSavingsAccountFulfillmentArrangementInstanceReportRecord   {
  private String savingsAccountFulfillmentArrangementInstanceReportData = null;

  private String savingsAccountFulfillmentArrangementInstanceReportType = null;

  private Object savingsAccountFulfillmentArrangementInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return savingsAccountFulfillmentArrangementInstanceReportData
  **/

  public String getSavingsAccountFulfillmentArrangementInstanceReportData() {
    return savingsAccountFulfillmentArrangementInstanceReportData;
  }

  public void setSavingsAccountFulfillmentArrangementInstanceReportData(String savingsAccountFulfillmentArrangementInstanceReportData) {
    this.savingsAccountFulfillmentArrangementInstanceReportData = savingsAccountFulfillmentArrangementInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return savingsAccountFulfillmentArrangementInstanceReport
  **/

  public Object getSavingsAccountFulfillmentArrangementInstanceReport() {
    return savingsAccountFulfillmentArrangementInstanceReport;
  }

  public void setSavingsAccountFulfillmentArrangementInstanceReport(Object savingsAccountFulfillmentArrangementInstanceReport) {
    this.savingsAccountFulfillmentArrangementInstanceReport = savingsAccountFulfillmentArrangementInstanceReport;
  }


}

