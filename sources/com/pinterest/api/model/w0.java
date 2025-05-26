package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public List f43122a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f43123b;

    public /* synthetic */ w0(int i13) {
        this();
    }

    private w0() {
        this.f43123b = new boolean[1];
    }

    private w0(@NonNull x0 x0Var) {
        List list;
        list = x0Var.f43519a;
        this.f43122a = list;
        boolean[] zArr = x0Var.f43520b;
        this.f43123b = Arrays.copyOf(zArr, zArr.length);
    }
}
