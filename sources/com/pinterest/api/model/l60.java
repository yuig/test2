package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class l60 {

    /* renamed from: a, reason: collision with root package name */
    public String f39661a;

    /* renamed from: b, reason: collision with root package name */
    public String f39662b;

    /* renamed from: c, reason: collision with root package name */
    public String f39663c;

    /* renamed from: d, reason: collision with root package name */
    public String f39664d;

    /* renamed from: e, reason: collision with root package name */
    public String f39665e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f39666f;

    public /* synthetic */ l60(int i13) {
        this();
    }

    private l60() {
        this.f39666f = new boolean[5];
    }

    private l60(@NonNull o60 o60Var) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        str = o60Var.f40627a;
        this.f39661a = str;
        str2 = o60Var.f40628b;
        this.f39662b = str2;
        str3 = o60Var.f40629c;
        this.f39663c = str3;
        str4 = o60Var.f40630d;
        this.f39664d = str4;
        str5 = o60Var.f40631e;
        this.f39665e = str5;
        boolean[] zArr = o60Var.f40632f;
        this.f39666f = Arrays.copyOf(zArr, zArr.length);
    }
}
