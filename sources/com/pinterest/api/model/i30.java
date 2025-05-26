package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public final class i30 {

    /* renamed from: a, reason: collision with root package name */
    public String f38630a;

    /* renamed from: b, reason: collision with root package name */
    public String f38631b;

    /* renamed from: c, reason: collision with root package name */
    public String f38632c;

    /* renamed from: d, reason: collision with root package name */
    public String f38633d;

    /* renamed from: e, reason: collision with root package name */
    public String f38634e;

    /* renamed from: f, reason: collision with root package name */
    public String f38635f;

    /* renamed from: g, reason: collision with root package name */
    public Map f38636g;

    /* renamed from: h, reason: collision with root package name */
    public String f38637h;

    /* renamed from: i, reason: collision with root package name */
    public String f38638i;

    /* renamed from: j, reason: collision with root package name */
    public oe0 f38639j;

    /* renamed from: k, reason: collision with root package name */
    public se0 f38640k;

    /* renamed from: l, reason: collision with root package name */
    public String f38641l;

    /* renamed from: m, reason: collision with root package name */
    public b01 f38642m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f38643n;

    public /* synthetic */ i30(int i13) {
        this();
    }

    public final l30 a() {
        return new l30(this.f38630a, this.f38631b, this.f38632c, this.f38633d, this.f38634e, this.f38635f, this.f38636g, this.f38637h, this.f38638i, this.f38639j, this.f38640k, this.f38641l, this.f38642m, this.f38643n, 0);
    }

    public final void b(String str) {
        this.f38635f = str;
        boolean[] zArr = this.f38643n;
        if (zArr.length > 5) {
            zArr[5] = true;
        }
    }

    public final void c(b01 b01Var) {
        this.f38642m = b01Var;
        boolean[] zArr = this.f38643n;
        if (zArr.length > 12) {
            zArr[12] = true;
        }
    }

    public /* synthetic */ i30(l30 l30Var, int i13) {
        this(l30Var);
    }

    private i30() {
        this.f38643n = new boolean[13];
    }

    private i30(@NonNull l30 l30Var) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Map map;
        String str7;
        String str8;
        oe0 oe0Var;
        se0 se0Var;
        String str9;
        b01 b01Var;
        str = l30Var.f39637a;
        this.f38630a = str;
        str2 = l30Var.f39638b;
        this.f38631b = str2;
        str3 = l30Var.f39639c;
        this.f38632c = str3;
        str4 = l30Var.f39640d;
        this.f38633d = str4;
        str5 = l30Var.f39641e;
        this.f38634e = str5;
        str6 = l30Var.f39642f;
        this.f38635f = str6;
        map = l30Var.f39643g;
        this.f38636g = map;
        str7 = l30Var.f39644h;
        this.f38637h = str7;
        str8 = l30Var.f39645i;
        this.f38638i = str8;
        oe0Var = l30Var.f39646j;
        this.f38639j = oe0Var;
        se0Var = l30Var.f39647k;
        this.f38640k = se0Var;
        str9 = l30Var.f39648l;
        this.f38641l = str9;
        b01Var = l30Var.f39649m;
        this.f38642m = b01Var;
        boolean[] zArr = l30Var.f39650n;
        this.f38643n = Arrays.copyOf(zArr, zArr.length);
    }
}
