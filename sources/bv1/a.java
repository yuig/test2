package bv1;

import dl1.b0;
import fk2.g;
import fv1.b;
import hk1.t;
import kotlin.jvm.internal.Intrinsics;
import tk2.e;
import wj2.c;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final uo.a f23956a;

    /* renamed from: b, reason: collision with root package name */
    public final b f23957b;

    public a(uo.a newsHubBadgeDataSource, b notificationCount) {
        Intrinsics.checkNotNullParameter(newsHubBadgeDataSource, "newsHubBadgeDataSource");
        Intrinsics.checkNotNullParameter(notificationCount, "notificationCount");
        this.f23956a = newsHubBadgeDataSource;
        this.f23957b = notificationCount;
    }

    public final g a() {
        g i13 = this.f23956a.b().r(e.f118017c).l(c.a()).k(new b0(27, new t(this, 25))).i();
        Intrinsics.checkNotNullExpressionValue(i13, "ignoreElement(...)");
        return i13;
    }
}
