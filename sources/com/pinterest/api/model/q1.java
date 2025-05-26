package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    public Double f41165a;

    /* renamed from: b, reason: collision with root package name */
    public Double f41166b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f41167c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f41168d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f41169e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f41170f;

    public /* synthetic */ q1(int i13) {
        this();
    }

    private q1() {
        this.f41170f = new boolean[5];
    }

    private q1(@NonNull r1 r1Var) {
        Double d2;
        Double d13;
        Integer num;
        Integer num2;
        Integer num3;
        d2 = r1Var.f41461a;
        this.f41165a = d2;
        d13 = r1Var.f41462b;
        this.f41166b = d13;
        num = r1Var.f41463c;
        this.f41167c = num;
        num2 = r1Var.f41464d;
        this.f41168d = num2;
        num3 = r1Var.f41465e;
        this.f41169e = num3;
        boolean[] zArr = r1Var.f41466f;
        this.f41170f = Arrays.copyOf(zArr, zArr.length);
    }
}
