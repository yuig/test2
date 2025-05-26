package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class me {

    /* renamed from: a, reason: collision with root package name */
    public String f40073a;

    /* renamed from: b, reason: collision with root package name */
    public String f40074b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f40075c;

    /* renamed from: d, reason: collision with root package name */
    public String f40076d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f40077e;

    public /* synthetic */ me(int i13) {
        this();
    }

    public final pe a() {
        return new pe(this.f40073a, this.f40074b, this.f40075c, this.f40076d, this.f40077e, 0);
    }

    public final void b(String str) {
        this.f40074b = str;
        boolean[] zArr = this.f40077e;
        if (zArr.length > 1) {
            zArr[1] = true;
        }
    }

    public final void c(Integer num) {
        this.f40075c = num;
        boolean[] zArr = this.f40077e;
        if (zArr.length > 2) {
            zArr[2] = true;
        }
    }

    public final void d(String str) {
        this.f40076d = str;
        boolean[] zArr = this.f40077e;
        if (zArr.length > 3) {
            zArr[3] = true;
        }
    }

    public final void e(String str) {
        this.f40073a = str;
        boolean[] zArr = this.f40077e;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
    }

    private me() {
        this.f40077e = new boolean[4];
    }

    private me(@NonNull pe peVar) {
        String str;
        String str2;
        Integer num;
        String str3;
        str = peVar.f40940a;
        this.f40073a = str;
        str2 = peVar.f40941b;
        this.f40074b = str2;
        num = peVar.f40942c;
        this.f40075c = num;
        str3 = peVar.f40943d;
        this.f40076d = str3;
        boolean[] zArr = peVar.f40944e;
        this.f40077e = Arrays.copyOf(zArr, zArr.length);
    }
}
