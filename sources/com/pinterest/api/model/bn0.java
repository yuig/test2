package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class bn0 {

    /* renamed from: a, reason: collision with root package name */
    public List f36132a;

    /* renamed from: b, reason: collision with root package name */
    public String f36133b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f36134c;

    public /* synthetic */ bn0(int i13) {
        this();
    }

    private bn0() {
        this.f36134c = new boolean[2];
    }

    private bn0(@NonNull en0 en0Var) {
        List list;
        String str;
        list = en0Var.f37312a;
        this.f36132a = list;
        str = en0Var.f37313b;
        this.f36133b = str;
        boolean[] zArr = en0Var.f37314c;
        this.f36134c = Arrays.copyOf(zArr, zArr.length);
    }
}
