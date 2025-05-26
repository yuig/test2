package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ij0 {

    /* renamed from: a, reason: collision with root package name */
    public Double f38799a;

    /* renamed from: b, reason: collision with root package name */
    public Double f38800b;

    /* renamed from: c, reason: collision with root package name */
    public Double f38801c;

    /* renamed from: d, reason: collision with root package name */
    public Double f38802d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f38803e;

    public /* synthetic */ ij0(int i13) {
        this();
    }

    private ij0() {
        this.f38803e = new boolean[4];
    }

    private ij0(@NonNull lj0 lj0Var) {
        Double d2;
        Double d13;
        Double d14;
        Double d15;
        d2 = lj0Var.f39805a;
        this.f38799a = d2;
        d13 = lj0Var.f39806b;
        this.f38800b = d13;
        d14 = lj0Var.f39807c;
        this.f38801c = d14;
        d15 = lj0Var.f39808d;
        this.f38802d = d15;
        boolean[] zArr = lj0Var.f39809e;
        this.f38803e = Arrays.copyOf(zArr, zArr.length);
    }
}
