package com.chatbotmanila.service.repository;

import com.chatbotmanila.service.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}