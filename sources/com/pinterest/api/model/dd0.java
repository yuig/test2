package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class dd0 {

    /* renamed from: a, reason: collision with root package name */
    public List f36734a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f36735b;

    public /* synthetic */ dd0(int i13) {
        this();
    }

    private dd0() {
        this.f36735b = new boolean[1];
    }

    private dd0(@NonNull gd0 gd0Var) {
        List list;
        list = gd0Var.f38046a;
        this.f36734a = list;
        boolean[] zArr = gd0Var.f38047b;
        this.f36735b = Arrays.copyOf(zArr, zArr.length);
    }
}
