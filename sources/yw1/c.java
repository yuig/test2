package yw1;

import com.pinterest.api.model.wy0;
import kh2.j;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import uj2.q;
import zx.l;
import zx.n;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final px.a f140316a;

    /* renamed from: b, reason: collision with root package name */
    public final b60.b f140317b;

    /* renamed from: c, reason: collision with root package name */
    public final yx.a f140318c;

    public c(px.a analyticsRepository, b60.b activeUserManager, yx.c filterRepository) {
        Intrinsics.checkNotNullParameter(analyticsRepository, "analyticsRepository");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(filterRepository, "filterRepository");
        this.f140316a = analyticsRepository;
        this.f140317b = activeUserManager;
        this.f140318c = filterRepository;
    }

    public final q a() {
        n t23;
        yx.c cVar = (yx.c) this.f140318c;
        l c13 = cVar.c();
        String Z = CollectionsKt.Z(dn.c.n(c13) ? f0.j(ww1.c.IMPRESSION, ww1.c.ENGAGEMENT, ww1.c.TOTAL_AUDIENCE, ww1.c.ENGAGERS, ww1.c.VIDEO_MRC_VIEW, ww1.c.VIDEO_V50_WATCH_TIME, ww1.c.OUTBOUND_CLICK, ww1.c.SAVE) : f0.j(ww1.c.IMPRESSION, ww1.c.ENGAGEMENT, ww1.c.TOTAL_AUDIENCE, ww1.c.ENGAGERS, ww1.c.OUTBOUND_CLICK, ww1.c.SAVE), null, null, null, 0, null, b.f140315i, 31);
        try {
            t23 = j.t2(c13, true);
        } catch (Exception unused) {
            cVar.d();
            t23 = j.t2(c13, true);
        }
        wy0 f13 = ((b60.d) this.f140317b).f();
        String uid = f13 != null ? f13.getUid() : null;
        if (uid == null) {
            uid = "";
        }
        q u13 = ((px.c) this.f140316a).a(new rx.b(uid, t23.f142983a, t23.f142984b, t23.f142988f, t23.f142985c, t23.f142986d, Boolean.valueOf(t23.f142987e), Z, t23.f142992j, Boolean.valueOf(t23.f142994l), Boolean.valueOf(t23.f142995m), Boolean.valueOf(t23.f142993k), t23.f142989g, t23.f142991i, t23.f142990h, t23.f142996n, t23.f142997o)).u();
        Intrinsics.checkNotNullExpressionValue(u13, "toObservable(...)");
        return u13;
    }
}
