package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class be {

    /* renamed from: a, reason: collision with root package name */
    public String f36045a;

    /* renamed from: b, reason: collision with root package name */
    public String f36046b;

    /* renamed from: c, reason: collision with root package name */
    public String f36047c;

    /* renamed from: d, reason: collision with root package name */
    public List f36048d;

    /* renamed from: e, reason: collision with root package name */
    public List f36049e;

    /* renamed from: f, reason: collision with root package name */
    public List f36050f;

    /* renamed from: g, reason: collision with root package name */
    public String f36051g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f36052h;

    public /* synthetic */ be(int i13) {
        this();
    }

    private be() {
        this.f36052h = new boolean[7];
    }

    private be(@NonNull ee eeVar) {
        String str;
        String str2;
        String str3;
        List list;
        List list2;
        List list3;
        String str4;
        str = eeVar.f37247a;
        this.f36045a = str;
        str2 = eeVar.f37248b;
        this.f36046b = str2;
        str3 = eeVar.f37249c;
        this.f36047c = str3;
        list = eeVar.f37250d;
        this.f36048d = list;
        list2 = eeVar.f37251e;
        this.f36049e = list2;
        list3 = eeVar.f37252f;
        this.f36050f = list3;
        str4 = eeVar.f37253g;
        this.f36051g = str4;
        boolean[] zArr = eeVar.f37254h;
        this.f36052h = Arrays.copyOf(zArr, zArr.length);
    }
}
