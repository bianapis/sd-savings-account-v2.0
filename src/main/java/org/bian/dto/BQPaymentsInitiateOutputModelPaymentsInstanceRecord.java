package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPaymentsInitiateOutputModelPaymentsInstanceRecord
 */
public class BQPaymentsInitiateOutputModelPaymentsInstanceRecord   {
  private String paymentDefinition = null;

  private String paymentProcessingOptionDefinition = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Definition of the type of payment including processing rules and guidelines 
   * @return paymentDefinition
  **/

  public String getPaymentDefinition() {
    return paymentDefinition;
  }

  public void setPaymentDefinition(String paymentDefinition) {
    this.paymentDefinition = paymentDefinition;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Definition of the processing option and impact (e.g. frequency and cumulative amount constraints) 
   * @return paymentProcessingOptionDefinition
  **/

  public String getPaymentProcessingOptionDefinition() {
    return paymentProcessingOptionDefinition;
  }

  public void setPaymentProcessingOptionDefinition(String paymentProcessingOptionDefinition) {
    this.paymentProcessingOptionDefinition = paymentProcessingOptionDefinition;
  }


}

