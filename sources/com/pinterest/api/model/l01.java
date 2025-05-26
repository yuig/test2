package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class l01 {

    /* renamed from: a, reason: collision with root package name */
    public String f39617a;

    /* renamed from: b, reason: collision with root package name */
    public String f39618b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f39619c;

    public /* synthetic */ l01(int i13) {
        this();
    }

    private l01() {
        this.f39619c = new boolean[2];
    }

    private l01(@NonNull o01 o01Var) {
        String str;
        String str2;
        str = o01Var.f40582a;
        this.f39617a = str;
        str2 = o01Var.f40583b;
        this.f39618b = str2;
        boolean[] zArr = o01Var.f40584c;
        this.f39619c = Arrays.copyOf(zArr, zArr.length);
    }
}
