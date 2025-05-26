package mp1;

import h32.f1;
import h32.i0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes2.dex */
public final class b implements l {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f87921a;

    /* renamed from: b, reason: collision with root package name */
    public final c f87922b;

    public b(d0 pinalytics, c handshakeEventGenerator) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(handshakeEventGenerator, "handshakeEventGenerator");
        this.f87921a = pinalytics;
        this.f87922b = handshakeEventGenerator;
    }

    public final void a(String failReason) {
        Intrinsics.checkNotNullParameter(failReason, "failReason");
        this.f87922b.getClass();
        Intrinsics.checkNotNullParameter(failReason, "failReason");
        i0 context = new i0(null, null, null, null, null, null);
        f1 eventType = f1.AMAZON_ACCT_UNCLAIMING_FAILURE;
        HashMap o13 = ep.b.o("fail_reason", failReason);
        Unit unit = Unit.f80348a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.f87921a.g(eventType, null, o13, false);
    }

    public final void b(String failReason, String errorCode) {
        Intrinsics.checkNotNullParameter(failReason, "failReason");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        zy.a a13 = this.f87922b.a(failReason, errorCode, null);
        this.f87921a.g(a13.f143049b, a13.f143050c, a13.f143051d, a13.f143054g);
    }
}
