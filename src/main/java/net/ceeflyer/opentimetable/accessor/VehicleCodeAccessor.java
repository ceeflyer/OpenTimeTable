package net.ceeflyer.opentimetable.accessor;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import net.ceeflyer.opentimetable.obj.VehicleCode;

public interface VehicleCodeAccessor extends AccessorInterface<VehicleCode>{
	@Delete("delete from VehicleCode where id = #{id};")
	@Override public void delete(int id);
	
	@Insert("insert into VehicleCode (code, isMainCode, nickname, vehicleId)"
			+ " values (#{code}, #{isMainCode}, #{nickname}, #{vehicleId});")
	@Override public void insert(VehicleCode obj);
	
	@Select("select * from VehicleCode limit #{from}, #{row};")
	@Override public List<VehicleCode> list(int from, int row);
	
	@Select("select * from VehicleCode where id = #{id};")
	@Override public VehicleCode select(int id);
	
	@Update("update VehicleCode set code = #{code}, isMainCode = #{isMainCode}, "
			+ "nickname = #{nickname}, vehicleId = #{vehicleId} where id = #{id};")
	@Override public void update(VehicleCode obj);
}
