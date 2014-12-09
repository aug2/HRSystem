package com.aug.actions;

import com.aug.entities.arm.Arm;
import com.aug.services.arm.ArmService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@ResultPath(value = "/")
public class ArmAction extends ActionSupport implements BaseAction{

    @Autowired
    private ArmService armService;

    private List<Arm> arms;

    @Override
    public String initCreate() {
        return null;
    }

    @Override
    @Action(value = "armInitList", results = {
            @Result(name = "input", location = "pages/arm/list.jsp")})
    public String initList() {
        return INPUT;
    }

    @Override
    public String initUpdate() {
        return null;
    }

    @Override
    public String initDelete() {
        return null;
    }

    @Override
    public String create() {
        return null;
    }

    @Override
    @Action(value = "list", results = {
            @Result(name = "input", location = "pages/arm/list.jsp"),
            @Result(name = "success", location = "pages/arm/list.jsp")
    })
    public String list() {
        arms = armService.findAll();

        return SUCCESS;
    }

    @Override
    public String update() {
        return null;
    }

    @Override
    public String delete() {
        return null;
    }
}