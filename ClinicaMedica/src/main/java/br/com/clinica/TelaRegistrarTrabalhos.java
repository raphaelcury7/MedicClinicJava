
package br.com.clinica;

import javax.swing.*;
import java.awt.*;

public class TelaRegistrarTrabalhos extends JFrame {

    private JTextField campoMedico;
    private JTextField campoPaciente;
    private JTextField campoTipo;
    private JTextField campoData;
    private JTextArea campoDescricao;

    public TelaRegistrarTrabalhos() {
        setTitle("Registrar Trabalhos");
        setSize(450, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel(new GridLayout(0, 2, 8, 8));
        painel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        campoMedico = new JTextField();
        campoPaciente = new JTextField();
        campoTipo = new JTextField();
        campoData = new JTextField();
        campoDescricao = new JTextArea(4, 20);

        painel.add(new JLabel("Médico responsável:"));
        painel.add(campoMedico);

        painel.add(new JLabel("Nome do paciente:"));
        painel.add(campoPaciente);

        painel.add(new JLabel("Tipo de trabalho:"));
        painel.add(campoTipo);

        painel.add(new JLabel("Data (dd/mm/aaaa):"));
        painel.add(campoData);

        painel.add(new JLabel("Descrição:"));
        painel.add(new JScrollPane(campoDescricao));

        JButton btnSalvar = new JButton("Salvar");
        JButton btnLimpar = new JButton("Limpar");

        btnSalvar.addActionListener(e -> salvarTrabalho());
        btnLimpar.addActionListener(e -> limparCampos());

        painel.add(btnSalvar);
        painel.add(btnLimpar);

        add(painel);
    }

    private void salvarTrabalho() {
        if (campoMedico.getText().trim().isEmpty()
                || campoPaciente.getText().trim().isEmpty()
                || campoTipo.getText().trim().isEmpty()
                || campoData.getText().trim().isEmpty()
                || campoDescricao.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(this,
                    "Preencha todos os campos!");
            return;
        }

        JOptionPane.showMessageDialog(this,
                "Trabalho registrado com sucesso!");

        limparCampos();
    }

    private void limparCampos() {
        campoMedico.setText("");
        campoPaciente.setText("");
        campoTipo.setText("");
        campoData.setText("");
        campoDescricao.setText("");
    }
}

