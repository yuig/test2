package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class b7 {

    /* renamed from: a, reason: collision with root package name */
    public String f36002a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f36003b;

    /* renamed from: c, reason: collision with root package name */
    public String f36004c;

    /* renamed from: d, reason: collision with root package name */
    public String f36005d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f36006e;

    public /* synthetic */ b7(int i13) {
        this();
    }

    public final c7 a() {
        return new c7(this.f36002a, this.f36003b, this.f36004c, this.f36005d, this.f36006e, 0);
    }

    public final void b(String str) {
        this.f36002a = str;
        boolean[] zArr = this.f36006e;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
    }

    public final void c(Boolean bool) {
        this.f36003b = bool;
        boolean[] zArr = this.f36006e;
        if (zArr.length > 1) {
            zArr[1] = true;
        }
    }

    public final void d(String str) {
        this.f36004c = str;
        boolean[] zArr = this.f36006e;
        if (zArr.length > 2) {
            zArr[2] = true;
        }
    }

    public final void e(String str) {
        this.f36005d = str;
        boolean[] zArr = this.f36006e;
        if (zArr.length > 3) {
            zArr[3] = true;
        }
    }

    public /* synthetic */ b7(c7 c7Var, int i13) {
        this(c7Var);
    }

    private b7() {
        this.f36006e = new boolean[4];
    }

    private b7(@NonNull c7 c7Var) {
        String str;
        Boolean bool;
        String str2;
        String str3;
        str = c7Var.f36314a;
        this.f36002a = str;
        bool = c7Var.f36315b;
        this.f36003b = bool;
        str2 = c7Var.f36316c;
        this.f36004c = str2;
        str3 = c7Var.f36317d;
        this.f36005d = str3;
        boolean[] zArr = c7Var.f36318e;
        this.f36006e = Arrays.copyOf(zArr, zArr.length);
    }
}
