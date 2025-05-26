package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class wt0 {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f43373a;

    /* renamed from: b, reason: collision with root package name */
    public List f43374b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f43375c;

    public /* synthetic */ wt0(int i13) {
        this();
    }

    private wt0() {
        this.f43375c = new boolean[2];
    }

    private wt0(@NonNull zt0 zt0Var) {
        Boolean bool;
        List list;
        bool = zt0Var.f44459a;
        this.f43373a = bool;
        list = zt0Var.f44460b;
        this.f43374b = list;
        boolean[] zArr = zt0Var.f44461c;
        this.f43375c = Arrays.copyOf(zArr, zArr.length);
    }
}
