/**
 * 
 */
package com.javaspring.controllerspractice.displaydate;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
//import java.time.format.FormatStyle;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ccomstock
 *
 */
@Controller
public class HomeController {
	@RequestMapping("/date")
	public String showDate(Model model) {
		model.addAttribute("title", "Date");
		model.addAttribute("color", "color:blue;");
//		model.addAttribute("datetime", ZonedDateTime.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
		model.addAttribute("datetime", ZonedDateTime.now().format(DateTimeFormatter.ofPattern("EEEE', the 'dd' of 'MMMM', 'uuuu")));
		return "index.jsp";
	}
	@RequestMapping("/time")
	public String showTime(Model model) {
		model.addAttribute("title", "Time");
		model.addAttribute("color", "color:green;");
//		model.addAttribute("datetime", ZonedDateTime.now().format(DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL)));
		model.addAttribute("datetime", ZonedDateTime.now().format(DateTimeFormatter.ofPattern("h:mm a")));
		return "index.jsp";
	}
}
