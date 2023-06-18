package com.badpetrovich.divinationforlove_mvc.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "cards")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "card")
    private String card;

    public String getCard() {
        return card;
    }

//    List<Card> cards = new ArrayList<>();

    //    private List<String> myDeck;
//            = new ArrayList<>();

//    public Lover() {
//    }
//
//    public void getCardToBuffer(int boundOfRandom, List<String> cards){
//
//        Random random = new Random();
//        int randomCard;
//
//        for(int i = 0; i<8; i++){
//            randomCard = random.nextInt(boundOfRandom);
//            myDeck.add(cards.get(randomCard));
//            cards.remove(randomCard);
//            boundOfRandom--;
//        }
//        myDeck.sort(new CardComparator());
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public List<String> getMyDeck() {
//        return myDeck;
//    }
//
//    public void clearMyDeck() {
//       myDeck.removeAll(myDeck);
//    }
//
//    @Override
//    public String toString() {
//        return "Lover{" +
//                "name='" + name + '\'' +
//                ", myDeck=" + myDeck +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Lover lover = (Lover) o;
//        return Objects.equals(name, lover.name) && Objects.equals(myDeck, lover.myDeck);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, myDeck);
//    }
//
//
}

