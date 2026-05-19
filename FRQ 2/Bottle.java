public class Bottle{
    private double capacity;
    private double filled;
  
    public Bottle(double capacity){
        this.capacity = capacity;
        filled = capacity;
    }

    public double updateAmount(double taken){
        if(filled - taken < capacity / 4){
            filled = capacity;
            return capacity;
        }

        filled -= taken;
        return filled;
    }
  
}
