package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/* loaded from: classes3.dex */
public final class j9 {

    /* renamed from: a, reason: collision with root package name */
    public String f39004a;

    /* renamed from: b, reason: collision with root package name */
    public String f39005b;

    /* renamed from: c, reason: collision with root package name */
    public g9 f39006c;

    /* renamed from: d, reason: collision with root package name */
    public Date f39007d;

    /* renamed from: e, reason: collision with root package name */
    public wy0 f39008e;

    /* renamed from: f, reason: collision with root package name */
    public List f39009f;

    /* renamed from: g, reason: collision with root package name */
    public Date f39010g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f39011h;

    public /* synthetic */ j9(int i13) {
        this();
    }

    private j9() {
        this.f39011h = new boolean[7];
    }

    private j9(@NonNull k9 k9Var) {
        String str;
        String str2;
        g9 g9Var;
        Date date;
        wy0 wy0Var;
        List list;
        Date date2;
        str = k9Var.f39338a;
        this.f39004a = str;
        str2 = k9Var.f39339b;
        this.f39005b = str2;
        g9Var = k9Var.f39340c;
        this.f39006c = g9Var;
        date = k9Var.f39341d;
        this.f39007d = date;
        wy0Var = k9Var.f39342e;
        this.f39008e = wy0Var;
        list = k9Var.f39343f;
        this.f39009f = list;
        date2 = k9Var.f39344g;
        this.f39010g = date2;
        boolean[] zArr = k9Var.f39345h;
        this.f39011h = Arrays.copyOf(zArr, zArr.length);
    }
}
