import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class MainForm {
    private JTextField txtNome;
    private JLabel lblNome;
    private JButton btnValidar;
    private JPanel mainPanel;
    private JLabel txtResultado;
    public MainForm(){
        btnValidar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomeDigitado = txtNome.getText();

                txtResultado.setText(nomeDigitado);
            }
        });

    }

    public static void main(String[] args) {

        //cria a minha tela (TV)
        JFrame frame = new JFrame("Minha primeira tela");
        //mostra qual painel vai ser assistido
        frame.setContentPane(new MainForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //ajusta a tv no tamanho do painel
        frame.pack();
       frame.setSize(500, 500);
        frame.setVisible(true);

    }

}