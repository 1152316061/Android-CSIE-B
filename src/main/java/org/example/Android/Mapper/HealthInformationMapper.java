package org.example.Android.Mapper;

import org.example.Android.pojo.HealthInformation;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HealthInformationMapper {
    void insertHI(HealthInformation HI);
    List<HealthInformation> getHIByUID(String UID);
}
