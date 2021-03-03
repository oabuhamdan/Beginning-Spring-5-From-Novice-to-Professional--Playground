package com.bsg5.chapter6;

import com.beginning_spring.chapter3.Artist;
import com.beginning_spring.chapter3.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
class GetArtistsExceptionController {
    @Autowired
    MusicService service;

    @ExceptionHandler(ArtistNotFoundException.class)
    public ModelAndView handleCustomException(ArtistNotFoundException ex) {
        ModelAndView model = new ModelAndView("error");
        model.addObject("message", ex.getMessage());
        model.addObject("statusCode", 404);
        return model;
    }

    @ExceptionHandler(Exception.class)
    public ModelAndView handleAllExceptions(Exception ex) {
        ModelAndView model = new ModelAndView("error");
        model.addObject("message", ex.getMessage());
        model.addObject("statusCode", 500);
        return model;
    }

    @GetMapping("/artists/{artist}")
    @ResponseBody
    public ResponseEntity<Artist> getSong(
            @PathVariable("artist") final String artist
    ) {
        throw new ArtistNotFoundException("Artist with name " + artist + " not found");
    }
}