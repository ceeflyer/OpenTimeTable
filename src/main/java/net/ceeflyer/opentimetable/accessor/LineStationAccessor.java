package net.ceeflyer.opentimetable.accessor;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import net.ceeflyer.opentimetable.obj.LineStation;

public interface LineStationAccessor extends AccessorInterface<LineStation>{
	@Delete("delete from LineStation where id = #{id};")
	@Override public void delete(int id);
	
	@Insert("insert into LineStation (station, lineId, order) values (#{station}, #{lineId}, #{order});")
	@Override public void insert(LineStation obj);
	
	@Select("select * from LineStation limit #{from}, #{row};")
	@Override public List<LineStation> list(int from, int row);
	
	@Select("select * from LineStation where id = #{id};")
	@Override public LineStation select(int id);
	
	@Update("update LineStation set stationId = #{stationId}, lineId = #{lineId}, order = #{order} where id = #{id};")
	@Override public void update(LineStation obj);
}
