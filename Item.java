package cCS210;



import java.util.Date;
public interface Item{
public final static String manufacturer = "ScaiProduction";
//Methods for all future items
void setProductionNumber(int productionNumber);
void setName(String name);
// method to set name of the product
String getName();
 // method to return the name of the product
Date getManufactureDate(); 
// defining the method to return the current
int getSerialNumber();
//definging method to  return the serial number
}



