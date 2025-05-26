package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public String f41737a;

    /* renamed from: b, reason: collision with root package name */
    public String f41738b;

    /* renamed from: c, reason: collision with root package name */
    public String f41739c;

    /* renamed from: d, reason: collision with root package name */
    public String f41740d;

    /* renamed from: e, reason: collision with root package name */
    public String f41741e;

    /* renamed from: f, reason: collision with root package name */
    public String f41742f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f41743g;

    public /* synthetic */ s0(int i13) {
        this();
    }

    private s0() {
        this.f41743g = new boolean[6];
    }

    private s0(@NonNull t0 t0Var) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        str = t0Var.f42027a;
        this.f41737a = str;
        str2 = t0Var.f42028b;
        this.f41738b = str2;
        str3 = t0Var.f42029c;
        this.f41739c = str3;
        str4 = t0Var.f42030d;
        this.f41740d = str4;
        str5 = t0Var.f42031e;
        this.f41741e = str5;
        str6 = t0Var.f42032f;
        this.f41742f = str6;
        boolean[] zArr = t0Var.f42033g;
        this.f41743g = Arrays.copyOf(zArr, zArr.length);
    }
}
