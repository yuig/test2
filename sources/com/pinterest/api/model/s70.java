package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class s70 {

    /* renamed from: a, reason: collision with root package name */
    public List f41825a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f41826b;

    public /* synthetic */ s70(int i13) {
        this();
    }

    private s70() {
        this.f41826b = new boolean[1];
    }

    private s70(@NonNull v70 v70Var) {
        List list;
        list = v70Var.f42777a;
        this.f41825a = list;
        boolean[] zArr = v70Var.f42778b;
        this.f41826b = Arrays.copyOf(zArr, zArr.length);
    }
}
