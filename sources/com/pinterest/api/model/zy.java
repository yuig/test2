package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zy {

    /* renamed from: a, reason: collision with root package name */
    public String f44503a;

    /* renamed from: b, reason: collision with root package name */
    public String f44504b;

    /* renamed from: c, reason: collision with root package name */
    public String f44505c;

    /* renamed from: d, reason: collision with root package name */
    public tm f44506d;

    /* renamed from: e, reason: collision with root package name */
    public String f44507e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f44508f;

    public /* synthetic */ zy(int i13) {
        this();
    }

    private zy() {
        this.f44508f = new boolean[5];
    }

    private zy(@NonNull cz czVar) {
        String str;
        String str2;
        String str3;
        tm tmVar;
        String str4;
        str = czVar.f36573a;
        this.f44503a = str;
        str2 = czVar.f36574b;
        this.f44504b = str2;
        str3 = czVar.f36575c;
        this.f44505c = str3;
        tmVar = czVar.f36576d;
        this.f44506d = tmVar;
        str4 = czVar.f36577e;
        this.f44507e = str4;
        boolean[] zArr = czVar.f36578f;
        this.f44508f = Arrays.copyOf(zArr, zArr.length);
    }
}
