package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class k90 {

    /* renamed from: a, reason: collision with root package name */
    public String f39346a;

    /* renamed from: b, reason: collision with root package name */
    public String f39347b;

    /* renamed from: c, reason: collision with root package name */
    public String f39348c;

    /* renamed from: d, reason: collision with root package name */
    public String f39349d;

    /* renamed from: e, reason: collision with root package name */
    public String f39350e;

    /* renamed from: f, reason: collision with root package name */
    public String f39351f;

    /* renamed from: g, reason: collision with root package name */
    public String f39352g;

    /* renamed from: h, reason: collision with root package name */
    public String f39353h;

    /* renamed from: i, reason: collision with root package name */
    public String f39354i;

    /* renamed from: j, reason: collision with root package name */
    public String f39355j;

    /* renamed from: k, reason: collision with root package name */
    public String f39356k;

    /* renamed from: l, reason: collision with root package name */
    public List f39357l;

    /* renamed from: m, reason: collision with root package name */
    public String f39358m;

    /* renamed from: n, reason: collision with root package name */
    public List f39359n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f39360o;

    public /* synthetic */ k90(int i13) {
        this();
    }

    public final n90 a() {
        return new n90(this.f39346a, this.f39347b, this.f39348c, this.f39349d, this.f39350e, this.f39351f, this.f39352g, this.f39353h, this.f39354i, this.f39355j, this.f39356k, this.f39357l, this.f39358m, this.f39359n, this.f39360o, 0);
    }

    public final void b(String str) {
        this.f39346a = str;
        boolean[] zArr = this.f39360o;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
    }

    public final void c(String str) {
        this.f39347b = str;
        boolean[] zArr = this.f39360o;
        if (zArr.length > 1) {
            zArr[1] = true;
        }
    }

    public final void d(String str) {
        this.f39348c = str;
        boolean[] zArr = this.f39360o;
        if (zArr.length > 2) {
            zArr[2] = true;
        }
    }

    public final void e(String str) {
        this.f39349d = str;
        boolean[] zArr = this.f39360o;
        if (zArr.length > 3) {
            zArr[3] = true;
        }
    }

    public final void f(String str) {
        this.f39350e = str;
        boolean[] zArr = this.f39360o;
        if (zArr.length > 4) {
            zArr[4] = true;
        }
    }

    public final void g(String str) {
        this.f39351f = str;
        boolean[] zArr = this.f39360o;
        if (zArr.length > 5) {
            zArr[5] = true;
        }
    }

    public final void h(String str) {
        this.f39352g = str;
        boolean[] zArr = this.f39360o;
        if (zArr.length > 6) {
            zArr[6] = true;
        }
    }

    public final void i(String str) {
        this.f39353h = str;
        boolean[] zArr = this.f39360o;
        if (zArr.length > 7) {
            zArr[7] = true;
        }
    }

    public final void j(String str) {
        this.f39354i = str;
        boolean[] zArr = this.f39360o;
        if (zArr.length > 8) {
            zArr[8] = true;
        }
    }

    public final void k(String str) {
        this.f39355j = str;
        boolean[] zArr = this.f39360o;
        if (zArr.length > 9) {
            zArr[9] = true;
        }
    }

    public final void l(String str) {
        this.f39356k = str;
        boolean[] zArr = this.f39360o;
        if (zArr.length > 10) {
            zArr[10] = true;
        }
    }

    public final void m(List list) {
        this.f39357l = list;
        boolean[] zArr = this.f39360o;
        if (zArr.length > 11) {
            zArr[11] = true;
        }
    }

    public final void n(String str) {
        this.f39358m = str;
        boolean[] zArr = this.f39360o;
        if (zArr.length > 12) {
            zArr[12] = true;
        }
    }

    public final void o(List list) {
        this.f39359n = list;
        boolean[] zArr = this.f39360o;
        if (zArr.length > 13) {
            zArr[13] = true;
        }
    }

    private k90() {
        this.f39360o = new boolean[14];
    }

    private k90(@NonNull n90 n90Var) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        List list;
        String str12;
        List list2;
        str = n90Var.f40357a;
        this.f39346a = str;
        str2 = n90Var.f40358b;
        this.f39347b = str2;
        str3 = n90Var.f40359c;
        this.f39348c = str3;
        str4 = n90Var.f40360d;
        this.f39349d = str4;
        str5 = n90Var.f40361e;
        this.f39350e = str5;
        str6 = n90Var.f40362f;
        this.f39351f = str6;
        str7 = n90Var.f40363g;
        this.f39352g = str7;
        str8 = n90Var.f40364h;
        this.f39353h = str8;
        str9 = n90Var.f40365i;
        this.f39354i = str9;
        str10 = n90Var.f40366j;
        this.f39355j = str10;
        str11 = n90Var.f40367k;
        this.f39356k = str11;
        list = n90Var.f40368l;
        this.f39357l = list;
        str12 = n90Var.f40369m;
        this.f39358m = str12;
        list2 = n90Var.f40370n;
        this.f39359n = list2;
        boolean[] zArr = n90Var.f40371o;
        this.f39360o = Arrays.copyOf(zArr, zArr.length);
    }
}
