package com.badpetrovich.divinationforlove_mvc.service;

import com.badpetrovich.divinationforlove_mvc.dao.LoverRepository;
import com.badpetrovich.divinationforlove_mvc.model.Lover;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoverService {

    @Autowired
    private LoverRepository loverRepository;

    public Lover findById(Integer id) throws Exception {
        Optional<Lover> lover = loverRepository.findById(id);
        if (lover.isPresent()){
            return lover.get();
        }
        else {
            throw new Exception("Любовник не найден");
        }
    }

    public List<Lover> findAll(){
        return loverRepository.findAll();
    }

    public Lover saveLover(Lover lover){
        return loverRepository.save(lover);
    }

    public void deleteById(Integer id){
        loverRepository.deleteById(id);
    }
}
