package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class nk0 {

    /* renamed from: a, reason: collision with root package name */
    public List f40429a;

    /* renamed from: b, reason: collision with root package name */
    public List f40430b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f40431c;

    public /* synthetic */ nk0(int i13) {
        this();
    }

    public final qk0 a() {
        return new qk0(this.f40429a, this.f40430b, this.f40431c, 0);
    }

    public final void b(List list) {
        this.f40429a = list;
        boolean[] zArr = this.f40431c;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
    }

    public final void c(List list) {
        this.f40430b = list;
        boolean[] zArr = this.f40431c;
        if (zArr.length > 1) {
            zArr[1] = true;
        }
    }

    private nk0() {
        this.f40431c = new boolean[2];
    }

    private nk0(@NonNull qk0 qk0Var) {
        List list;
        List list2;
        list = qk0Var.f41324a;
        this.f40429a = list;
        list2 = qk0Var.f41325b;
        this.f40430b = list2;
        boolean[] zArr = qk0Var.f41326c;
        this.f40431c = Arrays.copyOf(zArr, zArr.length);
    }
}
