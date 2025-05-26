package sy;

import ao2.j0;
import ey.c3;
import h32.a4;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;
import l82.g;
import l82.h;
import my.k;
import s92.i;
import s92.l;
import s92.o;
import u50.r;

/* loaded from: classes3.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public final i f115631a;

    /* renamed from: b, reason: collision with root package name */
    public final l f115632b;

    /* renamed from: c, reason: collision with root package name */
    public final d4 f115633c;

    /* renamed from: d, reason: collision with root package name */
    public final a4 f115634d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f115635e;

    /* renamed from: f, reason: collision with root package name */
    public final c3 f115636f;

    public a(i pwtAction, l pwtCause, d4 viewType, a4 a4Var, boolean z13, c3 perfEventsRouter) {
        Intrinsics.checkNotNullParameter(pwtAction, "pwtAction");
        Intrinsics.checkNotNullParameter(pwtCause, "pwtCause");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(perfEventsRouter, "perfEventsRouter");
        this.f115631a = pwtAction;
        this.f115632b = pwtCause;
        this.f115633c = viewType;
        this.f115634d = a4Var;
        this.f115635e = z13;
        this.f115636f = perfEventsRouter;
    }

    @Override // l82.g
    public final void e(j0 scope, h hVar, r eventIntake) {
        f request = (f) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (this.f115635e) {
            return;
        }
        boolean z13 = request instanceof e;
        i iVar = this.f115631a;
        c3 c3Var = this.f115636f;
        if (z13) {
            c3Var.a(new k(iVar, this.f115632b, this.f115633c, this.f115634d));
        } else if (request instanceof c) {
            c3Var.a(new my.e(iVar, o.COMPLETE));
        } else if (request instanceof d) {
            c3Var.a(new my.e(iVar, o.ERROR));
        } else if (request instanceof b) {
            c3Var.a(new my.e(iVar, o.ABORTED));
        }
    }
}
