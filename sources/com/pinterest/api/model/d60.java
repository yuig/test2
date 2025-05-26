package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class d60 {

    /* renamed from: a, reason: collision with root package name */
    public String f36660a;

    /* renamed from: b, reason: collision with root package name */
    public String f36661b;

    /* renamed from: c, reason: collision with root package name */
    public String f36662c;

    /* renamed from: d, reason: collision with root package name */
    public String f36663d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f36664e;

    public /* synthetic */ d60(int i13) {
        this();
    }

    public final g60 a() {
        return new g60(this.f36660a, this.f36661b, this.f36662c, this.f36663d, this.f36664e, 0);
    }

    public final void b(String str) {
        this.f36662c = str;
        boolean[] zArr = this.f36664e;
        if (zArr.length > 2) {
            zArr[2] = true;
        }
    }

    public final void c(String str) {
        this.f36661b = str;
        boolean[] zArr = this.f36664e;
        if (zArr.length > 1) {
            zArr[1] = true;
        }
    }

    public final void d(String str) {
        this.f36663d = str;
        boolean[] zArr = this.f36664e;
        if (zArr.length > 3) {
            zArr[3] = true;
        }
    }

    public final void e(String str) {
        this.f36660a = str;
        boolean[] zArr = this.f36664e;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
    }

    private d60() {
        this.f36664e = new boolean[4];
    }

    private d60(@NonNull g60 g60Var) {
        String str;
        String str2;
        String str3;
        String str4;
        str = g60Var.f37972a;
        this.f36660a = str;
        str2 = g60Var.f37973b;
        this.f36661b = str2;
        str3 = g60Var.f37974c;
        this.f36662c = str3;
        str4 = g60Var.f37975d;
        this.f36663d = str4;
        boolean[] zArr = g60Var.f37976e;
        this.f36664e = Arrays.copyOf(zArr, zArr.length);
    }
}
