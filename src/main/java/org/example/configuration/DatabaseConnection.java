package org.example.configuration;

import jakarta.persistence.EntityManagerFactory;
import org.hibernate.cfg.Environment;

import java.util.Properties;

public class DatabaseConfiguration {
 public static EntityManagerFactory createentityManagerFactory(){
     Properties properties=new Properties();
     properties.setProperty(Environment.DRIVER,"")
 }
}
