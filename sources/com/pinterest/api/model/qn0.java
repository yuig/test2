package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class qn0 {

    /* renamed from: a, reason: collision with root package name */
    public List f41344a;

    /* renamed from: b, reason: collision with root package name */
    public String f41345b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f41346c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f41347d;

    public /* synthetic */ qn0(int i13) {
        this();
    }

    private qn0() {
        this.f41347d = new boolean[3];
    }

    private qn0(@NonNull tn0 tn0Var) {
        List list;
        String str;
        Integer num;
        list = tn0Var.f42247a;
        this.f41344a = list;
        str = tn0Var.f42248b;
        this.f41345b = str;
        num = tn0Var.f42249c;
        this.f41346c = num;
        boolean[] zArr = tn0Var.f42250d;
        this.f41347d = Arrays.copyOf(zArr, zArr.length);
    }
}
