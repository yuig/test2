package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class uc0 {

    /* renamed from: a, reason: collision with root package name */
    public String f42509a;

    /* renamed from: b, reason: collision with root package name */
    public String f42510b;

    /* renamed from: c, reason: collision with root package name */
    public String f42511c;

    /* renamed from: d, reason: collision with root package name */
    public String f42512d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f42513e;

    public /* synthetic */ uc0(int i13) {
        this();
    }

    private uc0() {
        this.f42513e = new boolean[4];
    }

    private uc0(@NonNull xc0 xc0Var) {
        String str;
        String str2;
        String str3;
        String str4;
        str = xc0Var.f43648a;
        this.f42509a = str;
        str2 = xc0Var.f43649b;
        this.f42510b = str2;
        str3 = xc0Var.f43650c;
        this.f42511c = str3;
        str4 = xc0Var.f43651d;
        this.f42512d = str4;
        boolean[] zArr = xc0Var.f43652e;
        this.f42513e = Arrays.copyOf(zArr, zArr.length);
    }
}
