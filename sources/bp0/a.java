package bp0;

import ap0.b;
import ap0.i;
import fk2.l;
import kotlin.jvm.internal.Intrinsics;
import tk2.e;
import uj2.q;
import uk1.d;
import wj2.c;
import yk1.n;
import yk1.r;
import yk1.t;

/* loaded from: classes5.dex */
public final class a extends t implements ap0.a {

    /* renamed from: a, reason: collision with root package name */
    public final c30.a f23649a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d pinalytics, q networkStateStream, c30.a userStateService) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(userStateService, "userStateService");
        this.f23649a = userStateService;
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        b view = (b) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "businessOnboardingListener");
        ((i) view).f20316o0 = this;
    }

    public final void p3(kl0.t errorFunction, boolean z13) {
        String str;
        int i13;
        Intrinsics.checkNotNullParameter(errorFunction, "errorFunction");
        if (z13) {
            str = "BIZ_CREATE_NUX_COMPLETE";
            i13 = 140015;
        } else {
            str = "BIZ_CONVERT_NUX_COMPLETE";
            i13 = 140016;
        }
        l h10 = this.f23649a.c(str, i13).l(e.f118017c).h(c.a());
        Intrinsics.checkNotNullExpressionValue(h10, "observeOn(...)");
        nl.b.r(h10, null, errorFunction, 1);
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        b view = (b) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "businessOnboardingListener");
        ((i) view).f20316o0 = this;
    }
}
