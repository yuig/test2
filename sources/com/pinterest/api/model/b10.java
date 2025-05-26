package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class b10 {

    /* renamed from: a, reason: collision with root package name */
    public String f35942a;

    /* renamed from: b, reason: collision with root package name */
    public String f35943b;

    /* renamed from: c, reason: collision with root package name */
    public Double f35944c;

    /* renamed from: d, reason: collision with root package name */
    public String f35945d;

    /* renamed from: e, reason: collision with root package name */
    public Double f35946e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f35947f;

    public /* synthetic */ b10(int i13) {
        this();
    }

    private b10() {
        this.f35947f = new boolean[5];
    }

    private b10(@NonNull e10 e10Var) {
        String str;
        String str2;
        Double d2;
        String str3;
        Double d13;
        str = e10Var.f37027a;
        this.f35942a = str;
        str2 = e10Var.f37028b;
        this.f35943b = str2;
        d2 = e10Var.f37029c;
        this.f35944c = d2;
        str3 = e10Var.f37030d;
        this.f35945d = str3;
        d13 = e10Var.f37031e;
        this.f35946e = d13;
        boolean[] zArr = e10Var.f37032f;
        this.f35947f = Arrays.copyOf(zArr, zArr.length);
    }
}
