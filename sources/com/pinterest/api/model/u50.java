package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class u50 {

    /* renamed from: a, reason: collision with root package name */
    public String f42417a;

    /* renamed from: b, reason: collision with root package name */
    public String f42418b;

    /* renamed from: c, reason: collision with root package name */
    public oe0 f42419c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f42420d;

    public /* synthetic */ u50(int i13) {
        this();
    }

    private u50() {
        this.f42420d = new boolean[3];
    }

    private u50(@NonNull x50 x50Var) {
        String str;
        String str2;
        oe0 oe0Var;
        str = x50Var.f43595a;
        this.f42417a = str;
        str2 = x50Var.f43596b;
        this.f42418b = str2;
        oe0Var = x50Var.f43597c;
        this.f42419c = oe0Var;
        boolean[] zArr = x50Var.f43598d;
        this.f42420d = Arrays.copyOf(zArr, zArr.length);
    }
}
