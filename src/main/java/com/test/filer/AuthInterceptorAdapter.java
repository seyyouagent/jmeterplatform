package com.test.filer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@EnableWebMvc
@Configuration
public class AuthInterceptorAdapter extends HandlerInterceptorAdapter {

    Logger logger = LoggerFactory.getLogger(AuthInterceptorAdapter.class);

//    private final static String API = "api";
//
//    @Value("${jwt.header}")
//    private String tokenHeader;
//    @Value("${jwt.tokenHead}")
//    private String tokenHead;
//
//    @Autowired
//    private JwtTokenUtil jwtTokenUtil;
//
////    @Autowired
//
//
//    @Autowired
//    RedisUtil redisUtil;
//
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//
//        if (handler.getClass().isAssignableFrom(HandlerMethod.class)) {
//            if (request.getRequestURL().toString().contains(API)){
//                return true;
//            }
//            try {
//                // 返回服务器ip
//                response.setHeader("serviceIp", InetAddress.getLocalHost().getHostAddress());
//            } catch (Exception e) {
//                response.setHeader("serviceIp", "服务器配置异常，无法获取服务器IP");
//            }
//            if (request.getRequestURI().endsWith("login") ||
//                    request.getRequestURI().endsWith("swagger-ui") ||
//                    request.getRequestURI().endsWith(".css") ||
//                    request.getRequestURI().endsWith(".js")) {
//                return true;
//            }
//
//        } else {
//            return true;
//        }
//
//        String strName = "";
//
////        String authHeader = request.getHeader(tokenHeader);
////        if (authHeader != null && authHeader.startsWith(tokenHead)) {
////            String authToken = authHeader.substring(tokenHead.length());
////            String username = jwtTokenUtil.getUsernameFromToken(authToken);
////            if (username != null) {
////                strName = redisUtil.get(username);
////                if(strName == null || strName.equals("")) {
////                    UserBo userBo = userService.loadUserByUsername(username);
////                    strName = userBo.getUserName();
////                }
////
////                if (jwtTokenUtil.validateToken(authToken)) {
////                    if (jwtTokenUtil.validateToken(authToken, strName)) {
////                        return true;
////                    } else {
////                        jwtTokenUtil.del(authToken);
////                        return false;
////                    }
////                }
////            }
////        }
//        return false;
//    }
}
