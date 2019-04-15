import java.util.*;
import java.lang.Math;
public class Employee{
    private int id;
    private String name;
    private static hra = 0.5;
    private double monthlyBasic;
    double conveyance = 800;
    static int medical =1250;

    public double getAnnualBasic(){
        return (12*monthlyBasic);
    }
    
    public double getMonthlyGrossSalary(){
        return (monthlyBasic + hra*monthlyBasic + medical + conveyance);
    }

    public double getAnnualGrossSalary(){
        return (12*getMonthlyGrossSalary());
    }
    
    public double getMonthlyDeductions(){
        return (getPFRate()+esic()+professionalTax());
    }

    public double getMonthlyTakeHome(){
        return  (getMonthlyGrossSalary()-getMonthlyDeductions()); 
    }
    
    public double getAnnualTakeHome(){
        return (12*getMonthlyTakeHome());
    }
    
    public double getPFRate() {
     
        return (Math.min(0.1*monthlyBasic,6500));   
    }

    public double hra(double monthlyBasic){

     return (0.5*monthlyBasic);
    
    }
    public double esic(double monthlyBasic) {
       if(monthlyBasic <= 5000) 
        return esic = 0.00475 * monthlyBasic;

    }
    public double professionalTax(double monthlyBasic) {
        if(getMonthlyGrossSalary() <= 10000){
            return 50;
        }
        else return 100;
    }
}
























