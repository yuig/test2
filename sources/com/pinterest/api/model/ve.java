package com.pinterest.api.model;

import java.util.Date;

/* loaded from: classes3.dex */
public class ve implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @om.b("id")
    private String f42832a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("read")
    private Boolean f42833b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("created_at")
    private Date f42834c;

    /* renamed from: d, reason: collision with root package name */
    public String f42835d;

    public final String a() {
        return this.f42835d;
    }

    @Override // dl1.s
    public final String b() {
        return this.f42832a;
    }

    public final void c(Date date) {
        this.f42834c = date;
    }

    public final void e(Boolean bool) {
        this.f42833b = bool;
    }

    public final void g(String str) {
        this.f42832a = str;
    }
}
