package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAccountLienRetrieveOutputModelAccountLienInstanceReport
 */
public class BQAccountLienRetrieveOutputModelAccountLienInstanceReport   {
  private Object accountLienInstanceReportRecord = null;

  private String accountLienInstanceReportType = null;

  private String accountLienInstanceReportParameters = null;

  private Object accountLienInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return accountLienInstanceReportRecord
  **/

  public Object getAccountLienInstanceReportRecord() {
    return accountLienInstanceReportRecord;
  }

  public void setAccountLienInstanceReportRecord(Object accountLienInstanceReportRecord) {
    this.accountLienInstanceReportRecord = accountLienInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return accountLienInstanceReportType
  **/

  public String getAccountLienInstanceReportType() {
    return accountLienInstanceReportType;
  }

  public void setAccountLienInstanceReportType(String accountLienInstanceReportType) {
    this.accountLienInstanceReportType = accountLienInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return accountLienInstanceReportParameters
  **/

  public String getAccountLienInstanceReportParameters() {
    return accountLienInstanceReportParameters;
  }

  public void setAccountLienInstanceReportParameters(String accountLienInstanceReportParameters) {
    this.accountLienInstanceReportParameters = accountLienInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return accountLienInstanceReport
  **/

  public Object getAccountLienInstanceReport() {
    return accountLienInstanceReport;
  }

  public void setAccountLienInstanceReport(Object accountLienInstanceReport) {
    this.accountLienInstanceReport = accountLienInstanceReport;
  }


}

