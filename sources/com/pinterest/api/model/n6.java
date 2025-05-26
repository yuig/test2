package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class n6 {

    /* renamed from: a, reason: collision with root package name */
    public String f40338a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f40339b;

    public /* synthetic */ n6(int i13) {
        this();
    }

    private n6() {
        this.f40339b = new boolean[1];
    }

    private n6(@NonNull o6 o6Var) {
        String str;
        str = o6Var.f40625a;
        this.f40338a = str;
        boolean[] zArr = o6Var.f40626b;
        this.f40339b = Arrays.copyOf(zArr, zArr.length);
    }
}
