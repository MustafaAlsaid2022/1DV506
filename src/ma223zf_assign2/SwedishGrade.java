/*
 * SwedishGrade.java
 * Date: 9 okt 2008
 * Author: Jonas Lundberg
 */
package ma223zf_assign2;

/* An enumeration type for the swedish grading system.
 * We have added short english descriptions for each grade.
 */
public enum SwedishGrade {
   U ("Fail"),
   G ("Pass"),
   VG ("Very Good");
   
   private String description;
   
   private SwedishGrade (String desc) {description = desc;}
   
   public String getDescription() {return description;}
}
