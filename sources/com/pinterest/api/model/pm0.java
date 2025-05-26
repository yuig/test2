package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class pm0 {

    /* renamed from: a, reason: collision with root package name */
    public Integer f41022a;

    /* renamed from: b, reason: collision with root package name */
    public String f41023b;

    /* renamed from: c, reason: collision with root package name */
    public String f41024c;

    /* renamed from: d, reason: collision with root package name */
    public String f41025d;

    /* renamed from: e, reason: collision with root package name */
    public String f41026e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f41027f;

    public /* synthetic */ pm0(int i13) {
        this();
    }

    private pm0() {
        this.f41027f = new boolean[5];
    }

    private pm0(@NonNull sm0 sm0Var) {
        Integer num;
        String str;
        String str2;
        String str3;
        String str4;
        num = sm0Var.f41938a;
        this.f41022a = num;
        str = sm0Var.f41939b;
        this.f41023b = str;
        str2 = sm0Var.f41940c;
        this.f41024c = str2;
        str3 = sm0Var.f41941d;
        this.f41025d = str3;
        str4 = sm0Var.f41942e;
        this.f41026e = str4;
        boolean[] zArr = sm0Var.f41943f;
        this.f41027f = Arrays.copyOf(zArr, zArr.length);
    }
}
