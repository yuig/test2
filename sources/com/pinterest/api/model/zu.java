package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zu {

    /* renamed from: a, reason: collision with root package name */
    public yu f44462a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f44463b;

    public /* synthetic */ zu(int i13) {
        this();
    }

    private zu() {
        this.f44463b = new boolean[1];
    }

    private zu(@NonNull cv cvVar) {
        yu yuVar;
        yuVar = cvVar.f36535a;
        this.f44462a = yuVar;
        boolean[] zArr = cvVar.f36536b;
        this.f44463b = Arrays.copyOf(zArr, zArr.length);
    }
}
