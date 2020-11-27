package net.maromo.view;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class formMenu {
    private JButton alunoButton;
    private JButton sairButton;
    private JButton disciplinasButton;
    private JButton professorButton;
    private JPanel menuPanel;
    public static JFrame telaAluno;
    public static JFrame telaProfessor;
    public static JFrame telaDiciplina;

    public JPanel getMenuPanel() {
        return menuPanel;
    }

    public formMenu() {
        alunoButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                telaAluno = new JFrame("Cadastro de Alunos");
                telaAluno.setContentPane(new formAluno().getAlunoPanel());
                telaAluno.setSize(500,500);
                telaAluno.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
                telaAluno.setVisible(true);

            }
        });
        sairButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.exit(0);
            }
        });
        professorButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                telaProfessor = new JFrame("Cadastro de Professores");
                telaProfessor.setContentPane(new formProfessor().getProfessorPanel());
                telaProfessor.setSize(500,500);
                telaProfessor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
                telaProfessor.setVisible(true);

            }
        });
        disciplinasButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                telaDiciplina = new JFrame("Cadastro de Diciplinaes");
                telaDiciplina.setContentPane(new formDiciplina().getDiciplinaPanel());
                telaDiciplina.setSize(500,500);
                telaDiciplina.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
                telaDiciplina.setVisible(true);

            }
        });
    }
}
