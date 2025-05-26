package com.pinterest.shuffles.scene.composer;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i0 implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f52058a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f52059b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f52060c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ao2.m f52061d;

    public i0(AtomicBoolean atomicBoolean, n0 n0Var, u uVar, ao2.o oVar) {
        this.f52058a = atomicBoolean;
        this.f52059b = n0Var;
        this.f52060c = uVar;
        this.f52061d = oVar;
    }

    @Override // com.pinterest.shuffles.scene.composer.o0
    public final void a() {
        if (this.f52058a.compareAndSet(false, true)) {
            n0 n0Var = this.f52059b;
            n0Var.f52111c.b("Offscreen rendering - awaitToRenderItemsLoad - load complete - " + n0Var.hashCode(), n72.l.VERBOSE);
            u uVar = this.f52060c;
            uVar.getClass();
            Intrinsics.checkNotNullParameter(this, "l");
            uVar.f52146d.remove(this);
            n0Var.f52111c.b("Offscreen rendering - awaitToRenderItemsLoad - continuation resume - " + n0Var.hashCode(), n72.l.VERBOSE);
            xk2.q qVar = xk2.s.f135225b;
            this.f52061d.resumeWith(Boolean.TRUE);
        }
    }
}
