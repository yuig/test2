package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class xn0 {

    /* renamed from: a, reason: collision with root package name */
    public String f43759a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f43760b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f43761c;

    public /* synthetic */ xn0(int i13) {
        this();
    }

    private xn0() {
        this.f43761c = new boolean[2];
    }

    private xn0(@NonNull ao0 ao0Var) {
        String str;
        Integer num;
        str = ao0Var.f35824a;
        this.f43759a = str;
        num = ao0Var.f35825b;
        this.f43760b = num;
        boolean[] zArr = ao0Var.f35826c;
        this.f43761c = Arrays.copyOf(zArr, zArr.length);
    }
}
