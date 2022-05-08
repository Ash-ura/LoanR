package com.Ashura.LoanR.domain.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"amount",
"borrower",
"repaymentTerm",
"interestRate"
})
@Generated("jsonschema2pojo")
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class LoanApplication implements Serializable
{

@Id
private long id;
@JsonProperty("amount")
private Integer amount;
@JsonProperty("borrower")
@ManyToOne
private User borrower;
@JsonProperty("repaymentTerm")
private Integer repaymentTerm;
@JsonProperty("interestRate")
private Double interestRate;
@JsonIgnore
private HashMap<String, Object> additionalProperties = new HashMap<String, Object>();
private final static long serialVersionUID = 6946789940055047927L;


public LoanApplication() {
}

/**
*
* @param interestRate
* @param repaymentTerm
* @param amount
* @param borrower
*/
public LoanApplication(Integer amount, User borrower, Integer repaymentTerm, Double interestRate) {
super();
this.amount = amount;
this.borrower = borrower;
this.repaymentTerm = repaymentTerm;
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

@JsonProperty("borrower")
public User getBorrower() {
return borrower;
}

@JsonProperty("borrower")
public void setBorrower(User borrower) {
this.borrower = borrower;
}

@JsonProperty("repaymentTerm")
public Integer getRepaymentTerm() {
return repaymentTerm;
}

@JsonProperty("repaymentTerm")
public void setRepaymentTerm(Integer repaymentTerm) {
this.repaymentTerm = repaymentTerm;
}

@JsonProperty("interestRate")
public Double getInterestRate() {
return interestRate;
}

@JsonProperty("id")
public long getId() {
return id;
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
sb.append(LoanApplication.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
sb.append("amount");
sb.append('=');
sb.append(((this.amount == null)?"<null>":this.amount));
sb.append(',');
sb.append("borrower");
sb.append('=');
sb.append(((this.borrower == null)?"<null>":this.borrower));
sb.append(',');
sb.append("repaymentTerm");
sb.append('=');
sb.append(((this.repaymentTerm == null)?"<null>":this.repaymentTerm));
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
result = ((result* 31)+((this.borrower == null)? 0 :this.borrower.hashCode()));
result = ((result* 31)+((this.interestRate == null)? 0 :this.interestRate.hashCode()));
result = ((result* 31)+((this.repaymentTerm == null)? 0 :this.repaymentTerm.hashCode()));
result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
return result;
}

@Override
public boolean equals(Object other) {
if (other == this) {
return true;
}
if ((other instanceof LoanApplication) == false) {
return false;
}
LoanApplication rhs = ((LoanApplication) other);
return ((((((this.borrower == rhs.borrower)||((this.borrower!= null)&&this.borrower.equals(rhs.borrower)))&&((this.interestRate == rhs.interestRate)||((this.interestRate!= null)&&this.interestRate.equals(rhs.interestRate))))&&((this.repaymentTerm == rhs.repaymentTerm)||((this.repaymentTerm!= null)&&this.repaymentTerm.equals(rhs.repaymentTerm))))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
}
}