package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class qz0 {

    /* renamed from: a, reason: collision with root package name */
    public String f41449a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f41450b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f41451c;

    public /* synthetic */ qz0(int i13) {
        this();
    }

    public final tz0 a() {
        return new tz0(this.f41449a, this.f41450b, this.f41451c, 0);
    }

    public final void b(String str) {
        this.f41449a = str;
        boolean[] zArr = this.f41451c;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
    }

    public final void c(Boolean bool) {
        this.f41450b = bool;
        boolean[] zArr = this.f41451c;
        if (zArr.length > 1) {
            zArr[1] = true;
        }
    }

    private qz0() {
        this.f41451c = new boolean[2];
    }

    private qz0(@NonNull tz0 tz0Var) {
        String str;
        Boolean bool;
        str = tz0Var.f42367a;
        this.f41449a = str;
        bool = tz0Var.f42368b;
        this.f41450b = bool;
        boolean[] zArr = tz0Var.f42369c;
        this.f41451c = Arrays.copyOf(zArr, zArr.length);
    }
}
