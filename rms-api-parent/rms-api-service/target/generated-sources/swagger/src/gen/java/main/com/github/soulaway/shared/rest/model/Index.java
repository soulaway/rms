package com.github.soulaway.shared.rest.model;

import org.joda.time.LocalDate;



import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "Index", propOrder =
	{ "future", "past", "globalIndex", "calendarIndex", "dataQualityIndex"
})

@XmlRootElement(name="Index")
public class Index  {
  

  @XmlElement(name="future")
  private LocalDate future = null;

  @XmlElement(name="past")
  private LocalDate past = null;

  @XmlElement(name="global_index")
  private Float globalIndex = null;

  @XmlElement(name="calendar_index")
  private Float calendarIndex = null;

  @XmlElement(name="data_quality_index")
  private Float dataQualityIndex = null;

  /**
   * The day for which the indexes are returned (described at midnight UTC)
   **/
  
  public LocalDate getFuture() {
    return future;
  }
  public void setFuture(LocalDate future) {
    this.future = future;
  }
  /**
   * The day which the measurement quality flags were used (described at midnight UTC)
   **/
  
  public LocalDate getPast() {
    return past;
  }
  public void setPast(LocalDate past) {
    this.past = past;
  }
  /**
   * Global index that summarizes which day is the more adequate to be selected as a similar day by the system
   **/
  
  public Float getGlobalIndex() {
    return globalIndex;
  }
  public void setGlobalIndex(Float globalIndex) {
    this.globalIndex = globalIndex;
  }
  /**
   * Index used to caracterize whether the day is similar based on calendar data (day of the week, vacations..)
   **/
  
  public Float getCalendarIndex() {
    return calendarIndex;
  }
  public void setCalendarIndex(Float calendarIndex) {
    this.calendarIndex = calendarIndex;
  }
  /**
   * Index used to caracterize whether the data associated to that day and substation is of good quality.
   **/
  
  public Float getDataQualityIndex() {
    return dataQualityIndex;
  }
  public void setDataQualityIndex(Float dataQualityIndex) {
    this.dataQualityIndex = dataQualityIndex;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Index {\n");
    
    sb.append("    future: ").append(toIndentedString(future)).append("\n");
    sb.append("    past: ").append(toIndentedString(past)).append("\n");
    sb.append("    globalIndex: ").append(toIndentedString(globalIndex)).append("\n");
    sb.append("    calendarIndex: ").append(toIndentedString(calendarIndex)).append("\n");
    sb.append("    dataQualityIndex: ").append(toIndentedString(dataQualityIndex)).append("\n");
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

