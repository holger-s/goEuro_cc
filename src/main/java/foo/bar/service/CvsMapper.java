package foo.bar.service;

import foo.bar.foo.bar.domain.Observation;

public class CvsMapper {
    public static final String SEPARATOR = ",";

    public String map(Observation observation) {
        return observation.getId() + SEPARATOR + observation.getName() + SEPARATOR + observation.getTime();

    }
}
