package eu.pierrebeitz.svc;

import io.quarkus.logging.Log;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Service {

    public void call() {
        Log.info("Logging from the service");
    }
}
