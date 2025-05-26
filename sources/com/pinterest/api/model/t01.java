package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class t01 {

    /* renamed from: a, reason: collision with root package name */
    public e11 f42042a;

    /* renamed from: b, reason: collision with root package name */
    public m11 f42043b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f42044c;

    public /* synthetic */ t01(int i13) {
        this();
    }

    private t01() {
        this.f42044c = new boolean[2];
    }

    private t01(@NonNull w01 w01Var) {
        e11 e11Var;
        m11 m11Var;
        e11Var = w01Var.f43132a;
        this.f42042a = e11Var;
        m11Var = w01Var.f43133b;
        this.f42043b = m11Var;
        boolean[] zArr = w01Var.f43134c;
        this.f42044c = Arrays.copyOf(zArr, zArr.length);
    }
}
