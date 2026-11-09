
package br.com.clinica;

import javax.swing.*;
import java.awt.*;

public class TelaAgendarExame extends JFrame {

    private JTextField campoPaciente;
    private JTextField campoMedico;
    private JTextField campoTipoExame;
    private JTextField campoData;
    private JTextField campoHorario;
    private JTextArea areaAgendamentos;

    public TelaAgendarExame() {
        setTitle("Agendar Exame");
        setSize(500, 550);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel(new GridLayout(0, 2, 8, 8));
        painel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        campoPaciente = new JTextField();
        campoMedico = new JTextField();
        campoTipoExame = new JTextField();
        campoData = new JTextField();
        campoHorario = new JTextField();

        painel.add(new JLabel("Nome do paciente:"));
        painel.add(campoPaciente);

        painel.add(new JLabel("Médico responsável:"));
        painel.add(campoMedico);

        painel.add(new JLabel("Tipo de exame:"));
        painel.add(campoTipoExame);

        painel.add(new JLabel("Data (dd/mm/aaaa):"));
        painel.add(campoData);

        painel.add(new JLabel("Horário (hh:mm):"));
        painel.add(campoHorario);

        JButton btnSalvar = new JButton("Agendar");
        JButton btnLimpar = new JButton("Limpar");

        btnSalvar.addActionListener(e -> salvarAgendamento());
        btnLimpar.addActionListener(e -> limparCampos());

        painel.add(btnSalvar);
        painel.add(btnLimpar);

        areaAgendamentos = new JTextArea();
        areaAgendamentos.setEditable(false);

        JScrollPane rolagem = new JScrollPane(areaAgendamentos);
        rolagem.setBorder(BorderFactory.createTitledBorder("Exames agendados"));

        setLayout(new BorderLayout());
        add(painel, BorderLayout.NORTH);
        add(rolagem, BorderLayout.CENTER);
    }

    private void salvarAgendamento() {

        if (campoPaciente.getText().trim().isEmpty()
                || campoMedico.getText().trim().isEmpty()
                || campoTipoExame.getText().trim().isEmpty()
                || campoData.getText().trim().isEmpty()
                || campoHorario.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(this,
                    "Preencha todos os campos!");
            return;
        }

        String agendamento = "Paciente: " + campoPaciente.getText()
                + "\nMédico: " + campoMedico.getText()
                + "\nExame: " + campoTipoExame.getText()
                + "\nData: " + campoData.getText()
                + "\nHorário: " + campoHorario.getText()
                + "\n------------------------------\n";

        areaAgendamentos.append(agendamento);

        JOptionPane.showMessageDialog(this,
                "Exame agendado com sucesso!");

        limparCampos();
    }

    private void limparCampos() {
        campoPaciente.setText("");
        campoMedico.setText("");
        campoTipoExame.setText("");
        campoData.setText("");
        campoHorario.setText("");
    }
}
