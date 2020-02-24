package org.mybatis.presentation;

import java.util.List;
import javax.annotation.Resource;

import org.mybatis.domain.Shop;
import org.mybatis.service.ShopService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping(value = "/shop") // 요청하는 controller 중에 shop이 들어가면 이 class를 사용하도록 지정
public class ShopController {
	
	// @Resource에 의해 ShopServiceImpl 객체를 자동 주입
	@Resource
	private ShopService shopService;
	
	// '/shop/list'를 get 방식으로 요청시 아래 method로 응답
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView list(Shop shop) throws Exception {
		List<Shop> listShop = this.shopService.find(shop);
		
		ModelAndView mav = new ModelAndView("/shop/list");
		mav.addObject("listShop", listShop);
		
		return mav;
	}
	
	// 등록 화면 GET방식 접근 시 해당 view 만 전달 ; WEB-INF/jsp/shop/add.jsp
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addForm() throws Exception {
		return "/shop/add";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView add (Shop shop) throws Exception {
		
		// RedirectView의 경우 parameter까지 같이 전달됨,
		// setExposeModelAttributes : RedirectView에 Parameter가 전달되도록 할지 설정 
		RedirectView rv = new RedirectView("list");
		rv.setExposeModelAttributes(false);
		
		this.shopService.add(shop);
		
		return new ModelAndView(rv);
	}
	
	@RequestMapping(value = "", method = RequestMethod.)
	public () throws Exception {
		
	}
	
	@RequestMapping(value = "", method = RequestMethod.)
	public () throws Exception {
		
	}
	
}
