package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ct0 {

    /* renamed from: a, reason: collision with root package name */
    public String f36516a;

    /* renamed from: b, reason: collision with root package name */
    public String f36517b;

    /* renamed from: c, reason: collision with root package name */
    public String f36518c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f36519d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f36520e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f36521f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f36522g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f36523h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f36524i;

    public /* synthetic */ ct0(int i13) {
        this();
    }

    private ct0() {
        this.f36524i = new boolean[8];
    }

    private ct0(@NonNull ft0 ft0Var) {
        String str;
        String str2;
        String str3;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        str = ft0Var.f37800a;
        this.f36516a = str;
        str2 = ft0Var.f37801b;
        this.f36517b = str2;
        str3 = ft0Var.f37802c;
        this.f36518c = str3;
        num = ft0Var.f37803d;
        this.f36519d = num;
        num2 = ft0Var.f37804e;
        this.f36520e = num2;
        num3 = ft0Var.f37805f;
        this.f36521f = num3;
        num4 = ft0Var.f37806g;
        this.f36522g = num4;
        num5 = ft0Var.f37807h;
        this.f36523h = num5;
        boolean[] zArr = ft0Var.f37808i;
        this.f36524i = Arrays.copyOf(zArr, zArr.length);
    }
}
