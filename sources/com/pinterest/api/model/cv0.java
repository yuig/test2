package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class cv0 {

    /* renamed from: a, reason: collision with root package name */
    public String f36537a;

    /* renamed from: b, reason: collision with root package name */
    public String f36538b;

    /* renamed from: c, reason: collision with root package name */
    public Double f36539c;

    /* renamed from: d, reason: collision with root package name */
    public Double f36540d;

    /* renamed from: e, reason: collision with root package name */
    public Double f36541e;

    /* renamed from: f, reason: collision with root package name */
    public Double f36542f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f36543g;

    public /* synthetic */ cv0(int i13) {
        this();
    }

    private cv0() {
        this.f36543g = new boolean[6];
    }

    private cv0(@NonNull fv0 fv0Var) {
        String str;
        String str2;
        Double d2;
        Double d13;
        Double d14;
        Double d15;
        str = fv0Var.f37814a;
        this.f36537a = str;
        str2 = fv0Var.f37815b;
        this.f36538b = str2;
        d2 = fv0Var.f37816c;
        this.f36539c = d2;
        d13 = fv0Var.f37817d;
        this.f36540d = d13;
        d14 = fv0Var.f37818e;
        this.f36541e = d14;
        d15 = fv0Var.f37819f;
        this.f36542f = d15;
        boolean[] zArr = fv0Var.f37820g;
        this.f36543g = Arrays.copyOf(zArr, zArr.length);
    }
}
