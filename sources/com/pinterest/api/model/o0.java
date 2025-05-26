package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public String f40563a;

    /* renamed from: b, reason: collision with root package name */
    public String f40564b;

    /* renamed from: c, reason: collision with root package name */
    public String f40565c;

    /* renamed from: d, reason: collision with root package name */
    public String f40566d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f40567e;

    public /* synthetic */ o0(int i13) {
        this();
    }

    private o0() {
        this.f40567e = new boolean[4];
    }

    private o0(@NonNull p0 p0Var) {
        String str;
        String str2;
        String str3;
        String str4;
        str = p0Var.f40841a;
        this.f40563a = str;
        str2 = p0Var.f40842b;
        this.f40564b = str2;
        str3 = p0Var.f40843c;
        this.f40565c = str3;
        str4 = p0Var.f40844d;
        this.f40566d = str4;
        boolean[] zArr = p0Var.f40845e;
        this.f40567e = Arrays.copyOf(zArr, zArr.length);
    }
}
