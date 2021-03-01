package com.ruoyi.web.websocket;

import com.ruoyi.system.domain.AthQ;
import com.ruoyi.system.mapper.AthQMapper;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TongHaoService {

  @Autowired
  AthQMapper athQMapper;

  // 加载消息列表
  public List<AthQ> getAllQlByYhId(Integer yhid){
    List<AthQ> list = athQMapper.getAllQlByYhId(yhid);
    return list;
  }



}
