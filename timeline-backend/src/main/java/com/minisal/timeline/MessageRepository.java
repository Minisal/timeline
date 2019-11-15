package com.minisal.timeline;

import org.springframework.data.repository.CrudRepository;

import com.minisal.timeline.Message;
import org.springframework.stereotype.Service;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface MessageRepository extends CrudRepository<Message, Integer>{


    Iterable<Message> findById(int id);

    Iterable<Message> findByIdGreaterThan(int id);

    Iterable<Message> findByIdLessThan(int id);

    Iterable<Message> findByIdGreaterThanAndIdLessThan(int greaterThanId, int lessThanId);


    Iterable<Message> findByAddTime(String addTime);

    Iterable<Message> findByAddTimeGreaterThan(String addTime);

    Iterable<Message> findByAddTimeLessThan(String addTime);

    Iterable<Message> findByAddTimeGreaterThanAndAddTimeLessThan(String greaterThanAddTime, String lessThanAddTime);

}






