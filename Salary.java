public class Salary {
    double salary(double basic){
           return basic;
    }
    double salary(double basic, double da){
           return basic+da;
    }
    double salary(double basic, double da, double hra){
           return basic+da+hra;
    }
    public static void main(String[] args){
           Salary sc=new Salary();
           double basic=300000;
           double da=50000;
           double hra=7000;
           System.out.println("Salary with basic only:" +sc.salary(basic));
           System.out.println("Salary with basic and da:" +sc.salary(basic,da));
           System.out.println("Salary with basic, da and hra:" +sc.salary(basic,da,hra));
    }
}