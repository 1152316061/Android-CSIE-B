package org.example.Android.Service.Impl;

import com.alibaba.fastjson.JSON;
import org.example.Android.Mapper.MedicineMapper;
import org.example.Android.Service.MedicineService;
import org.example.Android.pojo.Medicine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicineServiceImpl implements MedicineService {

    @Autowired
    private MedicineMapper medicineMapper;

    @Override
    public int addMedicine(Medicine medicine) {
        return medicineMapper.addMedicine(medicine);
    }

    @Override
    public String getMedicineByUID(String UID) {
        return JSON.toJSONString(medicineMapper.getMedicineByUID(UID));
    }
}
