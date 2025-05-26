package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class rd0 {

    /* renamed from: a, reason: collision with root package name */
    public Double f41551a;

    /* renamed from: b, reason: collision with root package name */
    public Double f41552b;

    /* renamed from: c, reason: collision with root package name */
    public Double f41553c;

    /* renamed from: d, reason: collision with root package name */
    public Double f41554d;

    /* renamed from: e, reason: collision with root package name */
    public Double f41555e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f41556f;

    public /* synthetic */ rd0(int i13) {
        this();
    }

    private rd0() {
        this.f41556f = new boolean[5];
    }

    private rd0(@NonNull ud0 ud0Var) {
        Double d2;
        Double d13;
        Double d14;
        Double d15;
        Double d16;
        d2 = ud0Var.f42518a;
        this.f41551a = d2;
        d13 = ud0Var.f42519b;
        this.f41552b = d13;
        d14 = ud0Var.f42520c;
        this.f41553c = d14;
        d15 = ud0Var.f42521d;
        this.f41554d = d15;
        d16 = ud0Var.f42522e;
        this.f41555e = d16;
        boolean[] zArr = ud0Var.f42523f;
        this.f41556f = Arrays.copyOf(zArr, zArr.length);
    }
}
