/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author JUAN JOSE
 */
public class SpotifyAdapter implements IMediaPlayer {
    private SpotifyService spotifyService;

    public SpotifyAdapter(SpotifyService spotifyService) {
        this.spotifyService = spotifyService;
    }

    @Override
    public void play() {
        spotifyService.startPlayback();
    }

    @Override
    public void pause() {
        spotifyService.stopPlayback();
    }

    @Override
    public void nextTrack() {
        spotifyService.skipToNext();
    }

    @Override
    public void previousTrack() {
        spotifyService.skipToPrevious();
    }

    @Override
    public void addToPlaylist(String track) {
        spotifyService.addTrackToPlaylist(track);
    }
}

