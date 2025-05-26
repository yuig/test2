package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class pr {

    /* renamed from: a, reason: collision with root package name */
    public String f41064a;

    /* renamed from: b, reason: collision with root package name */
    public Double f41065b;

    /* renamed from: c, reason: collision with root package name */
    public String f41066c;

    /* renamed from: d, reason: collision with root package name */
    public String f41067d;

    /* renamed from: e, reason: collision with root package name */
    public Double f41068e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f41069f;

    public /* synthetic */ pr(int i13) {
        this();
    }

    public final sr a() {
        return new sr(this.f41064a, this.f41065b, this.f41066c, this.f41067d, this.f41068e, this.f41069f, 0);
    }

    public final void b(String str) {
        this.f41064a = str;
        boolean[] zArr = this.f41069f;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
    }

    public final void c(Double d2) {
        this.f41065b = d2;
        boolean[] zArr = this.f41069f;
        if (zArr.length > 1) {
            zArr[1] = true;
        }
    }

    public final void d(String str) {
        this.f41066c = str;
        boolean[] zArr = this.f41069f;
        if (zArr.length > 2) {
            zArr[2] = true;
        }
    }

    public final void e(String str) {
        this.f41067d = str;
        boolean[] zArr = this.f41069f;
        if (zArr.length > 3) {
            zArr[3] = true;
        }
    }

    public final void f(Double d2) {
        this.f41068e = d2;
        boolean[] zArr = this.f41069f;
        if (zArr.length > 4) {
            zArr[4] = true;
        }
    }

    private pr() {
        this.f41069f = new boolean[5];
    }

    private pr(@NonNull sr srVar) {
        String str;
        Double d2;
        String str2;
        String str3;
        Double d13;
        str = srVar.f41970a;
        this.f41064a = str;
        d2 = srVar.f41971b;
        this.f41065b = d2;
        str2 = srVar.f41972c;
        this.f41066c = str2;
        str3 = srVar.f41973d;
        this.f41067d = str3;
        d13 = srVar.f41974e;
        this.f41068e = d13;
        boolean[] zArr = srVar.f41975f;
        this.f41069f = Arrays.copyOf(zArr, zArr.length);
    }
}
