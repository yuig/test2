package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class fa {

    /* renamed from: a, reason: collision with root package name */
    public String f37625a;

    /* renamed from: b, reason: collision with root package name */
    public String f37626b;

    /* renamed from: c, reason: collision with root package name */
    public List f37627c;

    /* renamed from: d, reason: collision with root package name */
    public Map f37628d;

    /* renamed from: e, reason: collision with root package name */
    public String f37629e;

    /* renamed from: f, reason: collision with root package name */
    public List f37630f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f37631g;

    public /* synthetic */ fa(int i13) {
        this();
    }

    private fa() {
        this.f37631g = new boolean[6];
    }

    private fa(@NonNull ga gaVar) {
        String str;
        String str2;
        List list;
        Map map;
        String str3;
        List list2;
        str = gaVar.f38002a;
        this.f37625a = str;
        str2 = gaVar.f38003b;
        this.f37626b = str2;
        list = gaVar.f38004c;
        this.f37627c = list;
        map = gaVar.f38005d;
        this.f37628d = map;
        str3 = gaVar.f38006e;
        this.f37629e = str3;
        list2 = gaVar.f38007f;
        this.f37630f = list2;
        boolean[] zArr = gaVar.f38008g;
        this.f37631g = Arrays.copyOf(zArr, zArr.length);
    }
}
