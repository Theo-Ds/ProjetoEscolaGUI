
package net.maromo.dao;

import net.maromo.model.Professor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProfessorDao {

    //	conectando
    Connection con	=	new	ConnectionFactory().getConnection();

    public void inserirDado(Professor professor) throws SQLException {

        //Preparando o Statement
        String	sql	=	"insert	into professor"	+
                "	(codigo, nome, email, telefone, endereco, materia)"	+
                "	values	(?,?,?,?,?,?)";
        PreparedStatement stmt	=	con.prepareStatement(sql);

        //preenche valores
        stmt.setInt(1, professor.getCodigo());
        stmt.setString(2, professor.getNome());
        stmt.setString(3, professor.getEmail());
        stmt.setString(4, professor.getTelefone());
        stmt.setString(5, professor.getEndereco());
        stmt.setString(6, professor.getMateria().toString());


        //executa
        stmt.execute();
        stmt.close();

    }

}
