package com.stackroute.MuzixApplication.repository;

import com.stackroute.MuzixApplication.domain.Track;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository //This annotation is not compulsory as we are inheriting MongoRepository which already has @Repository annotation
public interface TrackRepository extends MongoRepository<Track,Integer> {
    @Query
    public Optional<Track> findOneByName(String name);
    @Query
    public Optional<Track> findOneByComment(String comment);
    @Query
    public List<Track> findByName(String name);
    @Query
    public List<Track> findByComment(String comment);
}
