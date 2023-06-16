package com.badpetrovich.divinationforlove_mvc.dao;

import com.badpetrovich.divinationforlove_mvc.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card,Integer> {
}
