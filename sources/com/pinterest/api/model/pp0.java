package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class pp0 {

    /* renamed from: a, reason: collision with root package name */
    public Integer f41051a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f41052b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f41053c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f41054d;

    public /* synthetic */ pp0(int i13) {
        this();
    }

    public final sp0 a() {
        return new sp0(this.f41051a, this.f41052b, this.f41053c, this.f41054d, 0);
    }

    public final void b(Integer num) {
        this.f41051a = num;
        boolean[] zArr = this.f41054d;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
    }

    public final void c(Integer num) {
        this.f41052b = num;
        boolean[] zArr = this.f41054d;
        if (zArr.length > 1) {
            zArr[1] = true;
        }
    }

    public final void d(Integer num) {
        this.f41053c = num;
        boolean[] zArr = this.f41054d;
        if (zArr.length > 2) {
            zArr[2] = true;
        }
    }

    private pp0() {
        this.f41054d = new boolean[3];
    }

    private pp0(@NonNull sp0 sp0Var) {
        Integer num;
        Integer num2;
        Integer num3;
        num = sp0Var.f41963a;
        this.f41051a = num;
        num2 = sp0Var.f41964b;
        this.f41052b = num2;
        num3 = sp0Var.f41965c;
        this.f41053c = num3;
        boolean[] zArr = sp0Var.f41966d;
        this.f41054d = Arrays.copyOf(zArr, zArr.length);
    }
}
