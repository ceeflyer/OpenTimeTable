package net.ceeflyer.opentimetable.accessor;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import net.ceeflyer.opentimetable.obj.Fare;

public interface FareAccessor extends AccessorInterface<Fare>{
	@Delete("delete from Fare where id = #{id};")
	@Override public void delete(int id);
	
	@Insert("insert into Fare (fareGroupId, relationId, currencyId, fare) values (#{fareGroupId}, #{relationId}, #{currencyId}, #{fare});")
	@Override public void insert(Fare obj);
	
	@Select("select * from Fare limit #{from}, #{row};")
	@Override public List<Fare> list(int from, int row);
	
	@Select("select * from Fare where id = #{id};")
	@Override public Fare select(int id);
	
	@Update("update Fare set fareGroupId = #{fareGroupId}, relationId = #{relationId}, currencyId = #{currentcyId}, fare = #{fare} where id = #{id};")
	@Override public void update(Fare obj);
}
