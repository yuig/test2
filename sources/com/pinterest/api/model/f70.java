package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class f70 {

    /* renamed from: a, reason: collision with root package name */
    public String f37581a;

    /* renamed from: b, reason: collision with root package name */
    public String f37582b;

    /* renamed from: c, reason: collision with root package name */
    public List f37583c;

    /* renamed from: d, reason: collision with root package name */
    public List f37584d;

    /* renamed from: e, reason: collision with root package name */
    public List f37585e;

    /* renamed from: f, reason: collision with root package name */
    public List f37586f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f37587g;

    public /* synthetic */ f70(int i13) {
        this();
    }

    private f70() {
        this.f37587g = new boolean[6];
    }

    private f70(@NonNull i70 i70Var) {
        String str;
        String str2;
        List list;
        List list2;
        List list3;
        List list4;
        str = i70Var.f38688a;
        this.f37581a = str;
        str2 = i70Var.f38689b;
        this.f37582b = str2;
        list = i70Var.f38690c;
        this.f37583c = list;
        list2 = i70Var.f38691d;
        this.f37584d = list2;
        list3 = i70Var.f38692e;
        this.f37585e = list3;
        list4 = i70Var.f38693f;
        this.f37586f = list4;
        boolean[] zArr = i70Var.f38694g;
        this.f37587g = Arrays.copyOf(zArr, zArr.length);
    }
}
