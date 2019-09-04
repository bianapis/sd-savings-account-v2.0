package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServiceFeesInitiateOutputModelSavingsAccountFulfillmentArrangementInstanceRecord;
import org.bian.dto.BQServiceFeesInitiateOutputModelServiceFeesInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQServiceFeesInitiateOutputModel
 */
public class BQServiceFeesInitiateOutputModel   {
  private BQServiceFeesInitiateOutputModelSavingsAccountFulfillmentArrangementInstanceRecord savingsAccountFulfillmentArrangementInstanceRecord = null;

  private String serviceFeesInstanceReference = null;

  private String serviceFeesInitiateActionReference = null;

  private Object serviceFeesInitiateActionRecord = null;

  private String serviceFeesInstanceStatus = null;

  private BQServiceFeesInitiateOutputModelServiceFeesInstanceRecord serviceFeesInstanceRecord = null;


  /**
   * Get savingsAccountFulfillmentArrangementInstanceRecord
   * @return savingsAccountFulfillmentArrangementInstanceRecord
  **/

  public BQServiceFeesInitiateOutputModelSavingsAccountFulfillmentArrangementInstanceRecord getSavingsAccountFulfillmentArrangementInstanceRecord() {
    return savingsAccountFulfillmentArrangementInstanceRecord;
  }

  public void setSavingsAccountFulfillmentArrangementInstanceRecord(BQServiceFeesInitiateOutputModelSavingsAccountFulfillmentArrangementInstanceRecord savingsAccountFulfillmentArrangementInstanceRecord) {
    this.savingsAccountFulfillmentArrangementInstanceRecord = savingsAccountFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Service Fees instance 
   * @return serviceFeesInstanceReference
  **/

  public String getServiceFeesInstanceReference() {
    return serviceFeesInstanceReference;
  }

  public void setServiceFeesInstanceReference(String serviceFeesInstanceReference) {
    this.serviceFeesInstanceReference = serviceFeesInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return serviceFeesInitiateActionReference
  **/

  public String getServiceFeesInitiateActionReference() {
    return serviceFeesInitiateActionReference;
  }

  public void setServiceFeesInitiateActionReference(String serviceFeesInitiateActionReference) {
    this.serviceFeesInitiateActionReference = serviceFeesInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return serviceFeesInitiateActionRecord
  **/

  public Object getServiceFeesInitiateActionRecord() {
    return serviceFeesInitiateActionRecord;
  }

  public void setServiceFeesInitiateActionRecord(Object serviceFeesInitiateActionRecord) {
    this.serviceFeesInitiateActionRecord = serviceFeesInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Service Fees instance (e.g. initialised, pending, active) 
   * @return serviceFeesInstanceStatus
  **/

  public String getServiceFeesInstanceStatus() {
    return serviceFeesInstanceStatus;
  }

  public void setServiceFeesInstanceStatus(String serviceFeesInstanceStatus) {
    this.serviceFeesInstanceStatus = serviceFeesInstanceStatus;
  }


  /**
   * Get serviceFeesInstanceRecord
   * @return serviceFeesInstanceRecord
  **/

  public BQServiceFeesInitiateOutputModelServiceFeesInstanceRecord getServiceFeesInstanceRecord() {
    return serviceFeesInstanceRecord;
  }

  public void setServiceFeesInstanceRecord(BQServiceFeesInitiateOutputModelServiceFeesInstanceRecord serviceFeesInstanceRecord) {
    this.serviceFeesInstanceRecord = serviceFeesInstanceRecord;
  }


}

