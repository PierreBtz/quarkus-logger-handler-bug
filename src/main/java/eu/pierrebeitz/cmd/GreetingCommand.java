package eu.pierrebeitz.cmd;

import eu.pierrebeitz.svc.Service;
import io.quarkus.logging.Log;
import io.quarkus.picocli.runtime.annotations.TopCommand;
import picocli.CommandLine.Command;

@TopCommand
@Command(name = "greeting", mixinStandardHelpOptions = true)
public class GreetingCommand implements Runnable {

    private final Service service;

    public GreetingCommand(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        Log.info("Logging from the command");
        service.call();
    }

}
