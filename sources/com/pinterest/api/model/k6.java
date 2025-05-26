package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class k6 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("answers")
    private String f39296a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("cookies")
    private String f39297b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("extra_context")
    private String f39298c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("pin_id")
    private String f39299d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("session_id")
    private String f39300e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f39301f;

    public /* synthetic */ k6(String str, String str2, String str3, String str4, String str5, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, str5, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k6 k6Var = (k6) obj;
        return Objects.equals(this.f39296a, k6Var.f39296a) && Objects.equals(this.f39297b, k6Var.f39297b) && Objects.equals(this.f39298c, k6Var.f39298c) && Objects.equals(this.f39299d, k6Var.f39299d) && Objects.equals(this.f39300e, k6Var.f39300e);
    }

    public final int hashCode() {
        return Objects.hash(this.f39296a, this.f39297b, this.f39298c, this.f39299d, this.f39300e);
    }

    public k6() {
        this.f39301f = new boolean[5];
    }

    private k6(String str, String str2, String str3, String str4, String str5, boolean[] zArr) {
        this.f39296a = str;
        this.f39297b = str2;
        this.f39298c = str3;
        this.f39299d = str4;
        this.f39300e = str5;
        this.f39301f = zArr;
    }
}
