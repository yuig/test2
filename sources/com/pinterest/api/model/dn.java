package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class dn {

    /* renamed from: a, reason: collision with root package name */
    public String f36897a;

    /* renamed from: b, reason: collision with root package name */
    public Double f36898b;

    /* renamed from: c, reason: collision with root package name */
    public String f36899c;

    /* renamed from: d, reason: collision with root package name */
    public String f36900d;

    /* renamed from: e, reason: collision with root package name */
    public Double f36901e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f36902f;

    public /* synthetic */ dn(int i13) {
        this();
    }

    public final gn a() {
        return new gn(this.f36897a, this.f36898b, this.f36899c, this.f36900d, this.f36901e, this.f36902f, 0);
    }

    public final void b(String str) {
        this.f36897a = str;
        boolean[] zArr = this.f36902f;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
    }

    public final void c(Double d2) {
        this.f36898b = d2;
        boolean[] zArr = this.f36902f;
        if (zArr.length > 1) {
            zArr[1] = true;
        }
    }

    public final void d(String str) {
        this.f36899c = str;
        boolean[] zArr = this.f36902f;
        if (zArr.length > 2) {
            zArr[2] = true;
        }
    }

    public final void e(String str) {
        this.f36900d = str;
        boolean[] zArr = this.f36902f;
        if (zArr.length > 3) {
            zArr[3] = true;
        }
    }

    public final void f(Double d2) {
        this.f36901e = d2;
        boolean[] zArr = this.f36902f;
        if (zArr.length > 4) {
            zArr[4] = true;
        }
    }

    private dn() {
        this.f36902f = new boolean[5];
    }

    private dn(@NonNull gn gnVar) {
        String str;
        Double d2;
        String str2;
        String str3;
        Double d13;
        str = gnVar.f38092a;
        this.f36897a = str;
        d2 = gnVar.f38093b;
        this.f36898b = d2;
        str2 = gnVar.f38094c;
        this.f36899c = str2;
        str3 = gnVar.f38095d;
        this.f36900d = str3;
        d13 = gnVar.f38096e;
        this.f36901e = d13;
        boolean[] zArr = gnVar.f38097f;
        this.f36902f = Arrays.copyOf(zArr, zArr.length);
    }
}
