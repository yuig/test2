package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class v4 {

    /* renamed from: a, reason: collision with root package name */
    public List f42726a;

    /* renamed from: b, reason: collision with root package name */
    public List f42727b;

    /* renamed from: c, reason: collision with root package name */
    public i5 f42728c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f42729d;

    public /* synthetic */ v4(int i13) {
        this();
    }

    private v4() {
        this.f42729d = new boolean[3];
    }

    private v4(@NonNull w4 w4Var) {
        List list;
        List list2;
        i5 i5Var;
        list = w4Var.f43166a;
        this.f42726a = list;
        list2 = w4Var.f43167b;
        this.f42727b = list2;
        i5Var = w4Var.f43168c;
        this.f42728c = i5Var;
        boolean[] zArr = w4Var.f43169d;
        this.f42729d = Arrays.copyOf(zArr, zArr.length);
    }
}
