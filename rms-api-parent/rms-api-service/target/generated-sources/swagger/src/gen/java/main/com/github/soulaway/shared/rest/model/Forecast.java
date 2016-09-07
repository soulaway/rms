package com.github.soulaway.shared.rest.model;




import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "Forecast", propOrder =
	{ "entity", "scheduleType", "scheduleProvider", "values"
})

@XmlRootElement(name="Forecast")
public class Forecast  {
  

  @XmlElement(name="entity")
  private String entity = null;

  @XmlElement(name="schedule_type")
  private String scheduleType = null;

  @XmlElement(name="schedule_provider")
  private String scheduleProvider = null;

  @XmlElement(name="values")
  private String values = null;

  /**
   * The name of the substation for the residual load forecast
   **/
  
  public String getEntity() {
    return entity;
  }
  public void setEntity(String entity) {
    this.entity = entity;
  }
  /**
   * The nature of the schedule (Residual Load Forecast)
   **/
  
  public String getScheduleType() {
    return scheduleType;
  }
  public void setScheduleType(String scheduleType) {
    this.scheduleType = scheduleType;
  }
  /**
   * The value will be \"STEDIN T-Forecast Engine\"
   **/
  
  public String getScheduleProvider() {
    return scheduleProvider;
  }
  public void setScheduleProvider(String scheduleProvider) {
    this.scheduleProvider = scheduleProvider;
  }
  /**
   * The series based on a specific format [time1,value1], [time2,value2]
   **/
  
  public String getValues() {
    return values;
  }
  public void setValues(String values) {
    this.values = values;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Forecast {\n");
    
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    scheduleType: ").append(toIndentedString(scheduleType)).append("\n");
    sb.append("    scheduleProvider: ").append(toIndentedString(scheduleProvider)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

