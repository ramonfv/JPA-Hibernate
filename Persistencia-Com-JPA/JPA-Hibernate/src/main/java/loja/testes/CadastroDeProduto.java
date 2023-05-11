package loja.testes;


import loja.dao.CategoriaDao;
import loja.dao.ProdutoDao;
import loja.modelo.Categoria;
import loja.modelo.Produto;
import loja.util.JPAUtil;


import javax.persistence.*;
import java.math.BigDecimal;

public class CadastroDeProduto {
    public static void main(String[] args) {
        Categoria smartphones = new Categoria("SMARTPHONES");
        Produto celular = new Produto("Motorola G-Series", "Smartphone Moto G15-play",new BigDecimal("2699.99"), smartphones);




        EntityManager em = JPAUtil.getEmtityManager();
        ProdutoDao produtoDao = new ProdutoDao(em);
        CategoriaDao categoriaDao = new CategoriaDao(em);

        em.getTransaction().begin();
        categoriaDao.cadastrar(smartphones);
        produtoDao.cadastrar(celular);
        em.getTransaction().commit();
        em.close();


    }
}
