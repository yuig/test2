package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class df {

    /* renamed from: a, reason: collision with root package name */
    public Integer f36817a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f36818b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f36819c;

    public /* synthetic */ df(int i13) {
        this();
    }

    private df() {
        this.f36819c = new boolean[2];
    }

    private df(@NonNull gf gfVar) {
        Integer num;
        Integer num2;
        num = gfVar.f38056a;
        this.f36817a = num;
        num2 = gfVar.f38057b;
        this.f36818b = num2;
        boolean[] zArr = gfVar.f38058c;
        this.f36819c = Arrays.copyOf(zArr, zArr.length);
    }
}
