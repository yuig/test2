package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class p00 {

    /* renamed from: a, reason: collision with root package name */
    public Integer f40846a;

    /* renamed from: b, reason: collision with root package name */
    public String f40847b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f40848c;

    public /* synthetic */ p00(int i13) {
        this();
    }

    private p00() {
        this.f40848c = new boolean[2];
    }

    private p00(@NonNull s00 s00Var) {
        Integer num;
        String str;
        num = s00Var.f41744a;
        this.f40846a = num;
        str = s00Var.f41745b;
        this.f40847b = str;
        boolean[] zArr = s00Var.f41746c;
        this.f40848c = Arrays.copyOf(zArr, zArr.length);
    }
}
