package com.softeem.stargym.mapper;

import com.softeem.stargym.entity.Advert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AdvertMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Advert record);

    int insertSelective(Advert record);

    Advert selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Advert record);

    int updateByPrimaryKey(Advert record);

    @Select("select * from advert")
    @ResultMap("BaseResultMap")
    List <Advert> selectAllAdvert();

    @Select("select * from advert where name like concat('%','${name}','%')")
    @ResultMap("BaseResultMap")
    List<Advert> selectAdvertByName(@Param("name") String name);


}