package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zc {

    /* renamed from: a, reason: collision with root package name */
    public String f44281a;

    /* renamed from: b, reason: collision with root package name */
    public String f44282b;

    /* renamed from: c, reason: collision with root package name */
    public Double f44283c;

    /* renamed from: d, reason: collision with root package name */
    public Double f44284d;

    /* renamed from: e, reason: collision with root package name */
    public Double f44285e;

    /* renamed from: f, reason: collision with root package name */
    public Double f44286f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f44287g;

    public /* synthetic */ zc(int i13) {
        this();
    }

    private zc() {
        this.f44287g = new boolean[6];
    }

    private zc(@NonNull cd cdVar) {
        String str;
        String str2;
        Double d2;
        Double d13;
        Double d14;
        Double d15;
        str = cdVar.f36367a;
        this.f44281a = str;
        str2 = cdVar.f36368b;
        this.f44282b = str2;
        d2 = cdVar.f36369c;
        this.f44283c = d2;
        d13 = cdVar.f36370d;
        this.f44284d = d13;
        d14 = cdVar.f36371e;
        this.f44285e = d14;
        d15 = cdVar.f36372f;
        this.f44286f = d15;
        boolean[] zArr = cdVar.f36373g;
        this.f44287g = Arrays.copyOf(zArr, zArr.length);
    }
}
