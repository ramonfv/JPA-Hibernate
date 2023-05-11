package loja.testes;


import modelo.Produto;


import javax.persistence.*;
import java.math.BigDecimal;

public class CadastroDeProduto {
    public static void main(String[] args) {
        Produto celular = new Produto();
        celular.setNome("Motorola G-Series");
        celular.setDescricao("Smartphone Moto G15-play");
        celular.setPreco(new BigDecimal("2699.99"));

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("loja");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.persist(celular);
        em.getTransaction().commit();
        em.close();


    }
}
