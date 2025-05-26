package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class lh {

    /* renamed from: a, reason: collision with root package name */
    public Integer f39760a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f39761b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f39762c;

    public /* synthetic */ lh(int i13) {
        this();
    }

    private lh() {
        this.f39762c = new boolean[2];
    }

    private lh(@NonNull oh ohVar) {
        Integer num;
        Integer num2;
        num = ohVar.f40728a;
        this.f39760a = num;
        num2 = ohVar.f40729b;
        this.f39761b = num2;
        boolean[] zArr = ohVar.f40730c;
        this.f39762c = Arrays.copyOf(zArr, zArr.length);
    }
}
