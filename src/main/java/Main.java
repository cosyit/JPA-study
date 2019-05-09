import com.cosyit.entities.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        //1.创建EntityManagerFactory
        String persistenceUnitName = "myJPA";

        //EntityManagerFactory 对应Hibernate中的SessionFactory.
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(persistenceUnitName);
        //2.创建EntityManager  [对应Hibernate 中的Session ]
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        //3.开启事务
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        //4.进行持久化操作。

        Student student = new Student();
        student.setAge(12);
        student.setName("jpa_test_name");
        student.setYouClass(2);

        entityManager.persist(student);
        //5.提交事务。
        transaction.commit();

        //6.关闭EntityManager
        entityManager.close();
        //7.关闭EntityManagerFactory.
        entityManagerFactory.close();
    }
}
