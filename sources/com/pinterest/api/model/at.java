package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes3.dex */
public final class at {

    /* renamed from: a, reason: collision with root package name */
    public Map f35853a;

    /* renamed from: b, reason: collision with root package name */
    public String f35854b;

    /* renamed from: c, reason: collision with root package name */
    public String f35855c;

    /* renamed from: d, reason: collision with root package name */
    public zs f35856d;

    /* renamed from: e, reason: collision with root package name */
    public String f35857e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f35858f;

    public /* synthetic */ at(int i13) {
        this();
    }

    private at() {
        this.f35858f = new boolean[5];
    }

    private at(@NonNull dt dtVar) {
        Map map;
        String str;
        String str2;
        zs zsVar;
        String str3;
        map = dtVar.f36950a;
        this.f35853a = map;
        str = dtVar.f36951b;
        this.f35854b = str;
        str2 = dtVar.f36952c;
        this.f35855c = str2;
        zsVar = dtVar.f36953d;
        this.f35856d = zsVar;
        str3 = dtVar.f36954e;
        this.f35857e = str3;
        boolean[] zArr = dtVar.f36955f;
        this.f35858f = Arrays.copyOf(zArr, zArr.length);
    }
}
