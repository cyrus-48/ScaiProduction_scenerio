package cCS210;

 
import java.util.Date;
abstract class Product implements Item, Comparable<Product>
{
int serialNumber;
static String manufacturer;
Date manufacturedOn;
String name;
//Integer class variable called currentProductionNumber. This will store the next number to be
//assigned to serialNumber.
private static int currentProductionNumber = 1;

//A constructor that will take in the name of the product and set this to the field variable name.
//Assign a serial number from the currentProductionNumber. The
//currentProductionNumber will be incremented in readiness for the next instance.
//Set manufacturedOn as the current date and time.
public Product(String name){
    
        manufacturer = Item.manufacturer; // to get the string name assigned in the item interface
        this.name = name;
        serialNumber = currentProductionNumber++;
        manufacturedOn = new Date();
        }
//impplementing the nethods from the item interface.
@Override
//setting production number 
public void setProductionNumber(int productionNumber){
        serialNumber = productionNumber;
}
@Override
//implememting the set name methid
public void setName(String name){
        this.name = name;
}
@Override
// implementing get name method from item interface
public String getName()
{
        return name;
}
@Override
//implementing the date method from item interface
public Date getManufactureDate(){
      return manufacturedOn;
}
@Override
//getting serial number 
public int getSerialNumber(){
       return serialNumber;
}
//Will return the data of the product
@Override
public String toString(){
return "Manufacturer : " + manufacturer  +"\n" + "Serial Number : " + serialNumber +"\n" + "Date          : " + manufacturedOn +  "\n" +"Name:" + name + "\n";
}
// compares the products in the product class and sorts the items 
@Override
public int compareTo(Product p){
return this.getName().compareTo(p.getName());
}
}