package my.exercise.Week_03.router;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class SequenceHttpEndpointRouter implements HttpEndpointRouter {
    static AtomicInteger index = new AtomicInteger(0);

    @Override
    public String route(List<String> urls) {
        if (urls.size() <= index.get()) {
            index.set(0);
        }

        return urls.get(index.getAndIncrement());
    }
}
