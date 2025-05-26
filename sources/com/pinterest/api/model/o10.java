package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class o10 {

    /* renamed from: a, reason: collision with root package name */
    public String f40588a;

    /* renamed from: b, reason: collision with root package name */
    public String f40589b;

    /* renamed from: c, reason: collision with root package name */
    public String f40590c;

    /* renamed from: d, reason: collision with root package name */
    public String f40591d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f40592e;

    public /* synthetic */ o10(int i13) {
        this();
    }

    private o10() {
        this.f40592e = new boolean[4];
    }

    private o10(@NonNull r10 r10Var) {
        String str;
        String str2;
        String str3;
        String str4;
        str = r10Var.f41467a;
        this.f40588a = str;
        str2 = r10Var.f41468b;
        this.f40589b = str2;
        str3 = r10Var.f41469c;
        this.f40590c = str3;
        str4 = r10Var.f41470d;
        this.f40591d = str4;
        boolean[] zArr = r10Var.f41471e;
        this.f40592e = Arrays.copyOf(zArr, zArr.length);
    }
}
