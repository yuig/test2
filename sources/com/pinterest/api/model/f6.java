package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class f6 {

    /* renamed from: a, reason: collision with root package name */
    public Integer f37572a;

    /* renamed from: b, reason: collision with root package name */
    public String f37573b;

    /* renamed from: c, reason: collision with root package name */
    public String f37574c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f37575d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f37576e;

    public /* synthetic */ f6(int i13) {
        this();
    }

    private f6() {
        this.f37576e = new boolean[4];
    }

    private f6(@NonNull g6 g6Var) {
        Integer num;
        String str;
        String str2;
        Integer num2;
        num = g6Var.f37967a;
        this.f37572a = num;
        str = g6Var.f37968b;
        this.f37573b = str;
        str2 = g6Var.f37969c;
        this.f37574c = str2;
        num2 = g6Var.f37970d;
        this.f37575d = num2;
        boolean[] zArr = g6Var.f37971e;
        this.f37576e = Arrays.copyOf(zArr, zArr.length);
    }
}
