package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public String f37019a;

    /* renamed from: b, reason: collision with root package name */
    public List f37020b;

    /* renamed from: c, reason: collision with root package name */
    public String f37021c;

    /* renamed from: d, reason: collision with root package name */
    public String f37022d;

    /* renamed from: e, reason: collision with root package name */
    public String f37023e;

    /* renamed from: f, reason: collision with root package name */
    public Double f37024f;

    /* renamed from: g, reason: collision with root package name */
    public String f37025g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f37026h;

    public /* synthetic */ e1(int i13) {
        this();
    }

    private e1() {
        this.f37026h = new boolean[7];
    }

    private e1(@NonNull f1 f1Var) {
        String str;
        List list;
        String str2;
        String str3;
        String str4;
        Double d2;
        String str5;
        str = f1Var.f37403a;
        this.f37019a = str;
        list = f1Var.f37404b;
        this.f37020b = list;
        str2 = f1Var.f37405c;
        this.f37021c = str2;
        str3 = f1Var.f37406d;
        this.f37022d = str3;
        str4 = f1Var.f37407e;
        this.f37023e = str4;
        d2 = f1Var.f37408f;
        this.f37024f = d2;
        str5 = f1Var.f37409g;
        this.f37025g = str5;
        boolean[] zArr = f1Var.f37410h;
        this.f37026h = Arrays.copyOf(zArr, zArr.length);
    }
}
