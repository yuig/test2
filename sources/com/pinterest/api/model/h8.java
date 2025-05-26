package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class h8 {

    /* renamed from: a, reason: collision with root package name */
    public String f38326a;

    /* renamed from: b, reason: collision with root package name */
    public String f38327b;

    /* renamed from: c, reason: collision with root package name */
    public Double f38328c;

    /* renamed from: d, reason: collision with root package name */
    public Double f38329d;

    /* renamed from: e, reason: collision with root package name */
    public Double f38330e;

    /* renamed from: f, reason: collision with root package name */
    public Double f38331f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f38332g;

    public /* synthetic */ h8(int i13) {
        this();
    }

    private h8() {
        this.f38332g = new boolean[6];
    }

    private h8(@NonNull i8 i8Var) {
        String str;
        String str2;
        Double d2;
        Double d13;
        Double d14;
        Double d15;
        str = i8Var.f38695a;
        this.f38326a = str;
        str2 = i8Var.f38696b;
        this.f38327b = str2;
        d2 = i8Var.f38697c;
        this.f38328c = d2;
        d13 = i8Var.f38698d;
        this.f38329d = d13;
        d14 = i8Var.f38699e;
        this.f38330e = d14;
        d15 = i8Var.f38700f;
        this.f38331f = d15;
        boolean[] zArr = i8Var.f38701g;
        this.f38332g = Arrays.copyOf(zArr, zArr.length);
    }
}
