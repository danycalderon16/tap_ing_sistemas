/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montecarlopi;

/**
 *
 * @author Calderon
 */
public class Aproximacion {
    
    public static void main(String[] args) {
        System.out.println("3.141592653 ≈"+piMonteCarloAvg(1000000));
    }    
    
    private static double piMonteCarlo(int n) {
        double[] x = new double[n];
        double[] y = new double[n];
        double pi_avg = 0;
        double pi_value = 0;
        double pi =0;
        for (int j = 0; j < n; j++) {
            double z = 0;
            int value = 0;  
            x[j]=Math.random();
            y[j]=Math.random();
            z = Math.sqrt(x[j] * x[j] + y[j] * y[j]);
                if(z<=1)
                    value++;
            float float_value = value;
            pi_value = float_value* 4 / n;
            pi_avg += pi_value;
            
            }
         pi = pi_avg/n;
        return pi;
    }
    
        private static double piMonteCarloAvg(int n) {
        double[] x = new double[n];
        double[] y = new double[n];
        double pi_avg = 0;
        double pi_value = 0;
        double pi =0;
        for (int j = 0; j < n; j++) {
                x[j]=Math.random();
                y[j]=Math.random();
            }
        for(int i=0;i<n;i++){
            double z = 0;
            int value = 0;            
            for (int j = 0; j < n; j++) {
                z = Math.sqrt(x[j] * x[j] + y[j] * y[j]);
                if(z<=1)
                    value++;
            }
            float float_value = value;
            pi_value = float_value* 4 / n;
            pi_avg += pi_value;
        }
        pi = pi_avg/n;
        return pi;
    }
    
}
