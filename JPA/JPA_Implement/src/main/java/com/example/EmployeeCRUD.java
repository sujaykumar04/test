package com.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class EmployeeCRUD {
    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction tx = em.getTransaction();

        Employee emp = new Employee("Sujay", "Engineering");

        tx.begin();
        em.persist(emp);
        tx.commit();

        Employee fetched = em.find(Employee.class, emp.getId());
        System.out.println(fetched.getName() + " - " + fetched.getDepartment());

        tx.begin();
        fetched.setDepartment("Cloud");
        em.merge(fetched);
        tx.commit();

        tx.begin();
        em.remove(fetched);
        tx.commit();

        em.close();
        JPAUtil.shutdown();
    }
}