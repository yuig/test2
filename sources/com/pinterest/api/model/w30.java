package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class w30 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("ENGAGEMENT")
    private a40 f43151a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("IMPRESSION")
    private a40 f43152b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("OUTBOUND_CLICK")
    private a40 f43153c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("PIN_CLICK")
    private a40 f43154d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("PRODUCT_TAG_CLICK")
    private a40 f43155e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("PRODUCT_TAG_IMPRESSION")
    private a40 f43156f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("PRODUCT_TAG_OUTBOUND_CLICK")
    private a40 f43157g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("PRODUCT_TAG_SAVE")
    private a40 f43158h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("QUARTILE_95_PERCENT_VIEW")
    private a40 f43159i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("SAVE")
    private a40 f43160j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("VIDEO_10S_VIEW")
    private a40 f43161k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("VIDEO_AVG_WATCH_TIME")
    private a40 f43162l;

    /* renamed from: m, reason: collision with root package name */
    @om.b("VIDEO_MRC_VIEW")
    private a40 f43163m;

    /* renamed from: n, reason: collision with root package name */
    @om.b("VIDEO_V50_WATCH_TIME")
    private a40 f43164n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f43165o;

    public /* synthetic */ w30(a40 a40Var, a40 a40Var2, a40 a40Var3, a40 a40Var4, a40 a40Var5, a40 a40Var6, a40 a40Var7, a40 a40Var8, a40 a40Var9, a40 a40Var10, a40 a40Var11, a40 a40Var12, a40 a40Var13, a40 a40Var14, boolean[] zArr, int i13) {
        this(a40Var, a40Var2, a40Var3, a40Var4, a40Var5, a40Var6, a40Var7, a40Var8, a40Var9, a40Var10, a40Var11, a40Var12, a40Var13, a40Var14, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        w30 w30Var = (w30) obj;
        return Objects.equals(this.f43151a, w30Var.f43151a) && Objects.equals(this.f43152b, w30Var.f43152b) && Objects.equals(this.f43153c, w30Var.f43153c) && Objects.equals(this.f43154d, w30Var.f43154d) && Objects.equals(this.f43155e, w30Var.f43155e) && Objects.equals(this.f43156f, w30Var.f43156f) && Objects.equals(this.f43157g, w30Var.f43157g) && Objects.equals(this.f43158h, w30Var.f43158h) && Objects.equals(this.f43159i, w30Var.f43159i) && Objects.equals(this.f43160j, w30Var.f43160j) && Objects.equals(this.f43161k, w30Var.f43161k) && Objects.equals(this.f43162l, w30Var.f43162l) && Objects.equals(this.f43163m, w30Var.f43163m) && Objects.equals(this.f43164n, w30Var.f43164n);
    }

    public final int hashCode() {
        return Objects.hash(this.f43151a, this.f43152b, this.f43153c, this.f43154d, this.f43155e, this.f43156f, this.f43157g, this.f43158h, this.f43159i, this.f43160j, this.f43161k, this.f43162l, this.f43163m, this.f43164n);
    }

    public final a40 o() {
        return this.f43151a;
    }

    public final a40 p() {
        return this.f43152b;
    }

    public final a40 q() {
        return this.f43153c;
    }

    public final a40 r() {
        return this.f43154d;
    }

    public final a40 s() {
        return this.f43159i;
    }

    public final a40 t() {
        return this.f43160j;
    }

    public final a40 u() {
        return this.f43161k;
    }

    public final a40 v() {
        return this.f43162l;
    }

    public final a40 w() {
        return this.f43163m;
    }

    public final a40 x() {
        return this.f43164n;
    }

    public w30() {
        this.f43165o = new boolean[14];
    }

    private w30(a40 a40Var, a40 a40Var2, a40 a40Var3, a40 a40Var4, a40 a40Var5, a40 a40Var6, a40 a40Var7, a40 a40Var8, a40 a40Var9, a40 a40Var10, a40 a40Var11, a40 a40Var12, a40 a40Var13, a40 a40Var14, boolean[] zArr) {
        this.f43151a = a40Var;
        this.f43152b = a40Var2;
        this.f43153c = a40Var3;
        this.f43154d = a40Var4;
        this.f43155e = a40Var5;
        this.f43156f = a40Var6;
        this.f43157g = a40Var7;
        this.f43158h = a40Var8;
        this.f43159i = a40Var9;
        this.f43160j = a40Var10;
        this.f43161k = a40Var11;
        this.f43162l = a40Var12;
        this.f43163m = a40Var13;
        this.f43164n = a40Var14;
        this.f43165o = zArr;
    }
}
