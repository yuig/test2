package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class mz0 {

    /* renamed from: a, reason: collision with root package name */
    public String f40267a;

    /* renamed from: b, reason: collision with root package name */
    public wy0 f40268b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f40269c;

    public /* synthetic */ mz0(int i13) {
        this();
    }

    public final pz0 a() {
        return new pz0(this.f40267a, this.f40268b, this.f40269c, 0);
    }

    public final void b(String str) {
        this.f40267a = str;
        boolean[] zArr = this.f40269c;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
    }

    public /* synthetic */ mz0(pz0 pz0Var, int i13) {
        this(pz0Var);
    }

    private mz0() {
        this.f40269c = new boolean[2];
    }

    private mz0(@NonNull pz0 pz0Var) {
        String str;
        wy0 wy0Var;
        str = pz0Var.f41144a;
        this.f40267a = str;
        wy0Var = pz0Var.f41145b;
        this.f40268b = wy0Var;
        boolean[] zArr = pz0Var.f41146c;
        this.f40269c = Arrays.copyOf(zArr, zArr.length);
    }
}
