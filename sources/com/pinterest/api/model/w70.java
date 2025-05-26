package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class w70 {

    /* renamed from: a, reason: collision with root package name */
    public List f43189a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f43190b;

    public /* synthetic */ w70(int i13) {
        this();
    }

    private w70() {
        this.f43190b = new boolean[1];
    }

    private w70(@NonNull z70 z70Var) {
        List list;
        list = z70Var.f44240a;
        this.f43189a = list;
        boolean[] zArr = z70Var.f44241b;
        this.f43190b = Arrays.copyOf(zArr, zArr.length);
    }
}
