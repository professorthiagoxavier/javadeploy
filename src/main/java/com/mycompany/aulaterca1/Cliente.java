package com.mycompany.aulaterca1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cliente extends HttpServlet {

    //Não está acessível externamente
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {

            String nome = request.getParameter("nome");
            String endereco = request.getParameter("endereco");
            short numero = Short.parseShort(request.getParameter("numero"));

            //Acessar a base de dados
            //Salvar salvar as informações
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Cliente</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Dados do cliente</h1>");
            out.println("<p> Nome: " + nome + " </p>");
            out.println("<p> Endereço: " + endereco + "</p>");
            out.println("<p> Número: " + numero + "</p>");
            
            out.println("<a href='cadastrarCliente.jsp' > Voltar </a> " );

            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

}
