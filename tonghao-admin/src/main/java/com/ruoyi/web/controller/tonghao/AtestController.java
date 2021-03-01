package com.ruoyi.web.controller.tonghao;

import com.ruoyi.system.domain.AthQ;
import com.ruoyi.system.domain.AthUser;
import com.ruoyi.system.domain.vo.TongHao;
import com.ruoyi.system.mapper.AthQMapper;
import com.ruoyi.system.mapper.AthUserMapper;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tonghao")
public class AtestController {

  @Autowired
  AthUserMapper athUserMapper;

  @Autowired
  AthQMapper athQMapper;

  @GetMapping("/usertest")
  public String testuserss(){
    System.out.println(String.valueOf(athUserMapper.findAll()));
    return "asdasd";
  }

  @GetMapping("/getAllQlByYhId")
  public TongHao getAllQlByYhId(Integer yhid){
    TongHao tongHao = new TongHao();
    List<AthQ> list = athQMapper.getAllQlByYhId(yhid);
    tongHao.data = list;
    tongHao.msg = "成功";
    return tongHao;
  }

  @GetMapping("/denlu")
  public TongHao denlu(String yhm, String mm){
    TongHao tongHao = new TongHao();
    AthUser athUser = new AthUser();
    List<AthUser> all = athUserMapper.findAll();
    if(all != null && all.size() > 0){
      if(all.stream().anyMatch(i -> i.getYhm().equals(yhm) )){
        athUser = all.stream().filter(i -> i.getYhm().equals(yhm) && i.getMm().equals(mm)).findFirst().orElse(null);
        if(athUser == null){
          tongHao.msg = "用户密码不正确";
        }else {
          tongHao.msg = "登陆成功";
          tongHao.data = athUser;
        }
      }else {
        tongHao.msg = "请先注册";
      }
    }else {
      athUser  = null;
      tongHao.msg = "请先注册";
    }
    return tongHao;
  }

  @GetMapping("/usertest1")
  public String usertest1(){
    return "asdasd222222==";
  }

}
