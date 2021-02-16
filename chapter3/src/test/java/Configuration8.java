import com.beginning_spring.chapter3.MusicService;
import com.beginning_spring.chapter3.Normalizer;
import com.beginning_spring.chapter3.mem02.MusicService2;
import com.beginning_spring.chapter3.mem02.SimpleNormalizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuration8 {
    @Bean
    Normalizer normalizer() {
        return new SimpleNormalizer();
    }

    @Bean
    MusicService musicService() {
        return new MusicService2();
    }
}