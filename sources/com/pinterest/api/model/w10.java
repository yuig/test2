package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class w10 {

    /* renamed from: a, reason: collision with root package name */
    public String f43137a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f43138b;

    public /* synthetic */ w10(int i13) {
        this();
    }

    private w10() {
        this.f43138b = new boolean[1];
    }

    private w10(@NonNull z10 z10Var) {
        String str;
        str = z10Var.f44175a;
        this.f43137a = str;
        boolean[] zArr = z10Var.f44176b;
        this.f43138b = Arrays.copyOf(zArr, zArr.length);
    }
}
