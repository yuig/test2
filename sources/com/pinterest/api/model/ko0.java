package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ko0 {

    /* renamed from: a, reason: collision with root package name */
    public Integer f39502a;

    /* renamed from: b, reason: collision with root package name */
    public mk0 f39503b;

    /* renamed from: c, reason: collision with root package name */
    public String f39504c;

    /* renamed from: d, reason: collision with root package name */
    public String f39505d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f39506e;

    public /* synthetic */ ko0(int i13) {
        this();
    }

    private ko0() {
        this.f39506e = new boolean[4];
    }

    private ko0(@NonNull no0 no0Var) {
        Integer num;
        mk0 mk0Var;
        String str;
        String str2;
        num = no0Var.f40448a;
        this.f39502a = num;
        mk0Var = no0Var.f40449b;
        this.f39503b = mk0Var;
        str = no0Var.f40450c;
        this.f39504c = str;
        str2 = no0Var.f40451d;
        this.f39505d = str2;
        boolean[] zArr = no0Var.f40452e;
        this.f39506e = Arrays.copyOf(zArr, zArr.length);
    }
}
