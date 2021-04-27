package com.test.service;import com.alibaba.dubbo.config.ApplicationConfig;import com.alibaba.dubbo.config.ReferenceConfig;import com.alibaba.dubbo.config.RegistryConfig;import com.alibaba.dubbo.config.utils.ReferenceConfigCache;import com.alibaba.dubbo.rpc.RpcException;import com.alibaba.dubbo.rpc.service.GenericService;import com.google.gson.JsonParseException;import groovy.util.logging.Slf4j;import org.slf4j.Logger;import org.slf4j.LoggerFactory;import org.springframework.stereotype.Component;import org.springframework.stereotype.Service;@Component@Service@Slf4jpublic class ProviderServer {    Logger logger = LoggerFactory.getLogger(ProviderServer.class);    private String protocol = "dubbo://";    /**     * 泛化调用     *     * @param methodName     * @param params     * @return     * @throws ClassNotFoundException     */    public String invoke(String methodName, Object[] params,String applicationName,String registryAdd,                         String interfaceName,String address,String group,String version,String[] className) {        if (org.apache.commons.lang3.StringUtils.isEmpty(methodName)) {            throw new IllegalArgumentException("方法名必填");        }        logger.info("method="+ methodName);        //获取ReferenceConfig        ReferenceConfig<GenericService> referenceConfig = getGenericReference(applicationName,registryAdd,interfaceName,address,group,version);        //该实例很重，里面封装了所有与注册中心及服务提供方连接，所以要缓存        ReferenceConfigCache configCache = ReferenceConfigCache.getCache();        GenericService genericService = configCache.get(referenceConfig);        try {            //最终泛化调用            Object result = genericService.$invoke(methodName, className, params);            logger.info("result：" + result);            return result.toString();        } catch (NumberFormatException | JsonParseException e) {            throw new RpcException(RpcException.UNKNOWN_EXCEPTION, "parse param error:" + e.toString());        }    }    /**     * 根据根据provider信息构建ReferenceConfig     *     * @return     */    private ReferenceConfig<GenericService> getGenericReference(String applicationName,String registryAdd,String interfaceName,String address,String group,String version) {        ApplicationConfig applicationConfig = new ApplicationConfig();        applicationConfig.setName(applicationName);        RegistryConfig registryConfig = new RegistryConfig();        registryConfig.setAddress("zookeeper://" + registryAdd);        ReferenceConfig<GenericService> referenceConfig = new ReferenceConfig<>();        referenceConfig.setInterface(interfaceName);        referenceConfig.setGeneric(true);        referenceConfig.setApplication(applicationConfig);        referenceConfig.setRegistry(registryConfig);        referenceConfig.setUrl(this.protocol + address);        //超时时间设置10s        referenceConfig.setTimeout(10000);        if (org.apache.commons.lang3.StringUtils.isNotEmpty(group)) {            referenceConfig.setGroup(group);        }        if (org.apache.commons.lang3.StringUtils.isNotEmpty(version)) {            referenceConfig.setVersion(version);        }        return referenceConfig;    }}