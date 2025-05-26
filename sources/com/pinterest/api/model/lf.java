package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class lf {

    /* renamed from: a, reason: collision with root package name */
    public List f39736a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f39737b;

    public /* synthetic */ lf(int i13) {
        this();
    }

    private lf() {
        this.f39737b = new boolean[1];
    }

    private lf(@NonNull of ofVar) {
        List list;
        list = ofVar.f40698a;
        this.f39736a = list;
        boolean[] zArr = ofVar.f40699b;
        this.f39737b = Arrays.copyOf(zArr, zArr.length);
    }
}
