package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class us0 {

    /* renamed from: a, reason: collision with root package name */
    public String f42635a;

    /* renamed from: b, reason: collision with root package name */
    public String f42636b;

    /* renamed from: c, reason: collision with root package name */
    public String f42637c;

    /* renamed from: d, reason: collision with root package name */
    public bt0 f42638d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f42639e;

    public /* synthetic */ us0(int i13) {
        this();
    }

    private us0() {
        this.f42639e = new boolean[4];
    }

    private us0(@NonNull xs0 xs0Var) {
        String str;
        String str2;
        String str3;
        bt0 bt0Var;
        str = xs0Var.f43784a;
        this.f42635a = str;
        str2 = xs0Var.f43785b;
        this.f42636b = str2;
        str3 = xs0Var.f43786c;
        this.f42637c = str3;
        bt0Var = xs0Var.f43787d;
        this.f42638d = bt0Var;
        boolean[] zArr = xs0Var.f43788e;
        this.f42639e = Arrays.copyOf(zArr, zArr.length);
    }
}
