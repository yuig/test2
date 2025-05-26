package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class ix0 {

    /* renamed from: a, reason: collision with root package name */
    public String f38879a;

    /* renamed from: b, reason: collision with root package name */
    public String f38880b;

    /* renamed from: c, reason: collision with root package name */
    public z2 f38881c;

    /* renamed from: d, reason: collision with root package name */
    public z2 f38882d;

    /* renamed from: e, reason: collision with root package name */
    public List f38883e;

    /* renamed from: f, reason: collision with root package name */
    public az0 f38884f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f38885g;

    public /* synthetic */ ix0(int i13) {
        this();
    }

    private ix0() {
        this.f38885g = new boolean[6];
    }

    private ix0(@NonNull lx0 lx0Var) {
        String str;
        String str2;
        z2 z2Var;
        z2 z2Var2;
        List list;
        az0 az0Var;
        str = lx0Var.f39936a;
        this.f38879a = str;
        str2 = lx0Var.f39937b;
        this.f38880b = str2;
        z2Var = lx0Var.f39938c;
        this.f38881c = z2Var;
        z2Var2 = lx0Var.f39939d;
        this.f38882d = z2Var2;
        list = lx0Var.f39940e;
        this.f38883e = list;
        az0Var = lx0Var.f39941f;
        this.f38884f = az0Var;
        boolean[] zArr = lx0Var.f39942g;
        this.f38885g = Arrays.copyOf(zArr, zArr.length);
    }
}
