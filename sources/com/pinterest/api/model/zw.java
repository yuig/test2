package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class zw {

    /* renamed from: a, reason: collision with root package name */
    public String f44493a;

    /* renamed from: b, reason: collision with root package name */
    public String f44494b;

    /* renamed from: c, reason: collision with root package name */
    public String f44495c;

    /* renamed from: d, reason: collision with root package name */
    public List f44496d;

    /* renamed from: e, reason: collision with root package name */
    public List f44497e;

    /* renamed from: f, reason: collision with root package name */
    public String f44498f;

    /* renamed from: g, reason: collision with root package name */
    public String f44499g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f44500h;

    public /* synthetic */ zw(int i13) {
        this();
    }

    private zw() {
        this.f44500h = new boolean[7];
    }

    private zw(@NonNull cx cxVar) {
        String str;
        String str2;
        String str3;
        List list;
        List list2;
        String str4;
        String str5;
        str = cxVar.f36544a;
        this.f44493a = str;
        str2 = cxVar.f36545b;
        this.f44494b = str2;
        str3 = cxVar.f36546c;
        this.f44495c = str3;
        list = cxVar.f36547d;
        this.f44496d = list;
        list2 = cxVar.f36548e;
        this.f44497e = list2;
        str4 = cxVar.f36549f;
        this.f44498f = str4;
        str5 = cxVar.f36550g;
        this.f44499g = str5;
        boolean[] zArr = cxVar.f36551h;
        this.f44500h = Arrays.copyOf(zArr, zArr.length);
    }
}
