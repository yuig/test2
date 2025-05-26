package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class vp {

    /* renamed from: a, reason: collision with root package name */
    public String f42944a;

    /* renamed from: b, reason: collision with root package name */
    public String f42945b;

    /* renamed from: c, reason: collision with root package name */
    public String f42946c;

    /* renamed from: d, reason: collision with root package name */
    public Double f42947d;

    /* renamed from: e, reason: collision with root package name */
    public String f42948e;

    /* renamed from: f, reason: collision with root package name */
    public String f42949f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f42950g;

    public /* synthetic */ vp(int i13) {
        this();
    }

    private vp() {
        this.f42950g = new boolean[6];
    }

    private vp(@NonNull yp ypVar) {
        String str;
        String str2;
        String str3;
        Double d2;
        String str4;
        String str5;
        str = ypVar.f44093a;
        this.f42944a = str;
        str2 = ypVar.f44094b;
        this.f42945b = str2;
        str3 = ypVar.f44095c;
        this.f42946c = str3;
        d2 = ypVar.f44096d;
        this.f42947d = d2;
        str4 = ypVar.f44097e;
        this.f42948e = str4;
        str5 = ypVar.f44098f;
        this.f42949f = str5;
        boolean[] zArr = ypVar.f44099g;
        this.f42950g = Arrays.copyOf(zArr, zArr.length);
    }
}
