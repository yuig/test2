package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class l5 {

    /* renamed from: a, reason: collision with root package name */
    public Double f39653a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f39654b;

    /* renamed from: c, reason: collision with root package name */
    public Double f39655c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f39656d;

    /* renamed from: e, reason: collision with root package name */
    public Double f39657e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f39658f;

    public /* synthetic */ l5(int i13) {
        this();
    }

    private l5() {
        this.f39658f = new boolean[5];
    }

    private l5(@NonNull m5 m5Var) {
        Double d2;
        Boolean bool;
        Double d13;
        Integer num;
        Double d14;
        d2 = m5Var.f39999a;
        this.f39653a = d2;
        bool = m5Var.f40000b;
        this.f39654b = bool;
        d13 = m5Var.f40001c;
        this.f39655c = d13;
        num = m5Var.f40002d;
        this.f39656d = num;
        d14 = m5Var.f40003e;
        this.f39657e = d14;
        boolean[] zArr = m5Var.f40004f;
        this.f39658f = Arrays.copyOf(zArr, zArr.length);
    }
}
