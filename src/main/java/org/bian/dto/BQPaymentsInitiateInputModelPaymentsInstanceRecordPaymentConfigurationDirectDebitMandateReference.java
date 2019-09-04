package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPaymentsInitiateInputModelPaymentsInstanceRecordPaymentConfigurationDirectDebitMandateReference
 */
public class BQPaymentsInitiateInputModelPaymentsInstanceRecordPaymentConfigurationDirectDebitMandateReference   {
  private String directDebitMandateSettings = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Processing settings governing direct debits 
   * @return directDebitMandateSettings
  **/

  public String getDirectDebitMandateSettings() {
    return directDebitMandateSettings;
  }

  public void setDirectDebitMandateSettings(String directDebitMandateSettings) {
    this.directDebitMandateSettings = directDebitMandateSettings;
  }


}

