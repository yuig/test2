package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class hn0 {

    /* renamed from: a, reason: collision with root package name */
    public List f38498a;

    /* renamed from: b, reason: collision with root package name */
    public List f38499b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f38500c;

    public /* synthetic */ hn0(int i13) {
        this();
    }

    private hn0() {
        this.f38500c = new boolean[2];
    }

    private hn0(@NonNull kn0 kn0Var) {
        List list;
        List list2;
        list = kn0Var.f39498a;
        this.f38498a = list;
        list2 = kn0Var.f39499b;
        this.f38499b = list2;
        boolean[] zArr = kn0Var.f39500c;
        this.f38500c = Arrays.copyOf(zArr, zArr.length);
    }
}
