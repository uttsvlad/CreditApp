package org.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.spring.entities.Client.Client;
import org.spring.entities.Client.MaritalStatus;
import org.springframework.stereotype.Component;


@Component
public class ClientDAO {
    private final Client client;

    public ClientDAO(Client client) {
        this.client = client;
    }

    public void createBid(){
        Configuration configuration = new Configuration();
        configuration.configure();

        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession()) {

            session.beginTransaction();

            Client client = Client.builder()
                    .passport(1)
                    .firstName("S")
                    .middleName("uttsvlad")
                    .lastName("Utts")
                    .telNumber("917854545")
                    .address("s")
                    .job("")
                    .maritalStatus(MaritalStatus.Married)
                    .creditSum(22)
                    .build();
            session.save(client);

            session.getTransaction().commit();
        }
    }

    public void showAllClients() {
        Configuration configuration = new Configuration();
        configuration.configure();

        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession()) {

            session.createQuery("select Client from Client ", Client.class);

            session.getTransaction().commit();
        }
    }

    public void findByTelNumber() {

    }

    public void findByFullName() {

    }

    public void findByPassport() {

    }
}