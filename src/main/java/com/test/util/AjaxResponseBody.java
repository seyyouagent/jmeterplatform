package com.test.util;

public class AjaxResponseBody {
    private Integer status;
    private String msg;
    private Object result;
    private String jwtToken;

    public AjaxResponseBody(){
    }

    public AjaxResponseBody(Integer status, String msg, Object result, String jwtToken) {
        this.status = status;
        this.result = result;
        this.msg = msg;
        this.jwtToken = jwtToken;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public String getJwtToken() {
        return jwtToken;
    }

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }

    @Override
    public String toString() {
        return "AjaxResponseBody{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                ", result=" + result +
                ", jwtToken='" + jwtToken + '\'' +
                '}';
    }
}
