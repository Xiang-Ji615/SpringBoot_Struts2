package main.java.spring.boot.tst.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport {

	String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		this.msg = "JJ Msg";
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("tstMsg", "Message from request");
		return SUCCESS;
	}

}
