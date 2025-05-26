package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class tp0 {

    /* renamed from: a, reason: collision with root package name */
    public Integer f42266a;

    /* renamed from: b, reason: collision with root package name */
    public String f42267b;

    /* renamed from: c, reason: collision with root package name */
    public String f42268c;

    /* renamed from: d, reason: collision with root package name */
    public String f42269d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f42270e;

    public /* synthetic */ tp0(int i13) {
        this();
    }

    private tp0() {
        this.f42270e = new boolean[4];
    }

    private tp0(@NonNull wp0 wp0Var) {
        Integer num;
        String str;
        String str2;
        String str3;
        num = wp0Var.f43325a;
        this.f42266a = num;
        str = wp0Var.f43326b;
        this.f42267b = str;
        str2 = wp0Var.f43327c;
        this.f42268c = str2;
        str3 = wp0Var.f43328d;
        this.f42269d = str3;
        boolean[] zArr = wp0Var.f43329e;
        this.f42270e = Arrays.copyOf(zArr, zArr.length);
    }
}
