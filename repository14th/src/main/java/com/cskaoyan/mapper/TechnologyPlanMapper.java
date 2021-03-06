package com.cskaoyan.mapper;

import com.cskaoyan.bean.TechnologyPlan;
import com.cskaoyan.vo.Vo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TechnologyPlanMapper {

    int deleteByPrimaryKey(String technologyPlanId);

    int insert(TechnologyPlan record);

    int insertSelective(TechnologyPlan record);

    TechnologyPlan selectByPrimaryKey(String technologyPlanId);

    int updateByPrimaryKeySelective(TechnologyPlan record);

    int updateByPrimaryKey(TechnologyPlan record);

    List<TechnologyPlan> findTechnologyPlan();

    TechnologyPlan getTechnologyPlan(@Param("planid")int planid);

    int deleteTechnologyPlanList(@Param("ids") String[] ids);

    List<TechnologyPlan> searchTechnologyPlanByTechnologyPlanId(@Param("searchValue") String searchValue);

    List<TechnologyPlan> searchTechnologyPlanByTechnologyName(@Param("searchValue") String searchValue);
}