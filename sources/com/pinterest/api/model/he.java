package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class he {

    /* renamed from: a, reason: collision with root package name */
    public String f38402a;

    /* renamed from: b, reason: collision with root package name */
    public wy0 f38403b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f38404c;

    public /* synthetic */ he(int i13) {
        this();
    }

    private he() {
        this.f38404c = new boolean[2];
    }

    private he(@NonNull ke keVar) {
        String str;
        wy0 wy0Var;
        str = keVar.f39418a;
        this.f38402a = str;
        wy0Var = keVar.f39419b;
        this.f38403b = wy0Var;
        boolean[] zArr = keVar.f39420c;
        this.f38404c = Arrays.copyOf(zArr, zArr.length);
    }
}
