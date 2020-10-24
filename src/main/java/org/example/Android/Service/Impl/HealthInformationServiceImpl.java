package org.example.Android.Service.Impl;

import com.alibaba.fastjson.JSON;
import org.example.Android.Mapper.HealthInformationMapper;
import org.example.Android.Service.HealthInformationService;
import org.example.Android.pojo.HealthInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HealthInformationServiceImpl implements HealthInformationService {

    @Autowired
    private HealthInformationMapper HIMapper;
    @Override
    public void insertHI(HealthInformation HI) {
        HIMapper.insertHI(HI);
    }

    @Override
    public String getHIByUID(String UID) {
        return JSON.toJSONString(HIMapper.getHIByUID(UID));
    }
}
