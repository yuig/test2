package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class zl0 {

    /* renamed from: a, reason: collision with root package name */
    public List f44387a;

    /* renamed from: b, reason: collision with root package name */
    public List f44388b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f44389c;

    public /* synthetic */ zl0(int i13) {
        this();
    }

    private zl0() {
        this.f44389c = new boolean[2];
    }

    private zl0(@NonNull cm0 cm0Var) {
        List list;
        List list2;
        list = cm0Var.f36468a;
        this.f44387a = list;
        list2 = cm0Var.f36469b;
        this.f44388b = list2;
        boolean[] zArr = cm0Var.f36470c;
        this.f44389c = Arrays.copyOf(zArr, zArr.length);
    }
}
