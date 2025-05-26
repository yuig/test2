package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class dd {

    /* renamed from: a, reason: collision with root package name */
    public String f36729a;

    /* renamed from: b, reason: collision with root package name */
    public String f36730b;

    /* renamed from: c, reason: collision with root package name */
    public Double f36731c;

    /* renamed from: d, reason: collision with root package name */
    public Double f36732d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f36733e;

    public /* synthetic */ dd(int i13) {
        this();
    }

    private dd() {
        this.f36733e = new boolean[4];
    }

    private dd(@NonNull gd gdVar) {
        String str;
        String str2;
        Double d2;
        Double d13;
        str = gdVar.f38041a;
        this.f36729a = str;
        str2 = gdVar.f38042b;
        this.f36730b = str2;
        d2 = gdVar.f38043c;
        this.f36731c = d2;
        d13 = gdVar.f38044d;
        this.f36732d = d13;
        boolean[] zArr = gdVar.f38045e;
        this.f36733e = Arrays.copyOf(zArr, zArr.length);
    }
}
