package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class uh0 {

    /* renamed from: a, reason: collision with root package name */
    public String f42566a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f42567b;

    /* renamed from: c, reason: collision with root package name */
    public String f42568c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f42569d;

    public /* synthetic */ uh0(int i13) {
        this();
    }

    public final void a(String str) {
        this.f42568c = str;
        boolean[] zArr = this.f42569d;
        if (zArr.length > 2) {
            zArr[2] = true;
        }
    }

    private uh0() {
        this.f42569d = new boolean[3];
    }

    private uh0(@NonNull xh0 xh0Var) {
        String str;
        Integer num;
        String str2;
        str = xh0Var.f43688a;
        this.f42566a = str;
        num = xh0Var.f43689b;
        this.f42567b = num;
        str2 = xh0Var.f43690c;
        this.f42568c = str2;
        boolean[] zArr = xh0Var.f43691d;
        this.f42569d = Arrays.copyOf(zArr, zArr.length);
    }
}
