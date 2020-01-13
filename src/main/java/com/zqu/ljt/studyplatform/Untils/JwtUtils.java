package com.zqu.ljt.studyplatform.Untils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.zqu.ljt.studyplatform.Bean.Account;
import com.zqu.ljt.studyplatform.Bean.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JwtUtils {
    private static final String SECRET = "MySecret_Token";
    private static final int EXPIRE =5;

    private static Map<String,Object> attribute;

    //拓展内容
    private static Map<String,Object> Attribute = new HashMap<>();

    /**
     *创建token
     * @param user 用户信息
     * @return token
     * @throws UnsupportedEncodingException
     */
    public static String createToken(User user) throws UnsupportedEncodingException {
        Calendar nowTime = Calendar.getInstance();
        nowTime.add(Calendar.SECOND,EXPIRE);
        Date expireDate = nowTime.getTime();

        Map<String,Object> map = new HashMap<>();
        map.put("alg","HS256");
        map.put("typ","JWT");


        String token = JWT.create()
                .withHeader(map)
//                .withClaim("userId",user.getId())
//                .withClaim("username",user.getUsername())
                .withClaim("Attribute", String.valueOf(Attribute))
                .withIssuedAt(new Date())
                .withExpiresAt(expireDate)
                .sign(Algorithm.HMAC256(SECRET));
        return token;
    }

    /**
     * 验证token是否失效
     * @param token token
     * @return
     * @throws UnsupportedEncodingException
     */
    public static Map<String, Claim> verifyToken(String token) throws UnsupportedEncodingException {
        JWTVerifier verifierToken = JWT.require(Algorithm.HMAC256(SECRET)).build();
        DecodedJWT jwt = null;
        try{
            jwt = verifierToken.verify(token);
        }catch (Exception e){
            throw new RuntimeException("会话失效，请重新登录");
        }
        return jwt.getClaims();
    }

    /**
     * 解析token信息
     * @param token token
     * @return token信息
     */
    public static Map<String,Claim> parseToken(String token){
        DecodedJWT decodedJWT = JWT.decode(token);
        return decodedJWT.getClaims();
    }

    public static Map<String, Object> getAttribute() {
        return Attribute;
    }

    public static void setAttribute(Map<String, Object> attribute) {
        Attribute = attribute;
    }

}
