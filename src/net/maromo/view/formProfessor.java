package net.maromo.view;

import net.maromo.dao.ProfessorDao;
import net.maromo.model.Materia;
import net.maromo.model.Professor;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

public class formProfessor {
    private JPanel professorPanel;
    private JTextField textCodigo;
    private JTextField textNome;
    private JTextField textEmail;
    private JTextField textTelefone;
    private JTextField textEndereco;
    private JButton Gravarbutton;
    private JButton Sairbutton;
    private JComboBox comboDiciplina;

    public formProfessor() {
        Gravarbutton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Professor professor = new Professor();

                professor.setCodigo(Integer.parseInt(textCodigo.getText()));
                professor.setEmail(textEmail.getText());
                professor.setEndereco(textEndereco.getText());
                professor.setTelefone(textTelefone.getText());
                professor.setNome(textNome.getText());
                Materia materia = Materia.fisica;

                switch (comboDiciplina.getSelectedIndex()){

                    case 0:
                        materia = Materia.matematica;
                        break;

                    case 1:
                        materia = Materia.portugues;
                        break;
                    case 2:
                        materia = Materia.historia;
                        break;
                    case 3:
                        materia = Materia.geografia;
                        break;
                    case 4:
                        materia = Materia.ingles;
                        break;
                    case 5:
                        materia = Materia.edfisica;
                        break;
                    case 6:
                        materia = Materia.quimica;
                        break;
                    case 7:
                        materia = Materia.fisica;
                        break;
                }
                professor.setMateria(materia);

                //mudando

                ProfessorDao dao = new ProfessorDao();

                try{
                    dao.inserirDado(professor);
                }catch (SQLException ex){
                    JOptionPane.showMessageDialog(
                            null,
                            "erro \n" +ex.toString(),
                            "Erro ao cadastrar Professor",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                }
                JOptionPane.showMessageDialog(
                        null,
                        "Dados do professor \n" + professor.toString(),
                        "Cadastro efetuado com sucesso",
                        JOptionPane.INFORMATION_MESSAGE
                );
                textCodigo.setText("");
                textEmail.setText("");
                textEndereco.setText("");
                textNome.setText("");
                textTelefone.setText("");
            }
        });
        Sairbutton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                formMenu.telaProfessor.dispose();
            }
        });


    }

    public JPanel getProfessorPanel() {
        return professorPanel;
    }
}
