package net.ceeflyer.opentimetable;

import java.util.List;
import net.ceeflyer.opentimetable.accessor.LineAccessor;
import net.ceeflyer.opentimetable.obj.Line;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller @RequestMapping("/line")
public class LineController{
	@Autowired private LineAccessor lineAccessor;
	
	@RequestMapping()
	public String listupLine(
			@RequestParam(value = "from", defaultValue = "0") int from,
			@RequestParam(value = "from", defaultValue = "50") int row,
			Model model){
		List<Line> lines = lineAccessor.list(from, row);
		model.addAttribute("", lines);
		
		return "";
	}
}
