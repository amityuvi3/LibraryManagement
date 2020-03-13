package com.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.BookBean;
import com.service.LibraryMgmtDaoImpl;

import com.tr.repository.BookBeanRepository;




@Controller
public class BookController {
		
	HttpSession session;
		
		@Autowired
		private LibraryMgmtDaoImpl libraryMgmtDaoImpl;
		
		@Autowired
		BookBeanRepository bookBeanRepository;
	
		@RequestMapping(value="/showaddpage",method=RequestMethod.GET)
		public String loginPage(@ModelAttribute("addBook")  BookBean bookBean){
			bookBean= new BookBean();
					
			return "addBook";
		}
	
	
	@RequestMapping(value = "/addBook", method = RequestMethod.POST)
	public String register(@Valid @ModelAttribute("addBook") BookBean bookBean,BindingResult result) {
	//	validator.validate(registrationBean, result);
		if(result.hasErrors()) {
			return "addBook";
		}
		bookBeanRepository.save(bookBean);
		return "redirect:/viewBook";
		
	}
	
	@RequestMapping("/viewBook")
	public String viewallProduct(Model m) {
		
		List<BookBean> productlist=bookBeanRepository.findAll();
		m.addAttribute("viewBooklist",productlist);
		return "viewBook";
	}
	
	@RequestMapping("/deleteBook")
	public String delete(@RequestParam int bookId) {
		bookBeanRepository.deleteById(bookId);
		System.out.println(bookId +"deleted");
	
		return "redirect:/viewBook";
	}
	
	@RequestMapping(value="/showupdatepage",method=RequestMethod.GET)
	public String showupdatepage(@RequestParam int bookId,Model model){
		BookBean bookBean=bookBeanRepository.getOne(bookId);
			model.addAttribute(bookBean);
		return "updateBook";
	}
	@RequestMapping("/updateBook")
	public String updateProduct(@ModelAttribute("bookBean") BookBean bookBean) {
		bookBeanRepository.save(bookBean);
		session.removeAttribute("deleteBook");
		//session.removeAttribute("rlist");
	return "redirect:/viewBook";
	}
	
	@RequestMapping("/searchBook")
    public String searchbyCategory(@RequestParam String category,@RequestParam String bookCategory,HttpServletRequest request) {
          System.out.println(category);
          System.out.println(bookCategory);
          List<BookBean> bookList=null;
          if(bookCategory.equalsIgnoreCase("author_name")){
               bookList=bookBeanRepository.getBooksByCategoryAuthor_Name(category);
          }else if(bookCategory.equalsIgnoreCase("book_name")){
          bookList=bookBeanRepository.getBooksByCategoryBook_Name(category);
          }else{
               bookList=bookBeanRepository.getBooksByCategorySubject_Name(category);
          }
          System.out.println(bookList);
    session=request.getSession();
    session.setAttribute("bookBeanList", bookList);
    //session.removeAttribute("bookBeanList");
               return  "redirect:/viewBook";
    }    

//		
		 	
	
}
