package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class x8 {

    /* renamed from: a, reason: collision with root package name */
    public String f43615a;

    /* renamed from: b, reason: collision with root package name */
    public String f43616b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f43617c;

    public /* synthetic */ x8(int i13) {
        this();
    }

    private x8() {
        this.f43617c = new boolean[2];
    }

    private x8(@NonNull y8 y8Var) {
        String str;
        String str2;
        str = y8Var.f43970a;
        this.f43615a = str;
        str2 = y8Var.f43971b;
        this.f43616b = str2;
        boolean[] zArr = y8Var.f43972c;
        this.f43617c = Arrays.copyOf(zArr, zArr.length);
    }
}
