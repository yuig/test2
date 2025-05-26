package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class mq0 {

    /* renamed from: a, reason: collision with root package name */
    public Integer f40191a;

    /* renamed from: b, reason: collision with root package name */
    public zk0 f40192b;

    /* renamed from: c, reason: collision with root package name */
    public String f40193c;

    /* renamed from: d, reason: collision with root package name */
    public vq0 f40194d;

    /* renamed from: e, reason: collision with root package name */
    public String f40195e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f40196f;

    public /* synthetic */ mq0(int i13) {
        this();
    }

    private mq0() {
        this.f40196f = new boolean[5];
    }

    private mq0(@NonNull pq0 pq0Var) {
        Integer num;
        zk0 zk0Var;
        String str;
        vq0 vq0Var;
        String str2;
        num = pq0Var.f41058a;
        this.f40191a = num;
        zk0Var = pq0Var.f41059b;
        this.f40192b = zk0Var;
        str = pq0Var.f41060c;
        this.f40193c = str;
        vq0Var = pq0Var.f41061d;
        this.f40194d = vq0Var;
        str2 = pq0Var.f41062e;
        this.f40195e = str2;
        boolean[] zArr = pq0Var.f41063f;
        this.f40196f = Arrays.copyOf(zArr, zArr.length);
    }
}
