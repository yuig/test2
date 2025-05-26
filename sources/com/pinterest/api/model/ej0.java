package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ej0 {

    /* renamed from: a, reason: collision with root package name */
    public String f37276a;

    /* renamed from: b, reason: collision with root package name */
    public String f37277b;

    /* renamed from: c, reason: collision with root package name */
    public lj0 f37278c;

    /* renamed from: d, reason: collision with root package name */
    public String f37279d;

    /* renamed from: e, reason: collision with root package name */
    public pj0 f37280e;

    /* renamed from: f, reason: collision with root package name */
    public f30 f37281f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f37282g;

    public /* synthetic */ ej0(int i13) {
        this();
    }

    private ej0() {
        this.f37282g = new boolean[6];
    }

    private ej0(@NonNull hj0 hj0Var) {
        String str;
        String str2;
        lj0 lj0Var;
        String str3;
        pj0 pj0Var;
        f30 f30Var;
        str = hj0Var.f38464a;
        this.f37276a = str;
        str2 = hj0Var.f38465b;
        this.f37277b = str2;
        lj0Var = hj0Var.f38466c;
        this.f37278c = lj0Var;
        str3 = hj0Var.f38467d;
        this.f37279d = str3;
        pj0Var = hj0Var.f38468e;
        this.f37280e = pj0Var;
        f30Var = hj0Var.f38469f;
        this.f37281f = f30Var;
        boolean[] zArr = hj0Var.f38470g;
        this.f37282g = Arrays.copyOf(zArr, zArr.length);
    }
}
