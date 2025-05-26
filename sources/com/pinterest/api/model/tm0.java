package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class tm0 {

    /* renamed from: a, reason: collision with root package name */
    public Integer f42239a;

    /* renamed from: b, reason: collision with root package name */
    public String f42240b;

    /* renamed from: c, reason: collision with root package name */
    public String f42241c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f42242d;

    public /* synthetic */ tm0(int i13) {
        this();
    }

    private tm0() {
        this.f42242d = new boolean[3];
    }

    private tm0(@NonNull wm0 wm0Var) {
        Integer num;
        String str;
        String str2;
        num = wm0Var.f43291a;
        this.f42239a = num;
        str = wm0Var.f43292b;
        this.f42240b = str;
        str2 = wm0Var.f43293c;
        this.f42241c = str2;
        boolean[] zArr = wm0Var.f43294d;
        this.f42242d = Arrays.copyOf(zArr, zArr.length);
    }
}
