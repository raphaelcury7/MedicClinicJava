
package br.com.clinica;

import javax.swing.*;
import java.awt.*;

public class TelaVerResultado extends JFrame {

    private JTextField campoPaciente;
    private JTextField campoExame;
    private JTextField campoData;
    private JTextArea campoResultado;
    private JTextArea areaConsulta;

    public TelaVerResultado() {
        setTitle("Ver Resultado de Exames");
        setSize(500, 550);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel(new GridLayout(0, 2, 8, 8));
        painel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        campoPaciente = new JTextField();
        campoExame = new JTextField();
        campoData = new JTextField();
        campoResultado = new JTextArea(4, 20);

        painel.add(new JLabel("Nome do paciente:"));
        painel.add(campoPaciente);

        painel.add(new JLabel("Tipo de exame:"));
        painel.add(campoExame);

        painel.add(new JLabel("Data do exame:"));
        painel.add(campoData);

        painel.add(new JLabel("Resultado:"));
        painel.add(new JScrollPane(campoResultado));

        JButton btnConsultar = new JButton("Exibir Resultado");
        JButton btnLimpar = new JButton("Limpar");

        btnConsultar.addActionListener(e -> consultarResultado());
        btnLimpar.addActionListener(e -> limparCampos());

        painel.add(btnConsultar);
        painel.add(btnLimpar);

        areaConsulta = new JTextArea();
        areaConsulta.setEditable(false);

        JScrollPane rolagem = new JScrollPane(areaConsulta);
        rolagem.setBorder(
                BorderFactory.createTitledBorder("Resultado consultado")
        );

        setLayout(new BorderLayout());
        add(painel, BorderLayout.NORTH);
        add(rolagem, BorderLayout.CENTER);
    }

    private void consultarResultado() {

        if (campoPaciente.getText().trim().isEmpty()
                || campoExame.getText().trim().isEmpty()
                || campoData.getText().trim().isEmpty()
                || campoResultado.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(this,
                    "Preencha todos os campos!");
            return;
        }

        String resultado = "Paciente: " + campoPaciente.getText()
                + "\nExame: " + campoExame.getText()
                + "\nData: " + campoData.getText()
                + "\nResultado: " + campoResultado.getText()
                + "\n------------------------------\n";

        areaConsulta.append(resultado);

        JOptionPane.showMessageDialog(this,
                "Resultado exibido com sucesso!");

        limparCampos();
    }

    private void limparCampos() {
        campoPaciente.setText("");
        campoExame.setText("");
        campoData.setText("");
        campoResultado.setText("");
    }
}

