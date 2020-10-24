package org.example.Android.Mapper;

import org.example.Android.pojo.Medicine;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicineMapper {
    int addMedicine(Medicine medicine);
    List<Medicine> getMedicineByUID(String UID);
}
