package net.ceeflyer.opentimetable.accessor;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import net.ceeflyer.opentimetable.obj.StationOrder;

public interface StationOrderAccessor extends AccessorInterface<StationOrder>{
	@Delete("delete from StationOrder where id = #{id};")
	@Override public void delete(int id);
	
	@Insert("insert into StationOrder (distance, lineId, order, stationId) values (#{distance}, #{lineId}, #{order}, #{stationId});")
	@Override public void insert(StationOrder obj);
	
	@Select("select * from StationOrder limit #{from}, #{row};")
	@Override public List<StationOrder> list(int from, int row);
	
	@Select("select * from StationOrder where id = #{id};")
	@Override public StationOrder select(int id);
	
	@Update("update StationOrder set distance = #{distance}, lineId = #{lineId}, order = #{order}, stationId = #{stationId} where id = #{id};")
	@Override public void update(StationOrder obj);
}
