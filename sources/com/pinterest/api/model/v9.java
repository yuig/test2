package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/* loaded from: classes3.dex */
public final class v9 {

    /* renamed from: a, reason: collision with root package name */
    public String f42787a;

    /* renamed from: b, reason: collision with root package name */
    public String f42788b;

    /* renamed from: c, reason: collision with root package name */
    public g9 f42789c;

    /* renamed from: d, reason: collision with root package name */
    public Date f42790d;

    /* renamed from: e, reason: collision with root package name */
    public wy0 f42791e;

    /* renamed from: f, reason: collision with root package name */
    public List f42792f;

    /* renamed from: g, reason: collision with root package name */
    public Date f42793g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f42794h;

    public /* synthetic */ v9(int i13) {
        this();
    }

    private v9() {
        this.f42794h = new boolean[7];
    }

    private v9(@NonNull w9 w9Var) {
        String str;
        String str2;
        g9 g9Var;
        Date date;
        wy0 wy0Var;
        List list;
        Date date2;
        str = w9Var.f43191a;
        this.f42787a = str;
        str2 = w9Var.f43192b;
        this.f42788b = str2;
        g9Var = w9Var.f43193c;
        this.f42789c = g9Var;
        date = w9Var.f43194d;
        this.f42790d = date;
        wy0Var = w9Var.f43195e;
        this.f42791e = wy0Var;
        list = w9Var.f43196f;
        this.f42792f = list;
        date2 = w9Var.f43197g;
        this.f42793g = date2;
        boolean[] zArr = w9Var.f43198h;
        this.f42794h = Arrays.copyOf(zArr, zArr.length);
    }
}
