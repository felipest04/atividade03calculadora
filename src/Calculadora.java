import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JTextField txtPrimeiroValor;
    private JTextField txtSegundoValor;
    private JButton btnSomar;
    private JButton btnLimpar;
    private JTextField txtResultado;
    private JPanel panelMain;
    private JButton subtrairButton;
    private JButton multiplicarButton;
    private JButton dividirButton;

    public Calculadora(){

        btnSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // peguei a informação da tela
                Integer primeiro = Integer.valueOf(txtPrimeiroValor.getText());
                Integer segundo =  Integer.valueOf(txtSegundoValor.getText());

                // processei
                Integer soma = primeiro + segundo;


                //mandei pra tela o resultado
                txtResultado.setText(soma.toString());



            }
        });

    }


    public static void main(String[] args) {

        JFrame frame = new JFrame("Minha Calculadora");
        frame.setContentPane(new Calculadora().panelMain);
        frame.setSize(500, 500);
        frame.setVisible(true);

    }

}
