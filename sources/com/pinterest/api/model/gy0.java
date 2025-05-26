package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class gy0 {

    /* renamed from: a, reason: collision with root package name */
    public String f38179a;

    /* renamed from: b, reason: collision with root package name */
    public String f38180b;

    /* renamed from: c, reason: collision with root package name */
    public String f38181c;

    /* renamed from: d, reason: collision with root package name */
    public String f38182d;

    /* renamed from: e, reason: collision with root package name */
    public String f38183e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f38184f;

    public /* synthetic */ gy0(int i13) {
        this();
    }

    private gy0() {
        this.f38184f = new boolean[5];
    }

    private gy0(@NonNull jy0 jy0Var) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        str = jy0Var.f39173a;
        this.f38179a = str;
        str2 = jy0Var.f39174b;
        this.f38180b = str2;
        str3 = jy0Var.f39175c;
        this.f38181c = str3;
        str4 = jy0Var.f39176d;
        this.f38182d = str4;
        str5 = jy0Var.f39177e;
        this.f38183e = str5;
        boolean[] zArr = jy0Var.f39178f;
        this.f38184f = Arrays.copyOf(zArr, zArr.length);
    }
}
