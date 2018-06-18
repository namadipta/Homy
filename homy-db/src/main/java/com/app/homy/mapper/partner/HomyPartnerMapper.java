/**
 * 
 */
package com.app.homy.mapper.partner;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.app.homy.dto.homyParner.HomyPartner;

/**
 * @author namadipta
 *
 * Mapper class to interact Partner data
 */
@Mapper
public interface HomyPartnerMapper {

	@Select("select * from partner_details")
	List<HomyPartner> findAllPartner();
	
	@Select("select * from partner_details where partner_id= #{userId}")
	HomyPartner findPartnerById(@Param("userId") final Integer userId);
	
	@Select("select * from partner_details where email_address= #{partnerEmail}")
	HomyPartner findPartnerByEmail(@Param("partnerNumber") final  String partnerEmail);
	
	@Select("select * from customer_details where mobile_number= #{partnerNumber}")
	HomyPartner findPartnerByNumber(@Param("partnerNumber") final  String partnerNumber);
}
