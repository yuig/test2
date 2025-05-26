package fj0;

import ao2.j0;
import ao2.v0;
import cj0.a1;
import cj0.c1;
import cj0.k0;
import cj0.o0;
import cj0.p0;
import cj0.q0;
import cj0.s0;
import cj0.u;
import cj0.z0;
import do1.n;
import java.util.ArrayList;
import kg.o;
import ko2.e;
import ko2.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import l82.g;
import l82.h;
import lb0.r;
import m60.w;
import tb0.p;
import x02.x0;

/* loaded from: classes5.dex */
public final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    public final x0 f62237a;

    /* renamed from: b, reason: collision with root package name */
    public final r f62238b;

    /* renamed from: c, reason: collision with root package name */
    public final w f62239c;

    /* renamed from: d, reason: collision with root package name */
    public final b20.c f62240d;

    /* renamed from: e, reason: collision with root package name */
    public final ob0.a f62241e;

    public c(x0 boardRepository, r prefsManagerUser, w eventManager, b20.c toastForSEP, ob0.a crashReporter) {
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(toastForSEP, "toastForSEP");
        Intrinsics.checkNotNullParameter(crashReporter, "crashReporter");
        this.f62237a = boardRepository;
        this.f62238b = prefsManagerUser;
        this.f62239c = eventManager;
        this.f62240d = toastForSEP;
        this.f62241e = crashReporter;
    }

    @Override // l82.g
    public final void e(j0 scope, h hVar, u50.r eventIntake) {
        u request = (u) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        boolean z13 = request instanceof p0;
        r rVar = this.f62238b;
        if (z13) {
            zo.c cVar = zo.c.DEFAULT;
            eventIntake.a(new k0(o.f(rVar.g("PREF_BOARD_VIEW_TYPE", cVar.ordinal()), cVar)));
            return;
        }
        if (request instanceof o0) {
            f fVar = v0.f20219a;
            j.z(scope, e.f80326c, null, new b(this, request, eventIntake, null), 2);
            return;
        }
        if (Intrinsics.d(request, z0.f27883a)) {
            this.f62239c.d(new r70.h(true, false));
            return;
        }
        if (request instanceof s0) {
            gb2.f fVar2 = gb2.f.f64747a;
            gb2.f.c(new gb2.h(((s0) request).f27865a));
            return;
        }
        if (request instanceof c1) {
            rVar.h("PREF_BOARD_VIEW_TYPE", ((c1) request).f27791a.ordinal());
            return;
        }
        if (request instanceof q0) {
            q0 q0Var = (q0) request;
            ((tb0.h) this.f62241e).q(q0Var.f27859a, q0Var.f27860b, p.BOARD_AND_SECTION_VIEW);
            return;
        }
        if (request instanceof a1) {
            int i13 = ((a1) request).f27781a;
            String[] formatArgs = new String[0];
            Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
            b20.c.B(this.f62240d, new k92.b(new k92.c(new u50.k0(i13, new ArrayList(0)), null, n.ERROR, false, 94)), null, null, 30);
        }
    }
}
