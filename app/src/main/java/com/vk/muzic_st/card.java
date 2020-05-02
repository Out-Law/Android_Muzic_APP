package com.vk.muzic_st;

public class card {
    private String site;
    private String url;

    card(String title, String content) {
        this.site = title;
        this.url = content;
    }

    String getSite() { return site; }

    String getUrl() { return url; }
}
