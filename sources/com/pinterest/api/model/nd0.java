package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class nd0 {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f40388a;

    /* renamed from: b, reason: collision with root package name */
    public String f40389b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f40390c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f40391d;

    public /* synthetic */ nd0(int i13) {
        this();
    }

    private nd0() {
        this.f40391d = new boolean[3];
    }

    private nd0(@NonNull qd0 qd0Var) {
        Boolean bool;
        String str;
        Integer num;
        bool = qd0Var.f41274a;
        this.f40388a = bool;
        str = qd0Var.f41275b;
        this.f40389b = str;
        num = qd0Var.f41276c;
        this.f40390c = num;
        boolean[] zArr = qd0Var.f41277d;
        this.f40391d = Arrays.copyOf(zArr, zArr.length);
    }
}
