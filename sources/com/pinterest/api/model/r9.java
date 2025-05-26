package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class r9 {

    /* renamed from: a, reason: collision with root package name */
    public String f41516a;

    /* renamed from: b, reason: collision with root package name */
    public String f41517b;

    /* renamed from: c, reason: collision with root package name */
    public k9 f41518c;

    /* renamed from: d, reason: collision with root package name */
    public o9 f41519d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f41520e;

    public /* synthetic */ r9(int i13) {
        this();
    }

    private r9() {
        this.f41520e = new boolean[4];
    }

    private r9(@NonNull s9 s9Var) {
        String str;
        String str2;
        k9 k9Var;
        o9 o9Var;
        str = s9Var.f41827a;
        this.f41516a = str;
        str2 = s9Var.f41828b;
        this.f41517b = str2;
        k9Var = s9Var.f41829c;
        this.f41518c = k9Var;
        o9Var = s9Var.f41830d;
        this.f41519d = o9Var;
        boolean[] zArr = s9Var.f41831e;
        this.f41520e = Arrays.copyOf(zArr, zArr.length);
    }
}
