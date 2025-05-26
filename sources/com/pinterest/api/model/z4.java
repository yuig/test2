package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class z4 {

    /* renamed from: a, reason: collision with root package name */
    public List f44209a;

    /* renamed from: b, reason: collision with root package name */
    public List f44210b;

    /* renamed from: c, reason: collision with root package name */
    public w4 f44211c;

    /* renamed from: d, reason: collision with root package name */
    public w4 f44212d;

    /* renamed from: e, reason: collision with root package name */
    public i5 f44213e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f44214f;

    public /* synthetic */ z4(int i13) {
        this();
    }

    private z4() {
        this.f44214f = new boolean[5];
    }

    private z4(@NonNull a5 a5Var) {
        List list;
        List list2;
        w4 w4Var;
        w4 w4Var2;
        i5 i5Var;
        list = a5Var.f35651a;
        this.f44209a = list;
        list2 = a5Var.f35652b;
        this.f44210b = list2;
        w4Var = a5Var.f35653c;
        this.f44211c = w4Var;
        w4Var2 = a5Var.f35654d;
        this.f44212d = w4Var2;
        i5Var = a5Var.f35655e;
        this.f44213e = i5Var;
        boolean[] zArr = a5Var.f35656f;
        this.f44214f = Arrays.copyOf(zArr, zArr.length);
    }
}
