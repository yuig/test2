package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class mu0 {

    /* renamed from: a, reason: collision with root package name */
    public String f40213a;

    /* renamed from: b, reason: collision with root package name */
    public String f40214b;

    /* renamed from: c, reason: collision with root package name */
    public List f40215c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f40216d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f40217e;

    /* renamed from: f, reason: collision with root package name */
    public Double f40218f;

    /* renamed from: g, reason: collision with root package name */
    public String f40219g;

    /* renamed from: h, reason: collision with root package name */
    public rv0 f40220h;

    /* renamed from: i, reason: collision with root package name */
    public Double f40221i;

    /* renamed from: j, reason: collision with root package name */
    public Double f40222j;

    /* renamed from: k, reason: collision with root package name */
    public Double f40223k;

    /* renamed from: l, reason: collision with root package name */
    public Double f40224l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f40225m;

    public /* synthetic */ mu0(int i13) {
        this();
    }

    public final pu0 a() {
        return new pu0(this.f40213a, this.f40214b, this.f40215c, this.f40216d, this.f40217e, this.f40218f, this.f40219g, this.f40220h, this.f40221i, this.f40222j, this.f40223k, this.f40224l, this.f40225m, 0);
    }

    public final void b(String str) {
        this.f40213a = str;
        boolean[] zArr = this.f40225m;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
    }

    public /* synthetic */ mu0(pu0 pu0Var, int i13) {
        this(pu0Var);
    }

    private mu0() {
        this.f40225m = new boolean[12];
    }

    private mu0(@NonNull pu0 pu0Var) {
        String str;
        String str2;
        List list;
        Integer num;
        Integer num2;
        Double d2;
        String str3;
        rv0 rv0Var;
        Double d13;
        Double d14;
        Double d15;
        Double d16;
        str = pu0Var.f41102a;
        this.f40213a = str;
        str2 = pu0Var.f41103b;
        this.f40214b = str2;
        list = pu0Var.f41104c;
        this.f40215c = list;
        num = pu0Var.f41105d;
        this.f40216d = num;
        num2 = pu0Var.f41106e;
        this.f40217e = num2;
        d2 = pu0Var.f41107f;
        this.f40218f = d2;
        str3 = pu0Var.f41108g;
        this.f40219g = str3;
        rv0Var = pu0Var.f41109h;
        this.f40220h = rv0Var;
        d13 = pu0Var.f41110i;
        this.f40221i = d13;
        d14 = pu0Var.f41111j;
        this.f40222j = d14;
        d15 = pu0Var.f41112k;
        this.f40223k = d15;
        d16 = pu0Var.f41113l;
        this.f40224l = d16;
        boolean[] zArr = pu0Var.f41114m;
        this.f40225m = Arrays.copyOf(zArr, zArr.length);
    }
}
