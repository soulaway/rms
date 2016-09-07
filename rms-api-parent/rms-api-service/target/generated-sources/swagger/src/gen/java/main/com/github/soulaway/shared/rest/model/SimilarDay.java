package com.github.soulaway.shared.rest.model;

import org.joda.time.LocalDate;



import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "SimilarDay", propOrder =
	{ "similarDay", "lastOverride"
})

@XmlRootElement(name="SimilarDay")
public class SimilarDay  {
  

  @XmlElement(name="similar_day")
  private LocalDate similarDay = null;

  @XmlElement(name="last_override")
  private LocalDate lastOverride = null;

  /**
   * The similar day (described at midnight UTC)
   **/
  
  public LocalDate getSimilarDay() {
    return similarDay;
  }
  public void setSimilarDay(LocalDate similarDay) {
    this.similarDay = similarDay;
  }
  /**
   * The last time a manual override as been made (if not, returns an empty string)
   **/
  
  public LocalDate getLastOverride() {
    return lastOverride;
  }
  public void setLastOverride(LocalDate lastOverride) {
    this.lastOverride = lastOverride;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimilarDay {\n");
    
    sb.append("    similarDay: ").append(toIndentedString(similarDay)).append("\n");
    sb.append("    lastOverride: ").append(toIndentedString(lastOverride)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

