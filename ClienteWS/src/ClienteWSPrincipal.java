
import javax.swing.JOptionPane;
import webs.Calculadora;
import webs.Calculadora_Service;

public class ClienteWSPrincipal {
    
    public static void main(String[] args) {
        
        Calculadora_Service servico = new Calculadora_Service();
        Calculadora porta = servico.getCalculadoraPort();
        
        double resposta = porta.somar(120, 230);
        
        System.out.println("Resposta: " + resposta);
        JOptionPane.showMessageDialog(null, resposta);
        
    }
    
}
