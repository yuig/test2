package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class kr0 {

    /* renamed from: a, reason: collision with root package name */
    public String f39518a;

    /* renamed from: b, reason: collision with root package name */
    public List f39519b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f39520c;

    public /* synthetic */ kr0(int i13) {
        this();
    }

    private kr0() {
        this.f39520c = new boolean[2];
    }

    private kr0(@NonNull nr0 nr0Var) {
        String str;
        List list;
        str = nr0Var.f40469a;
        this.f39518a = str;
        list = nr0Var.f40470b;
        this.f39519b = list;
        boolean[] zArr = nr0Var.f40471c;
        this.f39520c = Arrays.copyOf(zArr, zArr.length);
    }
}
