package net.ceeflyer.opentimetable.accessor;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import net.ceeflyer.opentimetable.obj.StationRelation;

public interface StationRelationAccessor extends AccessorInterface<StationRelation>{
	@Delete("delete from StationRelation where id = #{id};")
	@Override public void delete(int id);
	
	@Insert("insert into StationRelation (distance, lineId, stationIdFrom, stationIdTo)"
			+ " values (#{distance}, #{lineId}, #{stationIdFrom}, #{stationIdTo});")
	@Override public void insert(StationRelation obj);
	
	@Select("select * from StationRelation limit #{from}, #{row};")
	@Override public List<StationRelation> list(int from, int row);
	
	@Select("select * from StationRelation where id = #{id};")
	@Override public StationRelation select(int id);
	
	@Update("update StationRelation set distance = #{distance}, lineId = #{lineId}, "
			+ "stationIdFrom = #{stationIdFrom}, stationIdTo = #{stationIdTo} where id = #{id};")
	@Override public void update(StationRelation obj);
}
