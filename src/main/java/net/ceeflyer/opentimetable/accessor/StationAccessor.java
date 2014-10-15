package net.ceeflyer.opentimetable.accessor;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import net.ceeflyer.opentimetable.obj.Station;

public interface StationAccessor extends AccessorInterface<Station>{
	@Delete("delete from Station where id = #{id};")
	@Override public void delete(int id);
	
	@Insert("insert into Station (name, place, provinceId, type) values (#{name}, #{place}, #{provinceId}, #{type});")
	@Override public void insert(Station obj);
	
	@Select("select * from Station limit #{from}, #{row};")
	@Override public List<Station> list(int from, int row);
	
	@Select("select * from Station where id = #{id};")
	@Override public Station select(int id);
	
	@Update("update Station set name = #{name}, place = #{place}, provinceId = #{provinceId}, type = #{type} where id = #{id};")
	@Override public void update(Station obj);
}
