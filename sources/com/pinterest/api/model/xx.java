package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class xx {

    /* renamed from: a, reason: collision with root package name */
    public List f43818a;

    /* renamed from: b, reason: collision with root package name */
    public String f43819b;

    /* renamed from: c, reason: collision with root package name */
    public tm f43820c;

    /* renamed from: d, reason: collision with root package name */
    public gz f43821d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f43822e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f43823f;

    /* renamed from: g, reason: collision with root package name */
    public String f43824g;

    /* renamed from: h, reason: collision with root package name */
    public String f43825h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f43826i;

    public /* synthetic */ xx(int i13) {
        this();
    }

    private xx() {
        this.f43826i = new boolean[8];
    }

    private xx(@NonNull ay ayVar) {
        List list;
        String str;
        tm tmVar;
        gz gzVar;
        Integer num;
        Integer num2;
        String str2;
        String str3;
        list = ayVar.f35895a;
        this.f43818a = list;
        str = ayVar.f35896b;
        this.f43819b = str;
        tmVar = ayVar.f35897c;
        this.f43820c = tmVar;
        gzVar = ayVar.f35898d;
        this.f43821d = gzVar;
        num = ayVar.f35899e;
        this.f43822e = num;
        num2 = ayVar.f35900f;
        this.f43823f = num2;
        str2 = ayVar.f35901g;
        this.f43824g = str2;
        str3 = ayVar.f35902h;
        this.f43825h = str3;
        boolean[] zArr = ayVar.f35903i;
        this.f43826i = Arrays.copyOf(zArr, zArr.length);
    }
}
