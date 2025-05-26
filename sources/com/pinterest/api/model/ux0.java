package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class ux0 {

    /* renamed from: a, reason: collision with root package name */
    public String f42671a;

    /* renamed from: b, reason: collision with root package name */
    public String f42672b;

    /* renamed from: c, reason: collision with root package name */
    public List f42673c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f42674d;

    public /* synthetic */ ux0(int i13) {
        this();
    }

    private ux0() {
        this.f42674d = new boolean[3];
    }

    private ux0(@NonNull xx0 xx0Var) {
        String str;
        String str2;
        List list;
        str = xx0Var.f43827a;
        this.f42671a = str;
        str2 = xx0Var.f43828b;
        this.f42672b = str2;
        list = xx0Var.f43829c;
        this.f42673c = list;
        boolean[] zArr = xx0Var.f43830d;
        this.f42674d = Arrays.copyOf(zArr, zArr.length);
    }
}
