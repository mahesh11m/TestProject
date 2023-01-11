class invalidexception extends Exception{
    public String toString(){
        return "cannot add 8 & 9";
    }
    public String getmessage(){
        return "i am getmessage";
    }
}
class cannotdividebyzeroexception extends Exception{
    public String toString(){
        return "cannot add 8 & 9";
    }
    public String getmessage(){
        return "i am getmessage";
    }
}
class maxinputexception extends Exception{
    public String toString(){
        return "cannot add 8 & 9";
    }
    public String getmessage(){
        return "i am getmessage";
    }
}
class maxmultiplyinputexception extends Exception{
    public String toString(){
        return "cannot add 8 & 9";
    }
    public String getmessage(){
        return "i am getmessage";
    }
}
class customcalculator{
    double add(double a,double b)throws invalidexception,maxinputexception,maxinputexception{
        if (a==8 || b==9){
            throw new invalidexception();
        }
        return a+b;}
        double sub(double a,double b){
            return a-b;}
            double mult(double a,double b){
                return a*b;}
                double div(double a,double b){
                    return a/b;

    }
}
public class cwh_103_ex6sol {
    public static void main(String[] args)throws invalidexception {
        customcalculator c=new customcalculator();
    //    c.add(4,8);



    }
}
