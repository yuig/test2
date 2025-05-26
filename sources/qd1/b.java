package qd1;

import ao2.j0;
import kotlin.jvm.internal.Intrinsics;
import l82.g;
import l82.h;
import od1.w;
import tx1.l;
import u50.r;
import zy.d0;

/* loaded from: classes5.dex */
public final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f103576a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f103577b;

    public b(d0 pinalyticsSEP, int i13) {
        this.f103576a = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
            this.f103577b = pinalyticsSEP;
        } else {
            Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
            this.f103577b = pinalyticsSEP;
        }
    }

    @Override // l82.g
    public final void e(j0 scope, h hVar, r eventIntake) {
        int i13 = this.f103576a;
        d0 d0Var = this.f103577b;
        switch (i13) {
            case 0:
                w request = (w) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                d0Var.e(scope, request.f94179a, eventIntake);
                break;
            default:
                l request2 = (l) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request2, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (request2 instanceof tx1.h) {
                    d0Var.e(scope, ((tx1.h) request2).f119689a, eventIntake);
                    break;
                }
                break;
        }
    }
}
