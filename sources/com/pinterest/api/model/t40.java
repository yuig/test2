package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Date;

/* loaded from: classes3.dex */
public final class t40 {

    /* renamed from: a, reason: collision with root package name */
    public String f42084a;

    /* renamed from: b, reason: collision with root package name */
    public String f42085b;

    /* renamed from: c, reason: collision with root package name */
    public Date f42086c;

    /* renamed from: d, reason: collision with root package name */
    public String f42087d;

    /* renamed from: e, reason: collision with root package name */
    public Date f42088e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f42089f;

    public /* synthetic */ t40(int i13) {
        this();
    }

    private t40() {
        this.f42089f = new boolean[5];
    }

    private t40(@NonNull w40 w40Var) {
        String str;
        String str2;
        Date date;
        String str3;
        Date date2;
        str = w40Var.f43170a;
        this.f42084a = str;
        str2 = w40Var.f43171b;
        this.f42085b = str2;
        date = w40Var.f43172c;
        this.f42086c = date;
        str3 = w40Var.f43173d;
        this.f42087d = str3;
        date2 = w40Var.f43174e;
        this.f42088e = date2;
        boolean[] zArr = w40Var.f43175f;
        this.f42089f = Arrays.copyOf(zArr, zArr.length);
    }
}
