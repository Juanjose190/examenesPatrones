/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author JUAN JOSE
 */
public class MusicFacade {
    private IMediaPlayer spotifyPlayer;
    private IMediaPlayer appleMusicPlayer;

    public MusicFacade(IMediaPlayer spotifyPlayer, IMediaPlayer appleMusicPlayer) {
        this.spotifyPlayer = spotifyPlayer;
        this.appleMusicPlayer = appleMusicPlayer;
    }

    public void playSpotify() {
        spotifyPlayer.play();
    }

    public void pauseSpotify() {
        spotifyPlayer.pause();
    }

    public void playAppleMusic() {
        appleMusicPlayer.play();
    }

    public void pauseAppleMusic() {
        appleMusicPlayer.pause();
    }

    public void addTrackToSpotifyPlaylist(String track) {
        spotifyPlayer.addToPlaylist(track);
    }

    public void addTrackToAppleMusicPlaylist(String track) {
        appleMusicPlayer.addToPlaylist(track);
    }
}

