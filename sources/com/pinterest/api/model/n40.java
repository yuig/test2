package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class n40 {

    /* renamed from: a, reason: collision with root package name */
    public List f40331a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f40332b;

    public /* synthetic */ n40(int i13) {
        this();
    }

    private n40() {
        this.f40332b = new boolean[1];
    }

    private n40(@NonNull q40 q40Var) {
        List list;
        list = q40Var.f41208a;
        this.f40331a = list;
        boolean[] zArr = q40Var.f41209b;
        this.f40332b = Arrays.copyOf(zArr, zArr.length);
    }
}
