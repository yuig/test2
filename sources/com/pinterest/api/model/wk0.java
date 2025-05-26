package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class wk0 {

    /* renamed from: a, reason: collision with root package name */
    public Double f43279a;

    /* renamed from: b, reason: collision with root package name */
    public Double f43280b;

    /* renamed from: c, reason: collision with root package name */
    public Double f43281c;

    /* renamed from: d, reason: collision with root package name */
    public Double f43282d;

    /* renamed from: e, reason: collision with root package name */
    public Double f43283e;

    /* renamed from: f, reason: collision with root package name */
    public Double f43284f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f43285g;

    public /* synthetic */ wk0(int i13) {
        this();
    }

    public final zk0 a() {
        return new zk0(this.f43279a, this.f43280b, this.f43281c, this.f43282d, this.f43283e, this.f43284f, this.f43285g, 0);
    }

    private wk0() {
        this.f43285g = new boolean[6];
    }

    private wk0(@NonNull zk0 zk0Var) {
        Double d2;
        Double d13;
        Double d14;
        Double d15;
        Double d16;
        Double d17;
        d2 = zk0Var.f44374a;
        this.f43279a = d2;
        d13 = zk0Var.f44375b;
        this.f43280b = d13;
        d14 = zk0Var.f44376c;
        this.f43281c = d14;
        d15 = zk0Var.f44377d;
        this.f43282d = d15;
        d16 = zk0Var.f44378e;
        this.f43283e = d16;
        d17 = zk0Var.f44379f;
        this.f43284f = d17;
        boolean[] zArr = zk0Var.f44380g;
        this.f43285g = Arrays.copyOf(zArr, zArr.length);
    }
}
