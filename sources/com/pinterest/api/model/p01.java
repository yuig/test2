package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class p01 {

    /* renamed from: a, reason: collision with root package name */
    public List f40849a;

    /* renamed from: b, reason: collision with root package name */
    public uw f40850b;

    /* renamed from: c, reason: collision with root package name */
    public r70 f40851c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f40852d;

    public /* synthetic */ p01(int i13) {
        this();
    }

    private p01() {
        this.f40852d = new boolean[3];
    }

    private p01(@NonNull s01 s01Var) {
        List list;
        uw uwVar;
        r70 r70Var;
        list = s01Var.f41747a;
        this.f40849a = list;
        uwVar = s01Var.f41748b;
        this.f40850b = uwVar;
        r70Var = s01Var.f41749c;
        this.f40851c = r70Var;
        boolean[] zArr = s01Var.f41750d;
        this.f40852d = Arrays.copyOf(zArr, zArr.length);
    }
}
