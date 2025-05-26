package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class l00 {

    /* renamed from: a, reason: collision with root package name */
    public String f39603a;

    /* renamed from: b, reason: collision with root package name */
    public String f39604b;

    /* renamed from: c, reason: collision with root package name */
    public String f39605c;

    /* renamed from: d, reason: collision with root package name */
    public List f39606d;

    /* renamed from: e, reason: collision with root package name */
    public String f39607e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f39608f;

    /* renamed from: g, reason: collision with root package name */
    public String f39609g;

    /* renamed from: h, reason: collision with root package name */
    public String f39610h;

    /* renamed from: i, reason: collision with root package name */
    public List f39611i;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f39612j;

    /* renamed from: k, reason: collision with root package name */
    public List f39613k;

    /* renamed from: l, reason: collision with root package name */
    public List f39614l;

    /* renamed from: m, reason: collision with root package name */
    public String f39615m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f39616n;

    public /* synthetic */ l00(int i13) {
        this();
    }

    public final o00 a() {
        return new o00(this.f39603a, this.f39604b, this.f39605c, this.f39606d, this.f39607e, this.f39608f, this.f39609g, this.f39610h, this.f39611i, this.f39612j, this.f39613k, this.f39614l, this.f39615m, this.f39616n, 0);
    }

    public final void b(List list) {
        this.f39606d = list;
        boolean[] zArr = this.f39616n;
        if (zArr.length > 3) {
            zArr[3] = true;
        }
    }

    public final void c(String str) {
        this.f39607e = str;
        boolean[] zArr = this.f39616n;
        if (zArr.length > 4) {
            zArr[4] = true;
        }
    }

    public final void d(Integer num) {
        this.f39608f = num;
        boolean[] zArr = this.f39616n;
        if (zArr.length > 5) {
            zArr[5] = true;
        }
    }

    public final void e(String str) {
        this.f39609g = str;
        boolean[] zArr = this.f39616n;
        if (zArr.length > 6) {
            zArr[6] = true;
        }
    }

    public final void f(List list) {
        this.f39611i = list;
        boolean[] zArr = this.f39616n;
        if (zArr.length > 8) {
            zArr[8] = true;
        }
    }

    public final void g(Boolean bool) {
        this.f39612j = bool;
        boolean[] zArr = this.f39616n;
        if (zArr.length > 9) {
            zArr[9] = true;
        }
    }

    public final void h(List list) {
        this.f39614l = list;
        boolean[] zArr = this.f39616n;
        if (zArr.length > 11) {
            zArr[11] = true;
        }
    }

    public /* synthetic */ l00(o00 o00Var, int i13) {
        this(o00Var);
    }

    private l00() {
        this.f39616n = new boolean[13];
    }

    private l00(@NonNull o00 o00Var) {
        String str;
        String str2;
        String str3;
        List list;
        String str4;
        Integer num;
        String str5;
        String str6;
        List list2;
        Boolean bool;
        List list3;
        List list4;
        String str7;
        str = o00Var.f40568a;
        this.f39603a = str;
        str2 = o00Var.f40569b;
        this.f39604b = str2;
        str3 = o00Var.f40570c;
        this.f39605c = str3;
        list = o00Var.f40571d;
        this.f39606d = list;
        str4 = o00Var.f40572e;
        this.f39607e = str4;
        num = o00Var.f40573f;
        this.f39608f = num;
        str5 = o00Var.f40574g;
        this.f39609g = str5;
        str6 = o00Var.f40575h;
        this.f39610h = str6;
        list2 = o00Var.f40576i;
        this.f39611i = list2;
        bool = o00Var.f40577j;
        this.f39612j = bool;
        list3 = o00Var.f40578k;
        this.f39613k = list3;
        list4 = o00Var.f40579l;
        this.f39614l = list4;
        str7 = o00Var.f40580m;
        this.f39615m = str7;
        boolean[] zArr = o00Var.f40581n;
        this.f39616n = Arrays.copyOf(zArr, zArr.length);
    }
}
