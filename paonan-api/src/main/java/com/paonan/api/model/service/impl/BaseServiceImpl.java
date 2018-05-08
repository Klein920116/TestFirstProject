package com.paonan.api.model.service.impl;

import org.mybatis.plus.mybatisplus.mapper.CommonMapper;
import org.mybatis.plus.mybatisplus.service.impl.CommonServiceImpl;

public class BaseServiceImpl<M extends CommonMapper<T>, T> extends CommonServiceImpl<M, T> {

}
