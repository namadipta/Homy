package com.app.homy.mapper.homyuser;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.app.homy.dto.homyUser.HomyUser;

/**
 * @author namadipta
 *
 * Mapper class to interact HomyPartner data
 */

@Mapper
public interface HomyUserMapper {

	@Select("select * from homy_user_details")
	List<HomyUser> findAllHomyUser();
	
	@Select("select * from homy_user_details where homy_user_id= #{userId}")
	HomyUser findHomyUserById(@Param("userId") final Integer userId);
	
	
	@Select("select * from homy_user_details where email_address= #{homyUserEmail}")
	HomyUser findHomyUserByEmail(@Param("homyUserEmail") final  String homyUserEmail);
	
	@Select("select * from homy_user_details where mobile_number= #{homyUserNumber}")
	HomyUser findHomyUserByNumber(@Param("homyUserNumber") final  String homyUserNumber);
}
