package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class ts0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("id")
    private String f42284a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("length")
    private Integer f42285b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("link")
    private String f42286c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("object_id")
    private String f42287d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("offset")
    private Integer f42288e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("tag_type")
    private Integer f42289f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("type")
    private String f42290g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f42291h;

    public /* synthetic */ ts0(String str, Integer num, String str2, String str3, Integer num2, Integer num3, String str4, boolean[] zArr, int i13) {
        this(str, num, str2, str3, num2, num3, str4, zArr);
    }

    public static qs0 h() {
        return new qs0(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ts0 ts0Var = (ts0) obj;
        return Objects.equals(this.f42289f, ts0Var.f42289f) && Objects.equals(this.f42288e, ts0Var.f42288e) && Objects.equals(this.f42285b, ts0Var.f42285b) && Objects.equals(this.f42284a, ts0Var.f42284a) && Objects.equals(this.f42286c, ts0Var.f42286c) && Objects.equals(this.f42287d, ts0Var.f42287d) && Objects.equals(this.f42290g, ts0Var.f42290g);
    }

    public final int hashCode() {
        return Objects.hash(this.f42284a, this.f42285b, this.f42286c, this.f42287d, this.f42288e, this.f42289f, this.f42290g);
    }

    public final Integer i() {
        Integer num = this.f42285b;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final String j() {
        return this.f42286c;
    }

    public final String k() {
        return this.f42287d;
    }

    public final Integer l() {
        Integer num = this.f42288e;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Integer m() {
        Integer num = this.f42289f;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public ts0() {
        this.f42291h = new boolean[7];
    }

    private ts0(String str, Integer num, String str2, String str3, Integer num2, Integer num3, String str4, boolean[] zArr) {
        this.f42284a = str;
        this.f42285b = num;
        this.f42286c = str2;
        this.f42287d = str3;
        this.f42288e = num2;
        this.f42289f = num3;
        this.f42290g = str4;
        this.f42291h = zArr;
    }
}
