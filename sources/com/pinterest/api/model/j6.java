package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class j6 {

    /* renamed from: a, reason: collision with root package name */
    public String f38986a;

    /* renamed from: b, reason: collision with root package name */
    public String f38987b;

    /* renamed from: c, reason: collision with root package name */
    public String f38988c;

    /* renamed from: d, reason: collision with root package name */
    public String f38989d;

    /* renamed from: e, reason: collision with root package name */
    public String f38990e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f38991f;

    public /* synthetic */ j6(int i13) {
        this();
    }

    public final k6 a() {
        return new k6(this.f38986a, this.f38987b, this.f38988c, this.f38989d, this.f38990e, this.f38991f, 0);
    }

    public final void b(String str) {
        this.f38986a = str;
        boolean[] zArr = this.f38991f;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
    }

    public final void c(String str) {
        this.f38987b = str;
        boolean[] zArr = this.f38991f;
        if (zArr.length > 1) {
            zArr[1] = true;
        }
    }

    public final void d(String str) {
        this.f38988c = str;
        boolean[] zArr = this.f38991f;
        if (zArr.length > 2) {
            zArr[2] = true;
        }
    }

    public final void e(String str) {
        this.f38989d = str;
        boolean[] zArr = this.f38991f;
        if (zArr.length > 3) {
            zArr[3] = true;
        }
    }

    public final void f(String str) {
        this.f38990e = str;
        boolean[] zArr = this.f38991f;
        if (zArr.length > 4) {
            zArr[4] = true;
        }
    }

    private j6() {
        this.f38991f = new boolean[5];
    }

    private j6(@NonNull k6 k6Var) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        str = k6Var.f39296a;
        this.f38986a = str;
        str2 = k6Var.f39297b;
        this.f38987b = str2;
        str3 = k6Var.f39298c;
        this.f38988c = str3;
        str4 = k6Var.f39299d;
        this.f38989d = str4;
        str5 = k6Var.f39300e;
        this.f38990e = str5;
        boolean[] zArr = k6Var.f39301f;
        this.f38991f = Arrays.copyOf(zArr, zArr.length);
    }
}
