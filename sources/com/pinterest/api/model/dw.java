package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class dw {

    /* renamed from: a, reason: collision with root package name */
    @om.b("app_link_scheme")
    private String f36973a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("application_id")
    private String f36974b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("icon_url_large")
    private String f36975c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("id")
    private String f36976d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f36977e;

    public /* synthetic */ dw(String str, String str2, String str3, String str4, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        dw dwVar = (dw) obj;
        return Objects.equals(this.f36973a, dwVar.f36973a) && Objects.equals(this.f36974b, dwVar.f36974b) && Objects.equals(this.f36975c, dwVar.f36975c) && Objects.equals(this.f36976d, dwVar.f36976d);
    }

    public final int hashCode() {
        return Objects.hash(this.f36973a, this.f36974b, this.f36975c, this.f36976d);
    }

    public dw() {
        this.f36977e = new boolean[4];
    }

    private dw(String str, String str2, String str3, String str4, boolean[] zArr) {
        this.f36973a = str;
        this.f36974b = str2;
        this.f36975c = str3;
        this.f36976d = str4;
        this.f36977e = zArr;
    }
}
