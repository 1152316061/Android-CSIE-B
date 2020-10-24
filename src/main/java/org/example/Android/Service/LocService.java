package org.example.Android.Service;

import org.example.Android.pojo.Myloc;
import org.springframework.stereotype.Service;

@Service
public interface LocService {
    void insertLoc(Myloc myloc);
}
