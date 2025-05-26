package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class m11 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("authId")
    private String f39968a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("context")
    private a11 f39969b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("sessionId")
    private String f39970c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("surveyId")
    private Integer f39971d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("username")
    private String f39972e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("visitId")
    private String f39973f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f39974g;

    public /* synthetic */ m11(String str, a11 a11Var, String str2, Integer num, String str3, String str4, boolean[] zArr, int i13) {
        this(str, a11Var, str2, num, str3, str4, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        m11 m11Var = (m11) obj;
        return Objects.equals(this.f39971d, m11Var.f39971d) && Objects.equals(this.f39968a, m11Var.f39968a) && Objects.equals(this.f39969b, m11Var.f39969b) && Objects.equals(this.f39970c, m11Var.f39970c) && Objects.equals(this.f39972e, m11Var.f39972e) && Objects.equals(this.f39973f, m11Var.f39973f);
    }

    public final String g() {
        return this.f39970c;
    }

    public final String h() {
        return this.f39973f;
    }

    public final int hashCode() {
        return Objects.hash(this.f39968a, this.f39969b, this.f39970c, this.f39971d, this.f39972e, this.f39973f);
    }

    public m11() {
        this.f39974g = new boolean[6];
    }

    private m11(String str, a11 a11Var, String str2, Integer num, String str3, String str4, boolean[] zArr) {
        this.f39968a = str;
        this.f39969b = a11Var;
        this.f39970c = str2;
        this.f39971d = num;
        this.f39972e = str3;
        this.f39973f = str4;
        this.f39974g = zArr;
    }
}
