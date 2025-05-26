package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class ry0 {

    /* renamed from: a, reason: collision with root package name */
    public String f41722a;

    /* renamed from: b, reason: collision with root package name */
    public String f41723b;

    /* renamed from: c, reason: collision with root package name */
    public List f41724c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f41725d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f41726e;

    public /* synthetic */ ry0(int i13) {
        this();
    }

    private ry0() {
        this.f41726e = new boolean[4];
    }

    private ry0(@NonNull uy0 uy0Var) {
        String str;
        String str2;
        List list;
        Integer num;
        str = uy0Var.f42675a;
        this.f41722a = str;
        str2 = uy0Var.f42676b;
        this.f41723b = str2;
        list = uy0Var.f42677c;
        this.f41724c = list;
        num = uy0Var.f42678d;
        this.f41725d = num;
        boolean[] zArr = uy0Var.f42679e;
        this.f41726e = Arrays.copyOf(zArr, zArr.length);
    }
}
