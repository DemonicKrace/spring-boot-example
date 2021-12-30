package mydlq.club;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.socket.config.annotation.EnableWebSocket;

/**
 * @author mydlq
 */
@EnableWebSocket
@SpringBootApplication
public class QueueSessionApplication {

    public static void main(String[] args) {
        SpringApplication.run(QueueSessionApplication.class, args);
    }

}