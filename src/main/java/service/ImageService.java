package service;

import model.ImageEntity;

import java.util.List;

public interface ImageService {
    List<ImageEntity> findAll();

    ImageEntity findById(Integer id);

    void save(ImageEntity blog);

    void remove(Integer id);
}
