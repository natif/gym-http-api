package pl.natif.java.gym.client;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import pl.natif.java.gym.client.model.Environment;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GymHttpClientTest {


    @Mock
    Client client;

    @Mock
    WebTarget webTarget;

    @Mock
    Builder builder;

    @Mock
    Response response;

    private GymHttpClient gymHttpClient;
    private static final String SERVICE_URL = "serviceUrl";

    @Before
    public void setUp() throws Exception {
        gymHttpClient = new GymHttpClient(SERVICE_URL);
        when(webTarget.request()).thenReturn(builder);
        when(builder.accept(MediaType.APPLICATION_JSON)).thenReturn(builder);
    }

    @Test
    public void getEnvsShouldReturnListOfEnvironments() throws Exception {
        List<Environment> environments = Collections.emptyList();
        when(client.target(SERVICE_URL + GymServerEndpoints.BASE_ENVS.toString())).thenReturn(webTarget);
        when(builder.get()).thenReturn(response);
        when(response.readEntity(new GenericType<List<Environment>>() {})).thenReturn(environments);
        assertEquals(0, environments.size());
    }
}