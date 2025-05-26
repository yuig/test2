package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class gy {

    /* renamed from: a, reason: collision with root package name */
    public ny f38174a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f38175b;

    /* renamed from: c, reason: collision with root package name */
    public String f38176c;

    /* renamed from: d, reason: collision with root package name */
    public String f38177d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f38178e;

    public /* synthetic */ gy(int i13) {
        this();
    }

    private gy() {
        this.f38178e = new boolean[4];
    }

    private gy(@NonNull jy jyVar) {
        ny nyVar;
        Integer num;
        String str;
        String str2;
        nyVar = jyVar.f39168a;
        this.f38174a = nyVar;
        num = jyVar.f39169b;
        this.f38175b = num;
        str = jyVar.f39170c;
        this.f38176c = str;
        str2 = jyVar.f39171d;
        this.f38177d = str2;
        boolean[] zArr = jyVar.f39172e;
        this.f38178e = Arrays.copyOf(zArr, zArr.length);
    }
}
