package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class st0 {

    /* renamed from: a, reason: collision with root package name */
    public String f41997a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f41998b;

    /* renamed from: c, reason: collision with root package name */
    public String f41999c;

    /* renamed from: d, reason: collision with root package name */
    public String f42000d;

    /* renamed from: e, reason: collision with root package name */
    public String f42001e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f42002f;

    public /* synthetic */ st0(int i13) {
        this();
    }

    private st0() {
        this.f42002f = new boolean[5];
    }

    private st0(@NonNull vt0 vt0Var) {
        String str;
        Integer num;
        String str2;
        String str3;
        String str4;
        str = vt0Var.f42978a;
        this.f41997a = str;
        num = vt0Var.f42979b;
        this.f41998b = num;
        str2 = vt0Var.f42980c;
        this.f41999c = str2;
        str3 = vt0Var.f42981d;
        this.f42000d = str3;
        str4 = vt0Var.f42982e;
        this.f42001e = str4;
        boolean[] zArr = vt0Var.f42983f;
        this.f42002f = Arrays.copyOf(zArr, zArr.length);
    }
}
