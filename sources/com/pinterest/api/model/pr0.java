package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class pr0 {

    /* renamed from: a, reason: collision with root package name */
    public List f41070a;

    /* renamed from: b, reason: collision with root package name */
    public String f41071b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f41072c;

    public /* synthetic */ pr0(int i13) {
        this();
    }

    private pr0() {
        this.f41072c = new boolean[2];
    }

    private pr0(@NonNull sr0 sr0Var) {
        List list;
        String str;
        list = sr0Var.f41976a;
        this.f41070a = list;
        str = sr0Var.f41977b;
        this.f41071b = str;
        boolean[] zArr = sr0Var.f41978c;
        this.f41072c = Arrays.copyOf(zArr, zArr.length);
    }
}
