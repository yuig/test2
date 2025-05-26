package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class pd {

    /* renamed from: a, reason: collision with root package name */
    public Integer f40937a;

    /* renamed from: b, reason: collision with root package name */
    public wd f40938b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f40939c;

    public /* synthetic */ pd(int i13) {
        this();
    }

    private pd() {
        this.f40939c = new boolean[2];
    }

    private pd(@NonNull sd sdVar) {
        Integer num;
        wd wdVar;
        num = sdVar.f41854a;
        this.f40937a = num;
        wdVar = sdVar.f41855b;
        this.f40938b = wdVar;
        boolean[] zArr = sdVar.f41856c;
        this.f40939c = Arrays.copyOf(zArr, zArr.length);
    }
}
