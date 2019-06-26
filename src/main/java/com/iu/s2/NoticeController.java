package com.iu.s2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.iu.notice.NoticeService;
import com.iu.s2.board.BoardVO;

@Controller
@RequestMapping(value="/notice/**")
public class NoticeController {
	
	private NoticeService noticeService;
	
	public NoticeController() {
		
		noticeService = new NoticeService();
	}
	
	@RequestMapping(value="noticeDelete", method=RequestMethod.GET)
	public void boardDelete() {
		
		
	}
	
	@RequestMapping(value="noticeSelect", method=RequestMethod.GET)
	public void boardSelect() {
		
		
	}
	
	//리다이렉트
	@RequestMapping(value="noticeUpdate", method=RequestMethod.POST)
	public String boardUpdate2() {
		
		return "redirect:./boardList";
	}
	
	@RequestMapping(value="noticeUpdate", method=RequestMethod.GET)
	public void boardUpdate() {
		
		
	}
	
	//리다이렉트
	@RequestMapping(value="noticeWrite", method=RequestMethod.POST)
	public String boardWrite2(BoardVO boardVO) {
		
		System.out.println(boardVO.getNum());
		System.out.println(boardVO.getTitle());
		System.out.println(boardVO.getContents());
		System.out.println(boardVO.getWriter());
		
		
		return "redirect:./boardList";
	}
	
	@RequestMapping(value="noticeWrite", method=RequestMethod.GET)
	public String boardWrite() {
		
		return "board/boardWrite";
	}
	
	@RequestMapping(value="noticeList", method=RequestMethod.GET)
	public ModelAndView boardList(ModelAndView mv) {
		
		mv.addObject("board/boardList");
		
		return mv;
	}

}
