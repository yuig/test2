package dd0;

import k90.i;
import kotlin.jvm.internal.Intrinsics;
import ra0.l0;
import tk2.e;
import x02.x2;
import yk1.n;
import yk1.r;
import yk1.t;

/* loaded from: classes5.dex */
public final class b extends t {

    /* renamed from: a, reason: collision with root package name */
    public final k12.a f54439a;

    /* renamed from: b, reason: collision with root package name */
    public final x2 f54440b;

    /* renamed from: c, reason: collision with root package name */
    public final b60.b f54441c;

    /* renamed from: d, reason: collision with root package name */
    public final a71.c f54442d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(uj2.q r2, uk1.e r3, k12.a r4, x02.x2 r5, b60.b r6) {
        /*
            r1 = this;
            java.lang.String r0 = "networkStateStream"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "presenterPinalyticsFactory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "brandedContentService"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "userRepository"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "activeUserManager"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            uk1.a r3 = (uk1.a) r3
            uk1.d r0 = r3.g()
            r1.<init>(r0, r2)
            r1.f54439a = r4
            r1.f54440b = r5
            r1.f54441c = r6
            a71.c r2 = new a71.c
            uk1.d r3 = r3.g()
            nx.d0 r3 = r3.f122379a
            java.lang.String r4 = "getPinalytics(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r4 = 0
            r2.<init>(r3, r4)
            r1.f54442d = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dd0.b.<init>(uj2.q, uk1.e, k12.a, x02.x2, b60.b):void");
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        com.pinterest.creatorHub.feature.brandedContent.a view = (com.pinterest.creatorHub.feature.brandedContent.a) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((ed0.c) view).f58504k0 = this;
    }

    public final void p3() {
        xj2.c o13 = this.f54439a.a(true).r(e.f118017c).l(wj2.c.a()).o(new i(10, new l0(this, 17)), new i(11, a.f54435k));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        addDisposable(o13);
        this.f54442d.d(md0.a.BRANDED_CONTENT_ENROLLMENT_TAPPED);
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        com.pinterest.creatorHub.feature.brandedContent.a view = (com.pinterest.creatorHub.feature.brandedContent.a) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((ed0.c) view).f58504k0 = this;
    }
}
