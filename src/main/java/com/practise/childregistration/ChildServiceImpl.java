package com.practise.childregistration;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ChildServiceImpl implements ChildService{

    private ChildRepository childRepository;

    @Override
    public ChildDto addChild(ChildDto childDto){

        //Convert ChildDto into Child JPA Entity
        Child younger = new Child();
        younger.setName(childDto.getName());
        younger.setBirthPlace(childDto.getBirthPlace());
        younger.setBirthDay(childDto.getBirthDay());
        younger.setGender(childDto.getGender());
        younger.setWeight(childDto.getWeight());
        younger.setMamaName(childDto.getMamaName());
        younger.setMamaOccupation(childDto.getMamaOccupation());
        younger.setMamaAge(childDto.getMamaAge());
        younger.setMaritalStatus(childDto.getMaritalStatus());

        //Child JPA Entity
        Child savedChild = childRepository.save(younger);

        //Convert saved Child JPA Entity object into ChildDto object
        ChildDto savedChildDto = new ChildDto();
        savedChildDto.setRegNo(savedChild.getRegNo());
        savedChildDto.setName(savedChild.getName());
        savedChildDto.setBirthPlace(savedChild.getBirthPlace());
        savedChildDto.setBirthDay(savedChild.getBirthDay());
        savedChildDto.setGender(savedChild.getGender());
        savedChildDto.setWeight(savedChild.getWeight());
        savedChildDto.setMamaName(savedChild.getMamaName());
        savedChildDto.setMamaOccupation(savedChild.getMamaOccupation());
        savedChildDto.setMamaAge(savedChild.getMamaAge());
        savedChildDto.setMaritalStatus(savedChild.getMaritalStatus());

        return savedChildDto;
    }
}
