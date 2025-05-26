package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class qs0 {

    /* renamed from: a, reason: collision with root package name */
    public String f41362a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f41363b;

    /* renamed from: c, reason: collision with root package name */
    public String f41364c;

    /* renamed from: d, reason: collision with root package name */
    public String f41365d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f41366e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f41367f;

    /* renamed from: g, reason: collision with root package name */
    public String f41368g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f41369h;

    public /* synthetic */ qs0(int i13) {
        this();
    }

    public final ts0 a() {
        return new ts0(this.f41362a, this.f41363b, this.f41364c, this.f41365d, this.f41366e, this.f41367f, this.f41368g, this.f41369h, 0);
    }

    public final void b(Integer num) {
        this.f41363b = num;
        boolean[] zArr = this.f41369h;
        if (zArr.length > 1) {
            zArr[1] = true;
        }
    }

    public final void c(String str) {
        this.f41364c = str;
        boolean[] zArr = this.f41369h;
        if (zArr.length > 2) {
            zArr[2] = true;
        }
    }

    public final void d(String str) {
        this.f41365d = str;
        boolean[] zArr = this.f41369h;
        if (zArr.length > 3) {
            zArr[3] = true;
        }
    }

    public final void e(Integer num) {
        this.f41366e = num;
        boolean[] zArr = this.f41369h;
        if (zArr.length > 4) {
            zArr[4] = true;
        }
    }

    public final void f(Integer num) {
        this.f41367f = num;
        boolean[] zArr = this.f41369h;
        if (zArr.length > 5) {
            zArr[5] = true;
        }
    }

    private qs0() {
        this.f41369h = new boolean[7];
    }

    private qs0(@NonNull ts0 ts0Var) {
        String str;
        Integer num;
        String str2;
        String str3;
        Integer num2;
        Integer num3;
        String str4;
        str = ts0Var.f42284a;
        this.f41362a = str;
        num = ts0Var.f42285b;
        this.f41363b = num;
        str2 = ts0Var.f42286c;
        this.f41364c = str2;
        str3 = ts0Var.f42287d;
        this.f41365d = str3;
        num2 = ts0Var.f42288e;
        this.f41366e = num2;
        num3 = ts0Var.f42289f;
        this.f41367f = num3;
        str4 = ts0Var.f42290g;
        this.f41368g = str4;
        boolean[] zArr = ts0Var.f42291h;
        this.f41369h = Arrays.copyOf(zArr, zArr.length);
    }
}
