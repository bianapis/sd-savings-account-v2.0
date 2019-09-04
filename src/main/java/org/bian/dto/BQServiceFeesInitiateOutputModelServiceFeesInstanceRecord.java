package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServiceFeesInitiateOutputModelServiceFeesInstanceRecordFeeConfigurationProfile;

import javax.validation.Valid;
  
/**
 * BQServiceFeesInitiateOutputModelServiceFeesInstanceRecord
 */
public class BQServiceFeesInitiateOutputModelServiceFeesInstanceRecord   {
  private BQServiceFeesInitiateOutputModelServiceFeesInstanceRecordFeeConfigurationProfile feeConfigurationProfile = null;


  /**
   * Get feeConfigurationProfile
   * @return feeConfigurationProfile
  **/

  public BQServiceFeesInitiateOutputModelServiceFeesInstanceRecordFeeConfigurationProfile getFeeConfigurationProfile() {
    return feeConfigurationProfile;
  }

  public void setFeeConfigurationProfile(BQServiceFeesInitiateOutputModelServiceFeesInstanceRecordFeeConfigurationProfile feeConfigurationProfile) {
    this.feeConfigurationProfile = feeConfigurationProfile;
  }


}

