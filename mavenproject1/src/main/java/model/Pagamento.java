/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Administrador
 */
public class Pagamento {
    private double valor;
    private String pix;
    private StatusPagamento status;
    
    public Pagamento(double valor, String pix, StatusPagamento status){
        this.valor = valor;
        this.pix = pix;
        this.status = status;
}

   public void confirmar(){

   }

}

