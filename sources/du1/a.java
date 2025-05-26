package du1;

import ao2.j0;
import eu1.i;
import eu1.j;
import kotlin.jvm.internal.Intrinsics;
import l82.g;
import l82.h;
import ss1.f;
import u50.r;
import yq1.u1;

/* loaded from: classes4.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56275a;

    /* renamed from: b, reason: collision with root package name */
    public final f f56276b;

    public a(f navigationController, int i13) {
        this.f56275a = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(navigationController, "navProvider");
            this.f56276b = navigationController;
        } else {
            Intrinsics.checkNotNullParameter(navigationController, "navigationController");
            this.f56276b = navigationController;
        }
    }

    @Override // l82.g
    public final void e(j0 scope, h hVar, r eventIntake) {
        int i13 = this.f56275a;
        f fVar = this.f56276b;
        switch (i13) {
            case 0:
                b request = (b) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (request instanceof b) {
                    fVar.a(new u1(request, 11));
                    break;
                }
                break;
            default:
                j request2 = (j) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request2, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (request2 instanceof i) {
                    fVar.a(fu1.a.f62990i);
                    break;
                }
                break;
        }
    }
}
