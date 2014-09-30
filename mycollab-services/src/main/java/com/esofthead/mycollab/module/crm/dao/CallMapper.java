/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.esofthead.mycollab.module.crm.dao;

import com.esofthead.mycollab.core.persistence.ICrudGenericDAO;
import com.esofthead.mycollab.module.crm.domain.CallExample;
import com.esofthead.mycollab.module.crm.domain.CallWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface CallMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_call
     *
     * @mbggenerated Sat Sep 27 14:27:26 ICT 2014
     */
    int countByExample(CallExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_call
     *
     * @mbggenerated Sat Sep 27 14:27:26 ICT 2014
     */
    int deleteByExample(CallExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_call
     *
     * @mbggenerated Sat Sep 27 14:27:26 ICT 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_call
     *
     * @mbggenerated Sat Sep 27 14:27:26 ICT 2014
     */
    int insert(CallWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_call
     *
     * @mbggenerated Sat Sep 27 14:27:26 ICT 2014
     */
    int insertSelective(CallWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_call
     *
     * @mbggenerated Sat Sep 27 14:27:26 ICT 2014
     */
    List<CallWithBLOBs> selectByExampleWithBLOBs(CallExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_call
     *
     * @mbggenerated Sat Sep 27 14:27:26 ICT 2014
     */
    CallWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_call
     *
     * @mbggenerated Sat Sep 27 14:27:26 ICT 2014
     */
    int updateByExampleSelective(@Param("record") CallWithBLOBs record, @Param("example") CallExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_call
     *
     * @mbggenerated Sat Sep 27 14:27:26 ICT 2014
     */
    int updateByExampleWithBLOBs(@Param("record") CallWithBLOBs record, @Param("example") CallExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_call
     *
     * @mbggenerated Sat Sep 27 14:27:26 ICT 2014
     */
    int updateByPrimaryKeySelective(CallWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_call
     *
     * @mbggenerated Sat Sep 27 14:27:26 ICT 2014
     */
    int updateByPrimaryKeyWithBLOBs(CallWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_call
     *
     * @mbggenerated Sat Sep 27 14:27:26 ICT 2014
     */
    Integer insertAndReturnKey(CallWithBLOBs value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_call
     *
     * @mbggenerated Sat Sep 27 14:27:26 ICT 2014
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_call
     *
     * @mbggenerated Sat Sep 27 14:27:26 ICT 2014
     */
    void massUpdateWithSession(@Param("record") CallWithBLOBs record, @Param("primaryKeys") List primaryKeys);
}