package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class b9 {

    /* renamed from: a, reason: collision with root package name */
    public Double f36015a;

    /* renamed from: b, reason: collision with root package name */
    public String f36016b;

    /* renamed from: c, reason: collision with root package name */
    public Double f36017c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f36018d;

    public /* synthetic */ b9(int i13) {
        this();
    }

    private b9() {
        this.f36018d = new boolean[3];
    }

    private b9(@NonNull c9 c9Var) {
        Double d2;
        String str;
        Double d13;
        d2 = c9Var.f36321a;
        this.f36015a = d2;
        str = c9Var.f36322b;
        this.f36016b = str;
        d13 = c9Var.f36323c;
        this.f36017c = d13;
        boolean[] zArr = c9Var.f36324d;
        this.f36018d = Arrays.copyOf(zArr, zArr.length);
    }
}
