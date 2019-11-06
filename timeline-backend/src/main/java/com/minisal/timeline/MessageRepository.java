package com.minisal.timeline;

import org.springframework.data.repository.CrudRepository;

import com.minisal.timeline.Message;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface MessageRepository extends CrudRepository<Message, Integer>{
}






