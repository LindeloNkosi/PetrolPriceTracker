package prog6112ea2019q1;

/**
 *
 * @author lindelo Desiree Nkosi
 */
public class Petrol {
   
    private String year;
    private String city;
    private double price;
    
    public Petrol( String year, String city,double price){
       this.year = year;
        this.city = city;
       this.price = price;
    }
    
   public Petrol(Petrol source){
       this.year = source.year;
       this.city = source.city;
       this.price = source.price;
   }
    
    public String getYear(){
        return this.year;
    }
   
    public String getCity(){
        return this.city;
       }
    
    public double getPrice(){
        return this.price;
    }
}
