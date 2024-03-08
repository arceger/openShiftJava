package over;

import org.apache.kafka.clients.consumer.ConsumerRecord;

import java.io.IOException;

public interface ListenerService {

    void KafkaListener(ConsumerRecord<String, String> consumerRecord) throws IOException;

    void KafkaSender() throws IOException;
}
