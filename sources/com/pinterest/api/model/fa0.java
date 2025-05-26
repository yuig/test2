package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class fa0 {

    /* renamed from: a, reason: collision with root package name */
    public String f37632a;

    /* renamed from: b, reason: collision with root package name */
    public String f37633b;

    /* renamed from: c, reason: collision with root package name */
    public String f37634c;

    /* renamed from: d, reason: collision with root package name */
    public cb0 f37635d;

    /* renamed from: e, reason: collision with root package name */
    public List f37636e;

    /* renamed from: f, reason: collision with root package name */
    public ya0 f37637f;

    /* renamed from: g, reason: collision with root package name */
    public List f37638g;

    /* renamed from: h, reason: collision with root package name */
    public String f37639h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f37640i;

    public /* synthetic */ fa0(int i13) {
        this();
    }

    private fa0() {
        this.f37640i = new boolean[8];
    }

    private fa0(@NonNull ia0 ia0Var) {
        String str;
        String str2;
        String str3;
        cb0 cb0Var;
        List list;
        ya0 ya0Var;
        List list2;
        String str4;
        str = ia0Var.f38710a;
        this.f37632a = str;
        str2 = ia0Var.f38711b;
        this.f37633b = str2;
        str3 = ia0Var.f38712c;
        this.f37634c = str3;
        cb0Var = ia0Var.f38713d;
        this.f37635d = cb0Var;
        list = ia0Var.f38714e;
        this.f37636e = list;
        ya0Var = ia0Var.f38715f;
        this.f37637f = ya0Var;
        list2 = ia0Var.f38716g;
        this.f37638g = list2;
        str4 = ia0Var.f38717h;
        this.f37639h = str4;
        boolean[] zArr = ia0Var.f38718i;
        this.f37640i = Arrays.copyOf(zArr, zArr.length);
    }
}
