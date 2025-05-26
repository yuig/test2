package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class j11 {

    /* renamed from: a, reason: collision with root package name */
    public String f38926a;

    /* renamed from: b, reason: collision with root package name */
    public a11 f38927b;

    /* renamed from: c, reason: collision with root package name */
    public String f38928c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f38929d;

    /* renamed from: e, reason: collision with root package name */
    public String f38930e;

    /* renamed from: f, reason: collision with root package name */
    public String f38931f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f38932g;

    public /* synthetic */ j11(int i13) {
        this();
    }

    private j11() {
        this.f38932g = new boolean[6];
    }

    private j11(@NonNull m11 m11Var) {
        String str;
        a11 a11Var;
        String str2;
        Integer num;
        String str3;
        String str4;
        str = m11Var.f39968a;
        this.f38926a = str;
        a11Var = m11Var.f39969b;
        this.f38927b = a11Var;
        str2 = m11Var.f39970c;
        this.f38928c = str2;
        num = m11Var.f39971d;
        this.f38929d = num;
        str3 = m11Var.f39972e;
        this.f38930e = str3;
        str4 = m11Var.f39973f;
        this.f38931f = str4;
        boolean[] zArr = m11Var.f39974g;
        this.f38932g = Arrays.copyOf(zArr, zArr.length);
    }
}
