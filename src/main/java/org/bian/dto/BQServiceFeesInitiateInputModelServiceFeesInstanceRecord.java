package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServiceFeesInitiateInputModelServiceFeesInstanceRecordFeeConfigurationProfile;

import javax.validation.Valid;
  
/**
 * BQServiceFeesInitiateInputModelServiceFeesInstanceRecord
 */
public class BQServiceFeesInitiateInputModelServiceFeesInstanceRecord   {
  private BQServiceFeesInitiateInputModelServiceFeesInstanceRecordFeeConfigurationProfile feeConfigurationProfile = null;


  /**
   * Get feeConfigurationProfile
   * @return feeConfigurationProfile
  **/

  public BQServiceFeesInitiateInputModelServiceFeesInstanceRecordFeeConfigurationProfile getFeeConfigurationProfile() {
    return feeConfigurationProfile;
  }

  public void setFeeConfigurationProfile(BQServiceFeesInitiateInputModelServiceFeesInstanceRecordFeeConfigurationProfile feeConfigurationProfile) {
    this.feeConfigurationProfile = feeConfigurationProfile;
  }


}

