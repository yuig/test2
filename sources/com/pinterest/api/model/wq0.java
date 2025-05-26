package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class wq0 {

    /* renamed from: a, reason: collision with root package name */
    public Integer f43340a;

    /* renamed from: b, reason: collision with root package name */
    public zk0 f43341b;

    /* renamed from: c, reason: collision with root package name */
    public Double f43342c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f43343d;

    /* renamed from: e, reason: collision with root package name */
    public String f43344e;

    /* renamed from: f, reason: collision with root package name */
    public Double f43345f;

    /* renamed from: g, reason: collision with root package name */
    public String f43346g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f43347h;

    public /* synthetic */ wq0(int i13) {
        this();
    }

    private wq0() {
        this.f43347h = new boolean[7];
    }

    private wq0(@NonNull zq0 zq0Var) {
        Integer num;
        zk0 zk0Var;
        Double d2;
        Boolean bool;
        String str;
        Double d13;
        String str2;
        num = zq0Var.f44413a;
        this.f43340a = num;
        zk0Var = zq0Var.f44414b;
        this.f43341b = zk0Var;
        d2 = zq0Var.f44415c;
        this.f43342c = d2;
        bool = zq0Var.f44416d;
        this.f43343d = bool;
        str = zq0Var.f44417e;
        this.f43344e = str;
        d13 = zq0Var.f44418f;
        this.f43345f = d13;
        str2 = zq0Var.f44419g;
        this.f43346g = str2;
        boolean[] zArr = zq0Var.f44420h;
        this.f43347h = Arrays.copyOf(zArr, zArr.length);
    }
}
