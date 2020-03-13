package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.RegistrationBean;
import com.service.LibraryMgmtDaoImpl;
import com.tr.repository.RegistrationBeanRepository;

@Controller
public class RegistrationController {

	HttpSession session;

	@Autowired
	private LibraryMgmtDaoImpl libraryMgmtDaoImpl;
	@Autowired
	RegistrationBeanRepository registerBeanRepository;
	//ModelMap model;
	// @Autowired
	// private Validator validator;
	

@RequestMapping("/logout")
       public String logout(){
              return "logout";
       }


	@RequestMapping(value = "/loginpage", method = RequestMethod.GET)
	public String loginPage(@ModelAttribute("login") RegistrationBean registrationBean) {
		registrationBean = new RegistrationBean();

		return "index";
	}

	@RequestMapping(value = "/registerPage", method = RequestMethod.GET)
	public String registerPage(@ModelAttribute("register") RegistrationBean registrationBean) {
		registrationBean = new RegistrationBean();

		return "registrationpage";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(@Valid @ModelAttribute("register") RegistrationBean registrationBean, BindingResult result) {
		// validator.validate(registrationBean, result);
		if (result.hasErrors()) {
			return "registrationpage";
		}
		registerBeanRepository.save(registrationBean);
		return "registerSuccess";

	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@Valid @ModelAttribute("login") RegistrationBean registrationBean, BindingResult result,
                  HttpServletRequest request, ModelMap model) {
           // validator.validate(registrationBean, result);
           
           
           if(registrationBean.getUserId().equals("")){
                  return "index";
           }
           if(registrationBean.getPassword().equals("")){
                  return "index";
           }
           
           RegistrationBean registrationBean1 = null;    
           
           
           registrationBean1 = libraryMgmtDaoImpl.validateLogin(registrationBean);
           
           
           if (registrationBean1 != null) {
                  String category = null;
                  category = registrationBean1.getCategory();
                  System.out.println(category);
                  if (category.equals("Admin")) {
                        if (registrationBean1.getFirstName() != null) {
                               session = request.getSession();
                               session.setAttribute("username", registrationBean1.getFirstName());
                               session.setAttribute("category", registrationBean1.getCategory());
                               return "admin_home";
                        } else if (result.hasErrors()) {
                               return "index";
                        }

                  }
                  if (category.equals("User")) {
                        if (registrationBean1.getFirstName() != null) {
                               session = request.getSession();
                               session.setAttribute("username", registrationBean1.getFirstName());
                               session.setAttribute("category", registrationBean1.getCategory());
                               return "user_home";
                        } else if (result.hasErrors()) {
                               return "index";
                        }

                  }
                  if (category.equals("Librarian")) {
                        if (registrationBean1.getFirstName() != null) {
                               session = request.getSession();
                               session.setAttribute("username", registrationBean1.getFirstName());
                               session.setAttribute("category", registrationBean1.getCategory());
                               return "librarian_home";
                        } else if (result.hasErrors()) {
                               return "index";
                        }

                  }
           
           
//               return "index";
//         }
//         else if(registrationBean1.getUserId()==null){
//         
//               
//               return "index";
//         }
//         else if(registrationBean1.getPassword()==null){
//               
//               
//               return "index";
//         }
    //     registrationBean1 = libraryMgmtDaoImpl.validateLogin(registrationBean);
           
           // else if(registrationBean.getUserId()!=null && registrationBean.getPassword()!=null ) {
           }
           
           else if(registrationBean1==null){       
                  
                  registrationBean1 = libraryMgmtDaoImpl.validateUserId(registrationBean);
                  
                  if(registrationBean1==null){
                  model.addAttribute("errorUserId","User Id not present");
                  }else
                        {model.addAttribute("errorPassword","User Password not matched");
                        
                        }
                  return "index";
           }
           
           
           
           return "index";
    }



	@RequestMapping("/register")
	public String addProduct(@Valid @ModelAttribute("register") RegistrationBean registrationBean,
			BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {

			return "registrationFail";
		}
		registerBeanRepository.save(registrationBean);
		return "redirect:/loginpage";
	}

	@ModelAttribute("categoryList")
	public List<String> populateExpense() {
		List<String> categoryListType = new ArrayList<String>();
		categoryListType.add("Admin");
		categoryListType.add("Librarian");
		categoryListType.add("User");
		return categoryListType;
	}
	
	@RequestMapping("/viewLibrarianDetails")
    public String viewLibrarianDetails(Model m) {
           
           List<RegistrationBean> registrationBeans = registerBeanRepository.getLibrarianDetails("Librarian");
           m.addAttribute("viewLibrarianlist",registrationBeans);
           return "librarianDetails";
    }
    
    @RequestMapping("/deleteLibrarian")
    public String delete(@RequestParam String userId) {
           
           
           registerBeanRepository.deleteByUserId(userId);
           System.out.println(userId +"deleted");
    
           return "redirect:/viewLibrarianDetails";
    }


}
