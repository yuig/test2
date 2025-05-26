package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class nl0 {

    /* renamed from: a, reason: collision with root package name */
    public Integer f40434a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f40435b;

    public /* synthetic */ nl0(int i13) {
        this();
    }

    public final ql0 a() {
        return new ql0(this.f40434a, this.f40435b, 0);
    }

    public final void b(Integer num) {
        this.f40434a = num;
        boolean[] zArr = this.f40435b;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
    }

    private nl0() {
        this.f40435b = new boolean[1];
    }

    private nl0(@NonNull ql0 ql0Var) {
        Integer num;
        num = ql0Var.f41332a;
        this.f40434a = num;
        boolean[] zArr = ql0Var.f41333b;
        this.f40435b = Arrays.copyOf(zArr, zArr.length);
    }
}
