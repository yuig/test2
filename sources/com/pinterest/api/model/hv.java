package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class hv {

    /* renamed from: a, reason: collision with root package name */
    public String f38545a;

    /* renamed from: b, reason: collision with root package name */
    public String f38546b;

    /* renamed from: c, reason: collision with root package name */
    public String f38547c;

    /* renamed from: d, reason: collision with root package name */
    public String f38548d;

    /* renamed from: e, reason: collision with root package name */
    public String f38549e;

    /* renamed from: f, reason: collision with root package name */
    public Double f38550f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f38551g;

    public /* synthetic */ hv(int i13) {
        this();
    }

    private hv() {
        this.f38551g = new boolean[6];
    }

    private hv(@NonNull kv kvVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Double d2;
        str = kvVar.f39544a;
        this.f38545a = str;
        str2 = kvVar.f39545b;
        this.f38546b = str2;
        str3 = kvVar.f39546c;
        this.f38547c = str3;
        str4 = kvVar.f39547d;
        this.f38548d = str4;
        str5 = kvVar.f39548e;
        this.f38549e = str5;
        d2 = kvVar.f39549f;
        this.f38550f = d2;
        boolean[] zArr = kvVar.f39550g;
        this.f38551g = Arrays.copyOf(zArr, zArr.length);
    }
}
