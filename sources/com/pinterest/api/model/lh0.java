package com.pinterest.api.model;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class lh0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("advisory")
    private Integer f39763a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("advisory_type")
    private String f39764b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("id")
    private String f39765c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("notices")
    private List<ay> f39766d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("resource_country")
    private String f39767e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("severity")
    private Integer f39768f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("type")
    private String f39769g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f39770h;

    public /* synthetic */ lh0(Integer num, String str, String str2, List list, String str3, Integer num2, String str4, boolean[] zArr, int i13) {
        this(num, str, str2, list, str3, num2, str4, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        lh0 lh0Var = (lh0) obj;
        return Objects.equals(this.f39768f, lh0Var.f39768f) && Objects.equals(this.f39763a, lh0Var.f39763a) && Objects.equals(this.f39764b, lh0Var.f39764b) && Objects.equals(this.f39765c, lh0Var.f39765c) && Objects.equals(this.f39766d, lh0Var.f39766d) && Objects.equals(this.f39767e, lh0Var.f39767e) && Objects.equals(this.f39769g, lh0Var.f39769g);
    }

    public final Integer h() {
        Integer num = this.f39763a;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final int hashCode() {
        return Objects.hash(this.f39763a, this.f39764b, this.f39765c, this.f39766d, this.f39767e, this.f39768f, this.f39769g);
    }

    public final boolean i() {
        boolean[] zArr = this.f39770h;
        return zArr.length > 0 && zArr[0];
    }

    public final String j() {
        return this.f39764b;
    }

    public final List k() {
        return this.f39766d;
    }

    public final String l() {
        return this.f39767e;
    }

    public final Integer m() {
        Integer num = this.f39768f;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public lh0() {
        this.f39770h = new boolean[7];
    }

    private lh0(Integer num, String str, String str2, List<ay> list, String str3, Integer num2, String str4, boolean[] zArr) {
        this.f39763a = num;
        this.f39764b = str;
        this.f39765c = str2;
        this.f39766d = list;
        this.f39767e = str3;
        this.f39768f = num2;
        this.f39769g = str4;
        this.f39770h = zArr;
    }
}
