package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceReport
 */
public class BQDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceReport   {
  private Object depositsAndWithdrawalsInstanceReportRecord = null;

  private String depositsAndWithdrawalsInstanceReportType = null;

  private String depositsAndWithdrawalsInstanceReportParameters = null;

  private Object depositsAndWithdrawalsInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return depositsAndWithdrawalsInstanceReportRecord
  **/

  public Object getDepositsAndWithdrawalsInstanceReportRecord() {
    return depositsAndWithdrawalsInstanceReportRecord;
  }

  public void setDepositsAndWithdrawalsInstanceReportRecord(Object depositsAndWithdrawalsInstanceReportRecord) {
    this.depositsAndWithdrawalsInstanceReportRecord = depositsAndWithdrawalsInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return depositsAndWithdrawalsInstanceReportType
  **/

  public String getDepositsAndWithdrawalsInstanceReportType() {
    return depositsAndWithdrawalsInstanceReportType;
  }

  public void setDepositsAndWithdrawalsInstanceReportType(String depositsAndWithdrawalsInstanceReportType) {
    this.depositsAndWithdrawalsInstanceReportType = depositsAndWithdrawalsInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return depositsAndWithdrawalsInstanceReportParameters
  **/

  public String getDepositsAndWithdrawalsInstanceReportParameters() {
    return depositsAndWithdrawalsInstanceReportParameters;
  }

  public void setDepositsAndWithdrawalsInstanceReportParameters(String depositsAndWithdrawalsInstanceReportParameters) {
    this.depositsAndWithdrawalsInstanceReportParameters = depositsAndWithdrawalsInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return depositsAndWithdrawalsInstanceReport
  **/

  public Object getDepositsAndWithdrawalsInstanceReport() {
    return depositsAndWithdrawalsInstanceReport;
  }

  public void setDepositsAndWithdrawalsInstanceReport(Object depositsAndWithdrawalsInstanceReport) {
    this.depositsAndWithdrawalsInstanceReport = depositsAndWithdrawalsInstanceReport;
  }


}

