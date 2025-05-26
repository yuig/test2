package fj0;

import ao2.j0;
import cj0.u;
import cj0.w0;
import gp1.k;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import l82.g;
import l82.h;
import u50.r;

/* loaded from: classes5.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public final il1.a f62231a;

    /* renamed from: b, reason: collision with root package name */
    public final e02.a f62232b;

    public a(il1.a fragmentFactory, e02.a boardRouter) {
        Intrinsics.checkNotNullParameter(fragmentFactory, "fragmentFactory");
        Intrinsics.checkNotNullParameter(boardRouter, "boardRouter");
        this.f62231a = fragmentFactory;
        this.f62232b = boardRouter;
    }

    @Override // l82.g
    public final void e(j0 scope, h hVar, r eventIntake) {
        u request = (u) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof w0) {
            w0 w0Var = (w0) request;
            e02.a.b(this.f62232b, w0Var.f27873a, false, this.f62231a, null, null, bs1.c.o(new Pair("board_id", w0Var.f27874b), new Pair("board_session_id", w0Var.f27875c)), null, null, null, null, null, "BOARD_FOR_ME", null, null, null, false, false, null, null, null, k.BOARD_FEED, null, 3143640);
        }
    }
}
