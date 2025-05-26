package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ov0 {

    /* renamed from: a, reason: collision with root package name */
    public String f40818a;

    /* renamed from: b, reason: collision with root package name */
    public String f40819b;

    /* renamed from: c, reason: collision with root package name */
    public jv0 f40820c;

    /* renamed from: d, reason: collision with root package name */
    public nv0 f40821d;

    /* renamed from: e, reason: collision with root package name */
    public vv0 f40822e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f40823f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f40824g;

    public /* synthetic */ ov0(int i13) {
        this();
    }

    public final rv0 a() {
        return new rv0(this.f40818a, this.f40819b, this.f40820c, this.f40821d, this.f40822e, this.f40823f, this.f40824g, 0);
    }

    public /* synthetic */ ov0(rv0 rv0Var, int i13) {
        this(rv0Var);
    }

    private ov0() {
        this.f40824g = new boolean[6];
    }

    private ov0(@NonNull rv0 rv0Var) {
        String str;
        String str2;
        jv0 jv0Var;
        nv0 nv0Var;
        vv0 vv0Var;
        Integer num;
        str = rv0Var.f41683a;
        this.f40818a = str;
        str2 = rv0Var.f41684b;
        this.f40819b = str2;
        jv0Var = rv0Var.f41685c;
        this.f40820c = jv0Var;
        nv0Var = rv0Var.f41686d;
        this.f40821d = nv0Var;
        vv0Var = rv0Var.f41687e;
        this.f40822e = vv0Var;
        num = rv0Var.f41688f;
        this.f40823f = num;
        boolean[] zArr = rv0Var.f41689g;
        this.f40824g = Arrays.copyOf(zArr, zArr.length);
    }
}
