package com.google.android.gms.common.api.internal;

import android.os.Looper;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final m5.j f30841a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f30842b;

    /* renamed from: c, reason: collision with root package name */
    public volatile j f30843c;

    public l(Looper looper, Object obj, String str) {
        this.f30841a = new m5.j(looper);
        com.bumptech.glide.d.u(obj, "Listener must not be null");
        this.f30842b = obj;
        com.bumptech.glide.d.o(str);
        this.f30843c = new j(obj, str);
    }
}
