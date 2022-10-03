package Process;

import Model.Numbers;

public class Operations {
    
    public String sum(Numbers numbers){
        String data = "";
        if(isNumeric(numbers.getNumber1()) == true && isNumeric(numbers.getNumber2()) == true){            
            float sum = Float.parseFloat(numbers.getNumber1()) + Float.parseFloat(numbers.getNumber2());
            data = ""+sum;
        }else{
            data = "Only numeric values ​​can be added.";
        }   
        return data; 
    }
    
    public String subtract(Numbers numbers){
        String data = "";
        if(isNumeric(numbers.getNumber1()) == true && isNumeric(numbers.getNumber2()) == true){ 
            float res = Float.parseFloat(numbers.getNumber1()) - Float.parseFloat(numbers.getNumber2());
            data = ""+res;
        }else{
            data = "Only numeric values ​​can be subtracted.";
        }
        return data;
    }
    
    public String multiply(Numbers numbers){
        String data = "";
        if(isNumeric(numbers.getNumber1()) == true && isNumeric(numbers.getNumber2()) == true){ 
            float mult = Float.parseFloat(numbers.getNumber1()) * Float.parseFloat(numbers.getNumber2());
            data = ""+mult;
        }else{
            data = "Only numeric values can be multiply.";
        }
        return data;
    }
    public String divide(Numbers numbers){
        String data = "";
        if(isNumeric(numbers.getNumber1()) == true && isNumeric(numbers.getNumber2()) == true){ 
            if(Float.parseFloat(numbers.getNumber2())!=0.0){
                float div = Float.parseFloat(numbers.getNumber1()) / Float.parseFloat(numbers.getNumber2());
                data = ""+div;
            }else{
                data = "You cannot divide a number by 0.";
            }           
            
        }else{
            data = "Only numeric values can be divided.";
        }
        return data; 
    }
    
     public static boolean isNumeric(String cadena) {
        boolean isNumber = true;
         try {
             Float.parseFloat(cadena);
         } catch (Exception e) {
             isNumber = false;
         }        
        return isNumber;
    }
}
