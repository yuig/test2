package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zd0 {

    /* renamed from: a, reason: collision with root package name */
    public Integer f44304a;

    /* renamed from: b, reason: collision with root package name */
    public String f44305b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f44306c;

    /* renamed from: d, reason: collision with root package name */
    public Double f44307d;

    /* renamed from: e, reason: collision with root package name */
    public String f44308e;

    /* renamed from: f, reason: collision with root package name */
    public String f44309f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f44310g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f44311h;

    public /* synthetic */ zd0(int i13) {
        this();
    }

    private zd0() {
        this.f44311h = new boolean[7];
    }

    private zd0(@NonNull ce0 ce0Var) {
        Integer num;
        String str;
        Integer num2;
        Double d2;
        String str2;
        String str3;
        Integer num3;
        num = ce0Var.f36394a;
        this.f44304a = num;
        str = ce0Var.f36395b;
        this.f44305b = str;
        num2 = ce0Var.f36396c;
        this.f44306c = num2;
        d2 = ce0Var.f36397d;
        this.f44307d = d2;
        str2 = ce0Var.f36398e;
        this.f44308e = str2;
        str3 = ce0Var.f36399f;
        this.f44309f = str3;
        num3 = ce0Var.f36400g;
        this.f44310g = num3;
        boolean[] zArr = ce0Var.f36401h;
        this.f44311h = Arrays.copyOf(zArr, zArr.length);
    }
}
