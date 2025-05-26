package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ka {

    /* renamed from: a, reason: collision with root package name */
    public String f39361a;

    /* renamed from: b, reason: collision with root package name */
    public String f39362b;

    /* renamed from: c, reason: collision with root package name */
    public String f39363c;

    /* renamed from: d, reason: collision with root package name */
    public String f39364d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f39365e;

    /* renamed from: f, reason: collision with root package name */
    public String f39366f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f39367g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f39368h;

    public /* synthetic */ ka(int i13) {
        this();
    }

    private ka() {
        this.f39368h = new boolean[7];
    }

    private ka(@NonNull la laVar) {
        String str;
        String str2;
        String str3;
        String str4;
        Boolean bool;
        String str5;
        Integer num;
        str = laVar.f39678a;
        this.f39361a = str;
        str2 = laVar.f39679b;
        this.f39362b = str2;
        str3 = laVar.f39680c;
        this.f39363c = str3;
        str4 = laVar.f39681d;
        this.f39364d = str4;
        bool = laVar.f39682e;
        this.f39365e = bool;
        str5 = laVar.f39683f;
        this.f39366f = str5;
        num = laVar.f39684g;
        this.f39367g = num;
        boolean[] zArr = laVar.f39685h;
        this.f39368h = Arrays.copyOf(zArr, zArr.length);
    }
}
