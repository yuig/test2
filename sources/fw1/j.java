package fw1;

import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.d0;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f63063a;

    /* renamed from: b, reason: collision with root package name */
    public final ll.j f63064b;

    /* renamed from: c, reason: collision with root package name */
    public final w f63065c;

    public j(d0 pinalytics, ll.j getHelpClickRouter, w eventManager) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(getHelpClickRouter, "getHelpClickRouter");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f63063a = pinalytics;
        this.f63064b = getHelpClickRouter;
        this.f63065c = eventManager;
    }
}
