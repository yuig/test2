package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class t5 {

    /* renamed from: a, reason: collision with root package name */
    public String f42090a;

    /* renamed from: b, reason: collision with root package name */
    public String f42091b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f42092c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f42093d;

    /* renamed from: e, reason: collision with root package name */
    public List f42094e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f42095f;

    /* renamed from: g, reason: collision with root package name */
    public List f42096g;

    /* renamed from: h, reason: collision with root package name */
    public List f42097h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f42098i;

    public /* synthetic */ t5(int i13) {
        this();
    }

    private t5() {
        this.f42098i = new boolean[8];
    }

    private t5(@NonNull u5 u5Var) {
        String str;
        String str2;
        Boolean bool;
        Boolean bool2;
        List list;
        Boolean bool3;
        List list2;
        List list3;
        str = u5Var.f42408a;
        this.f42090a = str;
        str2 = u5Var.f42409b;
        this.f42091b = str2;
        bool = u5Var.f42410c;
        this.f42092c = bool;
        bool2 = u5Var.f42411d;
        this.f42093d = bool2;
        list = u5Var.f42412e;
        this.f42094e = list;
        bool3 = u5Var.f42413f;
        this.f42095f = bool3;
        list2 = u5Var.f42414g;
        this.f42096g = list2;
        list3 = u5Var.f42415h;
        this.f42097h = list3;
        boolean[] zArr = u5Var.f42416i;
        this.f42098i = Arrays.copyOf(zArr, zArr.length);
    }
}
