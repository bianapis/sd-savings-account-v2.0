package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAccountLienInitiateInputModelAccountLienInstanceRecordLienRecord;

import javax.validation.Valid;
  
/**
 * BQAccountLienUpdateInputModelAccountLienInstanceRecord
 */
public class BQAccountLienUpdateInputModelAccountLienInstanceRecord   {
  private String lienType = null;

  private String lienProcessingOption = null;

  private BQAccountLienInitiateInputModelAccountLienInstanceRecordLienRecord lienRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of lien (e.g. final, pending) 
   * @return lienType
  **/

  public String getLienType() {
    return lienType;
  }

  public void setLienType(String lienType) {
    this.lienType = lienType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The processing option applied to the lien 
   * @return lienProcessingOption
  **/

  public String getLienProcessingOption() {
    return lienProcessingOption;
  }

  public void setLienProcessingOption(String lienProcessingOption) {
    this.lienProcessingOption = lienProcessingOption;
  }


  /**
   * Get lienRecord
   * @return lienRecord
  **/

  public BQAccountLienInitiateInputModelAccountLienInstanceRecordLienRecord getLienRecord() {
    return lienRecord;
  }

  public void setLienRecord(BQAccountLienInitiateInputModelAccountLienInstanceRecordLienRecord lienRecord) {
    this.lienRecord = lienRecord;
  }


}

