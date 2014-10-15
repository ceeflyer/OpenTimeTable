package net.ceeflyer.opentimetable.accessor;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import net.ceeflyer.opentimetable.obj.LineFare;

public interface LineFareAccessor extends AccessorInterface<LineFare>{
	@Delete("delete from LineFare where id = #{id};")
	@Override public void delete(int id);
	
	@Insert("insert into LineFare (lineId, fareId) values (#{lineId}, #{fareId});")
	@Override public void insert(LineFare obj);
	
	@Select("select * from LineFare limit #{from}, #{row};")
	@Override public List<LineFare> list(int from, int row);
	
	@Select("select * from LineFare where id = #{id};")
	@Override public LineFare select(int id);
	
	@Update("update LineFare set lineId = #{lineId}, fareId = #{fareId} where id = #{id};")
	@Override public void update(LineFare obj);
}
