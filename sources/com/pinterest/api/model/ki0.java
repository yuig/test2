package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ki0 {

    /* renamed from: a, reason: collision with root package name */
    public String f39473a;

    /* renamed from: b, reason: collision with root package name */
    public String f39474b;

    /* renamed from: c, reason: collision with root package name */
    public ee f39475c;

    /* renamed from: d, reason: collision with root package name */
    public fi0 f39476d;

    /* renamed from: e, reason: collision with root package name */
    public wy0 f39477e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f39478f;

    public /* synthetic */ ki0(int i13) {
        this();
    }

    private ki0() {
        this.f39478f = new boolean[5];
    }

    private ki0(@NonNull ni0 ni0Var) {
        String str;
        String str2;
        ee eeVar;
        fi0 fi0Var;
        wy0 wy0Var;
        str = ni0Var.f40405a;
        this.f39473a = str;
        str2 = ni0Var.f40406b;
        this.f39474b = str2;
        eeVar = ni0Var.f40407c;
        this.f39475c = eeVar;
        fi0Var = ni0Var.f40408d;
        this.f39476d = fi0Var;
        wy0Var = ni0Var.f40409e;
        this.f39477e = wy0Var;
        boolean[] zArr = ni0Var.f40410f;
        this.f39478f = Arrays.copyOf(zArr, zArr.length);
    }
}
