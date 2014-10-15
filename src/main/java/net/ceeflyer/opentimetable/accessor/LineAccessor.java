package net.ceeflyer.opentimetable.accessor;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import net.ceeflyer.opentimetable.obj.FareType;
import net.ceeflyer.opentimetable.obj.Line;

public interface LineAccessor extends AccessorInterface<Line>{
	@Delete("delete from Line where id = #{id};")
	@Override public void delete(int id);

	@Insert("insert into Line (name, nickname, companyId) values (#{name}, #{nickname}, #{companyId});")
	@Override public void insert(Line obj);
	
	@Select("select * from Line limit #{from}, #{row};")
	@Override public List<Line> list(int from, int row);
	
	@Select("select * from Line where id = #{id};")
	@Override public Line select(int id);
	
	@Update("update Line set name = #{name}, nickname = #{nickname}, companyId = #{companyId} where id = #{id};")
	@Override public void update(Line obj);
}
