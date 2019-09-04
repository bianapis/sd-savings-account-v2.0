package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQIssuedDeviceInitiateOutputModelSavingsAccountFulfillmentArrangementInstanceRecordAssociations;
import org.bian.dto.CRSavingsAccountFulfillmentArrangementInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecordDateType;
import org.bian.dto.CRSavingsAccountFulfillmentArrangementInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecordPositionLimits;

import javax.validation.Valid;
  
/**
 * BQIssuedDeviceInitiateOutputModelSavingsAccountFulfillmentArrangementInstanceRecord
 */
public class BQIssuedDeviceInitiateOutputModelSavingsAccountFulfillmentArrangementInstanceRecord   {
  private BQIssuedDeviceInitiateOutputModelSavingsAccountFulfillmentArrangementInstanceRecordAssociations associations = null;

  private CRSavingsAccountFulfillmentArrangementInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecordPositionLimits positionLimits = null;

  private CRSavingsAccountFulfillmentArrangementInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecordDateType dateType = null;


  /**
   * Get associations
   * @return associations
  **/

  public BQIssuedDeviceInitiateOutputModelSavingsAccountFulfillmentArrangementInstanceRecordAssociations getAssociations() {
    return associations;
  }

  public void setAssociations(BQIssuedDeviceInitiateOutputModelSavingsAccountFulfillmentArrangementInstanceRecordAssociations associations) {
    this.associations = associations;
  }


  /**
   * Get positionLimits
   * @return positionLimits
  **/

  public CRSavingsAccountFulfillmentArrangementInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecordPositionLimits getPositionLimits() {
    return positionLimits;
  }

  public void setPositionLimits(CRSavingsAccountFulfillmentArrangementInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecordPositionLimits positionLimits) {
    this.positionLimits = positionLimits;
  }


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

