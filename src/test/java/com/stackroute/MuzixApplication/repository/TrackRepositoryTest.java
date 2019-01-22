package com.stackroute.MuzixApplication.repository;


import com.stackroute.MuzixApplication.domain.Track;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
public class TrackRepositoryTest {

    @Autowired
    TrackRepository trackRepository;
    Track track;

    @Before
    public void setUp()
    {
        track = new Track();
        track.setId(3);
        track.setName("test case");
        track.setComment("testing 1 2 3...");
    }

    @After
    public void tearDown(){

        trackRepository.deleteAll();
    }


    @Test
    public void testSaveTrack(){
        trackRepository.save(track);
        Track fetchtrack = trackRepository.findById(track.getId()).get();
        Assert.assertEquals(3,fetchtrack.getId());

    }

    @Test
    public void testSaveTrackFailure(){
        Track testUser = new Track(1,"d32w","dj2l;l");
        trackRepository.save(track);
        Track fetchTrack = trackRepository.findById(track.getId()).get();
        Assert.assertNotSame(testUser,track);
    }

    @Test
    public void testGetAllTracks(){
        Track t = new Track(2,"revtevc","egcr");
        Track t1 = new Track(3,"cevgRe","gev");
        trackRepository.save(t);
        trackRepository.save(t1);

        List<Track> list = trackRepository.findAll();
        Assert.assertEquals("Johny",list.get(0).getName());




    }


}
