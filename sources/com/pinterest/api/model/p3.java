package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class p3 {

    /* renamed from: a, reason: collision with root package name */
    public String f40868a;

    /* renamed from: b, reason: collision with root package name */
    public String f40869b;

    /* renamed from: c, reason: collision with root package name */
    public String f40870c;

    /* renamed from: d, reason: collision with root package name */
    public Double f40871d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f40872e;

    public /* synthetic */ p3(int i13) {
        this();
    }

    private p3() {
        this.f40872e = new boolean[4];
    }

    private p3(@NonNull q3 q3Var) {
        String str;
        String str2;
        String str3;
        Double d2;
        str = q3Var.f41196a;
        this.f40868a = str;
        str2 = q3Var.f41197b;
        this.f40869b = str2;
        str3 = q3Var.f41198c;
        this.f40870c = str3;
        d2 = q3Var.f41199d;
        this.f40871d = d2;
        boolean[] zArr = q3Var.f41200e;
        this.f40872e = Arrays.copyOf(zArr, zArr.length);
    }
}
