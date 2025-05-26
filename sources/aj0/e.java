package aj0;

import c91.f;
import kotlin.jvm.internal.Intrinsics;
import ku1.l;
import m60.w;
import pb0.g;
import x02.i2;
import x02.x2;

/* loaded from: classes5.dex */
public final class e extends b {

    /* renamed from: j, reason: collision with root package name */
    public final f f15429j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(uk1.d presenterPinalytics, w eventManager, i2 pinRepository, x2 userRepository, l uriNavigator, f fVar) {
        super(presenterPinalytics, eventManager, pinRepository, userRepository, uriNavigator);
        g clock = g.f99432a;
        Intrinsics.checkNotNullParameter("homefeed_bubble", "referrerSource");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(uriNavigator, "uriNavigator");
        this.f15429j = fVar;
    }

    @Override // aj0.b
    public final void p3() {
        f fVar = this.f15429j;
        if (fVar != null) {
            fVar.a(new jh0.d(this, 4), null, c91.a.f26973a);
        }
    }
}
