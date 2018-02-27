/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.otr;

/**
 *
 * @author T-102
 */
public class ValidarCantidades {
    
    
    public static void validarVslorNegativo(float valor) throws NumeroNegativoException {

        if(valor<0) throw  new NumeroNegativoException();
    }
        
}
