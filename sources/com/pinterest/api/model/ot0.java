package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ot0 {

    /* renamed from: a, reason: collision with root package name */
    public String f40807a;

    /* renamed from: b, reason: collision with root package name */
    public String f40808b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f40809c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f40810d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f40811e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f40812f;

    public /* synthetic */ ot0(int i13) {
        this();
    }

    private ot0() {
        this.f40812f = new boolean[5];
    }

    private ot0(@NonNull rt0 rt0Var) {
        String str;
        String str2;
        Integer num;
        Integer num2;
        Integer num3;
        str = rt0Var.f41664a;
        this.f40807a = str;
        str2 = rt0Var.f41665b;
        this.f40808b = str2;
        num = rt0Var.f41666c;
        this.f40809c = num;
        num2 = rt0Var.f41667d;
        this.f40810d = num2;
        num3 = rt0Var.f41668e;
        this.f40811e = num3;
        boolean[] zArr = rt0Var.f41669f;
        this.f40812f = Arrays.copyOf(zArr, zArr.length);
    }
}
