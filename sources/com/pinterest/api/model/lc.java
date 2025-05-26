package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class lc {

    /* renamed from: a, reason: collision with root package name */
    public String f39699a;

    /* renamed from: b, reason: collision with root package name */
    public String f39700b;

    /* renamed from: c, reason: collision with root package name */
    public String f39701c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f39702d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f39703e;

    public /* synthetic */ lc(int i13) {
        this();
    }

    private lc() {
        this.f39703e = new boolean[4];
    }

    private lc(@NonNull oc ocVar) {
        String str;
        String str2;
        String str3;
        Integer num;
        str = ocVar.f40668a;
        this.f39699a = str;
        str2 = ocVar.f40669b;
        this.f39700b = str2;
        str3 = ocVar.f40670c;
        this.f39701c = str3;
        num = ocVar.f40671d;
        this.f39702d = num;
        boolean[] zArr = ocVar.f40672e;
        this.f39703e = Arrays.copyOf(zArr, zArr.length);
    }
}
