package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class iw0 {

    /* renamed from: a, reason: collision with root package name */
    public List f38876a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f38877b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f38878c;

    public /* synthetic */ iw0(int i13) {
        this();
    }

    private iw0() {
        this.f38878c = new boolean[2];
    }

    private iw0(@NonNull lw0 lw0Var) {
        List list;
        Integer num;
        list = lw0Var.f39931a;
        this.f38876a = list;
        num = lw0Var.f39932b;
        this.f38877b = num;
        boolean[] zArr = lw0Var.f39933c;
        this.f38878c = Arrays.copyOf(zArr, zArr.length);
    }
}
