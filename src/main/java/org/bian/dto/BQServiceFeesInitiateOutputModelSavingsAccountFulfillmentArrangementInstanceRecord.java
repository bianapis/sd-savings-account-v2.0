package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSavingsAccountFulfillmentArrangementInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecordDateType;

import javax.validation.Valid;
  
/**
 * BQServiceFeesInitiateOutputModelSavingsAccountFulfillmentArrangementInstanceRecord
 */
public class BQServiceFeesInitiateOutputModelSavingsAccountFulfillmentArrangementInstanceRecord   {
  private CRSavingsAccountFulfillmentArrangementInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecordDateType dateType = null;


  /**
   * Get dateType
   * @return dateType
  **/

  public CRSavingsAccountFulfillmentArrangementInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(CRSavingsAccountFulfillmentArrangementInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecordDateType dateType) {
    this.dateType = dateType;
  }


}

