package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class in {

    /* renamed from: a, reason: collision with root package name */
    public String f38821a;

    /* renamed from: b, reason: collision with root package name */
    public String f38822b;

    /* renamed from: c, reason: collision with root package name */
    public String f38823c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f38824d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f38825e;

    /* renamed from: f, reason: collision with root package name */
    public String f38826f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f38827g;

    public /* synthetic */ in(int i13) {
        this();
    }

    public final ln a() {
        return new ln(this.f38821a, this.f38822b, this.f38823c, this.f38824d, this.f38825e, this.f38826f, this.f38827g, 0);
    }

    public final void b(String str) {
        this.f38823c = str;
        boolean[] zArr = this.f38827g;
        if (zArr.length > 2) {
            zArr[2] = true;
        }
    }

    public final void c(Integer num) {
        this.f38824d = num;
        boolean[] zArr = this.f38827g;
        if (zArr.length > 3) {
            zArr[3] = true;
        }
    }

    public final void d(String str) {
        this.f38822b = str;
        boolean[] zArr = this.f38827g;
        if (zArr.length > 1) {
            zArr[1] = true;
        }
    }

    public final void e(Integer num) {
        this.f38825e = num;
        boolean[] zArr = this.f38827g;
        if (zArr.length > 4) {
            zArr[4] = true;
        }
    }

    public final void f(String str) {
        this.f38826f = str;
        boolean[] zArr = this.f38827g;
        if (zArr.length > 5) {
            zArr[5] = true;
        }
    }

    public final void g(String str) {
        this.f38821a = str;
        boolean[] zArr = this.f38827g;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
    }

    private in() {
        this.f38827g = new boolean[6];
    }

    private in(@NonNull ln lnVar) {
        String str;
        String str2;
        String str3;
        Integer num;
        Integer num2;
        String str4;
        str = lnVar.f39824a;
        this.f38821a = str;
        str2 = lnVar.f39825b;
        this.f38822b = str2;
        str3 = lnVar.f39826c;
        this.f38823c = str3;
        num = lnVar.f39827d;
        this.f38824d = num;
        num2 = lnVar.f39828e;
        this.f38825e = num2;
        str4 = lnVar.f39829f;
        this.f38826f = str4;
        boolean[] zArr = lnVar.f39830g;
        this.f38827g = Arrays.copyOf(zArr, zArr.length);
    }
}
