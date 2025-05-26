package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class na0 {

    /* renamed from: a, reason: collision with root package name */
    public String f40372a;

    /* renamed from: b, reason: collision with root package name */
    public String f40373b;

    /* renamed from: c, reason: collision with root package name */
    public String f40374c;

    /* renamed from: d, reason: collision with root package name */
    public String f40375d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f40376e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f40377f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f40378g;

    public /* synthetic */ na0(int i13) {
        this();
    }

    private na0() {
        this.f40378g = new boolean[6];
    }

    private na0(@NonNull qa0 qa0Var) {
        String str;
        String str2;
        String str3;
        String str4;
        Integer num;
        Integer num2;
        str = qa0Var.f41245a;
        this.f40372a = str;
        str2 = qa0Var.f41246b;
        this.f40373b = str2;
        str3 = qa0Var.f41247c;
        this.f40374c = str3;
        str4 = qa0Var.f41248d;
        this.f40375d = str4;
        num = qa0Var.f41249e;
        this.f40376e = num;
        num2 = qa0Var.f41250f;
        this.f40377f = num2;
        boolean[] zArr = qa0Var.f41251g;
        this.f40378g = Arrays.copyOf(zArr, zArr.length);
    }
}
