package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSavingsAccountFulfillmentArrangementUpdateInputModelSavingsAccountFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRSavingsAccountFulfillmentArrangementUpdateOutputModel
 */
public class CRSavingsAccountFulfillmentArrangementUpdateOutputModel   {
  private CRSavingsAccountFulfillmentArrangementUpdateInputModelSavingsAccountFulfillmentArrangementInstanceRecord savingsAccountFulfillmentArrangementInstanceRecord = null;

  private String savingsAccountFulfillmentArrangementUpdateActionTaskReference = null;

  private Object savingsAccountFulfillmentArrangementUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get savingsAccountFulfillmentArrangementInstanceRecord
   * @return savingsAccountFulfillmentArrangementInstanceRecord
  **/

  public CRSavingsAccountFulfillmentArrangementUpdateInputModelSavingsAccountFulfillmentArrangementInstanceRecord getSavingsAccountFulfillmentArrangementInstanceRecord() {
    return savingsAccountFulfillmentArrangementInstanceRecord;
  }

  public void setSavingsAccountFulfillmentArrangementInstanceRecord(CRSavingsAccountFulfillmentArrangementUpdateInputModelSavingsAccountFulfillmentArrangementInstanceRecord savingsAccountFulfillmentArrangementInstanceRecord) {
    this.savingsAccountFulfillmentArrangementInstanceRecord = savingsAccountFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return savingsAccountFulfillmentArrangementUpdateActionTaskReference
  **/

  public String getSavingsAccountFulfillmentArrangementUpdateActionTaskReference() {
    return savingsAccountFulfillmentArrangementUpdateActionTaskReference;
  }

  public void setSavingsAccountFulfillmentArrangementUpdateActionTaskReference(String savingsAccountFulfillmentArrangementUpdateActionTaskReference) {
    this.savingsAccountFulfillmentArrangementUpdateActionTaskReference = savingsAccountFulfillmentArrangementUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return savingsAccountFulfillmentArrangementUpdateActionTaskRecord
  **/

  public Object getSavingsAccountFulfillmentArrangementUpdateActionTaskRecord() {
    return savingsAccountFulfillmentArrangementUpdateActionTaskRecord;
  }

  public void setSavingsAccountFulfillmentArrangementUpdateActionTaskRecord(Object savingsAccountFulfillmentArrangementUpdateActionTaskRecord) {
    this.savingsAccountFulfillmentArrangementUpdateActionTaskRecord = savingsAccountFulfillmentArrangementUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

