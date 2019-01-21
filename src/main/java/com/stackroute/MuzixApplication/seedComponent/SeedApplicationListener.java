package com.stackroute.MuzixApplication.seedComponent;

import com.stackroute.MuzixApplication.domain.Track;
import com.stackroute.MuzixApplication.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class SeedApplicationListener implements ApplicationListener<ContextRefreshedEvent> {
//seed data is added after the particularly asked event
    @Autowired
    private TrackRepository trackRepository;    //or u can take object of track services and call .saveTrack method(either way is fine)

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        trackRepository.save(new Track(7,"song7","comment"));
        trackRepository.save(new Track(8,"song8","comment"));
        trackRepository.save(new Track(9,"song9","comment"));
    }
}
