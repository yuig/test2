package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class x5 {

    /* renamed from: a, reason: collision with root package name */
    public String f43590a;

    /* renamed from: b, reason: collision with root package name */
    public String f43591b;

    /* renamed from: c, reason: collision with root package name */
    public List f43592c;

    /* renamed from: d, reason: collision with root package name */
    public String f43593d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f43594e;

    public /* synthetic */ x5(int i13) {
        this();
    }

    private x5() {
        this.f43594e = new boolean[4];
    }

    private x5(@NonNull y5 y5Var) {
        String str;
        String str2;
        List list;
        String str3;
        str = y5Var.f43949a;
        this.f43590a = str;
        str2 = y5Var.f43950b;
        this.f43591b = str2;
        list = y5Var.f43951c;
        this.f43592c = list;
        str3 = y5Var.f43952d;
        this.f43593d = str3;
        boolean[] zArr = y5Var.f43953e;
        this.f43594e = Arrays.copyOf(zArr, zArr.length);
    }
}
