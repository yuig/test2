package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class hc {

    /* renamed from: a, reason: collision with root package name */
    public String f38364a;

    /* renamed from: b, reason: collision with root package name */
    public String f38365b;

    /* renamed from: c, reason: collision with root package name */
    public String f38366c;

    /* renamed from: d, reason: collision with root package name */
    public List f38367d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f38368e;

    public /* synthetic */ hc(int i13) {
        this();
    }

    private hc() {
        this.f38368e = new boolean[4];
    }

    private hc(@NonNull kc kcVar) {
        String str;
        String str2;
        String str3;
        List list;
        str = kcVar.f39380a;
        this.f38364a = str;
        str2 = kcVar.f39381b;
        this.f38365b = str2;
        str3 = kcVar.f39382c;
        this.f38366c = str3;
        list = kcVar.f39383d;
        this.f38367d = list;
        boolean[] zArr = kcVar.f39384e;
        this.f38368e = Arrays.copyOf(zArr, zArr.length);
    }
}
