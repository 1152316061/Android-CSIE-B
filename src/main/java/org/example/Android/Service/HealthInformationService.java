package org.example.Android.Service;

import org.example.Android.pojo.HealthInformation;
import org.springframework.stereotype.Service;


@Service
public interface HealthInformationService {
    void insertHI(HealthInformation HI);
    String getHIByUID(String UID);
}
