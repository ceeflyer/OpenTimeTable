package net.ceeflyer.opentimetable.accessor;

import org.apache.ibatis.annotations.Insert;

public interface UserAccessor{
	@Insert("insert into User ")
	void add(String user, String pass);
}
