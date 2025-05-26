package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class rh {

    /* renamed from: a, reason: collision with root package name */
    public String f41600a;

    /* renamed from: b, reason: collision with root package name */
    public String f41601b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f41602c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f41603d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f41604e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f41605f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f41606g;

    public /* synthetic */ rh(int i13) {
        this();
    }

    private rh() {
        this.f41606g = new boolean[6];
    }

    private rh(@NonNull uh uhVar) {
        String str;
        String str2;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        str = uhVar.f42559a;
        this.f41600a = str;
        str2 = uhVar.f42560b;
        this.f41601b = str2;
        num = uhVar.f42561c;
        this.f41602c = num;
        num2 = uhVar.f42562d;
        this.f41603d = num2;
        num3 = uhVar.f42563e;
        this.f41604e = num3;
        num4 = uhVar.f42564f;
        this.f41605f = num4;
        boolean[] zArr = uhVar.f42565g;
        this.f41606g = Arrays.copyOf(zArr, zArr.length);
    }
}
