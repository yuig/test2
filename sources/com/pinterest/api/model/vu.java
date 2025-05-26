package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class vu {

    /* renamed from: a, reason: collision with root package name */
    public String f42984a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f42985b;

    /* renamed from: c, reason: collision with root package name */
    public String f42986c;

    /* renamed from: d, reason: collision with root package name */
    public String f42987d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f42988e;

    public /* synthetic */ vu(int i13) {
        this();
    }

    private vu() {
        this.f42988e = new boolean[4];
    }

    private vu(@NonNull yu yuVar) {
        String str;
        Integer num;
        String str2;
        String str3;
        str = yuVar.f44122a;
        this.f42984a = str;
        num = yuVar.f44123b;
        this.f42985b = num;
        str2 = yuVar.f44124c;
        this.f42986c = str2;
        str3 = yuVar.f44125d;
        this.f42987d = str3;
        boolean[] zArr = yuVar.f44126e;
        this.f42988e = Arrays.copyOf(zArr, zArr.length);
    }
}
