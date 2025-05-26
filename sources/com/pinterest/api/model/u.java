package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public String f42370a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f42371b;

    public /* synthetic */ u(int i13) {
        this();
    }

    private u() {
        this.f42371b = new boolean[1];
    }

    private u(@NonNull v vVar) {
        String str;
        str = vVar.f42691a;
        this.f42370a = str;
        boolean[] zArr = vVar.f42692b;
        this.f42371b = Arrays.copyOf(zArr, zArr.length);
    }
}
