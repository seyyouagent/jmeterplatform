package com.test.bean;import java.io.Serializable;public class DubboBean implements Serializable {    // 名称    private String applicationName;    // zk地址 如果集群 用逗号分割    private String zkAddr;    // service 地址    private String interfaceAddr;    // 方法名称    private String ref;    // 组    private String group;    // 版本    private String version;    // 参数地址    private String classAddr;    // 参数合集    private String params;    public String getApplicationName() {        return applicationName;    }    public void setApplicationName(String applicationName) {        this.applicationName = applicationName;    }    public String getZkAddr() {        return zkAddr;    }    public void setZkAddr(String zkAddr) {        this.zkAddr = zkAddr;    }    public String getInterfaceAddr() {        return interfaceAddr;    }    public void setInterfaceAddr(String interfaceAddr) {        this.interfaceAddr = interfaceAddr;    }    public String getRef() {        return ref;    }    public void setRef(String ref) {        this.ref = ref;    }    public String getGroup() {        return group;    }    public void setGroup(String group) {        this.group = group;    }    public String getVersion() {        return version;    }    public void setVersion(String version) {        this.version = version;    }    public String getClassAddr() {        return classAddr;    }    public void setClassAddr(String classAddr) {        this.classAddr = classAddr;    }    public String getParams() {        return params;    }    public void setParams(String params) {        this.params = params;    }    @Override    public String toString() {        return "DubboBean{" +                "applicationName='" + applicationName + '\'' +                ", zkAddr='" + zkAddr + '\'' +                ", interfaceAddr='" + interfaceAddr + '\'' +                ", ref='" + ref + '\'' +                ", group='" + group + '\'' +                ", version='" + version + '\'' +                ", classAddr='" + classAddr + '\'' +                ", params='" + params + '\'' +                '}';    }}