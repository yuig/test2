package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes3.dex */
public final class qu {

    /* renamed from: a, reason: collision with root package name */
    public String f41375a;

    /* renamed from: b, reason: collision with root package name */
    public Map f41376b;

    /* renamed from: c, reason: collision with root package name */
    public String f41377c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f41378d;

    public /* synthetic */ qu(int i13) {
        this();
    }

    private qu() {
        this.f41378d = new boolean[3];
    }

    private qu(@NonNull tu tuVar) {
        String str;
        Map map;
        String str2;
        str = tuVar.f42299a;
        this.f41375a = str;
        map = tuVar.f42300b;
        this.f41376b = map;
        str2 = tuVar.f42301c;
        this.f41377c = str2;
        boolean[] zArr = tuVar.f42302d;
        this.f41378d = Arrays.copyOf(zArr, zArr.length);
    }
}
