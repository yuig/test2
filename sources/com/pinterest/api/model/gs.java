package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class gs {

    /* renamed from: a, reason: collision with root package name */
    public String f38124a;

    /* renamed from: b, reason: collision with root package name */
    public String f38125b;

    /* renamed from: c, reason: collision with root package name */
    public String f38126c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f38127d;

    public /* synthetic */ gs(int i13) {
        this();
    }

    private gs() {
        this.f38127d = new boolean[3];
    }

    private gs(@NonNull js jsVar) {
        String str;
        String str2;
        String str3;
        str = jsVar.f39134a;
        this.f38124a = str;
        str2 = jsVar.f39135b;
        this.f38125b = str2;
        str3 = jsVar.f39136c;
        this.f38126c = str3;
        boolean[] zArr = jsVar.f39137d;
        this.f38127d = Arrays.copyOf(zArr, zArr.length);
    }
}
