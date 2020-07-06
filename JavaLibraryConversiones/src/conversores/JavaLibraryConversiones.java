/*
 *Daniel Alejandro Calderón Virgen 
 *No Lista 26
 *12:00 - 13:00 hrs 
 *09-03-2020
 */
package conversores;

public class JavaLibraryConversiones {
    
    
    //divisa
    public double pesoDolar(double peso, double dolarConversion){
        return peso*dolarConversion;
        // peso*0.052
    }    
    
    public double pesoDolar(double peso){
        return peso*0.05;
    }
    
    public double pesoEuro(double peso){
        return peso*0.04;
    }
    
    public double pesoYen(double peso){
        return peso*5.06;
    }
    
    public double pesoLibra(double peso){
        return peso*0.04;
    }    
    
    ///Volumen
    public double litrosGalones(double litros){
        return litros*0.264172;
    }
       
    public double litrosCucharaditas(double litros){
        return litros*202.8841;
    }    
    
    public double litrosPintas(double litros){
        return litros*2.113376;
    }
    
    public double litrosPiesCubicos(double litros){
        return litros*0.0353147;
    }
    
    //Longitud
    public double metrosYardas(double metros){
        return metros*1.093613;
    }
    
    public double kmMIllas(double km){
        return km*0.621371;
    }
    
    public double cmPies(double cm){
        return cm*0.0328084;
    }
    
    public double cmPulg(double cm){
        return cm*0.393701;
    }
    
    //PesoMasa
    public double kgLibras(double kg){
        return kg*2.205623;
    }
    
    public double kgOnzas(double kg){
        return kg*35.27396;
    }
    
    public double kgPiedra(double kg){
        return kg*0.157473;
    }
    
    public double gramosQuilates(double g){
        return g*5;
    }
    
    
    //Temperatura
    public double celsiusFahrenheit(double celsius){
        return celsius*9/5 + 32;
    }
       
    public double fahrenheitCelsius(double fh){
        return ((fh-32)/(1.8));
    }
        
    public double celsiusKelvin(double celsius){
        return celsius+273.15;
    }
    
    public double kelvinCelsius(double k){
        return k-273.15;
    }
    
    //Energía
    public double joulesCaloriasTermales(double joules){
        return joules*0.239006;
    }
    
    
    public double joulesCaloriasAlimentos(double joules){
        return joules*0.000239006;
    }
    
    public double kJoulesUnidadesTermicasUK(double kj){
        return kj*0.947817;
    }
    
    public double joulesPielibras(double joules){
        return joules*0.737562;
    }
    
    public double dolarPeso(double dolar){
        return dolar*21.3;
        // peso*0.052
    }
    
    public double dolarPeso(double dolar, double pesoConversion){
        return dolar*pesoConversion;
        // peso*0.052
    }    
    
    public double galonesLitros(double galones){
        return galones*3.785412;
    }
    
    public double yardasMetros(double yardas){
        return yardas*0.9144;
    }
    
    public double librasKg(double libras){
        return libras*0.453592;
    }
    
    
    public double caloriastermalesJoules(double calT){
        return calT*4.184;
    }
   
}
