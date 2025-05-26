package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class uu0 {

    /* renamed from: a, reason: collision with root package name */
    public String f42643a;

    /* renamed from: b, reason: collision with root package name */
    public String f42644b;

    /* renamed from: c, reason: collision with root package name */
    public bv0 f42645c;

    /* renamed from: d, reason: collision with root package name */
    public fv0 f42646d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f42647e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f42648f;

    public /* synthetic */ uu0(int i13) {
        this();
    }

    private uu0() {
        this.f42648f = new boolean[5];
    }

    private uu0(@NonNull xu0 xu0Var) {
        String str;
        String str2;
        bv0 bv0Var;
        fv0 fv0Var;
        Integer num;
        str = xu0Var.f43793a;
        this.f42643a = str;
        str2 = xu0Var.f43794b;
        this.f42644b = str2;
        bv0Var = xu0Var.f43795c;
        this.f42645c = bv0Var;
        fv0Var = xu0Var.f43796d;
        this.f42646d = fv0Var;
        num = xu0Var.f43797e;
        this.f42647e = num;
        boolean[] zArr = xu0Var.f43798f;
        this.f42648f = Arrays.copyOf(zArr, zArr.length);
    }
}
