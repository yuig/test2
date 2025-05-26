package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public final class e01 {

    /* renamed from: a, reason: collision with root package name */
    public Double f37008a;

    /* renamed from: b, reason: collision with root package name */
    public Map f37009b;

    /* renamed from: c, reason: collision with root package name */
    public Double f37010c;

    /* renamed from: d, reason: collision with root package name */
    public Double f37011d;

    /* renamed from: e, reason: collision with root package name */
    public String f37012e;

    /* renamed from: f, reason: collision with root package name */
    public String f37013f;

    /* renamed from: g, reason: collision with root package name */
    public Double f37014g;

    /* renamed from: h, reason: collision with root package name */
    public Double f37015h;

    /* renamed from: i, reason: collision with root package name */
    public String f37016i;

    /* renamed from: j, reason: collision with root package name */
    public Double f37017j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean[] f37018k;

    public /* synthetic */ e01(int i13) {
        this();
    }

    public final void a(Double d2) {
        this.f37008a = d2;
        boolean[] zArr = this.f37018k;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
    }

    public final void b(Double d2) {
        this.f37014g = d2;
        boolean[] zArr = this.f37018k;
        if (zArr.length > 6) {
            zArr[6] = true;
        }
    }

    public final void c(Double d2) {
        this.f37015h = d2;
        boolean[] zArr = this.f37018k;
        if (zArr.length > 7) {
            zArr[7] = true;
        }
    }

    private e01() {
        this.f37018k = new boolean[10];
    }

    private e01(@NonNull h01 h01Var) {
        Double d2;
        Map map;
        Double d13;
        Double d14;
        String str;
        String str2;
        Double d15;
        Double d16;
        String str3;
        Double d17;
        d2 = h01Var.f38225a;
        this.f37008a = d2;
        map = h01Var.f38226b;
        this.f37009b = map;
        d13 = h01Var.f38227c;
        this.f37010c = d13;
        d14 = h01Var.f38228d;
        this.f37011d = d14;
        str = h01Var.f38229e;
        this.f37012e = str;
        str2 = h01Var.f38230f;
        this.f37013f = str2;
        d15 = h01Var.f38231g;
        this.f37014g = d15;
        d16 = h01Var.f38232h;
        this.f37015h = d16;
        str3 = h01Var.f38233i;
        this.f37016i = str3;
        d17 = h01Var.f38234j;
        this.f37017j = d17;
        boolean[] zArr = h01Var.f38235k;
        this.f37018k = Arrays.copyOf(zArr, zArr.length);
    }
}
