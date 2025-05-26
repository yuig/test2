package com.pinterest.api.model;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class r40 {

    /* renamed from: a, reason: collision with root package name */
    public final String f41481a;

    public r40(@NonNull String str, vd0.c cVar) {
        if (pk.a0.x0(str) || cVar == null) {
            return;
        }
        cVar.o("title", "").replace("\\n", "");
        this.f41481a = cVar.o("url", "");
        cVar.o("site_name", "");
        cVar.o("favicon_link", "");
        cVar.o("apple_touch_icon_link", "");
        cVar.o("locale", "");
    }

    public r40(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f41481a = str6;
    }
}
