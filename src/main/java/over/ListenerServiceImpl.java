package over;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.io.IOException;
import java.util.Properties;

public class ListenerServiceImpl implements ListenerService{

    @Override
    public void KafkaListener(ConsumerRecord<String, String> consumerRecord) throws IOException {

    }

    @Override
    public void KafkaSender() throws IOException {
        System.out.println("enviando mensagens");
        // Configurações do produtor
        Properties props = new Properties();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");

        // Criando o produtor
        KafkaProducer<String, String> producer = new KafkaProducer<>(props);

        // Tópico para o qual vamos escrever mensagens
        String topic = "meu-topico";

        try {
            // Enviando algumas mensagens de exemplo
            for (int i = 0; i < 1; i++) {
                String message = "Mensagem de exemplo " + i;
                // Criando um registro de produtor
                ProducerRecord<String, String> record = new ProducerRecord<>(topic, message);
                // Enviando o registro
                producer.send(record);
                System.out.println("Mensagem enviada com sucesso: " + message);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Fechando o produtor
            producer.close();
        }
    }

}

