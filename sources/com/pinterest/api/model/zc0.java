package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class zc0 {

    /* renamed from: a, reason: collision with root package name */
    public String f44288a;

    /* renamed from: b, reason: collision with root package name */
    public String f44289b;

    /* renamed from: c, reason: collision with root package name */
    public String f44290c;

    /* renamed from: d, reason: collision with root package name */
    public String f44291d;

    /* renamed from: e, reason: collision with root package name */
    public String f44292e;

    /* renamed from: f, reason: collision with root package name */
    public List f44293f;

    /* renamed from: g, reason: collision with root package name */
    public String f44294g;

    /* renamed from: h, reason: collision with root package name */
    public List f44295h;

    /* renamed from: i, reason: collision with root package name */
    public Integer f44296i;

    /* renamed from: j, reason: collision with root package name */
    public String f44297j;

    /* renamed from: k, reason: collision with root package name */
    public String f44298k;

    /* renamed from: l, reason: collision with root package name */
    public String f44299l;

    /* renamed from: m, reason: collision with root package name */
    public List f44300m;

    /* renamed from: n, reason: collision with root package name */
    public String f44301n;

    /* renamed from: o, reason: collision with root package name */
    public String f44302o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f44303p;

    public /* synthetic */ zc0(int i13) {
        this();
    }

    public final cd0 a() {
        return new cd0(this.f44288a, this.f44289b, this.f44290c, this.f44291d, this.f44292e, this.f44293f, this.f44294g, this.f44295h, this.f44296i, this.f44297j, this.f44298k, this.f44299l, this.f44300m, this.f44301n, this.f44302o, this.f44303p, 0);
    }

    public final void b(String str) {
        this.f44290c = str;
        boolean[] zArr = this.f44303p;
        if (zArr.length > 2) {
            zArr[2] = true;
        }
    }

    public final void c(String str) {
        this.f44291d = str;
        boolean[] zArr = this.f44303p;
        if (zArr.length > 3) {
            zArr[3] = true;
        }
    }

    public final void d(String str) {
        this.f44292e = str;
        boolean[] zArr = this.f44303p;
        if (zArr.length > 4) {
            zArr[4] = true;
        }
    }

    public final void e(List list) {
        this.f44293f = list;
        boolean[] zArr = this.f44303p;
        if (zArr.length > 5) {
            zArr[5] = true;
        }
    }

    public final void f(String str) {
        this.f44294g = str;
        boolean[] zArr = this.f44303p;
        if (zArr.length > 6) {
            zArr[6] = true;
        }
    }

    public final void g(List list) {
        this.f44295h = list;
        boolean[] zArr = this.f44303p;
        if (zArr.length > 7) {
            zArr[7] = true;
        }
    }

    public final void h(Integer num) {
        this.f44296i = num;
        boolean[] zArr = this.f44303p;
        if (zArr.length > 8) {
            zArr[8] = true;
        }
    }

    public final void i(String str) {
        this.f44297j = str;
        boolean[] zArr = this.f44303p;
        if (zArr.length > 9) {
            zArr[9] = true;
        }
    }

    public final void j(String str) {
        this.f44298k = str;
        boolean[] zArr = this.f44303p;
        if (zArr.length > 10) {
            zArr[10] = true;
        }
    }

    public final void k(String str) {
        this.f44299l = str;
        boolean[] zArr = this.f44303p;
        if (zArr.length > 11) {
            zArr[11] = true;
        }
    }

    public final void l(List list) {
        this.f44300m = list;
        boolean[] zArr = this.f44303p;
        if (zArr.length > 12) {
            zArr[12] = true;
        }
    }

    public final void m(String str) {
        this.f44301n = str;
        boolean[] zArr = this.f44303p;
        if (zArr.length > 13) {
            zArr[13] = true;
        }
    }

    public final void n(String str) {
        this.f44288a = str;
        boolean[] zArr = this.f44303p;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
    }

    private zc0() {
        this.f44303p = new boolean[15];
    }

    private zc0(@NonNull cd0 cd0Var) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        List list;
        String str6;
        List list2;
        Integer num;
        String str7;
        String str8;
        String str9;
        List list3;
        String str10;
        String str11;
        str = cd0Var.f36374a;
        this.f44288a = str;
        str2 = cd0Var.f36375b;
        this.f44289b = str2;
        str3 = cd0Var.f36376c;
        this.f44290c = str3;
        str4 = cd0Var.f36377d;
        this.f44291d = str4;
        str5 = cd0Var.f36378e;
        this.f44292e = str5;
        list = cd0Var.f36379f;
        this.f44293f = list;
        str6 = cd0Var.f36380g;
        this.f44294g = str6;
        list2 = cd0Var.f36381h;
        this.f44295h = list2;
        num = cd0Var.f36382i;
        this.f44296i = num;
        str7 = cd0Var.f36383j;
        this.f44297j = str7;
        str8 = cd0Var.f36384k;
        this.f44298k = str8;
        str9 = cd0Var.f36385l;
        this.f44299l = str9;
        list3 = cd0Var.f36386m;
        this.f44300m = list3;
        str10 = cd0Var.f36387n;
        this.f44301n = str10;
        str11 = cd0Var.f36388o;
        this.f44302o = str11;
        boolean[] zArr = cd0Var.f36389p;
        this.f44303p = Arrays.copyOf(zArr, zArr.length);
    }
}
