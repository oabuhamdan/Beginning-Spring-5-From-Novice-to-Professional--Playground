import com.beginning_spring.chapter3.MusicService;
import com.beginning_spring.chapter3.Normalizer;
import com.beginning_spring.chapter3.mem03.CapLeadingNormalizer;
import com.beginning_spring.chapter3.mem03.MusicService3;
import com.beginning_spring.chapter3.mem03.SimpleNormalizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuration9 {
    @Bean
    Normalizer foo() {
        return new SimpleNormalizer();
    }

    @Bean(name = "bar")
    Normalizer capNormalizer() {
        return new CapLeadingNormalizer();
    }

    @Bean
    MusicService musicService() {
        return new MusicService3();
    }
}