package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class b11 {

    /* renamed from: a, reason: collision with root package name */
    public String f35948a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f35949b;

    public /* synthetic */ b11(int i13) {
        this();
    }

    private b11() {
        this.f35949b = new boolean[1];
    }

    private b11(@NonNull e11 e11Var) {
        String str;
        str = e11Var.f37033a;
        this.f35948a = str;
        boolean[] zArr = e11Var.f37034b;
        this.f35949b = Arrays.copyOf(zArr, zArr.length);
    }
}
