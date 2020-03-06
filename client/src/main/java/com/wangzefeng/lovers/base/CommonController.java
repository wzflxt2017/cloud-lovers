package com.wangzefeng.lovers.base;

import com.wangzefeng.lovers.constants.CommonConstants;
import com.wangzefeng.lovers.domain.dto.Result;
import com.wangzefeng.lovers.domain.entity.SysUser;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.PropertiesEditor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Data
@Controller
public class CommonController  {

    @Value("${lovers.rootPath}")
    protected String rootPath;

    public SysUser getSysUser(){
        Object ouser = session.getAttribute(CommonConstants.SESSION_USER);
        if(ouser!=null){
            return (SysUser)ouser;
        }else{
            return null;
        }
    }

//    @InitBinder
//    public void initDateBinder(WebDataBinder dataBinder) {
//        dataBinder.registerCustomEditor(Date.class,new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
//        dataBinder.registerCustomEditor(Date.class,new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"), true));
//    }

    @InitBinder
    protected void initDateBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class, new MyDateEditor());
        binder.registerCustomEditor(Double.class, new DoubleEditor());
        binder.registerCustomEditor(Integer.class, new IntegerEditor());
    }

    private class MyDateEditor extends PropertyEditorSupport {
        @Override
        public void setAsText(String text) throws IllegalArgumentException {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = null;
            try {
                date = format.parse(text);
            } catch (ParseException e) {
                format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                try {
                    date = format.parse(text);
                } catch (ParseException e1) {
                    format = new SimpleDateFormat("yyyy-MM-dd");
                    try {
                        date = format.parse(text);
                    } catch (ParseException e2) {
                    }
                }
            }
            setValue(date);
        }
    }

    public class DoubleEditor extends PropertiesEditor {
        @Override
        public void setAsText(String text) throws IllegalArgumentException {
            if (text == null || text.equals("")) {
                text = "0";
            }
            setValue(Double.parseDouble(text));
        }

        @Override
        public String getAsText() {
            return getValue().toString();
        }
    }

    public class IntegerEditor extends PropertiesEditor {
        @Override
        public void setAsText(String text) throws IllegalArgumentException {
            if (text == null || text.equals("")) {
                text = "0";
            }
            setValue(Integer.parseInt(text));
        }

        @Override
        public String getAsText() {
            return getValue().toString();
        }
    }

    public String getRootPath() {
        return rootPath;
    }

    public void setRootPath(String rootPath) {
        this.rootPath = rootPath;
    }

    @Autowired
    protected HttpSession session;

    @Autowired
    protected HttpServletRequest request;

    @Autowired
    protected HttpServletResponse response;

    protected Result result=new Result();

    protected Map<String,Object> reqData=new HashMap<>();

    public String getParam(String key){
        return request.getParameter(key);
    }

    public String getRequestAttr(String key){
        return request.getAttribute(key)!=null?request.getAttribute(key).toString():null;
    }

    public Object getRequestObjectAttr(String key){
        return request.getAttribute(key);
    }

    public void setRequestAttr(String key,Object value){
        request.setAttribute(key,value);
    }

    public Object getSessionObjectAttr(String key){
        return session.getAttribute(key);
    }

    public String getSessionAttr(String key){
        return session.getAttribute(key)!=null?session.getAttribute(key).toString():null;
    }

    public void setSessionAttr(String key,Object value){
        session.setAttribute(key,value);
    }
}

