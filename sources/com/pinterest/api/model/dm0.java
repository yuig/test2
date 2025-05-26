package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class dm0 {

    /* renamed from: a, reason: collision with root package name */
    public Integer f36890a;

    /* renamed from: b, reason: collision with root package name */
    public zk0 f36891b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f36892c;

    /* renamed from: d, reason: collision with root package name */
    public iq0 f36893d;

    /* renamed from: e, reason: collision with root package name */
    public String f36894e;

    /* renamed from: f, reason: collision with root package name */
    public String f36895f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f36896g;

    public /* synthetic */ dm0(int i13) {
        this();
    }

    private dm0() {
        this.f36896g = new boolean[6];
    }

    private dm0(@NonNull gm0 gm0Var) {
        Integer num;
        zk0 zk0Var;
        Integer num2;
        iq0 iq0Var;
        String str;
        String str2;
        num = gm0Var.f38085a;
        this.f36890a = num;
        zk0Var = gm0Var.f38086b;
        this.f36891b = zk0Var;
        num2 = gm0Var.f38087c;
        this.f36892c = num2;
        iq0Var = gm0Var.f38088d;
        this.f36893d = iq0Var;
        str = gm0Var.f38089e;
        this.f36894e = str;
        str2 = gm0Var.f38090f;
        this.f36895f = str2;
        boolean[] zArr = gm0Var.f38091g;
        this.f36896g = Arrays.copyOf(zArr, zArr.length);
    }
}
