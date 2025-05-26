package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class b70 {

    /* renamed from: a, reason: collision with root package name */
    public String f36007a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f36008b;

    public /* synthetic */ b70(int i13) {
        this();
    }

    private b70() {
        this.f36008b = new boolean[1];
    }

    private b70(@NonNull e70 e70Var) {
        String str;
        str = e70Var.f37194a;
        this.f36007a = str;
        boolean[] zArr = e70Var.f37195b;
        this.f36008b = Arrays.copyOf(zArr, zArr.length);
    }
}
