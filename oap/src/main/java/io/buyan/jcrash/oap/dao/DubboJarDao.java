package io.buyan.jcrash.oap.dao;

import io.buyan.jcrash.oap.entity.DubboJar;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 
 *
 * @author Gan Pengyu
 * CreateDate 2022/2/12
 */
@Mapper
public interface DubboJarDao {
    int deleteByPrimaryKey(Long id);

    int insert(DubboJar record);

    int batchInsert(List<DubboJar> jars);

    int insertSelective(DubboJar record);

    DubboJar selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DubboJar record);

    int updateByPrimaryKey(DubboJar record);
}