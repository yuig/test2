package p70;

import com.pinterest.api.model.md0;
import kotlin.jvm.internal.Intrinsics;
import m60.u;
import n70.h;
import tk0.n;
import u50.r;
import ub1.g;

/* loaded from: classes5.dex */
public final /* synthetic */ class c implements ak2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f99066a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f99067b;

    public /* synthetic */ c(r rVar, int i13) {
        this.f99066a = i13;
        this.f99067b = rVar;
    }

    @Override // ak2.a
    public final void run() {
        int i13 = this.f99066a;
        r eventIntake = this.f99067b;
        switch (i13) {
            case 0:
                eventIntake.a(h.f89614a);
                eventIntake.a(n70.b.f89602a);
                u.f85943a.d(new md0());
                break;
            case 1:
                Intrinsics.checkNotNullParameter(eventIntake, "$eventIntake");
                eventIntake.a(new n(true));
                break;
            case 2:
                Intrinsics.checkNotNullParameter(eventIntake, "$eventIntake");
                eventIntake.a(new n(true));
                break;
            case 3:
                eventIntake.a(ma1.h.f86784a);
                break;
            default:
                eventIntake.a(g.f121719a);
                break;
        }
    }
}
