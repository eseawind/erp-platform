package com.speedycomm.erp.org.core;

import com.speedycomm.erp.org.OrganizationType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by linjietao on 15/12/29.
 * 组织单元托管代理关系
 */
@Entity
@Table(name = "T_ORG_OrganizationAgent")
public class OrganizationAgent extends OrganizationRelation {

    private static final long serialVersionUID = 5928496647198872862L;

    @Column(name = "FAgentType")
    private OrganizationType agentType;

    public OrganizationType getAgentType() {
        return agentType;
    }

    public void setAgentType(OrganizationType agentType) {
        this.agentType = agentType;
    }
}