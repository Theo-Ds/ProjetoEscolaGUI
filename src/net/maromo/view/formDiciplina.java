package net.maromo.view;

import net.maromo.dao.DiciplinaDao;
import net.maromo.dao.ProfessorDao;
import net.maromo.model.Diciplina;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

public class formDiciplina {
    private JPanel diciplinaPanel;
    private JTextField textCodigo;
    private JTextField textNome;
    private JTextField textProfessores;
    private JTextField textDescricao;
    private JButton gravarButton;
    private JButton sairButton;

    public JPanel getDiciplinaPanel() {
        return diciplinaPanel;
    }

    public formDiciplina() {
        gravarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                Diciplina diciplina = new Diciplina();
                diciplina.setCodigo(Integer.parseInt(textCodigo.getText()));
                diciplina.setDescricao(textDescricao.getText());
                diciplina.setNome(textNome.getText());
                diciplina.setProfessores(textProfessores.getText());

                //mudando

                DiciplinaDao dao = new DiciplinaDao();

                try{
                    dao.inserirDado(diciplina);
                }catch (SQLException ex){
                    JOptionPane.showMessageDialog(
                            null,
                            "erro \n" +ex.toString(),
                            "Erro ao cadastrar Diciplina",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                }
                JOptionPane.showMessageDialog(
                        null,
                        "Dados da diciplina \n" + diciplina.toString(),
                        "Cadastro efetuado com sucesso",
                        JOptionPane.INFORMATION_MESSAGE

                );

                textCodigo.setText("");
                textDescricao.setText("");
                textNome.setText("");
                textProfessores.setText("");
            }
        });
        sairButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                formMenu.telaDiciplina.dispose();
            }
        });
    }
}
