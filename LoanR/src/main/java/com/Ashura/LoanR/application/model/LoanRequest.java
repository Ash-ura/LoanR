package com.Ashura.LoanR.application.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import com.Ashura.LoanR.domain.model.AllArgsConstructor;
import com.Ashura.LoanR.domain.model.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"amount",
"borrowerId",
"daysToRepay",
"interestRate"
})
@Generated("jsonschema2pojo")
@NoArgsConstructor
@AllArgsConstructor
public class LoanRequest implements Serializable
{

@JsonProperty("amount")
private Integer amount;
@JsonProperty("borrowerId")
private Long borrowerId;
@JsonProperty("daysToRepay")
private Integer daysToRepay;
@JsonProperty("interestRate")
private Double interestRate;
@JsonIgnore
private HashMap<String, Object> additionalProperties = new HashMap<String, Object>();
private final static long serialVersionUID = -5386909647871068807L;


public LoanRequest() {
}

/**
*
* @param interestRate
* @param borrowerId
* @param amount
* @param daysToRepay
*/
public LoanRequest(Integer amount, Long borrowerId, Integer daysToRepay, Double interestRate) {
super();
this.amount = amount;
this.borrowerId = borrowerId;
this.daysToRepay = daysToRepay;
this.interestRate = interestRate;
}

@JsonProperty("amount")
public Integer getAmount() {
return amount;
}

@JsonProperty("amount")
public void setAmount(Integer amount) {
this.amount = amount;
}

@JsonProperty("borrowerId")
public Long getBorrowerId() {
return borrowerId;
}

@JsonProperty("borrowerId")
public void setBorrowerId(Long borrowerId) {
this.borrowerId = borrowerId;
}

@JsonProperty("daysToRepay")
public Integer getDaysToRepay() {
return daysToRepay;
}

@JsonProperty("daysToRepay")
public void setDaysToRepay(Integer daysToRepay) {
this.daysToRepay = daysToRepay;
}

@JsonProperty("interestRate")
public Double getInterestRate() {
return interestRate;
}

@JsonProperty("interestRate")
public void setInterestRate(Double interestRate) {
this.interestRate = interestRate;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append(LoanRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
sb.append("amount");
sb.append('=');
sb.append(((this.amount == null)?"<null>":this.amount));
sb.append(',');
sb.append("borrowerId");
sb.append('=');
sb.append(((this.borrowerId == null)?"<null>":this.borrowerId));
sb.append(',');
sb.append("daysToRepay");
sb.append('=');
sb.append(((this.daysToRepay == null)?"<null>":this.daysToRepay));
sb.append(',');
sb.append("interestRate");
sb.append('=');
sb.append(((this.interestRate == null)?"<null>":this.interestRate));
sb.append(',');
sb.append("additionalProperties");
sb.append('=');
sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
sb.append(',');
if (sb.charAt((sb.length()- 1)) == ',') {
sb.setCharAt((sb.length()- 1), ']');
} else {
sb.append(']');
}
return sb.toString();
}

@Override
public int hashCode() {
int result = 1;
result = ((result* 31)+((this.interestRate == null)? 0 :this.interestRate.hashCode()));
result = ((result* 31)+((this.borrowerId == null)? 0 :this.borrowerId.hashCode()));
result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
result = ((result* 31)+((this.daysToRepay == null)? 0 :this.daysToRepay.hashCode()));
result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
return result;
}

@Override
public boolean equals(Object other) {
if (other == this) {
return true;
}
if ((other instanceof LoanRequest) == false) {
return false;
}
LoanRequest rhs = ((LoanRequest) other);
return ((((((this.interestRate == rhs.interestRate)||((this.interestRate!= null)&&this.interestRate.equals(rhs.interestRate)))&&((this.borrowerId == rhs.borrowerId)||((this.borrowerId!= null)&&this.borrowerId.equals(rhs.borrowerId))))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.daysToRepay == rhs.daysToRepay)||((this.daysToRepay!= null)&&this.daysToRepay.equals(rhs.daysToRepay))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
}

}