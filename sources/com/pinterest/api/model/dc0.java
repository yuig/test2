package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class dc0 {

    /* renamed from: a, reason: collision with root package name */
    public String f36722a;

    /* renamed from: b, reason: collision with root package name */
    public String f36723b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f36724c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f36725d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f36726e;

    /* renamed from: f, reason: collision with root package name */
    public String f36727f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f36728g;

    public /* synthetic */ dc0(int i13) {
        this();
    }

    private dc0() {
        this.f36728g = new boolean[6];
    }

    private dc0(@NonNull gc0 gc0Var) {
        String str;
        String str2;
        Integer num;
        Integer num2;
        Integer num3;
        String str3;
        str = gc0Var.f38034a;
        this.f36722a = str;
        str2 = gc0Var.f38035b;
        this.f36723b = str2;
        num = gc0Var.f38036c;
        this.f36724c = num;
        num2 = gc0Var.f38037d;
        this.f36725d = num2;
        num3 = gc0Var.f38038e;
        this.f36726e = num3;
        str3 = gc0Var.f38039f;
        this.f36727f = str3;
        boolean[] zArr = gc0Var.f38040g;
        this.f36728g = Arrays.copyOf(zArr, zArr.length);
    }
}
