package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class yx0 {

    /* renamed from: a, reason: collision with root package name */
    public String f44148a;

    /* renamed from: b, reason: collision with root package name */
    public String f44149b;

    /* renamed from: c, reason: collision with root package name */
    public String f44150c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f44151d;

    public /* synthetic */ yx0(int i13) {
        this();
    }

    private yx0() {
        this.f44151d = new boolean[3];
    }

    private yx0(@NonNull by0 by0Var) {
        String str;
        String str2;
        String str3;
        str = by0Var.f36226a;
        this.f44148a = str;
        str2 = by0Var.f36227b;
        this.f44149b = str2;
        str3 = by0Var.f36228c;
        this.f44150c = str3;
        boolean[] zArr = by0Var.f36229d;
        this.f44151d = Arrays.copyOf(zArr, zArr.length);
    }
}
