package i80;

import ao2.j0;
import h80.n;
import h80.o;
import h80.q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import l82.g;
import l82.h;
import u50.r;

/* loaded from: classes5.dex */
public final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f71718a;

    /* renamed from: b, reason: collision with root package name */
    public final g20.a f71719b;

    public b(g20.a canvasService, int i13) {
        this.f71718a = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(canvasService, "canvasService");
            this.f71719b = canvasService;
        } else {
            Intrinsics.checkNotNullParameter(canvasService, "canvasService");
            this.f71719b = canvasService;
        }
    }

    @Override // l82.g
    public final /* bridge */ /* synthetic */ void e(j0 j0Var, h hVar, r rVar) {
        switch (this.f71718a) {
            case 0:
                j(j0Var, (q) hVar, rVar);
                break;
            default:
                j(j0Var, (q) hVar, rVar);
                break;
        }
    }

    public final void j(j0 scope, q request, r eventIntake) {
        switch (this.f71718a) {
            case 0:
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (request instanceof n) {
                    j.z(scope, null, null, new a(this, request, eventIntake, null), 3);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (request instanceof o) {
                    j.z(scope, null, null, new c(this, request, eventIntake, null), 3);
                    break;
                }
                break;
        }
    }
}
