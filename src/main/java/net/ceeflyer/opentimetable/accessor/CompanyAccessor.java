package net.ceeflyer.opentimetable.accessor;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import net.ceeflyer.opentimetable.obj.Company;

public interface CompanyAccessor extends AccessorInterface<Company>{
	@Delete("delete from Company where id = #{id};")
	@Override public void delete(int id);
	
	@Insert("insert into Company (name, countryid) values (#{name}, #{countryid});")
	@Override public void insert(Company obj);
	
	@Select("select * from Company limit #{from}, #{row};")
	@Override public List<Company> list(int from, int row);
	
	@Select("select * from Company where countryid = #{countryid} limit #{from}, #{row};")
	public List<Company> listByCountry(int countryid, int from, int row);
	
	@Select("select * from Company where id = #{id};")
	@Override public Company select(int id);
	
	@Update("update Company set name = #{name}, countryid = #{countryid} where id = #{id};")
	@Override public void update(Company obj);
}
