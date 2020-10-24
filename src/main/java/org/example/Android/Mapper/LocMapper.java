package org.example.Android.Mapper;

import org.example.Android.pojo.Myloc;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocMapper {
    void insertLoc(Myloc loc);
    List<Myloc> getLatestLocByUID(String UID);
}
