package com.appsdevblog.ws.clients.photoappwebclient.controllers;

import com.appsdevblog.ws.clients.photoappwebclient.response.AlbumRest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class AlbumsController {
    @GetMapping("/albums")
    public String getAlbums(Model model) {
        AlbumRest albumRest = new AlbumRest();
        albumRest.setUserId("user1");
        albumRest.setAlbumId("album1");
        albumRest.setAlbumTitle("Album 1");
        albumRest.setAlbumDescription("This is album 1");
        albumRest.setAlbumUrl("http://localhost:8082/albums/album1");

        AlbumRest albumRest2 = new AlbumRest();
        albumRest2.setUserId("user2");
        albumRest2.setAlbumId("album2");
        albumRest2.setAlbumTitle("Album 2");
        albumRest2.setAlbumDescription("This is album 2");
        albumRest2.setAlbumUrl("http://localhost:8082/albums/album2");

        model.addAttribute("albums", Arrays.asList(albumRest, albumRest2));
        return "albums";
    }
}
