package PageMager;

import pageObjectManager.E2E_VerifyCart_page_Object_Model;
import pageObjectManager.E2E_verifycart_interface;
import pageObjectManager.E2E_verifycart_method_class;

public class PageObjectManager {
	
private E2E_VerifyCart_page_Object_Model e2e_VerifyCart_page_Object_Model;

private E2E_verifycart_method_class e2e_verifycart_method_class;

private E2E_verifycart_interface e2e_verifycart_interface;

public E2E_VerifyCart_page_Object_Model getE2e_VerifyCart_page_Object_Model() {
	
	return (e2e_VerifyCart_page_Object_Model==null)? e2e_VerifyCart_page_Object_Model= new E2E_VerifyCart_page_Object_Model():e2e_VerifyCart_page_Object_Model;
}

public E2E_verifycart_method_class getE2e_verifycart_method_class() {
	return (e2e_verifycart_method_class==null)?e2e_verifycart_method_class = new E2E_verifycart_method_class():e2e_verifycart_method_class;
}

public E2E_verifycart_interface getE2e_verifycart_interface() {
	
	return (e2e_verifycart_interface==null)? e2e_verifycart_interface = new E2E_verifycart_interface():e2e_verifycart_interface;
}

}
