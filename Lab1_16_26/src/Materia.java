/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dayae
 */
public class Materia {
    
    private String mat;
    private boolean aprobada;

    public Materia(String mat, boolean aprobada) {
        this.mat = mat;
        this.aprobada = aprobada;
    }

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public boolean isAprobada() {
        return aprobada;
    }

    public void setAprobada(boolean aprobada) {
        this.aprobada = aprobada;
    }
    
    
    
}
