package net.ceeflyer.opentimetable.accessor;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import net.ceeflyer.opentimetable.obj.Currency;

public interface CurrencyAccessor extends AccessorInterface<Currency>{
	@Delete("delete from Currency where id = #{id};")
	@Override public void delete(int id);
	
	@Insert("insert into Currency (name, symbol, rate) values (#{name}, #{symbol}, #{rate});")
	@Override public void insert(Currency obj);
	
	@Select("select * from Currency limit #{from}, #{row};")
	@Override public List<Currency> list(int from, int row);
	
	@Select("select * from Currency where id = #{id};")
	@Override public Currency select(int id);
	
	@Update("update Currency set name = #{name}, symbol = #{symbol}, rate = #{rate} where id = #{id};")
	@Override public void update(Currency obj);
}
