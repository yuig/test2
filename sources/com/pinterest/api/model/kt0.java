package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class kt0 {

    /* renamed from: a, reason: collision with root package name */
    public String f39524a;

    /* renamed from: b, reason: collision with root package name */
    public String f39525b;

    /* renamed from: c, reason: collision with root package name */
    public List f39526c;

    /* renamed from: d, reason: collision with root package name */
    public List f39527d;

    /* renamed from: e, reason: collision with root package name */
    public List f39528e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f39529f;

    public /* synthetic */ kt0(int i13) {
        this();
    }

    private kt0() {
        this.f39529f = new boolean[5];
    }

    private kt0(@NonNull nt0 nt0Var) {
        String str;
        String str2;
        List list;
        List list2;
        List list3;
        str = nt0Var.f40479a;
        this.f39524a = str;
        str2 = nt0Var.f40480b;
        this.f39525b = str2;
        list = nt0Var.f40481c;
        this.f39526c = list;
        list2 = nt0Var.f40482d;
        this.f39527d = list2;
        list3 = nt0Var.f40483e;
        this.f39528e = list3;
        boolean[] zArr = nt0Var.f40484f;
        this.f39529f = Arrays.copyOf(zArr, zArr.length);
    }
}
