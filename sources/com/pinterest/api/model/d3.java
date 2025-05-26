package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d3 {

    /* renamed from: a, reason: collision with root package name */
    public Integer f36642a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f36643b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f36644c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f36645d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f36646e;

    public /* synthetic */ d3(int i13) {
        this();
    }

    public /* synthetic */ d3(e3 e3Var, int i13) {
        this(e3Var);
    }

    private d3() {
        this.f36646e = new boolean[4];
    }

    private d3(@NonNull e3 e3Var) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        num = e3Var.f37057a;
        this.f36642a = num;
        num2 = e3Var.f37058b;
        this.f36643b = num2;
        num3 = e3Var.f37059c;
        this.f36644c = num3;
        num4 = e3Var.f37060d;
        this.f36645d = num4;
        boolean[] zArr = e3Var.f37061e;
        this.f36646e = Arrays.copyOf(zArr, zArr.length);
    }
}
