package com.bugsnag.android;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class t1 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f29642a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    public boolean f29643b = false;

    public final boolean a(String str, o oVar, c cVar) {
        try {
            oVar.f29392z.b(hd.n.IO, new n.g(this, str, oVar, cVar, 2)).get();
            return this.f29643b;
        } catch (Throwable unused) {
            return false;
        }
    }
}
