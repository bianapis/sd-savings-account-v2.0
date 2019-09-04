package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSavingsAccountFulfillmentArrangementRetrieveOutputModelSavingsAccountFulfillmentArrangementInstanceAnalysis;
import org.bian.dto.CRSavingsAccountFulfillmentArrangementRetrieveOutputModelSavingsAccountFulfillmentArrangementInstanceRecord;
import org.bian.dto.CRSavingsAccountFulfillmentArrangementRetrieveOutputModelSavingsAccountFulfillmentArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRSavingsAccountFulfillmentArrangementRetrieveOutputModel
 */
public class CRSavingsAccountFulfillmentArrangementRetrieveOutputModel   {
  private CRSavingsAccountFulfillmentArrangementRetrieveOutputModelSavingsAccountFulfillmentArrangementInstanceRecord savingsAccountFulfillmentArrangementInstanceRecord = null;

  private String savingsAccountFulfillmentArrangementRetrieveActionTaskReference = null;

  private Object savingsAccountFulfillmentArrangementRetrieveActionTaskRecord = null;

  private String savingsAccountFulfillmentArrangementRetrieveActionResponse = null;

  private CRSavingsAccountFulfillmentArrangementRetrieveOutputModelSavingsAccountFulfillmentArrangementInstanceReportRecord savingsAccountFulfillmentArrangementInstanceReportRecord = null;

  private CRSavingsAccountFulfillmentArrangementRetrieveOutputModelSavingsAccountFulfillmentArrangementInstanceAnalysis savingsAccountFulfillmentArrangementInstanceAnalysis = null;


  /**
   * Get savingsAccountFulfillmentArrangementInstanceRecord
   * @return savingsAccountFulfillmentArrangementInstanceRecord
  **/

  public CRSavingsAccountFulfillmentArrangementRetrieveOutputModelSavingsAccountFulfillmentArrangementInstanceRecord getSavingsAccountFulfillmentArrangementInstanceRecord() {
    return savingsAccountFulfillmentArrangementInstanceRecord;
  }

  public void setSavingsAccountFulfillmentArrangementInstanceRecord(CRSavingsAccountFulfillmentArrangementRetrieveOutputModelSavingsAccountFulfillmentArrangementInstanceRecord savingsAccountFulfillmentArrangementInstanceRecord) {
    this.savingsAccountFulfillmentArrangementInstanceRecord = savingsAccountFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Savings Account Fulfillment Arrangement instance retrieve service call 
   * @return savingsAccountFulfillmentArrangementRetrieveActionTaskReference
  **/

  public String getSavingsAccountFulfillmentArrangementRetrieveActionTaskReference() {
    return savingsAccountFulfillmentArrangementRetrieveActionTaskReference;
  }

  public void setSavingsAccountFulfillmentArrangementRetrieveActionTaskReference(String savingsAccountFulfillmentArrangementRetrieveActionTaskReference) {
    this.savingsAccountFulfillmentArrangementRetrieveActionTaskReference = savingsAccountFulfillmentArrangementRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return savingsAccountFulfillmentArrangementRetrieveActionResponse
  **/

  public String getSavingsAccountFulfillmentArrangementRetrieveActionResponse() {
    return savingsAccountFulfillmentArrangementRetrieveActionResponse;
  }

  public void setSavingsAccountFulfillmentArrangementRetrieveActionResponse(String savingsAccountFulfillmentArrangementRetrieveActionResponse) {
    this.savingsAccountFulfillmentArrangementRetrieveActionResponse = savingsAccountFulfillmentArrangementRetrieveActionResponse;
  }


  /**
   * Get savingsAccountFulfillmentArrangementInstanceReportRecord
   * @return savingsAccountFulfillmentArrangementInstanceReportRecord
  **/

  public CRSavingsAccountFulfillmentArrangementRetrieveOutputModelSavingsAccountFulfillmentArrangementInstanceReportRecord getSavingsAccountFulfillmentArrangementInstanceReportRecord() {
    return savingsAccountFulfillmentArrangementInstanceReportRecord;
  }

  public void setSavingsAccountFulfillmentArrangementInstanceReportRecord(CRSavingsAccountFulfillmentArrangementRetrieveOutputModelSavingsAccountFulfillmentArrangementInstanceReportRecord savingsAccountFulfillmentArrangementInstanceReportRecord) {
    this.savingsAccountFulfillmentArrangementInstanceReportRecord = savingsAccountFulfillmentArrangementInstanceReportRecord;
  }


  /**
   * Get savingsAccountFulfillmentArrangementInstanceAnalysis
   * @return savingsAccountFulfillmentArrangementInstanceAnalysis
  **/

  public CRSavingsAccountFulfillmentArrangementRetrieveOutputModelSavingsAccountFulfillmentArrangementInstanceAnalysis getSavingsAccountFulfillmentArrangementInstanceAnalysis() {
    return savingsAccountFulfillmentArrangementInstanceAnalysis;
  }

  public void setSavingsAccountFulfillmentArrangementInstanceAnalysis(CRSavingsAccountFulfillmentArrangementRetrieveOutputModelSavingsAccountFulfillmentArrangementInstanceAnalysis savingsAccountFulfillmentArrangementInstanceAnalysis) {
    this.savingsAccountFulfillmentArrangementInstanceAnalysis = savingsAccountFulfillmentArrangementInstanceAnalysis;
  }


}

