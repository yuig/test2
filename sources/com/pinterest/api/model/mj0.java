package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class mj0 {

    /* renamed from: a, reason: collision with root package name */
    public Double f40139a;

    /* renamed from: b, reason: collision with root package name */
    public Double f40140b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f40141c;

    public /* synthetic */ mj0(int i13) {
        this();
    }

    private mj0() {
        this.f40141c = new boolean[2];
    }

    private mj0(@NonNull pj0 pj0Var) {
        Double d2;
        Double d13;
        d2 = pj0Var.f41011a;
        this.f40139a = d2;
        d13 = pj0Var.f41012b;
        this.f40140b = d13;
        boolean[] zArr = pj0Var.f41013c;
        this.f40141c = Arrays.copyOf(zArr, zArr.length);
    }
}
