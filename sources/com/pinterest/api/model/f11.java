package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class f11 {

    /* renamed from: a, reason: collision with root package name */
    public String f37416a;

    /* renamed from: b, reason: collision with root package name */
    public String f37417b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f37418c;

    public /* synthetic */ f11(int i13) {
        this();
    }

    public final i11 a() {
        return new i11(this.f37416a, this.f37417b, this.f37418c, 0);
    }

    public final void b(String str) {
        this.f37416a = str;
        boolean[] zArr = this.f37418c;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
    }

    public final void c(String str) {
        this.f37417b = str;
        boolean[] zArr = this.f37418c;
        if (zArr.length > 1) {
            zArr[1] = true;
        }
    }

    private f11() {
        this.f37418c = new boolean[2];
    }

    private f11(@NonNull i11 i11Var) {
        String str;
        String str2;
        str = i11Var.f38596a;
        this.f37416a = str;
        str2 = i11Var.f38597b;
        this.f37417b = str2;
        boolean[] zArr = i11Var.f38598c;
        this.f37418c = Arrays.copyOf(zArr, zArr.length);
    }
}
