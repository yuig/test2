package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ip {

    /* renamed from: a, reason: collision with root package name */
    public String f38832a;

    /* renamed from: b, reason: collision with root package name */
    public String f38833b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f38834c;

    public /* synthetic */ ip(int i13) {
        this();
    }

    private ip() {
        this.f38834c = new boolean[2];
    }

    private ip(@NonNull lp lpVar) {
        String str;
        String str2;
        str = lpVar.f39850a;
        this.f38832a = str;
        str2 = lpVar.f39851b;
        this.f38833b = str2;
        boolean[] zArr = lpVar.f39852c;
        this.f38834c = Arrays.copyOf(zArr, zArr.length);
    }
}
