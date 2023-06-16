package com.badpetrovich.divinationforlove_mvc.service;

import com.badpetrovich.divinationforlove_mvc.dao.CardRepository;
import com.badpetrovich.divinationforlove_mvc.dao.LoverRepository;
import com.badpetrovich.divinationforlove_mvc.model.Card;
import com.badpetrovich.divinationforlove_mvc.model.Lover;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    private LoverRepository loverRepository;

    @Autowired
    private CardRepository cardRepository;

    public Lover findById(Integer id) throws Exception {
        Optional<Lover> lover = loverRepository.findById(id);
        if (lover.isPresent()){
            return lover.get();
        }
        else {
            throw new Exception("Любовник не найден");
        }
    }

    public List<Card> findAll(){
        return cardRepository.findAll();
    }

    public void getCardToLover(List<Lover> lovers, List<Card> cardsBuffer){
        List<String> cards = new ArrayList<>();
        for(int i=0;i<cardsBuffer.size();i++){
            cards.add((cardsBuffer.get(i).getCard()));
        }
        Collections.shuffle(cards);
        for(int i = 0; i<lovers.size();i++){
            int boundOfRandom=cards.size();
            lovers.get(i).getCardToBuffer(boundOfRandom, cards);
        }
    }

    public Lover saveLover(Lover lover){
        return loverRepository.save(lover);
    }

    public void deleteById(Integer id){
        loverRepository.deleteById(id);
    }
}
