package service;

import model.ImageEntity;
import org.springframework.beans.factory.annotation.Autowired;
import repository.ImageRepository;

import java.util.List;

public class ImageServiceImpl implements ImageService {

    @Autowired
    private ImageRepository imageRepository;

    @Override
    public List<ImageEntity> findAll() {
        return imageRepository.findAll();
    }

    @Override
    public ImageEntity findById(Integer id) {
        return imageRepository.findOne(id);
    }

    @Override
    public void save(ImageEntity image) {
        imageRepository.save(image);
    }

    @Override
    public void remove(Integer id) {
        imageRepository.delete(id);
    }
}
