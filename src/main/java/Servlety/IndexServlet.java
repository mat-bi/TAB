package Servlety;

import java.io.IOException;

/**
 * Created by mat-bi on 15.06.16.
 */
public class IndexServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.getWriter().println(baza.FabrykaPolaczenia.getInstance().getConnection().getCollection("Osoba").findOne());

    }
}
