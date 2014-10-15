package net.ceeflyer.opentimetable.accessor;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import net.ceeflyer.opentimetable.obj.Province;

public interface ProvinceAccessor extends AccessorInterface<Province>{
	@Delete("delete from Province where id = #{id};")
	@Override public void delete(int id);
	
	@Insert("insert into Province (name, countryId) values (#{name}, #{countryId});")
	@Override public void insert(Province obj);
	
	@Select("select * from Province limit #{from}, #{row};")
	@Override public List<Province> list(int from, int row);
	
	@Select("select * from Province where countryId = #{countryId} limit #{from}, #{row};")
	public List<Province> listByCountry(int countryId, int from, int row);
	
	@Select("select * from Province where id = #{id};")
	@Override public Province select(int id);
	
	@Update("update Province set name = #{name}, countryId = #{countryId} where id = #{id};")
	@Override public void update(Province obj);
}
