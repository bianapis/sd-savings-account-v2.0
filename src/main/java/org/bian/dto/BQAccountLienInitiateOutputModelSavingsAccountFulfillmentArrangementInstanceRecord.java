package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAccountLienInitiateOutputModelSavingsAccountFulfillmentArrangementInstanceRecordPositionLimits;
import org.bian.dto.CRSavingsAccountFulfillmentArrangementInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecordDateType;

import javax.validation.Valid;
  
/**
 * BQAccountLienInitiateOutputModelSavingsAccountFulfillmentArrangementInstanceRecord
 */
public class BQAccountLienInitiateOutputModelSavingsAccountFulfillmentArrangementInstanceRecord   {
  private String entitlementOptionDefinition = null;

  private String restrictionOptionDefinition = null;

  private BQAccountLienInitiateOutputModelSavingsAccountFulfillmentArrangementInstanceRecordPositionLimits positionLimits = null;

  private CRSavingsAccountFulfillmentArrangementInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecordDateType dateType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The definition of an applicable entitlement option 
   * @return entitlementOptionDefinition
  **/

  public String getEntitlementOptionDefinition() {
    return entitlementOptionDefinition;
  }

  public void setEntitlementOptionDefinition(String entitlementOptionDefinition) {
    this.entitlementOptionDefinition = entitlementOptionDefinition;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The definition of an applicable restriction option 
   * @return restrictionOptionDefinition
  **/

  public String getRestrictionOptionDefinition() {
    return restrictionOptionDefinition;
  }

  public void setRestrictionOptionDefinition(String restrictionOptionDefinition) {
    this.restrictionOptionDefinition = restrictionOptionDefinition;
  }


  /**
   * Get positionLimits
   * @return positionLimits
  **/

  public BQAccountLienInitiateOutputModelSavingsAccountFulfillmentArrangementInstanceRecordPositionLimits getPositionLimits() {
    return positionLimits;
  }

  public void setPositionLimits(BQAccountLienInitiateOutputModelSavingsAccountFulfillmentArrangementInstanceRecordPositionLimits positionLimits) {
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

