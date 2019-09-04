package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAccountSweepRetrieveOutputModelAccountSweepInstanceReport
 */
public class BQAccountSweepRetrieveOutputModelAccountSweepInstanceReport   {
  private Object accountSweepInstanceReportRecord = null;

  private String accountSweepInstanceReportType = null;

  private String accountSweepInstanceReportParameters = null;

  private Object accountSweepInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return accountSweepInstanceReportRecord
  **/

  public Object getAccountSweepInstanceReportRecord() {
    return accountSweepInstanceReportRecord;
  }

  public void setAccountSweepInstanceReportRecord(Object accountSweepInstanceReportRecord) {
    this.accountSweepInstanceReportRecord = accountSweepInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return accountSweepInstanceReportType
  **/

  public String getAccountSweepInstanceReportType() {
    return accountSweepInstanceReportType;
  }

  public void setAccountSweepInstanceReportType(String accountSweepInstanceReportType) {
    this.accountSweepInstanceReportType = accountSweepInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return accountSweepInstanceReportParameters
  **/

  public String getAccountSweepInstanceReportParameters() {
    return accountSweepInstanceReportParameters;
  }

  public void setAccountSweepInstanceReportParameters(String accountSweepInstanceReportParameters) {
    this.accountSweepInstanceReportParameters = accountSweepInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return accountSweepInstanceReport
  **/

  public Object getAccountSweepInstanceReport() {
    return accountSweepInstanceReport;
  }

  public void setAccountSweepInstanceReport(Object accountSweepInstanceReport) {
    this.accountSweepInstanceReport = accountSweepInstanceReport;
  }


}

