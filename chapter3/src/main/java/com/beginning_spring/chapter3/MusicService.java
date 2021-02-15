package com.beginning_spring.chapter3;

import java.util.List;

public interface MusicService {
    List<Song> getSongsForArtist(String artist);

    List<String> getMatchingSongNamesForArtist(String artist, String prefix);

    List<String> getMatchingArtistNames(String prefix);

    Song getSong(String artist, String name);

    Song voteForSong(String artist, String name);
}