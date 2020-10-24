package org.example.Android.Service;

import org.example.Android.pojo.Medicine;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MedicineService {
    int addMedicine(Medicine medicine);
    String getMedicineByUID(String UID);
}
