package com.test.bean;import java.io.Serializable;import java.util.Arrays;public class ProviderBean implements Serializable {    private String methodName;    private Object[] params;    private String applicationName;    private String registryAdd;    private String interfaceName;    private String address;    private String group;    private String version;    private String[] className;    public String getMethodName() {        return methodName;    }    public void setMethodName(String methodName) {        this.methodName = methodName;    }    public Object[] getParams() {        return params;    }    public void setParams(Object[] params) {        this.params = params;    }    public String getApplicationName() {        return applicationName;    }    public void setApplicationName(String applicationName) {        this.applicationName = applicationName;    }    public String getRegistryAdd() {        return registryAdd;    }    public void setRegistryAdd(String registryAdd) {        this.registryAdd = registryAdd;    }    public String getInterfaceName() {        return interfaceName;    }    public void setInterfaceName(String interfaceName) {        this.interfaceName = interfaceName;    }    public String getAddress() {        return address;    }    public void setAddress(String address) {        this.address = address;    }    public String getGroup() {        return group;    }    public void setGroup(String group) {        this.group = group;    }    public String getVersion() {        return version;    }    public void setVersion(String version) {        this.version = version;    }    public String[] getClassName() {        return className;    }    public void setClassName(String[] className) {        this.className = className;    }    @Override    public String toString() {        return "ProviderBean{" +                "methodName='" + methodName + '\'' +                ", params=" + Arrays.toString(params) +                ", applicationName='" + applicationName + '\'' +                ", registryAdd='" + registryAdd + '\'' +                ", interfaceName='" + interfaceName + '\'' +                ", address='" + address + '\'' +                ", group='" + group + '\'' +                ", version='" + version + '\'' +                ", className=" + Arrays.toString(className) +                '}';    }}