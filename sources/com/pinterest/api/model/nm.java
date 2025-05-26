package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class nm {

    /* renamed from: a, reason: collision with root package name */
    public List f40436a;

    /* renamed from: b, reason: collision with root package name */
    public String f40437b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f40438c;

    public /* synthetic */ nm(int i13) {
        this();
    }

    private nm() {
        this.f40438c = new boolean[2];
    }

    private nm(@NonNull pm pmVar) {
        List list;
        String str;
        list = pmVar.f41019a;
        this.f40436a = list;
        str = pmVar.f41020b;
        this.f40437b = str;
        boolean[] zArr = pmVar.f41021c;
        this.f40438c = Arrays.copyOf(zArr, zArr.length);
    }
}
