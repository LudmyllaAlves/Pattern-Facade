/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrãofacade;

/**
 *
 * @author tatia
 */
public class Pagamento {
    public void formaDePagamento() {
        System.out.println("Como deseja pagar?");
    }
    
    public void pagamentoFoiAceitoPor(String forma) {
        System.out.println(forma);
    }
    
}
