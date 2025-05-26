package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class lr {

    /* renamed from: a, reason: collision with root package name */
    public Double f39865a;

    /* renamed from: b, reason: collision with root package name */
    public Double f39866b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f39867c;

    public /* synthetic */ lr(int i13) {
        this();
    }

    private lr() {
        this.f39867c = new boolean[2];
    }

    private lr(@NonNull or orVar) {
        Double d2;
        Double d13;
        d2 = orVar.f40782a;
        this.f39865a = d2;
        d13 = orVar.f40783b;
        this.f39866b = d13;
        boolean[] zArr = orVar.f40784c;
        this.f39867c = Arrays.copyOf(zArr, zArr.length);
    }
}
