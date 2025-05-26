package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class hb0 {

    /* renamed from: a, reason: collision with root package name */
    public String f38356a;

    /* renamed from: b, reason: collision with root package name */
    public String f38357b;

    /* renamed from: c, reason: collision with root package name */
    public String f38358c;

    /* renamed from: d, reason: collision with root package name */
    public rb0 f38359d;

    /* renamed from: e, reason: collision with root package name */
    public String f38360e;

    /* renamed from: f, reason: collision with root package name */
    public String f38361f;

    /* renamed from: g, reason: collision with root package name */
    public List f38362g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f38363h;

    public /* synthetic */ hb0(int i13) {
        this();
    }

    private hb0() {
        this.f38363h = new boolean[7];
    }

    private hb0(@NonNull kb0 kb0Var) {
        String str;
        String str2;
        String str3;
        rb0 rb0Var;
        String str4;
        String str5;
        List list;
        str = kb0Var.f39372a;
        this.f38356a = str;
        str2 = kb0Var.f39373b;
        this.f38357b = str2;
        str3 = kb0Var.f39374c;
        this.f38358c = str3;
        rb0Var = kb0Var.f39375d;
        this.f38359d = rb0Var;
        str4 = kb0Var.f39376e;
        this.f38360e = str4;
        str5 = kb0Var.f39377f;
        this.f38361f = str5;
        list = kb0Var.f39378g;
        this.f38362g = list;
        boolean[] zArr = kb0Var.f39379h;
        this.f38363h = Arrays.copyOf(zArr, zArr.length);
    }
}
