package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class is0 {

    /* renamed from: a, reason: collision with root package name */
    public String f38856a;

    /* renamed from: b, reason: collision with root package name */
    public String f38857b;

    /* renamed from: c, reason: collision with root package name */
    public List f38858c;

    /* renamed from: d, reason: collision with root package name */
    public List f38859d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f38860e;

    public /* synthetic */ is0(int i13) {
        this();
    }

    private is0() {
        this.f38860e = new boolean[4];
    }

    private is0(@NonNull ls0 ls0Var) {
        String str;
        String str2;
        List list;
        List list2;
        str = ls0Var.f39874a;
        this.f38856a = str;
        str2 = ls0Var.f39875b;
        this.f38857b = str2;
        list = ls0Var.f39876c;
        this.f38858c = list;
        list2 = ls0Var.f39877d;
        this.f38859d = list2;
        boolean[] zArr = ls0Var.f39878e;
        this.f38860e = Arrays.copyOf(zArr, zArr.length);
    }
}
