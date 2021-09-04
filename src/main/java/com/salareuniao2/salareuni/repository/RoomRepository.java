package com.salareuniao2.salareuni.repository;

import java.util.List;
import com.salareuniao2.salareuni.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room,Long> {

    List<Room> find();

    List<Room> findAll();
    
}
