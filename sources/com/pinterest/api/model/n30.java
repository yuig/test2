package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class n30 {

    /* renamed from: a, reason: collision with root package name */
    public String f40307a;

    /* renamed from: b, reason: collision with root package name */
    public String f40308b;

    /* renamed from: c, reason: collision with root package name */
    public List f40309c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f40310d;

    /* renamed from: e, reason: collision with root package name */
    public List f40311e;

    /* renamed from: f, reason: collision with root package name */
    public List f40312f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f40313g;

    public /* synthetic */ n30(int i13) {
        this();
    }

    private n30() {
        this.f40313g = new boolean[6];
    }

    private n30(@NonNull q30 q30Var) {
        String str;
        String str2;
        List list;
        Integer num;
        List list2;
        List list3;
        str = q30Var.f41201a;
        this.f40307a = str;
        str2 = q30Var.f41202b;
        this.f40308b = str2;
        list = q30Var.f41203c;
        this.f40309c = list;
        num = q30Var.f41204d;
        this.f40310d = num;
        list2 = q30Var.f41205e;
        this.f40311e = list2;
        list3 = q30Var.f41206f;
        this.f40312f = list3;
        boolean[] zArr = q30Var.f41207g;
        this.f40313g = Arrays.copyOf(zArr, zArr.length);
    }
}
