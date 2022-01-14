package cCS210;
java.util.Comparator;
 public class Compare implements Comparator<Product>{
public int compare(Product p1, Product p2) {
    return p1.getName().compareTo(p2.getName());

}
public static void print(){
    Comparator<Product> compare = new Compare();
    Collections.sort(Product.products, compare);
    
    for (Product p : Product.products){
        System.out.println(p);
        System.out.println("");
    }
} 
 }
 
