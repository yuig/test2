package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class hc0 {

    /* renamed from: a, reason: collision with root package name */
    public String f38369a;

    /* renamed from: b, reason: collision with root package name */
    public String f38370b;

    /* renamed from: c, reason: collision with root package name */
    public p0 f38371c;

    /* renamed from: d, reason: collision with root package name */
    public v2 f38372d;

    /* renamed from: e, reason: collision with root package name */
    public List f38373e;

    /* renamed from: f, reason: collision with root package name */
    public kf f38374f;

    /* renamed from: g, reason: collision with root package name */
    public List f38375g;

    /* renamed from: h, reason: collision with root package name */
    public Boolean f38376h;

    /* renamed from: i, reason: collision with root package name */
    public String f38377i;

    /* renamed from: j, reason: collision with root package name */
    public th0 f38378j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean[] f38379k;

    public /* synthetic */ hc0(int i13) {
        this();
    }

    private hc0() {
        this.f38379k = new boolean[10];
    }

    private hc0(@NonNull kc0 kc0Var) {
        String str;
        String str2;
        p0 p0Var;
        v2 v2Var;
        List list;
        kf kfVar;
        List list2;
        Boolean bool;
        String str3;
        th0 th0Var;
        str = kc0Var.f39385a;
        this.f38369a = str;
        str2 = kc0Var.f39386b;
        this.f38370b = str2;
        p0Var = kc0Var.f39387c;
        this.f38371c = p0Var;
        v2Var = kc0Var.f39388d;
        this.f38372d = v2Var;
        list = kc0Var.f39389e;
        this.f38373e = list;
        kfVar = kc0Var.f39390f;
        this.f38374f = kfVar;
        list2 = kc0Var.f39391g;
        this.f38375g = list2;
        bool = kc0Var.f39392h;
        this.f38376h = bool;
        str3 = kc0Var.f39393i;
        this.f38377i = str3;
        th0Var = kc0Var.f39394j;
        this.f38378j = th0Var;
        boolean[] zArr = kc0Var.f39395k;
        this.f38379k = Arrays.copyOf(zArr, zArr.length);
    }
}
