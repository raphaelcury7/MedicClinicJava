
package br.com.clinica;

import javax.swing.*;
import java.awt.*;

public class TelaCadastroMedico extends JFrame {

    private JTextField campoNome;
    private JTextField campoCPF;
    private JTextField campoTelefone;
    private JTextField campoEmail;
    private JTextField campoEndereco;
    private JComboBox<String> campoEspecialidade;

    public TelaCadastroMedico() {
        setTitle("Cadastro de Médico");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel painel = new JPanel();
        painel.setLayout(null);
        painel.setBackground(new Color(235, 244, 250));

        JLabel titulo = new JLabel("Cadastro de Médico");
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        titulo.setBounds(110, 25, 300, 35);
        painel.add(titulo);

        adicionarLabel(painel, "Nome completo:", 70);
        campoNome = adicionarCampo(painel, 100);

        adicionarLabel(painel, "CPF:", 145);
        campoCPF = adicionarCampo(painel, 175);

        adicionarLabel(painel, "Telefone:", 220);
        campoTelefone = adicionarCampo(painel, 250);

        adicionarLabel(painel, "E-mail:", 295);
        campoEmail = adicionarCampo(painel, 325);

        adicionarLabel(painel, "Endereço:", 370);
        campoEndereco = adicionarCampo(painel, 400);

        JLabel labelEspecialidade = new JLabel("Especialidade:");
        labelEspecialidade.setBounds(50, 445, 200, 25);
        painel.add(labelEspecialidade);

        String[] especialidades = {
            "Clínica Geral",
            "Cardiologia",
            "Dermatologia",
            "Pediatria",
            "Ortopedia",
            "Ginecologia",
            "Neurologia",
            "Oftalmologia",
            "Outra"
        };

        campoEspecialidade = new JComboBox<>(especialidades);
        campoEspecialidade.setBounds(50, 470, 380, 30);
        painel.add(campoEspecialidade);

        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.setBounds(80, 520, 150, 35);
        painel.add(btnSalvar);

        JButton btnLimpar = new JButton("Limpar");
        btnLimpar.setBounds(260, 520, 150, 35);
        painel.add(btnLimpar);

        btnSalvar.addActionListener(e -> salvarMedico());
        btnLimpar.addActionListener(e -> limparCampos());

        add(painel);
    }

    private void adicionarLabel(JPanel painel, String texto, int y) {
        JLabel label = new JLabel(texto);
        label.setBounds(50, y, 200, 25);
        painel.add(label);
    }

    private JTextField adicionarCampo(JPanel painel, int y) {
        JTextField campo = new JTextField();
        campo.setBounds(50, y, 380, 30);
        painel.add(campo);
        return campo;
    }

    private void salvarMedico() {
        if (campoNome.getText().trim().isEmpty()
                || campoCPF.getText().trim().isEmpty()
                || campoTelefone.getText().trim().isEmpty()
                || campoEmail.getText().trim().isEmpty()
                || campoEndereco.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(this,
                    "Preencha todos os campos!");
            return;
        }

        JOptionPane.showMessageDialog(this,
                "Cadastro realizado com sucesso!");

        limparCampos();
    }

    private void limparCampos() {
        campoNome.setText("");
        campoCPF.setText("");
        campoTelefone.setText("");
        campoEmail.setText("");
        campoEndereco.setText("");
        campoEspecialidade.setSelectedIndex(0);
    }
}
