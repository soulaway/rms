package com.github.soulaway.shared.rest.model;

import com.github.soulaway.shared.rest.model.Index;
import java.util.ArrayList;
import java.util.List;



import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "Indexes", propOrder =
	{ "index"
})

@XmlRootElement(name="Indexes")
public class Indexes  {
  

  @XmlElement(name="index")
  private List<Index> index = new ArrayList<Index>();

  /**
   * Common collection holder for xml binding of Index model
   **/
  
  public List<Index> getIndex() {
    return index;
  }
  public void setIndex(List<Index> index) {
    this.index = index;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Indexes {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
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

