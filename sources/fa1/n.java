package fa1;

import androidx.appcompat.widget.x;
import ao2.j0;
import ea1.a1;
import ea1.b1;
import ea1.c1;
import ea1.d1;
import ea1.e1;
import ea1.g1;
import ea1.j1;
import ea1.k1;
import ea1.l1;
import ea1.m1;
import kotlin.jvm.internal.Intrinsics;
import p91.y;
import u50.r;
import x02.x0;
import x02.z0;

/* loaded from: classes5.dex */
public final class n implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final k22.m f61580a;

    /* renamed from: b, reason: collision with root package name */
    public final x f61581b;

    /* renamed from: c, reason: collision with root package name */
    public final e82.f f61582c;

    /* renamed from: d, reason: collision with root package name */
    public final x0 f61583d;

    /* renamed from: e, reason: collision with root package name */
    public final z0 f61584e;

    /* renamed from: f, reason: collision with root package name */
    public ek2.j f61585f;

    /* renamed from: g, reason: collision with root package name */
    public ek2.j f61586g;

    /* renamed from: h, reason: collision with root package name */
    public final xj2.b f61587h;

    public n(k22.m userService, x socialConnectManager, e82.f autoPublishManager, x0 boardRepository, z0 boardSectionRepository) {
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(socialConnectManager, "socialConnectManager");
        Intrinsics.checkNotNullParameter(autoPublishManager, "autoPublishManager");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(boardSectionRepository, "boardSectionRepository");
        this.f61580a = userService;
        this.f61581b = socialConnectManager;
        this.f61582c = autoPublishManager;
        this.f61583d = boardRepository;
        this.f61584e = boardSectionRepository;
        this.f61587h = new xj2.b();
    }

    @Override // l82.g
    public final void e(j0 scope, l82.h hVar, r eventIntake) {
        m1 request = (m1) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof ea1.x0) {
            kotlin.jvm.internal.j.z(scope, null, null, new a(this, eventIntake, null), 3);
            return;
        }
        if (request instanceof d1) {
            kotlin.jvm.internal.j.z(scope, null, null, new d(this, eventIntake, null), 3);
            return;
        }
        if (request instanceof ea1.z0) {
            ea1.z0 z0Var = (ea1.z0) request;
            z0Var.f58174b.H3(new y71.b(14, this, z0Var));
            return;
        }
        if (request instanceof j1) {
            kotlin.jvm.internal.j.z(scope, null, null, new j(this, (j1) request, null), 3);
            return;
        }
        if (request instanceof e1) {
            kotlin.jvm.internal.j.z(scope, null, null, new e(this, (e1) request, null), 3);
            return;
        }
        if (request instanceof c1) {
            c1 c1Var = (c1) request;
            if (c1Var.f58039a == null) {
                return;
            }
            ek2.j jVar = this.f61585f;
            if (jVar != null && !jVar.isDisposed()) {
                bk2.c.dispose(jVar);
            }
            this.f61585f = (ek2.j) this.f61583d.L(c1Var.f58039a).H(tk2.e.f118017c).A(wj2.c.a()).F(new y(22, new b(c1Var, this, eventIntake)), new y(23, new b(c1Var, eventIntake, this)), ck2.i.f27923c, ck2.i.f27924d);
            return;
        }
        if (request instanceof l1) {
            kotlin.jvm.internal.j.z(scope, null, null, new m(this, (l1) request, eventIntake, null), 3);
            return;
        }
        if (request instanceof g1) {
            kotlin.jvm.internal.j.z(scope, null, null, new h(this, (g1) request, eventIntake, null), 3);
            return;
        }
        if (request instanceof k1) {
            kotlin.jvm.internal.j.z(scope, null, null, new l(this, (k1) request, eventIntake, null), 3);
        } else if (request instanceof a1) {
            kotlin.jvm.internal.j.z(scope, null, null, new i(this, false, ((a1) request).f58033a, eventIntake, null), 3);
        } else if (request instanceof b1) {
            kotlin.jvm.internal.j.z(scope, null, null, new i(this, true, ((b1) request).f58036a, eventIntake, null), 3);
        }
    }
}
