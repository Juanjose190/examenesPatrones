/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.test;

/**
 *
 * @author JUAN JOSE
 */
public class Main {

    public static void main(String[] args) {
        SpotifyService spotifyService = new SpotifyService();
        AppleMusicService appleMusicService = new AppleMusicService();

        IMediaPlayer spotifyAdapter = new SpotifyAdapter(spotifyService);
        IMediaPlayer appleMusicAdapter = new AppleMusicAdapter(appleMusicService);

        MusicFacade musicFacade = new MusicFacade(spotifyAdapter, appleMusicAdapter);

        System.out.println("Playing music on Spotify");
        musicFacade.playSpotify();

        System.out.println("Adding track 'Song A' to Spotify playlist");
        musicFacade.addTrackToSpotifyPlaylist("Song A");

        System.out.println("Playing music on Apple Music");
        musicFacade.playAppleMusic();

        System.out.println("Adding track 'Song B' to Apple Music playlist");
        musicFacade.addTrackToAppleMusicPlaylist("Song B");
    }
}
