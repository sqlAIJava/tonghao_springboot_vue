package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.AthQ;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AthQMapper {

  List<AthQ> getAllQlByYhId(@Param("yhid") Integer yhid);

}
