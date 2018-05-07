package com.freelancer.spring.flbackend.dto.param;

import java.io.Serializable;

public class UpdateAvatarUrlDto implements Serializable{

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    private String avatarUrl;
}
