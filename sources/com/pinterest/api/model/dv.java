package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class dv {

    /* renamed from: a, reason: collision with root package name */
    public yu f36967a;

    /* renamed from: b, reason: collision with root package name */
    public jy0 f36968b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f36969c;

    public /* synthetic */ dv(int i13) {
        this();
    }

    private dv() {
        this.f36969c = new boolean[2];
    }

    private dv(@NonNull gv gvVar) {
        yu yuVar;
        jy0 jy0Var;
        yuVar = gvVar.f38155a;
        this.f36967a = yuVar;
        jy0Var = gvVar.f38156b;
        this.f36968b = jy0Var;
        boolean[] zArr = gvVar.f38157c;
        this.f36969c = Arrays.copyOf(zArr, zArr.length);
    }
}
