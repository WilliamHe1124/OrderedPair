//William He
public class OrderedPair
{
    double X, Y;
    
    public OrderedPair(){
        X=0;
        Y=0;
    }
    
    public OrderedPair(double a, double b){
        X=a;
        Y=b;
    }
    
        public String toString(){
        return (X+","+Y);
    }
    
    public double getX(){
        return X;
    }
    
    public double getY(){
        return Y;
    }
}
