package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zm {

    /* renamed from: a, reason: collision with root package name */
    public String f44390a;

    /* renamed from: b, reason: collision with root package name */
    public String f44391b;

    /* renamed from: c, reason: collision with root package name */
    public String f44392c;

    /* renamed from: d, reason: collision with root package name */
    public String f44393d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f44394e;

    public /* synthetic */ zm(int i13) {
        this();
    }

    private zm() {
        this.f44394e = new boolean[4];
    }

    private zm(@NonNull cn cnVar) {
        String str;
        String str2;
        String str3;
        String str4;
        str = cnVar.f36471a;
        this.f44390a = str;
        str2 = cnVar.f36472b;
        this.f44391b = str2;
        str3 = cnVar.f36473c;
        this.f44392c = str3;
        str4 = cnVar.f36474d;
        this.f44393d = str4;
        boolean[] zArr = cnVar.f36475e;
        this.f44394e = Arrays.copyOf(zArr, zArr.length);
    }
}
