package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class f50 {

    /* renamed from: a, reason: collision with root package name */
    public String f37567a;

    /* renamed from: b, reason: collision with root package name */
    public String f37568b;

    /* renamed from: c, reason: collision with root package name */
    public String f37569c;

    /* renamed from: d, reason: collision with root package name */
    public String f37570d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f37571e;

    public /* synthetic */ f50(int i13) {
        this();
    }

    private f50() {
        this.f37571e = new boolean[4];
    }

    private f50(@NonNull i50 i50Var) {
        String str;
        String str2;
        String str3;
        String str4;
        str = i50Var.f38673a;
        this.f37567a = str;
        str2 = i50Var.f38674b;
        this.f37568b = str2;
        str3 = i50Var.f38675c;
        this.f37569c = str3;
        str4 = i50Var.f38676d;
        this.f37570d = str4;
        boolean[] zArr = i50Var.f38677e;
        this.f37571e = Arrays.copyOf(zArr, zArr.length);
    }
}
