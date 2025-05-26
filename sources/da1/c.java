package da1;

import ao2.j0;
import aw0.j;
import ca1.q;
import ca1.t;
import ck2.i;
import e82.f;
import ga1.u;
import ga1.v;
import i92.k;
import k22.m;
import kb1.p;
import kb1.s;
import kotlin.jvm.internal.Intrinsics;
import l82.g;
import l82.h;
import lh0.m3;
import p91.y;
import tk2.e;
import u50.r;
import w60.d;
import x02.x0;
import x02.z0;
import zy.d0;

/* loaded from: classes5.dex */
public final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54228a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f54229b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f54230c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f54231d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f54232e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f54233f;

    public c(m userService, x0 boardRepository, z0 boardSectionRepository, f autoPublishManager) {
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(boardSectionRepository, "boardSectionRepository");
        Intrinsics.checkNotNullParameter(autoPublishManager, "autoPublishManager");
        this.f54229b = userService;
        this.f54232e = boardRepository;
        this.f54233f = boardSectionRepository;
        this.f54230c = autoPublishManager;
        this.f54231d = new xj2.b();
    }

    @Override // l82.g
    public final void e(j0 scope, h hVar, r eventIntake) {
        int i13 = this.f54228a;
        Object obj = this.f54231d;
        Object obj2 = this.f54230c;
        switch (i13) {
            case 0:
                t request = (t) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (!(request instanceof ca1.r)) {
                    if (request instanceof q) {
                        q qVar = (q) request;
                        f fVar = (f) obj2;
                        String str = fVar.f57835e;
                        if (str != null) {
                            ((xj2.b) obj).a(((x0) this.f54232e).L(str).H(e.f118017c).A(wj2.c.a()).F(new y(16, new j(fVar.f57836f, this, qVar, eventIntake, 13)), new y(17, new y71.b(10, eventIntake, this)), i.f27923c, i.f27924d));
                            break;
                        }
                    }
                } else {
                    kotlin.jvm.internal.j.z(scope, null, null, new a(this, eventIntake, null), 3);
                    break;
                }
                break;
            case 1:
                v request2 = (v) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request2, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (!(request2 instanceof ga1.r)) {
                    if (request2 instanceof u) {
                        kotlin.jvm.internal.j.z(scope, null, null, new ha1.b(this, (u) request2, eventIntake, null), 3);
                        break;
                    }
                } else {
                    kotlin.jvm.internal.j.z(scope, null, null, new ha1.a(this, eventIntake, null), 3);
                    break;
                }
                break;
            default:
                s request3 = (s) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request3, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (!(request3 instanceof p)) {
                    if (!(request3 instanceof kb1.q)) {
                        if (request3 instanceof kb1.r) {
                            ((d0) obj).e(scope, ((kb1.r) request3).f79094a, eventIntake);
                            break;
                        }
                    } else {
                        ((d) obj2).j(scope, ((kb1.q) request3).f79093a, eventIntake);
                        break;
                    }
                } else {
                    kotlin.jvm.internal.j.z(scope, null, null, new lb1.b(this, (p) request3, eventIntake, null), 3);
                    break;
                }
                break;
        }
    }

    public c(m userService, f autoPublishManager, ll.j navigator, m3 experiments) {
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(autoPublishManager, "autoPublishManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f54229b = userService;
        this.f54230c = autoPublishManager;
        this.f54232e = navigator;
        this.f54233f = experiments;
        this.f54231d = new xj2.b();
    }

    public c(x10.a passcodeApiService, b60.b userManager, k toastUtils, d navigationSEP, d0 pinalyticsSEP) {
        Intrinsics.checkNotNullParameter(passcodeApiService, "passcodeApiService");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(navigationSEP, "navigationSEP");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        this.f54229b = passcodeApiService;
        this.f54232e = userManager;
        this.f54233f = toastUtils;
        this.f54230c = navigationSEP;
        this.f54231d = pinalyticsSEP;
    }
}
