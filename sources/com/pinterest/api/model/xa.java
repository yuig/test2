package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class xa {

    /* renamed from: a, reason: collision with root package name */
    public String f43634a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f43635b;

    public /* synthetic */ xa(int i13) {
        this();
    }

    private xa() {
        this.f43635b = new boolean[1];
    }

    private xa(@NonNull ya yaVar) {
        String str;
        str = yaVar.f43986a;
        this.f43634a = str;
        boolean[] zArr = yaVar.f43987b;
        this.f43635b = Arrays.copyOf(zArr, zArr.length);
    }
}
