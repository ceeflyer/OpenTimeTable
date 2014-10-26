package net.ceeflyer.opentimetable.accessor;

import net.ceeflyer.opentimetable.obj.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserAccessor{
	@Insert("insert into User (user, pass, privilege) values (#{user}, password(#{pass}), #{privilege});")
	void add(User user);
	
	@Select("select count(*) from User where user = #{user} and pass = password(#{pass});")
	int inquiry(String user, String pass);
	
	@Select("select count(*) from User where user = #{user};")
	int exists(String user);
	
	@Select("select * from User where user = #{user} and pass = password(#{pass});")
	User select(String user, String pass);
	
	@Update("update User set user = #{user} and pass = password(#{pass}) and privilege = #{privilege} where user = #{user} and pass = password(#{pass});")
	void update(User user);
	
	@Delete("delete from user where user = #{user};")
	void delete(String user);
}
