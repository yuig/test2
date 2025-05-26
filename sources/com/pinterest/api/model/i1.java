package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public String f38589a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f38590b;

    public /* synthetic */ i1(int i13) {
        this();
    }

    private i1() {
        this.f38590b = new boolean[1];
    }

    private i1(@NonNull j1 j1Var) {
        String str;
        str = j1Var.f38920a;
        this.f38589a = str;
        boolean[] zArr = j1Var.f38921b;
        this.f38590b = Arrays.copyOf(zArr, zArr.length);
    }
}
