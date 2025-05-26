package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/* loaded from: classes3.dex */
public final class e80 {

    /* renamed from: a, reason: collision with root package name */
    public String f37205a;

    /* renamed from: b, reason: collision with root package name */
    public String f37206b;

    /* renamed from: c, reason: collision with root package name */
    public List f37207c;

    /* renamed from: d, reason: collision with root package name */
    public cb f37208d;

    /* renamed from: e, reason: collision with root package name */
    public Date f37209e;

    /* renamed from: f, reason: collision with root package name */
    public String f37210f;

    /* renamed from: g, reason: collision with root package name */
    public String f37211g;

    /* renamed from: h, reason: collision with root package name */
    public wz f37212h;

    /* renamed from: i, reason: collision with root package name */
    public List f37213i;

    /* renamed from: j, reason: collision with root package name */
    public xh0 f37214j;

    /* renamed from: k, reason: collision with root package name */
    public t80 f37215k;

    /* renamed from: l, reason: collision with root package name */
    public List f37216l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f37217m;

    public /* synthetic */ e80(int i13) {
        this();
    }

    public final h80 a() {
        return new h80(this.f37205a, this.f37206b, this.f37207c, this.f37208d, this.f37209e, this.f37210f, this.f37211g, this.f37212h, this.f37213i, this.f37214j, this.f37215k, this.f37216l, this.f37217m, 0);
    }

    private e80() {
        this.f37217m = new boolean[12];
    }

    private e80(@NonNull h80 h80Var) {
        String str;
        String str2;
        List list;
        cb cbVar;
        Date date;
        String str3;
        String str4;
        wz wzVar;
        List list2;
        xh0 xh0Var;
        t80 t80Var;
        List list3;
        str = h80Var.f38333a;
        this.f37205a = str;
        str2 = h80Var.f38334b;
        this.f37206b = str2;
        list = h80Var.f38335c;
        this.f37207c = list;
        cbVar = h80Var.f38336d;
        this.f37208d = cbVar;
        date = h80Var.f38337e;
        this.f37209e = date;
        str3 = h80Var.f38338f;
        this.f37210f = str3;
        str4 = h80Var.f38339g;
        this.f37211g = str4;
        wzVar = h80Var.f38340h;
        this.f37212h = wzVar;
        list2 = h80Var.f38341i;
        this.f37213i = list2;
        xh0Var = h80Var.f38342j;
        this.f37214j = xh0Var;
        t80Var = h80Var.f38343k;
        this.f37215k = t80Var;
        list3 = h80Var.f38344l;
        this.f37216l = list3;
        boolean[] zArr = h80Var.f38345m;
        this.f37217m = Arrays.copyOf(zArr, zArr.length);
    }
}
