package com.beginning_spring.chapter3.mem02;

import com.beginning_spring.chapter3.AbstractMusicService;
import com.beginning_spring.chapter3.Normalizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicService2 extends AbstractMusicService {
    @Autowired
    Normalizer normalizer;

    @Override
    protected String transformArtist(String input) {
        return normalizer.transform(input);
    }

    @Override
    protected String transformSong(String input) {
        return normalizer.transform(input);
    }
}