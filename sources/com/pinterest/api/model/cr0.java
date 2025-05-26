package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class cr0 {

    /* renamed from: a, reason: collision with root package name */
    public zr0 f36496a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f36497b;

    /* renamed from: c, reason: collision with root package name */
    public zr0 f36498c;

    /* renamed from: d, reason: collision with root package name */
    public List f36499d;

    /* renamed from: e, reason: collision with root package name */
    public String f36500e;

    /* renamed from: f, reason: collision with root package name */
    public String f36501f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f36502g;

    public /* synthetic */ cr0(int i13) {
        this();
    }

    private cr0() {
        this.f36502g = new boolean[6];
    }

    private cr0(@NonNull fr0 fr0Var) {
        zr0 zr0Var;
        Boolean bool;
        zr0 zr0Var2;
        List list;
        String str;
        String str2;
        zr0Var = fr0Var.f37763a;
        this.f36496a = zr0Var;
        bool = fr0Var.f37764b;
        this.f36497b = bool;
        zr0Var2 = fr0Var.f37765c;
        this.f36498c = zr0Var2;
        list = fr0Var.f37766d;
        this.f36499d = list;
        str = fr0Var.f37767e;
        this.f36500e = str;
        str2 = fr0Var.f37768f;
        this.f36501f = str2;
        boolean[] zArr = fr0Var.f37769g;
        this.f36502g = Arrays.copyOf(zArr, zArr.length);
    }
}
