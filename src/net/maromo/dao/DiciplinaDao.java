package net.maromo.dao;

import net.maromo.model.Diciplina;
import net.maromo.model.Professor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DiciplinaDao {

    //	conectando
    Connection con	=	new	ConnectionFactory().getConnection();

    public void inserirDado(Diciplina diciplina) throws SQLException {

        //	conectando
        Connection con	=	new	ConnectionFactory().getConnection();

        //Preparando o Statement
        String	sql	=	"insert	into diciplina"	+
                "	(codigo, nome, professores, descricao)"	+
                "	values	(?,?,?,?)";
        PreparedStatement stmt	=	con.prepareStatement(sql);

        //preenche valores
        stmt.setInt(1, diciplina.getCodigo());
        stmt.setString(2, diciplina.getNome());
        stmt.setString(3, diciplina.getProfessores());
        stmt.setString(4, diciplina.getDescricao());

        //executa
        stmt.execute();
        stmt.close();

    }
}
