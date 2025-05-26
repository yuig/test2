package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class hm0 {

    /* renamed from: a, reason: collision with root package name */
    public Integer f38488a;

    /* renamed from: b, reason: collision with root package name */
    public zk0 f38489b;

    /* renamed from: c, reason: collision with root package name */
    public om0 f38490c;

    /* renamed from: d, reason: collision with root package name */
    public String f38491d;

    /* renamed from: e, reason: collision with root package name */
    public String f38492e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f38493f;

    public /* synthetic */ hm0(int i13) {
        this();
    }

    private hm0() {
        this.f38493f = new boolean[5];
    }

    private hm0(@NonNull km0 km0Var) {
        Integer num;
        zk0 zk0Var;
        om0 om0Var;
        String str;
        String str2;
        num = km0Var.f39492a;
        this.f38488a = num;
        zk0Var = km0Var.f39493b;
        this.f38489b = zk0Var;
        om0Var = km0Var.f39494c;
        this.f38490c = om0Var;
        str = km0Var.f39495d;
        this.f38491d = str;
        str2 = km0Var.f39496e;
        this.f38492e = str2;
        boolean[] zArr = km0Var.f39497f;
        this.f38493f = Arrays.copyOf(zArr, zArr.length);
    }
}
