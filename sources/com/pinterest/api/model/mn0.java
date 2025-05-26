package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class mn0 {

    /* renamed from: a, reason: collision with root package name */
    public Integer f40167a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f40168b;

    /* renamed from: c, reason: collision with root package name */
    public String f40169c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f40170d;

    public /* synthetic */ mn0(int i13) {
        this();
    }

    private mn0() {
        this.f40170d = new boolean[3];
    }

    private mn0(@NonNull pn0 pn0Var) {
        Integer num;
        Integer num2;
        String str;
        num = pn0Var.f41032a;
        this.f40167a = num;
        num2 = pn0Var.f41033b;
        this.f40168b = num2;
        str = pn0Var.f41034c;
        this.f40169c = str;
        boolean[] zArr = pn0Var.f41035d;
        this.f40170d = Arrays.copyOf(zArr, zArr.length);
    }
}
