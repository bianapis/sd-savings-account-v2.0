package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAccountLienInitiateInputModelAccountLienInstanceRecordLienRecord
 */
public class BQAccountLienInitiateInputModelAccountLienInstanceRecordLienRecord   {
  private String lienOriginator = null;

  private String lienPurpose = null;

  private String lienAmount = null;

  private String lienStartDate = null;

  private String lienExpiryDate = null;

  private String lienStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The party requesting the lien 
   * @return lienOriginator
  **/

  public String getLienOriginator() {
    return lienOriginator;
  }

  public void setLienOriginator(String lienOriginator) {
    this.lienOriginator = lienOriginator;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The purpose or associated facility linked to the lien 
   * @return lienPurpose
  **/

  public String getLienPurpose() {
    return lienPurpose;
  }

  public void setLienPurpose(String lienPurpose) {
    this.lienPurpose = lienPurpose;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The amount being blocked 
   * @return lienAmount
  **/

  public String getLienAmount() {
    return lienAmount;
  }

  public void setLienAmount(String lienAmount) {
    this.lienAmount = lienAmount;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date the lien is enforced 
   * @return lienStartDate
  **/

  public String getLienStartDate() {
    return lienStartDate;
  }

  public void setLienStartDate(String lienStartDate) {
    this.lienStartDate = lienStartDate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date the lien is removed 
   * @return lienExpiryDate
  **/

  public String getLienExpiryDate() {
    return lienExpiryDate;
  }

  public void setLienExpiryDate(String lienExpiryDate) {
    this.lienExpiryDate = lienExpiryDate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status on the lien 
   * @return lienStatus
  **/

  public String getLienStatus() {
    return lienStatus;
  }

  public void setLienStatus(String lienStatus) {
    this.lienStatus = lienStatus;
  }


}

