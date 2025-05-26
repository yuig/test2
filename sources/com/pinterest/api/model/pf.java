package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class pf {

    /* renamed from: a, reason: collision with root package name */
    public String f40964a;

    /* renamed from: b, reason: collision with root package name */
    public String f40965b;

    /* renamed from: c, reason: collision with root package name */
    public String f40966c;

    /* renamed from: d, reason: collision with root package name */
    public String f40967d;

    /* renamed from: e, reason: collision with root package name */
    public String f40968e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f40969f;

    public /* synthetic */ pf(int i13) {
        this();
    }

    private pf() {
        this.f40969f = new boolean[5];
    }

    private pf(@NonNull sf sfVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        str = sfVar.f41888a;
        this.f40964a = str;
        str2 = sfVar.f41889b;
        this.f40965b = str2;
        str3 = sfVar.f41890c;
        this.f40966c = str3;
        str4 = sfVar.f41891d;
        this.f40967d = str4;
        str5 = sfVar.f41892e;
        this.f40968e = str5;
        boolean[] zArr = sfVar.f41893f;
        this.f40969f = Arrays.copyOf(zArr, zArr.length);
    }
}
