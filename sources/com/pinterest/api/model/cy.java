package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class cy {

    /* renamed from: a, reason: collision with root package name */
    public jy f36563a;

    /* renamed from: b, reason: collision with root package name */
    public tm f36564b;

    /* renamed from: c, reason: collision with root package name */
    public tm f36565c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f36566d;

    public /* synthetic */ cy(int i13) {
        this();
    }

    private cy() {
        this.f36566d = new boolean[3];
    }

    private cy(@NonNull fy fyVar) {
        jy jyVar;
        tm tmVar;
        tm tmVar2;
        jyVar = fyVar.f37850a;
        this.f36563a = jyVar;
        tmVar = fyVar.f37851b;
        this.f36564b = tmVar;
        tmVar2 = fyVar.f37852c;
        this.f36565c = tmVar2;
        boolean[] zArr = fyVar.f37853d;
        this.f36566d = Arrays.copyOf(zArr, zArr.length);
    }
}
