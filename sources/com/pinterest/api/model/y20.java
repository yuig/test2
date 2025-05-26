package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class y20 {

    /* renamed from: a, reason: collision with root package name */
    public String f43904a;

    /* renamed from: b, reason: collision with root package name */
    public String f43905b;

    /* renamed from: c, reason: collision with root package name */
    public String f43906c;

    /* renamed from: d, reason: collision with root package name */
    public String f43907d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f43908e;

    public /* synthetic */ y20(int i13) {
        this();
    }

    private y20() {
        this.f43908e = new boolean[4];
    }

    private y20(@NonNull b30 b30Var) {
        String str;
        String str2;
        String str3;
        String str4;
        str = b30Var.f35956a;
        this.f43904a = str;
        str2 = b30Var.f35957b;
        this.f43905b = str2;
        str3 = b30Var.f35958c;
        this.f43906c = str3;
        str4 = b30Var.f35959d;
        this.f43907d = str4;
        boolean[] zArr = b30Var.f35960e;
        this.f43908e = Arrays.copyOf(zArr, zArr.length);
    }
}
