package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class n9 {

    /* renamed from: a, reason: collision with root package name */
    public String f40351a;

    /* renamed from: b, reason: collision with root package name */
    public String f40352b;

    /* renamed from: c, reason: collision with root package name */
    public String f40353c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f40354d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f40355e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f40356f;

    public /* synthetic */ n9(int i13) {
        this();
    }

    private n9() {
        this.f40356f = new boolean[5];
    }

    private n9(@NonNull o9 o9Var) {
        String str;
        String str2;
        String str3;
        Integer num;
        Integer num2;
        str = o9Var.f40645a;
        this.f40351a = str;
        str2 = o9Var.f40646b;
        this.f40352b = str2;
        str3 = o9Var.f40647c;
        this.f40353c = str3;
        num = o9Var.f40648d;
        this.f40354d = num;
        num2 = o9Var.f40649e;
        this.f40355e = num2;
        boolean[] zArr = o9Var.f40650f;
        this.f40356f = Arrays.copyOf(zArr, zArr.length);
    }
}
