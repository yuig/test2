package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class o2 {

    /* renamed from: a, reason: collision with root package name */
    public List f40598a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f40599b;

    public /* synthetic */ o2(int i13) {
        this();
    }

    private o2() {
        this.f40599b = new boolean[1];
    }

    private o2(@NonNull p2 p2Var) {
        List list;
        list = p2Var.f40855a;
        this.f40598a = list;
        boolean[] zArr = p2Var.f40856b;
        this.f40599b = Arrays.copyOf(zArr, zArr.length);
    }
}
