package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class yl {

    /* renamed from: a, reason: collision with root package name */
    public List f44070a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f44071b;

    public /* synthetic */ yl(int i13) {
        this();
    }

    private yl() {
        this.f44071b = new boolean[1];
    }

    private yl(@NonNull em emVar) {
        List list;
        list = emVar.f37302a;
        this.f44070a = list;
        boolean[] zArr = emVar.f37303b;
        this.f44071b = Arrays.copyOf(zArr, zArr.length);
    }
}
