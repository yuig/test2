package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class hp0 {

    /* renamed from: a, reason: collision with root package name */
    public Integer f38511a;

    /* renamed from: b, reason: collision with root package name */
    public zk0 f38512b;

    /* renamed from: c, reason: collision with root package name */
    public iq0 f38513c;

    /* renamed from: d, reason: collision with root package name */
    public String f38514d;

    /* renamed from: e, reason: collision with root package name */
    public String f38515e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f38516f;

    public /* synthetic */ hp0(int i13) {
        this();
    }

    private hp0() {
        this.f38516f = new boolean[5];
    }

    private hp0(@NonNull kp0 kp0Var) {
        Integer num;
        zk0 zk0Var;
        iq0 iq0Var;
        String str;
        String str2;
        num = kp0Var.f39507a;
        this.f38511a = num;
        zk0Var = kp0Var.f39508b;
        this.f38512b = zk0Var;
        iq0Var = kp0Var.f39509c;
        this.f38513c = iq0Var;
        str = kp0Var.f39510d;
        this.f38514d = str;
        str2 = kp0Var.f39511e;
        this.f38515e = str2;
        boolean[] zArr = kp0Var.f39512f;
        this.f38516f = Arrays.copyOf(zArr, zArr.length);
    }
}
