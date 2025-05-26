package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes3.dex */
public final class lg {

    /* renamed from: a, reason: collision with root package name */
    public Map f39746a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f39747b;

    public /* synthetic */ lg(int i13) {
        this();
    }

    private lg() {
        this.f39747b = new boolean[1];
    }

    private lg(@NonNull og ogVar) {
        Map map;
        map = ogVar.f40700a;
        this.f39746a = map;
        boolean[] zArr = ogVar.f40701b;
        this.f39747b = Arrays.copyOf(zArr, zArr.length);
    }
}
