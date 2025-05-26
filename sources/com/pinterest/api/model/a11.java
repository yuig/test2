package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class a11 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("app_type")
    private String f35620a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("app_version")
    private String f35621b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("language")
    private String f35622c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("pin_id")
    private String f35623d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("user_country")
    private String f35624e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f35625f;

    public /* synthetic */ a11(String str, String str2, String str3, String str4, String str5, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, str5, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a11 a11Var = (a11) obj;
        return Objects.equals(this.f35620a, a11Var.f35620a) && Objects.equals(this.f35621b, a11Var.f35621b) && Objects.equals(this.f35622c, a11Var.f35622c) && Objects.equals(this.f35623d, a11Var.f35623d) && Objects.equals(this.f35624e, a11Var.f35624e);
    }

    public final int hashCode() {
        return Objects.hash(this.f35620a, this.f35621b, this.f35622c, this.f35623d, this.f35624e);
    }

    public a11() {
        this.f35625f = new boolean[5];
    }

    private a11(String str, String str2, String str3, String str4, String str5, boolean[] zArr) {
        this.f35620a = str;
        this.f35621b = str2;
        this.f35622c = str3;
        this.f35623d = str4;
        this.f35624e = str5;
        this.f35625f = zArr;
    }
}
