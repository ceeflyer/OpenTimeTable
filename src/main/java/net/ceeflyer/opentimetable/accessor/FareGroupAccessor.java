package net.ceeflyer.opentimetable.accessor;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import net.ceeflyer.opentimetable.obj.FareGroup;

public interface FareGroupAccessor extends AccessorInterface<FareGroup>{
	@Delete("delete from FareGroup where id = #{id};")
	@Override public void delete(int id);

	@Insert("insert into FareGroup (name) values (#{name});")
	@Override public void insert(FareGroup obj);
	
	@Select("select * from FareGroup limit #{from}, #{row};")
	@Override public List<FareGroup> list(int from, int row);
	
	@Select("select * from FareGroup where id = #{id};")
	@Override public FareGroup select(int id);
	
	@Update("update FareGroup set name = #{name} where id = #{id};")
	@Override public void update(FareGroup obj);
}
