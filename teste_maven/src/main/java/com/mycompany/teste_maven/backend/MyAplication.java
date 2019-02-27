

package com.mycompany.teste_maven.backend;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("rest")
public class MyAplication extends ResourceConfig {
    public MyAplication(){
        packages("com.mycompany.teste_maven.backend.controller");
    }
}
