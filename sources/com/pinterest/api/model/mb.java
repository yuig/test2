package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class mb {

    /* renamed from: a, reason: collision with root package name */
    public List f40048a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f40049b;

    public /* synthetic */ mb(int i13) {
        this();
    }

    private mb() {
        this.f40049b = new boolean[1];
    }

    private mb(@NonNull pb pbVar) {
        List list;
        list = pbVar.f40931a;
        this.f40048a = list;
        boolean[] zArr = pbVar.f40932b;
        this.f40049b = Arrays.copyOf(zArr, zArr.length);
    }
}
