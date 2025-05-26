package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class wr0 {

    /* renamed from: a, reason: collision with root package name */
    public String f43348a;

    /* renamed from: b, reason: collision with root package name */
    public String f43349b;

    /* renamed from: c, reason: collision with root package name */
    public String f43350c;

    /* renamed from: d, reason: collision with root package name */
    public String f43351d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f43352e;

    public /* synthetic */ wr0(int i13) {
        this();
    }

    private wr0() {
        this.f43352e = new boolean[4];
    }

    private wr0(@NonNull zr0 zr0Var) {
        String str;
        String str2;
        String str3;
        String str4;
        str = zr0Var.f44424a;
        this.f43348a = str;
        str2 = zr0Var.f44425b;
        this.f43349b = str2;
        str3 = zr0Var.f44426c;
        this.f43350c = str3;
        str4 = zr0Var.f44427d;
        this.f43351d = str4;
        boolean[] zArr = zr0Var.f44428e;
        this.f43352e = Arrays.copyOf(zArr, zArr.length);
    }
}
