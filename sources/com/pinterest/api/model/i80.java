package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class i80 {

    /* renamed from: a, reason: collision with root package name */
    public List f38702a;

    /* renamed from: b, reason: collision with root package name */
    public w30 f38703b;

    /* renamed from: c, reason: collision with root package name */
    public k4 f38704c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f38705d;

    public /* synthetic */ i80(int i13) {
        this();
    }

    private i80() {
        this.f38705d = new boolean[3];
    }

    private i80(@NonNull l80 l80Var) {
        List list;
        w30 w30Var;
        k4 k4Var;
        list = l80Var.f39667a;
        this.f38702a = list;
        w30Var = l80Var.f39668b;
        this.f38703b = w30Var;
        k4Var = l80Var.f39669c;
        this.f38704c = k4Var;
        boolean[] zArr = l80Var.f39670d;
        this.f38705d = Arrays.copyOf(zArr, zArr.length);
    }
}
