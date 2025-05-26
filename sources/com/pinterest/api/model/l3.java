package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class l3 {

    /* renamed from: a, reason: collision with root package name */
    public Integer f39634a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f39635b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f39636c;

    public /* synthetic */ l3(int i13) {
        this();
    }

    private l3() {
        this.f39636c = new boolean[2];
    }

    private l3(@NonNull m3 m3Var) {
        Integer num;
        Integer num2;
        num = m3Var.f39988a;
        this.f39634a = num;
        num2 = m3Var.f39989b;
        this.f39635b = num2;
        boolean[] zArr = m3Var.f39990c;
        this.f39636c = Arrays.copyOf(zArr, zArr.length);
    }
}
