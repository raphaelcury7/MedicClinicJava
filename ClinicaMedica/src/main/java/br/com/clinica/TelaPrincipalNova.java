
package br.com.clinica;

import javax.swing.*;
import java.awt.*;

public class TelaPrincipalNova extends JFrame {

    public TelaPrincipalNova() {
        setTitle("Sistema de Gerenciamento - Clínica Médica");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(4, 1, 10, 10));
        painel.setBorder(BorderFactory.createEmptyBorder(25, 40, 25, 40));

        JButton btnCadastrar = new JButton("Cadastrar Médico");
        JButton btnTrabalhos = new JButton("Registrar Trabalhos");
        JButton btnAgendar = new JButton("Agendar Exame");
        JButton btnResultado = new JButton("Ver Resultado");

        btnTrabalhos.addActionListener(e ->
            new TelaRegistrarTrabalhos().setVisible(true)
        );

        btnTrabalhos.addActionListener(e ->
            JOptionPane.showMessageDialog(this, "Tela de Registrar Trabalhos")
        );

        btnAgendar.addActionListener(e ->
        new TelaAgendarExame().setVisible(true)
        );
        

        btnResultado.addActionListener(e ->
        new TelaVerResultado().setVisible(true)
        );

        painel.add(btnCadastrar);
        painel.add(btnTrabalhos);
        painel.add(btnAgendar);
        painel.add(btnResultado);

        add(painel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TelaPrincipalNova().setVisible(true);
        });
    }
}
