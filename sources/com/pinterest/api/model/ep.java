package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ep {

    /* renamed from: a, reason: collision with root package name */
    public String f37315a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f37316b;

    public /* synthetic */ ep(int i13) {
        this();
    }

    private ep() {
        this.f37316b = new boolean[1];
    }

    private ep(@NonNull hp hpVar) {
        String str;
        str = hpVar.f38509a;
        this.f37315a = str;
        boolean[] zArr = hpVar.f38510b;
        this.f37316b = Arrays.copyOf(zArr, zArr.length);
    }
}
