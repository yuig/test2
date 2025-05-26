package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public final class lm0 {

    /* renamed from: a, reason: collision with root package name */
    public String f39821a;

    /* renamed from: b, reason: collision with root package name */
    public Map f39822b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f39823c;

    public /* synthetic */ lm0(int i13) {
        this();
    }

    private lm0() {
        this.f39823c = new boolean[2];
    }

    private lm0(@NonNull om0 om0Var) {
        String str;
        Map map;
        str = om0Var.f40756a;
        this.f39821a = str;
        map = om0Var.f40757b;
        this.f39822b = map;
        boolean[] zArr = om0Var.f40758c;
        this.f39823c = Arrays.copyOf(zArr, zArr.length);
    }
}
