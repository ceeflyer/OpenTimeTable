package net.ceeflyer.opentimetable.accessor;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import net.ceeflyer.opentimetable.obj.Country;

public interface CountryAccessor extends AccessorInterface<Country>{
	@Delete("delete from Country where id = #{id};")
	@Override public void delete(int id);
	
	@Insert("insert into Country (name) values (#{name});")
	@Override public void insert(Country obj);
	
	@Select("select * from Country limit #{from}, ${row};")
	@Override public List<Country> list(int from, int row);
	
	@Select("select * from Country where id = #{id};")
	@Override public Country select(int id);
	
	@Update("update Country set name = ${name} where id = #{id};")
	@Override public void update(Country obj);
}
