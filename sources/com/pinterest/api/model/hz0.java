package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class hz0 {

    /* renamed from: a, reason: collision with root package name */
    public String f38573a;

    /* renamed from: b, reason: collision with root package name */
    public String f38574b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f38575c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f38576d;

    public /* synthetic */ hz0(int i13) {
        this();
    }

    public final void a(String str) {
        this.f38573a = str;
        boolean[] zArr = this.f38576d;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
    }

    public final void b(String str) {
        this.f38574b = str;
        boolean[] zArr = this.f38576d;
        if (zArr.length > 1) {
            zArr[1] = true;
        }
    }

    public final void c(Integer num) {
        this.f38575c = num;
        boolean[] zArr = this.f38576d;
        if (zArr.length > 2) {
            zArr[2] = true;
        }
    }

    private hz0() {
        this.f38576d = new boolean[3];
    }

    private hz0(@NonNull kz0 kz0Var) {
        String str;
        String str2;
        Integer num;
        str = kz0Var.f39567a;
        this.f38573a = str;
        str2 = kz0Var.f39568b;
        this.f38574b = str2;
        num = kz0Var.f39569c;
        this.f38575c = num;
        boolean[] zArr = kz0Var.f39570d;
        this.f38576d = Arrays.copyOf(zArr, zArr.length);
    }
}
