package nw0;

import cp1.p;
import is1.l;
import k22.m;
import kotlin.jvm.internal.Intrinsics;
import ku1.j;
import lb0.q;
import nx.d0;
import ow0.c;
import qy1.d;
import rg0.n;
import yk1.b;

/* loaded from: classes5.dex */
public final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    public final n f92364a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f92365b;

    /* renamed from: c, reason: collision with root package name */
    public final m f92366c;

    /* renamed from: d, reason: collision with root package name */
    public final l f92367d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(n experience, d0 pinalytics, m userService, l locationUtils) {
        super(0);
        Intrinsics.checkNotNullParameter(experience, "experience");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(locationUtils, "locationUtils");
        this.f92364a = experience;
        this.f92365b = pinalytics;
        this.f92366c = userService;
        this.f92367d = locationUtils;
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        com.pinterest.feature.location.a view = (com.pinterest.feature.location.a) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        this.f92364a.g();
        Intrinsics.checkNotNullParameter(this, "listener");
        ((c) view).f97928k0 = this;
    }

    public final void p3() {
        this.f92364a.c(null, null);
        if (isBound()) {
            ((j) ((c) ((com.pinterest.feature.location.a) getView())).o7()).f();
        }
    }

    public final void q3(q prefsManagerPersisted, p activity) {
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f92364a.a(null, null);
        if (isBound()) {
            au0.a aVar = new au0.a(this, 14);
            d.f(prefsManagerPersisted, activity, d.f105359a, new is1.q(activity, this.f92365b, this.f92366c, this.f92367d, aVar));
        }
    }
}
