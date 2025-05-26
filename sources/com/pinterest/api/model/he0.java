package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Date;

/* loaded from: classes3.dex */
public final class he0 {

    /* renamed from: a, reason: collision with root package name */
    public Date f38405a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f38406b;

    public /* synthetic */ he0(int i13) {
        this();
    }

    public final ke0 a() {
        return new ke0(this.f38405a, this.f38406b, 0);
    }

    public final void b(Date date) {
        this.f38405a = date;
        boolean[] zArr = this.f38406b;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
    }

    private he0() {
        this.f38406b = new boolean[1];
    }

    private he0(@NonNull ke0 ke0Var) {
        Date date;
        date = ke0Var.f39421a;
        this.f38405a = date;
        boolean[] zArr = ke0Var.f39422b;
        this.f38406b = Arrays.copyOf(zArr, zArr.length);
    }
}
