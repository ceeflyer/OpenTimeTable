package net.ceeflyer.opentimetable.accessor;

import java.util.List;
import net.ceeflyer.opentimetable.obj.AbstractObject;

public interface AccessorInterface<T extends AbstractObject>{
	T select(int id);
	
	List<T> list(int from, int row);
	
	void insert(T obj);
	
	void delete(int id);
	
	void update(T obj);
}
