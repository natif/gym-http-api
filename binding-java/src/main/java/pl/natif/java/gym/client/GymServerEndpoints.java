package pl.natif.java.gym.client;

public enum GymServerEndpoints {

    BASE_ENVS("/v1/envs"),
    RESET("/reset"),
    STEP("/step"),
    ACTION_SPACE("/action_space"),
    OBSERVATION_SPACE("observation_space"),
    MONITOR_START("/monitor/start"),
    MONITOR_CLOSE("/monitor/close"),
    UPLOAD("/v1/upload"),
    SHUTDOWN("/v1/shutdown");


    private final String endpoint;

    private GymServerEndpoints(String endpoint) {
        this.endpoint = endpoint;
    }

    @Override
    public String toString() {
        return endpoint;
    }
}
