/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.global.struts.form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 11-26-2008
 * 
 * XDoclet definition:
 * @struts.form name="selectEmployeeForm"
 */
public class SelectEmployeeForm extends ActionForm {
	/*
	 * Generated fields
	 */

	/** employeeID property */
	private String empNO;

	/** deliveryspotID property */
	private String deliveryspotName;

	/*
	 * Generated Methods
	 */

	/** 
	 * Method validate
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * Method reset
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
	}

	/** 
	 * Returns the employeeID.
	 * @return String
	 */
	public String getEmpNO() {
		return empNO;
	}

	/** 
	 * Set the employeeID.
	 * @param employeeID The employeeID to set
	 */
	public void setEmpNO(String empNO) {
		this.empNO = empNO;
	}

	/** 
	 * Returns the deliveryspotID.
	 * @return String
	 */
	public String getDeliveryspotName() {
		return deliveryspotName;
	}

	/** 
	 * Set the deliveryspotID.
	 * @param deliveryspotID The deliveryspotID to set
	 */
	public void setDeliveryspotName(String deliveryspotName) {
		this.deliveryspotName = deliveryspotName;
	}
}