package com.pinterest.feature.pin.closeup.datasource;

import kotlin.jvm.internal.Intrinsics;
import uj2.q;
import wt1.e0;

/* loaded from: classes5.dex */
public final class e extends e0 implements nr0.j {

    /* renamed from: h, reason: collision with root package name */
    public final h22.f f46934h;

    /* renamed from: i, reason: collision with root package name */
    public final String f46935i;

    /* renamed from: j, reason: collision with root package name */
    public ek2.j f46936j;

    public e(h22.f storyPinService, String pinUid, q networkStateStream, uk1.d presenterPinalytics) {
        Intrinsics.checkNotNullParameter(storyPinService, "storyPinService");
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        this.f46934h = storyPinService;
        this.f46935i = pinUid;
        o(919191, new ni0.f(pinUid, networkStateStream, new au0.a(presenterPinalytics, 25)));
    }

    @Override // nr0.g
    public final boolean c3(int i13) {
        return true;
    }

    @Override // nr0.g
    public final boolean f(int i13) {
        return true;
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return 919191;
    }

    @Override // nr0.g
    public final boolean n0(int i13) {
        return true;
    }

    @Override // wk1.e
    public final void onUnbind() {
        ek2.j jVar = this.f46936j;
        if (jVar != null) {
            bk2.c.dispose(jVar);
        }
    }

    public final void u() {
        if (a() > 0) {
            return;
        }
        ek2.j jVar = this.f46936j;
        if (jVar != null) {
            bk2.c.dispose(jVar);
        }
        this.f46936j = (ek2.j) this.f46934h.loadTaggedProducts(this.f46935i, n00.b.a(n00.c.SHOPPING_FULL_FEED_FIELDS)).l(wj2.c.a()).r(tk2.e.f118017c).k(new wv0.a(17, d.f46931j)).u().F(new com.pinterest.feature.pin.i(4, new dx0.d(this, 23)), new com.pinterest.feature.pin.i(5, d.f46932k), ck2.i.f27923c, ck2.i.f27924d);
    }
}
