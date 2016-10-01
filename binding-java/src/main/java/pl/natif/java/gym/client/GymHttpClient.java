package pl.natif.java.gym.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.natif.java.gym.client.model.Environment;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import java.util.Collections;
import java.util.List;

public class GymHttpClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(GymHttpClient.class);
    private Client client;
    private String serviceUrl;


    public GymHttpClient(String serviceUrl) {
        this.serviceUrl = serviceUrl;
        this.client = ClientBuilder.newClient();
    }

    public Environment addEnv(String environmentId) {
        return null;
    }

    public List<Environment> getEnvs() {
        try {
            final WebTarget webTarget = client.target(this.serviceUrl + GymServerEndpoints.BASE_ENVS);
            final List<Environment> environments = webTarget.request()
                    .accept(MediaType.APPLICATION_JSON)
                    .get()
                    .readEntity(new GenericType<List<Environment>>() {
                    });

            return environments;
        } catch (Exception e) {
            LOGGER.error("There was an error while calling " + GymServerEndpoints.BASE_ENVS.toString());
        }
        return Collections.emptyList();

    }

    public String resetEnv() {
        return null;
    }

    public void stepEnv() {

    }

    public String getActionSpace() {
        return null;
    }

    public String getObservationSpace() {
        return null;
    }

    public void startMonitoring() {

    }

    public void closeMonitoring() {

    }

    public void uploadMonitoringData() {

    }

    public void shutdownServer() {

    }

}
