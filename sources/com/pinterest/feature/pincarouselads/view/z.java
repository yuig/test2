package com.pinterest.feature.pincarouselads.view;

import h32.f1;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes5.dex */
public final class z extends ic2.d {

    /* renamed from: c, reason: collision with root package name */
    public Boolean f47432c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f47433d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0 f47434e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d0 f47435f;

    public z(boolean z13, a0 a0Var, d0 d0Var) {
        this.f47433d = z13;
        this.f47434e = a0Var;
        this.f47435f = d0Var;
    }

    @Override // ic2.d
    public final void e0(float f13, qc2.c viewability, boolean z13, boolean z14, long j13) {
        Intrinsics.checkNotNullParameter(viewability, "viewability");
        super.e0(f13, viewability, z13, z14, j13);
        boolean d2 = Intrinsics.d(this.f47432c, Boolean.FALSE);
        a0 a0Var = this.f47434e;
        if (d2 && z14) {
            if (this.f47433d) {
                a0Var.b(this.f47435f, f1.VIEW);
            }
            if (a0Var.a().c() && a0Var.a().d()) {
                m60.w wVar = m60.u.f85943a;
                String str = a0Var.f47366k;
                wVar.d(str != null ? new qs.d(str, System.currentTimeMillis() * 1000000) : null);
            }
        }
        if (Intrinsics.d(this.f47432c, Boolean.TRUE) && !z14 && a0Var.a().c() && a0Var.a().d()) {
            m60.w wVar2 = m60.u.f85943a;
            String str2 = a0Var.f47366k;
            wVar2.d(str2 != null ? new qs.c(str2, System.currentTimeMillis() * 1000000) : null);
        }
        this.f47432c = Boolean.valueOf(z14);
    }

    @Override // n7.c
    public final void q(n7.b eventTime, boolean z13) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        if (this.f47433d && z13) {
            this.f47434e.b(this.f47435f, f1.VIDEO_START);
        }
    }
}
