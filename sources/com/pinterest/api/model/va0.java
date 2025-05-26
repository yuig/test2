package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class va0 {

    /* renamed from: a, reason: collision with root package name */
    public String f42802a;

    /* renamed from: b, reason: collision with root package name */
    public String f42803b;

    /* renamed from: c, reason: collision with root package name */
    public List f42804c;

    /* renamed from: d, reason: collision with root package name */
    public String f42805d;

    /* renamed from: e, reason: collision with root package name */
    public List f42806e;

    /* renamed from: f, reason: collision with root package name */
    public List f42807f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f42808g;

    public /* synthetic */ va0(int i13) {
        this();
    }

    private va0() {
        this.f42808g = new boolean[6];
    }

    private va0(@NonNull ya0 ya0Var) {
        String str;
        String str2;
        List list;
        String str3;
        List list2;
        List list3;
        str = ya0Var.f43988a;
        this.f42802a = str;
        str2 = ya0Var.f43989b;
        this.f42803b = str2;
        list = ya0Var.f43990c;
        this.f42804c = list;
        str3 = ya0Var.f43991d;
        this.f42805d = str3;
        list2 = ya0Var.f43992e;
        this.f42806e = list2;
        list3 = ya0Var.f43993f;
        this.f42807f = list3;
        boolean[] zArr = ya0Var.f43994g;
        this.f42808g = Arrays.copyOf(zArr, zArr.length);
    }
}
