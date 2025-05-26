package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ur {

    /* renamed from: a, reason: collision with root package name */
    public fs f42625a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f42626b;

    public /* synthetic */ ur(int i13) {
        this();
    }

    private ur() {
        this.f42626b = new boolean[1];
    }

    private ur(@NonNull xr xrVar) {
        fs fsVar;
        fsVar = xrVar.f43772a;
        this.f42625a = fsVar;
        boolean[] zArr = xrVar.f43773b;
        this.f42626b = Arrays.copyOf(zArr, zArr.length);
    }
}
