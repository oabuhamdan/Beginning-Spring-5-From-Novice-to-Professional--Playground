import com.beginning_spring.chapter3.MusicService;
import com.beginning_spring.chapter3.mem01.MusicService1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuration7 {
    @Bean
    MusicService musicService() {
        return new MusicService1();
    }
}