package com.pinterest.api.model;

import androidx.annotation.NonNull;
import com.pinterest.api.model.mp0;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class lp0 {

    /* renamed from: a, reason: collision with root package name */
    public Integer f39853a;

    /* renamed from: b, reason: collision with root package name */
    public zk0 f39854b;

    /* renamed from: c, reason: collision with root package name */
    public Double f39855c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f39856d;

    /* renamed from: e, reason: collision with root package name */
    public String f39857e;

    /* renamed from: f, reason: collision with root package name */
    public Double f39858f;

    /* renamed from: g, reason: collision with root package name */
    public mp0.a f39859g;

    /* renamed from: h, reason: collision with root package name */
    public String f39860h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f39861i;

    public /* synthetic */ lp0(int i13) {
        this();
    }

    public final mp0 a() {
        return new mp0(this.f39853a, this.f39854b, this.f39855c, this.f39856d, this.f39857e, this.f39858f, this.f39859g, this.f39860h, this.f39861i, 0);
    }

    public /* synthetic */ lp0(mp0 mp0Var, int i13) {
        this(mp0Var);
    }

    private lp0() {
        this.f39861i = new boolean[8];
    }

    private lp0(@NonNull mp0 mp0Var) {
        Integer num;
        zk0 zk0Var;
        Double d2;
        Boolean bool;
        String str;
        Double d13;
        mp0.a aVar;
        String str2;
        num = mp0Var.f40175a;
        this.f39853a = num;
        zk0Var = mp0Var.f40176b;
        this.f39854b = zk0Var;
        d2 = mp0Var.f40177c;
        this.f39855c = d2;
        bool = mp0Var.f40178d;
        this.f39856d = bool;
        str = mp0Var.f40179e;
        this.f39857e = str;
        d13 = mp0Var.f40180f;
        this.f39858f = d13;
        aVar = mp0Var.f40181g;
        this.f39859g = aVar;
        str2 = mp0Var.f40182h;
        this.f39860h = str2;
        boolean[] zArr = mp0Var.f40183i;
        this.f39861i = Arrays.copyOf(zArr, zArr.length);
    }
}
