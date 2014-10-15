package net.ceeflyer.opentimetable.accessor;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import net.ceeflyer.opentimetable.obj.FareType;

public interface FareTypeAccessor extends AccessorInterface<FareType>{
	@Delete("delete from FareType where id = #{id};")
	@Override public void delete(int id);

	@Insert("insert into FareType (name) values (#{name});")
	@Override public void insert(FareType obj);
	
	@Select("select * from FareType limit #{from}, #{row};")
	@Override public List<FareType> list(int from, int row);
	
	@Select("select * from FareType where id = #{id};")
	@Override public FareType select(int id);
	
	@Update("update FareType set name = #{name} where id = #{id};")
	@Override public void update(FareType obj);
}
