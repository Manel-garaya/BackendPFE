package com.flesk.messageriee.services;

import com.flesk.messageriee.models.Image;
import com.flesk.messageriee.repositories.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ImageService {

    @Autowired
    ImageRepository imageRepository;

    public List<Image> list() {
        return imageRepository.findByOrderById();
    }

    public Optional<Image> getOne(String id) {
        return imageRepository.findById(id);
    }

    public void save(Image image) {
        imageRepository.save(image);

    }
    public void delete(String id) {
        imageRepository.deleteById(id);
    }
    public boolean exists(String id){
        return imageRepository.existsById(id);
    }
}
