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
public class Facade {
     
    protected Pagamento pagamento;
    protected Passagem passagemAviao;
    protected Reserve reservaHotel;
    protected AluguelCarro aluguelCarro;
    
    public void inicializarSubsistemas() {
        pagamento = new Pagamento();
        pagamento.formaDePagamento();
        
        passagemAviao = new Passagem();
        passagemAviao.companhiaAeria();
        
        reservaHotel = new Reserve();
        reservaHotel.hotel();
        
        aluguelCarro = new AluguelCarro();
        aluguelCarro.alugarCarro();
    }
    
    public void pagamentoAceito(String forma){
        pagamento.pagamentoFoiAceitoPor(forma);
    }
    
    public void destino(String forma) {
        passagemAviao.destinoViajem(forma);
    }
    
    public void quartoDeHotel(String forma){
        reservaHotel.quartoDeHotel(forma);
    }

    
}
