package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class pe0 {

    /* renamed from: a, reason: collision with root package name */
    public List f40945a;

    /* renamed from: b, reason: collision with root package name */
    public v2 f40946b;

    /* renamed from: c, reason: collision with root package name */
    public Map f40947c;

    /* renamed from: d, reason: collision with root package name */
    public String f40948d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f40949e;

    /* renamed from: f, reason: collision with root package name */
    public String f40950f;

    /* renamed from: g, reason: collision with root package name */
    public String f40951g;

    /* renamed from: h, reason: collision with root package name */
    public Map f40952h;

    /* renamed from: i, reason: collision with root package name */
    public String f40953i;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f40954j;

    /* renamed from: k, reason: collision with root package name */
    public String f40955k;

    /* renamed from: l, reason: collision with root package name */
    public Boolean f40956l;

    /* renamed from: m, reason: collision with root package name */
    public dw f40957m;

    /* renamed from: n, reason: collision with root package name */
    public List f40958n;

    /* renamed from: o, reason: collision with root package name */
    public String f40959o;

    /* renamed from: p, reason: collision with root package name */
    public String f40960p;

    /* renamed from: q, reason: collision with root package name */
    public String f40961q;

    /* renamed from: r, reason: collision with root package name */
    public String f40962r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f40963s;

    public /* synthetic */ pe0(int i13) {
        this();
    }

    public final se0 a() {
        return new se0(this.f40945a, this.f40946b, this.f40947c, this.f40948d, this.f40949e, this.f40950f, this.f40951g, this.f40952h, this.f40953i, this.f40954j, this.f40955k, this.f40956l, this.f40957m, this.f40958n, this.f40959o, this.f40960p, this.f40961q, this.f40962r, this.f40963s, 0);
    }

    public final void b(Boolean bool) {
        this.f40954j = bool;
        boolean[] zArr = this.f40963s;
        if (zArr.length > 9) {
            zArr[9] = true;
        }
    }

    public final void c(Boolean bool) {
        this.f40956l = bool;
        boolean[] zArr = this.f40963s;
        if (zArr.length > 11) {
            zArr[11] = true;
        }
    }

    private pe0() {
        this.f40963s = new boolean[18];
    }

    private pe0(@NonNull se0 se0Var) {
        List list;
        v2 v2Var;
        Map map;
        String str;
        Integer num;
        String str2;
        String str3;
        Map map2;
        String str4;
        Boolean bool;
        String str5;
        Boolean bool2;
        dw dwVar;
        List list2;
        String str6;
        String str7;
        String str8;
        String str9;
        list = se0Var.f41869a;
        this.f40945a = list;
        v2Var = se0Var.f41870b;
        this.f40946b = v2Var;
        map = se0Var.f41871c;
        this.f40947c = map;
        str = se0Var.f41872d;
        this.f40948d = str;
        num = se0Var.f41873e;
        this.f40949e = num;
        str2 = se0Var.f41874f;
        this.f40950f = str2;
        str3 = se0Var.f41875g;
        this.f40951g = str3;
        map2 = se0Var.f41876h;
        this.f40952h = map2;
        str4 = se0Var.f41877i;
        this.f40953i = str4;
        bool = se0Var.f41878j;
        this.f40954j = bool;
        str5 = se0Var.f41879k;
        this.f40955k = str5;
        bool2 = se0Var.f41880l;
        this.f40956l = bool2;
        dwVar = se0Var.f41881m;
        this.f40957m = dwVar;
        list2 = se0Var.f41882n;
        this.f40958n = list2;
        str6 = se0Var.f41883o;
        this.f40959o = str6;
        str7 = se0Var.f41884p;
        this.f40960p = str7;
        str8 = se0Var.f41885q;
        this.f40961q = str8;
        str9 = se0Var.f41886r;
        this.f40962r = str9;
        boolean[] zArr = se0Var.f41887s;
        this.f40963s = Arrays.copyOf(zArr, zArr.length);
    }
}
