package com.softeem.stargym.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GalleryController {

    @RequestMapping("/toGallery.hm")
    public String toGallery(){

        return "client/gallery";
    }
}
