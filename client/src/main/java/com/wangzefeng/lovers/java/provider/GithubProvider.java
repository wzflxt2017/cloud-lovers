package com.wangzefeng.lovers.java.provider;

import com.alibaba.fastjson.JSON;
import com.wangzefeng.lovers.java.dto.AccessTokenDTO;
import com.wangzefeng.lovers.java.dto.GithubUser;
import com.lovers.utils.HttpUtils;
import org.springframework.stereotype.Component;

@Component
public class GithubProvider {

    private String users_url="https://github.com/login/oauth/access_token";

    public String getAccessToken(AccessTokenDTO accessTokenDTO){

        String post = HttpUtils.post(users_url, JSON.toJSONString(accessTokenDTO));
        String[] split = post.split("&");
        String access_token = split[0].split("=")[1];
        return access_token;
    }

    public GithubUser getGithubUser(String access_token){
        String userJson = HttpUtils.get("https://api.github.com/user?access_token=" + access_token);
        GithubUser githubUser = JSON.parseObject(userJson, GithubUser.class);
        return githubUser;
    }
}
