package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class xd {

    /* renamed from: a, reason: collision with root package name */
    public String f43653a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f43654b;

    public /* synthetic */ xd(int i13) {
        this();
    }

    private xd() {
        this.f43654b = new boolean[1];
    }

    private xd(@NonNull ae aeVar) {
        String str;
        str = aeVar.f35708a;
        this.f43653a = str;
        boolean[] zArr = aeVar.f35709b;
        this.f43654b = Arrays.copyOf(zArr, zArr.length);
    }
}
