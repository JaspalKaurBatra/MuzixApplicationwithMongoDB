package com.stackroute.MuzixApplication.seedComponent;

import com.stackroute.MuzixApplication.domain.Track;
import com.stackroute.MuzixApplication.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class SeedApplicationRunner implements ApplicationRunner {
//runner adds the seed data after creation of beans by ApplicationContext
    @Autowired
    private TrackRepository trackRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        trackRepository.save(new Track(4,"song4","comment"));
        trackRepository.save(new Track(5,"song5","comment"));
        trackRepository.save(new Track(6,"song6","comment"));
    }
}
