package org.example.Android.Service.Impl;

import org.example.Android.Mapper.LocMapper;
import org.example.Android.Service.LocService;
import org.example.Android.pojo.Myloc;

public class LocServiceImpl implements LocService {
    private LocMapper locMapper;
    @Override
    public void insertLoc(Myloc myloc) {
        locMapper.insertLoc(myloc);
    }
}
