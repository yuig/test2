package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class p50 {

    /* renamed from: a, reason: collision with root package name */
    public Double f40882a;

    /* renamed from: b, reason: collision with root package name */
    public Double f40883b;

    /* renamed from: c, reason: collision with root package name */
    public String f40884c;

    /* renamed from: d, reason: collision with root package name */
    public List f40885d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f40886e;

    /* renamed from: f, reason: collision with root package name */
    public Double f40887f;

    /* renamed from: g, reason: collision with root package name */
    public Double f40888g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f40889h;

    public /* synthetic */ p50(int i13) {
        this();
    }

    private p50() {
        this.f40889h = new boolean[7];
    }

    private p50(@NonNull s50 s50Var) {
        Double d2;
        Double d13;
        String str;
        List list;
        Boolean bool;
        Double d14;
        Double d15;
        d2 = s50Var.f41783a;
        this.f40882a = d2;
        d13 = s50Var.f41784b;
        this.f40883b = d13;
        str = s50Var.f41785c;
        this.f40884c = str;
        list = s50Var.f41786d;
        this.f40885d = list;
        bool = s50Var.f41787e;
        this.f40886e = bool;
        d14 = s50Var.f41788f;
        this.f40887f = d14;
        d15 = s50Var.f41789g;
        this.f40888g = d15;
        boolean[] zArr = s50Var.f41790h;
        this.f40889h = Arrays.copyOf(zArr, zArr.length);
    }
}
