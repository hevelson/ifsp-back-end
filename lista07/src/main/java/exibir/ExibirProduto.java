package exibir;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import model.Produto;
import dao.ProdutoDao;

public class ExibirProduto extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");

        String busca = req.getParameter("busca");

        PrintWriter saida = resp.getWriter();

        ProdutoDao produtoDao = new ProdutoDao();
        List<Produto> lista = new ArrayList();

        lista = produtoDao.pesquisar(busca);
        
        String produtoJsonStr = new Gson().toJson(lista);

        saida.println(produtoJsonStr);

        saida.flush();
        saida.close();
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");

        String busca = req.getParameter("busca");

        PrintWriter saida = resp.getWriter();

        ProdutoDao produtoDao = new ProdutoDao();
        List<Produto> lista = new ArrayList();

        lista = produtoDao.pesquisar(busca);
        
        String produtoJsonStr = new Gson().toJson(lista);

        saida.println(produtoJsonStr);

        saida.flush();
        saida.close();
    }
}