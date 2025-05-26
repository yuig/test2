package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class qx0 {

    /* renamed from: a, reason: collision with root package name */
    public String f41418a;

    /* renamed from: b, reason: collision with root package name */
    public String f41419b;

    /* renamed from: c, reason: collision with root package name */
    public Map f41420c;

    /* renamed from: d, reason: collision with root package name */
    public String f41421d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f41422e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f41423f;

    /* renamed from: g, reason: collision with root package name */
    public String f41424g;

    /* renamed from: h, reason: collision with root package name */
    public Double f41425h;

    /* renamed from: i, reason: collision with root package name */
    public List f41426i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f41427j;

    /* renamed from: k, reason: collision with root package name */
    public String f41428k;

    /* renamed from: l, reason: collision with root package name */
    public String f41429l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f41430m;

    public /* synthetic */ qx0(int i13) {
        this();
    }

    public final tx0 a() {
        return new tx0(this.f41418a, this.f41419b, this.f41420c, this.f41421d, this.f41422e, this.f41423f, this.f41424g, this.f41425h, this.f41426i, this.f41427j, this.f41428k, this.f41429l, this.f41430m, 0);
    }

    public final void b(String str) {
        this.f41421d = str;
        boolean[] zArr = this.f41430m;
        if (zArr.length > 3) {
            zArr[3] = true;
        }
    }

    public final void c(Boolean bool) {
        this.f41422e = bool;
        boolean[] zArr = this.f41430m;
        if (zArr.length > 4) {
            zArr[4] = true;
        }
    }

    public final void d(String str) {
        this.f41424g = str;
        boolean[] zArr = this.f41430m;
        if (zArr.length > 6) {
            zArr[6] = true;
        }
    }

    public final void e(Double d2) {
        this.f41425h = d2;
        boolean[] zArr = this.f41430m;
        if (zArr.length > 7) {
            zArr[7] = true;
        }
    }

    public final void f(String str) {
        this.f41428k = str;
        boolean[] zArr = this.f41430m;
        if (zArr.length > 10) {
            zArr[10] = true;
        }
    }

    public final void g(String str) {
        this.f41418a = str;
        boolean[] zArr = this.f41430m;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
    }

    public final void h(String str) {
        this.f41429l = str;
        boolean[] zArr = this.f41430m;
        if (zArr.length > 11) {
            zArr[11] = true;
        }
    }

    public /* synthetic */ qx0(tx0 tx0Var, int i13) {
        this(tx0Var);
    }

    private qx0() {
        this.f41430m = new boolean[12];
    }

    private qx0(@NonNull tx0 tx0Var) {
        String str;
        String str2;
        Map map;
        String str3;
        Boolean bool;
        Boolean bool2;
        String str4;
        Double d2;
        List list;
        Integer num;
        String str5;
        String str6;
        str = tx0Var.f42349a;
        this.f41418a = str;
        str2 = tx0Var.f42350b;
        this.f41419b = str2;
        map = tx0Var.f42351c;
        this.f41420c = map;
        str3 = tx0Var.f42352d;
        this.f41421d = str3;
        bool = tx0Var.f42353e;
        this.f41422e = bool;
        bool2 = tx0Var.f42354f;
        this.f41423f = bool2;
        str4 = tx0Var.f42355g;
        this.f41424g = str4;
        d2 = tx0Var.f42356h;
        this.f41425h = d2;
        list = tx0Var.f42357i;
        this.f41426i = list;
        num = tx0Var.f42358j;
        this.f41427j = num;
        str5 = tx0Var.f42359k;
        this.f41428k = str5;
        str6 = tx0Var.f42360l;
        this.f41429l = str6;
        boolean[] zArr = tx0Var.f42361m;
        this.f41430m = Arrays.copyOf(zArr, zArr.length);
    }
}
