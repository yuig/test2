package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class bq0 {

    /* renamed from: a, reason: collision with root package name */
    public String f36167a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f36168b;

    public /* synthetic */ bq0(int i13) {
        this();
    }

    private bq0() {
        this.f36168b = new boolean[1];
    }

    private bq0(@NonNull eq0 eq0Var) {
        String str;
        str = eq0Var.f37332a;
        this.f36167a = str;
        boolean[] zArr = eq0Var.f37333b;
        this.f36168b = Arrays.copyOf(zArr, zArr.length);
    }
}
