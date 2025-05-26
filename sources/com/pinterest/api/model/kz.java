package com.pinterest.api.model;

/* loaded from: classes3.dex */
public enum kz {
    NOTIFICATION_SETTING_TYPE_NEWS("news"),
    NOTIFICATION_SETTING_TYPE_EMAIL("email"),
    NOTIFICATION_SETTING_TYPE_PUSH("push");

    private final String type;

    kz(String str) {
        this.type = str;
    }

    public String getType() {
        return this.type;
    }
}
