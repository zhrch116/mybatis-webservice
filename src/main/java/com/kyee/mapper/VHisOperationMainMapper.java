package com.kyee.mapper;

import com.kyee.model.VHisOperationMain;
import java.util.List;

public interface VHisOperationMainMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table V_HIS_OPERATION_MAIN
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String operationMainId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table V_HIS_OPERATION_MAIN
     *
     * @mbggenerated
     */
    int insert(VHisOperationMain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table V_HIS_OPERATION_MAIN
     *
     * @mbggenerated
     */
    VHisOperationMain selectByPrimaryKey(String operationMainId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table V_HIS_OPERATION_MAIN
     *
     * @mbggenerated
     */
    List<VHisOperationMain> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table V_HIS_OPERATION_MAIN
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(VHisOperationMain record);
}