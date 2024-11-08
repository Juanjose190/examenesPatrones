/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author JUAN JOSE
 */
public class AppleMusicAdapter implements IMediaPlayer {
    private final AppleMusicService appleMusicService;

    public AppleMusicAdapter(AppleMusicService appleMusicService) {
        this.appleMusicService = appleMusicService;
    }

    @Override
    public void play() {
        appleMusicService.playSong();
    }

    @Override
    public void pause() {
        appleMusicService.pauseSong();
    }

    @Override
    public void nextTrack() {
        appleMusicService.next();
    }

    @Override
    public void previousTrack() {
        appleMusicService.previous();
    }

    @Override
    public void addToPlaylist(String track) {
        appleMusicService.addToPlaylist(track);
    }
}
