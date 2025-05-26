package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class o4 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("all")
    private a5 f40606a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("from_you")
    private a5 f40607b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("in_profile_false")
    private a5 f40608c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("in_profile_true")
    private a5 f40609d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("mobile")
    private a5 f40610e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("not_from_you")
    private a5 f40611f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("organic")
    private a5 f40612g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("paid")
    private a5 f40613h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("paid_false")
    private a5 f40614i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("paid_true")
    private a5 f40615j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("product")
    private a5 f40616k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("standard")
    private a5 f40617l;

    /* renamed from: m, reason: collision with root package name */
    @om.b("story")
    private a5 f40618m;

    /* renamed from: n, reason: collision with root package name */
    @om.b("tablet")
    private a5 f40619n;

    /* renamed from: o, reason: collision with root package name */
    @om.b("video")
    private a5 f40620o;

    /* renamed from: p, reason: collision with root package name */
    @om.b("web")
    private a5 f40621p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f40622q;

    public /* synthetic */ o4(a5 a5Var, a5 a5Var2, a5 a5Var3, a5 a5Var4, a5 a5Var5, a5 a5Var6, a5 a5Var7, a5 a5Var8, a5 a5Var9, a5 a5Var10, a5 a5Var11, a5 a5Var12, a5 a5Var13, a5 a5Var14, a5 a5Var15, a5 a5Var16, boolean[] zArr, int i13) {
        this(a5Var, a5Var2, a5Var3, a5Var4, a5Var5, a5Var6, a5Var7, a5Var8, a5Var9, a5Var10, a5Var11, a5Var12, a5Var13, a5Var14, a5Var15, a5Var16, zArr);
    }

    public final a5 A() {
        return this.f40616k;
    }

    public final a5 B() {
        return this.f40617l;
    }

    public final a5 C() {
        return this.f40618m;
    }

    public final a5 D() {
        return this.f40619n;
    }

    public final a5 E() {
        return this.f40620o;
    }

    public final a5 F() {
        return this.f40621p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        o4 o4Var = (o4) obj;
        return Objects.equals(this.f40606a, o4Var.f40606a) && Objects.equals(this.f40607b, o4Var.f40607b) && Objects.equals(this.f40608c, o4Var.f40608c) && Objects.equals(this.f40609d, o4Var.f40609d) && Objects.equals(this.f40610e, o4Var.f40610e) && Objects.equals(this.f40611f, o4Var.f40611f) && Objects.equals(this.f40612g, o4Var.f40612g) && Objects.equals(this.f40613h, o4Var.f40613h) && Objects.equals(this.f40614i, o4Var.f40614i) && Objects.equals(this.f40615j, o4Var.f40615j) && Objects.equals(this.f40616k, o4Var.f40616k) && Objects.equals(this.f40617l, o4Var.f40617l) && Objects.equals(this.f40618m, o4Var.f40618m) && Objects.equals(this.f40619n, o4Var.f40619n) && Objects.equals(this.f40620o, o4Var.f40620o) && Objects.equals(this.f40621p, o4Var.f40621p);
    }

    public final int hashCode() {
        return Objects.hash(this.f40606a, this.f40607b, this.f40608c, this.f40609d, this.f40610e, this.f40611f, this.f40612g, this.f40613h, this.f40614i, this.f40615j, this.f40616k, this.f40617l, this.f40618m, this.f40619n, this.f40620o, this.f40621p);
    }

    public final a5 q() {
        return this.f40606a;
    }

    public final a5 r() {
        return this.f40607b;
    }

    public final a5 s() {
        return this.f40608c;
    }

    public final a5 t() {
        return this.f40609d;
    }

    public final a5 u() {
        return this.f40610e;
    }

    public final a5 v() {
        return this.f40611f;
    }

    public final a5 w() {
        return this.f40612g;
    }

    public final a5 x() {
        return this.f40613h;
    }

    public final a5 y() {
        return this.f40614i;
    }

    public final a5 z() {
        return this.f40615j;
    }

    public o4() {
        this.f40622q = new boolean[16];
    }

    private o4(a5 a5Var, a5 a5Var2, a5 a5Var3, a5 a5Var4, a5 a5Var5, a5 a5Var6, a5 a5Var7, a5 a5Var8, a5 a5Var9, a5 a5Var10, a5 a5Var11, a5 a5Var12, a5 a5Var13, a5 a5Var14, a5 a5Var15, a5 a5Var16, boolean[] zArr) {
        this.f40606a = a5Var;
        this.f40607b = a5Var2;
        this.f40608c = a5Var3;
        this.f40609d = a5Var4;
        this.f40610e = a5Var5;
        this.f40611f = a5Var6;
        this.f40612g = a5Var7;
        this.f40613h = a5Var8;
        this.f40614i = a5Var9;
        this.f40615j = a5Var10;
        this.f40616k = a5Var11;
        this.f40617l = a5Var12;
        this.f40618m = a5Var13;
        this.f40619n = a5Var14;
        this.f40620o = a5Var15;
        this.f40621p = a5Var16;
        this.f40622q = zArr;
    }
}
