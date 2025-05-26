package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class iu0 {

    /* renamed from: a, reason: collision with root package name */
    public String f38864a;

    /* renamed from: b, reason: collision with root package name */
    public String f38865b;

    /* renamed from: c, reason: collision with root package name */
    public Double f38866c;

    /* renamed from: d, reason: collision with root package name */
    public Double f38867d;

    /* renamed from: e, reason: collision with root package name */
    public Double f38868e;

    /* renamed from: f, reason: collision with root package name */
    public Double f38869f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f38870g;

    public /* synthetic */ iu0(int i13) {
        this();
    }

    private iu0() {
        this.f38870g = new boolean[6];
    }

    private iu0(@NonNull lu0 lu0Var) {
        String str;
        String str2;
        Double d2;
        Double d13;
        Double d14;
        Double d15;
        str = lu0Var.f39899a;
        this.f38864a = str;
        str2 = lu0Var.f39900b;
        this.f38865b = str2;
        d2 = lu0Var.f39901c;
        this.f38866c = d2;
        d13 = lu0Var.f39902d;
        this.f38867d = d13;
        d14 = lu0Var.f39903e;
        this.f38868e = d14;
        d15 = lu0Var.f39904f;
        this.f38869f = d15;
        boolean[] zArr = lu0Var.f39905g;
        this.f38870g = Arrays.copyOf(zArr, zArr.length);
    }
}
