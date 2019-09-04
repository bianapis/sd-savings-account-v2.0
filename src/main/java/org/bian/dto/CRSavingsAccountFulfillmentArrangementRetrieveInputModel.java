package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSavingsAccountFulfillmentArrangementRetrieveInputModelSavingsAccountFulfillmentArrangementInstanceAnalysis;
import org.bian.dto.CRSavingsAccountFulfillmentArrangementRetrieveInputModelSavingsAccountFulfillmentArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRSavingsAccountFulfillmentArrangementRetrieveInputModel
 */
public class CRSavingsAccountFulfillmentArrangementRetrieveInputModel   {
  private Object savingsAccountFulfillmentArrangementRetrieveActionTaskRecord = null;

  private String savingsAccountFulfillmentArrangementRetrieveActionRequest = null;

  private CRSavingsAccountFulfillmentArrangementRetrieveInputModelSavingsAccountFulfillmentArrangementInstanceReportRecord savingsAccountFulfillmentArrangementInstanceReportRecord = null;

  private CRSavingsAccountFulfillmentArrangementRetrieveInputModelSavingsAccountFulfillmentArrangementInstanceAnalysis savingsAccountFulfillmentArrangementInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return savingsAccountFulfillmentArrangementRetrieveActionTaskRecord
  **/

  public Object getSavingsAccountFulfillmentArrangementRetrieveActionTaskRecord() {
    return savingsAccountFulfillmentArrangementRetrieveActionTaskRecord;
  }

  public void setSavingsAccountFulfillmentArrangementRetrieveActionTaskRecord(Object savingsAccountFulfillmentArrangementRetrieveActionTaskRecord) {
    this.savingsAccountFulfillmentArrangementRetrieveActionTaskRecord = savingsAccountFulfillmentArrangementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return savingsAccountFulfillmentArrangementRetrieveActionRequest
  **/

  public String getSavingsAccountFulfillmentArrangementRetrieveActionRequest() {
    return savingsAccountFulfillmentArrangementRetrieveActionRequest;
  }

  public void setSavingsAccountFulfillmentArrangementRetrieveActionRequest(String savingsAccountFulfillmentArrangementRetrieveActionRequest) {
    this.savingsAccountFulfillmentArrangementRetrieveActionRequest = savingsAccountFulfillmentArrangementRetrieveActionRequest;
  }


  /**
   * Get savingsAccountFulfillmentArrangementInstanceReportRecord
   * @return savingsAccountFulfillmentArrangementInstanceReportRecord
  **/

  public CRSavingsAccountFulfillmentArrangementRetrieveInputModelSavingsAccountFulfillmentArrangementInstanceReportRecord getSavingsAccountFulfillmentArrangementInstanceReportRecord() {
    return savingsAccountFulfillmentArrangementInstanceReportRecord;
  }

  public void setSavingsAccountFulfillmentArrangementInstanceReportRecord(CRSavingsAccountFulfillmentArrangementRetrieveInputModelSavingsAccountFulfillmentArrangementInstanceReportRecord savingsAccountFulfillmentArrangementInstanceReportRecord) {
    this.savingsAccountFulfillmentArrangementInstanceReportRecord = savingsAccountFulfillmentArrangementInstanceReportRecord;
  }


  /**
   * Get savingsAccountFulfillmentArrangementInstanceAnalysis
   * @return savingsAccountFulfillmentArrangementInstanceAnalysis
  **/

  public CRSavingsAccountFulfillmentArrangementRetrieveInputModelSavingsAccountFulfillmentArrangementInstanceAnalysis getSavingsAccountFulfillmentArrangementInstanceAnalysis() {
    return savingsAccountFulfillmentArrangementInstanceAnalysis;
  }

  public void setSavingsAccountFulfillmentArrangementInstanceAnalysis(CRSavingsAccountFulfillmentArrangementRetrieveInputModelSavingsAccountFulfillmentArrangementInstanceAnalysis savingsAccountFulfillmentArrangementInstanceAnalysis) {
    this.savingsAccountFulfillmentArrangementInstanceAnalysis = savingsAccountFulfillmentArrangementInstanceAnalysis;
  }


}

