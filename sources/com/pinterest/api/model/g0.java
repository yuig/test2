package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public List f37887a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f37888b;

    public /* synthetic */ g0(int i13) {
        this();
    }

    private g0() {
        this.f37888b = new boolean[1];
    }

    private g0(@NonNull h0 h0Var) {
        List list;
        list = h0Var.f38208a;
        this.f37887a = list;
        boolean[] zArr = h0Var.f38209b;
        this.f37888b = Arrays.copyOf(zArr, zArr.length);
    }
}
