package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class sy {

    /* renamed from: a, reason: collision with root package name */
    public String f42013a;

    /* renamed from: b, reason: collision with root package name */
    public String f42014b;

    /* renamed from: c, reason: collision with root package name */
    public List f42015c;

    /* renamed from: d, reason: collision with root package name */
    public cz f42016d;

    /* renamed from: e, reason: collision with root package name */
    public String f42017e;

    /* renamed from: f, reason: collision with root package name */
    public String f42018f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f42019g;

    public /* synthetic */ sy(int i13) {
        this();
    }

    private sy() {
        this.f42019g = new boolean[6];
    }

    private sy(@NonNull yy yyVar) {
        String str;
        String str2;
        List list;
        cz czVar;
        String str3;
        String str4;
        str = yyVar.f44152a;
        this.f42013a = str;
        str2 = yyVar.f44153b;
        this.f42014b = str2;
        list = yyVar.f44154c;
        this.f42015c = list;
        czVar = yyVar.f44155d;
        this.f42016d = czVar;
        str3 = yyVar.f44156e;
        this.f42017e = str3;
        str4 = yyVar.f44157f;
        this.f42018f = str4;
        boolean[] zArr = yyVar.f44158g;
        this.f42019g = Arrays.copyOf(zArr, zArr.length);
    }
}
