package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class ws {

    /* renamed from: a, reason: collision with root package name */
    public String f43353a;

    /* renamed from: b, reason: collision with root package name */
    public String f43354b;

    /* renamed from: c, reason: collision with root package name */
    public String f43355c;

    /* renamed from: d, reason: collision with root package name */
    public List f43356d;

    /* renamed from: e, reason: collision with root package name */
    public String f43357e;

    /* renamed from: f, reason: collision with root package name */
    public Date f43358f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f43359g;

    /* renamed from: h, reason: collision with root package name */
    public String f43360h;

    /* renamed from: i, reason: collision with root package name */
    public Map f43361i;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f43362j;

    /* renamed from: k, reason: collision with root package name */
    public String f43363k;

    /* renamed from: l, reason: collision with root package name */
    public String f43364l;

    /* renamed from: m, reason: collision with root package name */
    public String f43365m;

    /* renamed from: n, reason: collision with root package name */
    public fx0 f43366n;

    /* renamed from: o, reason: collision with root package name */
    public String f43367o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f43368p;

    public /* synthetic */ ws(int i13) {
        this();
    }

    public final zs a() {
        return new zs(this.f43353a, this.f43354b, this.f43355c, this.f43356d, this.f43357e, this.f43358f, this.f43359g, this.f43360h, this.f43361i, this.f43362j, this.f43363k, this.f43364l, this.f43365m, this.f43366n, this.f43367o, this.f43368p, 0);
    }

    public final void b(String str) {
        this.f43355c = str;
        boolean[] zArr = this.f43368p;
        if (zArr.length > 2) {
            zArr[2] = true;
        }
    }

    public final void c(List list) {
        this.f43356d = list;
        boolean[] zArr = this.f43368p;
        if (zArr.length > 3) {
            zArr[3] = true;
        }
    }

    public final void d(String str) {
        this.f43357e = str;
        boolean[] zArr = this.f43368p;
        if (zArr.length > 4) {
            zArr[4] = true;
        }
    }

    public final void e(Date date) {
        this.f43358f = date;
        boolean[] zArr = this.f43368p;
        if (zArr.length > 5) {
            zArr[5] = true;
        }
    }

    public final void f(String str) {
        this.f43360h = str;
        boolean[] zArr = this.f43368p;
        if (zArr.length > 7) {
            zArr[7] = true;
        }
    }

    public final void g(String str) {
        this.f43363k = str;
        boolean[] zArr = this.f43368p;
        if (zArr.length > 10) {
            zArr[10] = true;
        }
    }

    public final void h(String str) {
        this.f43365m = str;
        boolean[] zArr = this.f43368p;
        if (zArr.length > 12) {
            zArr[12] = true;
        }
    }

    public final void i(fx0 fx0Var) {
        this.f43366n = fx0Var;
        boolean[] zArr = this.f43368p;
        if (zArr.length > 13) {
            zArr[13] = true;
        }
    }

    public final void j(String str) {
        this.f43367o = str;
        boolean[] zArr = this.f43368p;
        if (zArr.length > 14) {
            zArr[14] = true;
        }
    }

    public /* synthetic */ ws(zs zsVar, int i13) {
        this(zsVar);
    }

    private ws() {
        this.f43368p = new boolean[15];
    }

    private ws(@NonNull zs zsVar) {
        String str;
        String str2;
        String str3;
        List list;
        String str4;
        Date date;
        Integer num;
        String str5;
        Map map;
        Boolean bool;
        String str6;
        String str7;
        String str8;
        fx0 fx0Var;
        String str9;
        str = zsVar.f44429a;
        this.f43353a = str;
        str2 = zsVar.f44430b;
        this.f43354b = str2;
        str3 = zsVar.f44431c;
        this.f43355c = str3;
        list = zsVar.f44432d;
        this.f43356d = list;
        str4 = zsVar.f44433e;
        this.f43357e = str4;
        date = zsVar.f44434f;
        this.f43358f = date;
        num = zsVar.f44435g;
        this.f43359g = num;
        str5 = zsVar.f44436h;
        this.f43360h = str5;
        map = zsVar.f44437i;
        this.f43361i = map;
        bool = zsVar.f44438j;
        this.f43362j = bool;
        str6 = zsVar.f44439k;
        this.f43363k = str6;
        str7 = zsVar.f44440l;
        this.f43364l = str7;
        str8 = zsVar.f44441m;
        this.f43365m = str8;
        fx0Var = zsVar.f44442n;
        this.f43366n = fx0Var;
        str9 = zsVar.f44443o;
        this.f43367o = str9;
        boolean[] zArr = zsVar.f44444p;
        this.f43368p = Arrays.copyOf(zArr, zArr.length);
    }
}
