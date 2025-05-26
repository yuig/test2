package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public String f43857a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f43858b;

    public /* synthetic */ y(int i13) {
        this();
    }

    private y() {
        this.f43858b = new boolean[1];
    }

    private y(@NonNull z zVar) {
        String str;
        str = zVar.f44164a;
        this.f43857a = str;
        boolean[] zArr = zVar.f44165b;
        this.f43858b = Arrays.copyOf(zArr, zArr.length);
    }
}
