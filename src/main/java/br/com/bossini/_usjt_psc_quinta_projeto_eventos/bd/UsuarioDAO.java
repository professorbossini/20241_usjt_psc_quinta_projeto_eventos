/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bossini._usjt_psc_quinta_projeto_eventos.bd;

import br.com.bossini._usjt_psc_quinta_projeto_eventos.modelo.Usuario;

/**
 *
 * @author rodrigo
 */
public class UsuarioDAO {
    //tipo de retorno, nome, lista de parametros, corpo
    public Usuario existe(Usuario u) throws Exception {
        //1. Especificar o comando SQL (SELECT)
        var sql = "SELECT * FROM tb_usuario_psc_quinta WHERE login = ? AND  senha = ?";
        //2. Estabelecer uma conexão com o banco
        var conexao = new ConnectionFactory().conectar();
        //3. Preparar o comando
        var ps = conexao.prepareStatement(sql);
        //4. Substituir os eventuais placeholders
        ps.setString(1, u.getLogin());
        ps.setString(2, u.getSenha());
        //5. Executar o comando
        var rs = ps.executeQuery();
        //6. Tratar o resultado e devolver true ou false
        var usuarioExiste = rs.next();
        if(usuarioExiste){
            var tipo = rs.getInt("tipo");
            u.setTipo(tipo);
        }
        else{
            u = null;
        }
        //7. Fechar a conexão
        rs.close();
        ps.close();
        conexao.close();
//        if(usuarioExiste)
//            return true;
//        return false;
//        return usuarioExiste ? true : false;
          return u;
    }
            
    //cláusula catch or declare
    public void cadastrar(Usuario u)  throws Exception{
        //1. Especificar o comando SQL (INSERT)
        var sql = "INSERT INTO tb_usuario_psc_quinta(login, senha) VALUES(?, ?)";
        //2. Estabelecer uma conexão com o banco
        var conexao = new ConnectionFactory().conectar();
        //3. Preparar o comando
        var ps = conexao.prepareStatement(sql);
        //4. Substituir os eventuais placeholders
        ps.setString(1, u.getLogin());
        ps.setString(2, u.getSenha());
//        ps.setInt(3, );
        //5. Executar o comando
        ps.execute();
        //6. Fechar a conexão
        conexao.close();
    }     
}
