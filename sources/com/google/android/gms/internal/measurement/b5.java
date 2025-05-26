package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* loaded from: classes3.dex */
public final class b5 {

    /* renamed from: a, reason: collision with root package name */
    public final String f31297a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f31298b;

    /* renamed from: c, reason: collision with root package name */
    public final String f31299c;

    /* renamed from: d, reason: collision with root package name */
    public final String f31300d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f31301e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f31302f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f31303g;

    /* renamed from: h, reason: collision with root package name */
    public final ok.t f31304h;

    public b5(String str, Uri uri, String str2, String str3, boolean z13, boolean z14, boolean z15, boolean z16, ok.t tVar) {
        this.f31297a = str;
        this.f31298b = uri;
        this.f31299c = str2;
        this.f31300d = str3;
        this.f31301e = z13;
        this.f31302f = z14;
        this.f31303g = z16;
        this.f31304h = tVar;
    }

    public final x4 a(String str, boolean z13) {
        Boolean valueOf = Boolean.valueOf(z13);
        Object obj = v4.f31663g;
        return new x4(this, str, valueOf);
    }

    public final y4 b(long j13, String str) {
        Long valueOf = Long.valueOf(j13);
        Object obj = v4.f31663g;
        return new y4(this, str, valueOf);
    }

    public final z4 c(String str, String str2) {
        Object obj = v4.f31663g;
        return new z4(this, str, str2);
    }
}
