package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class kx {

    /* renamed from: a, reason: collision with root package name */
    public Integer f39558a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f39559b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f39560c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f39561d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f39562e;

    public /* synthetic */ kx(int i13) {
        this();
    }

    private kx() {
        this.f39562e = new boolean[4];
    }

    private kx(@NonNull nx nxVar) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        num = nxVar.f40523a;
        this.f39558a = num;
        num2 = nxVar.f40524b;
        this.f39559b = num2;
        num3 = nxVar.f40525c;
        this.f39560c = num3;
        num4 = nxVar.f40526d;
        this.f39561d = num4;
        boolean[] zArr = nxVar.f40527e;
        this.f39562e = Arrays.copyOf(zArr, zArr.length);
    }
}
