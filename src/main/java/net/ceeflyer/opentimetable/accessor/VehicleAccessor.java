package net.ceeflyer.opentimetable.accessor;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import net.ceeflyer.opentimetable.obj.Vehicle;

public interface VehicleAccessor extends AccessorInterface<Vehicle>{
	@Delete("delete from Vehicle where id = #{id};")
	@Override public void delete(int id);
	
	@Insert("insert into Vehicle (continuousId, endOrder, lineId, name, nextId, startOrder)"
			+ " values (#{continuousId}, #{endOrder}, #{lineId}, #{name}, #{nextId}, #{startOrder});")
	@Override public void insert(Vehicle obj);
	
	@Select("select * from Vehicle limit #{from}, #{row};")
	@Override public List<Vehicle> list(int from, int row);
	
	@Select("select * from Vehicle where id = #{id};")
	@Override public Vehicle select(int id);
	
	@Update("update Vehicle set continuousId = #{continuousId}, endOrder = #{endOrder}, lineId = #{lineId}, "
			+ "name = #{name}, nextId = #{nextId}, startOrder = #{startOrder} where id = #{id};")
	@Override public void update(Vehicle obj);
}
