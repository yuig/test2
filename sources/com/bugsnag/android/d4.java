package com.bugsnag.android;

import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d4 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f29190a;

    /* renamed from: b, reason: collision with root package name */
    public final id.c f29191b;

    /* renamed from: c, reason: collision with root package name */
    public final id.c f29192c;

    /* renamed from: d, reason: collision with root package name */
    public final u1 f29193d;

    /* renamed from: e, reason: collision with root package name */
    public final sp2.i f29194e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f29195f;

    public d4(boolean z13, id.d dVar, w wVar, y yVar, u1 u1Var) {
        File file = new File((File) dVar.get(), "user-info");
        this.f29190a = z13;
        this.f29191b = wVar;
        this.f29192c = yVar;
        this.f29193d = u1Var;
        this.f29195f = new AtomicReference(null);
        this.f29194e = new sp2.i(file);
    }

    public final void a(a4 a4Var) {
        if (!this.f29190a || Intrinsics.d(a4Var, this.f29195f.getAndSet(a4Var))) {
            return;
        }
        try {
            this.f29194e.X(a4Var);
        } catch (Exception e13) {
            this.f29193d.a("Failed to persist user info", e13);
        }
    }
}
