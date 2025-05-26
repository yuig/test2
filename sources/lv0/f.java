package lv0;

import kotlin.jvm.internal.Intrinsics;
import mv0.k;
import uj2.q;
import yk1.n;
import yk1.r;
import yk1.t;

/* loaded from: classes5.dex */
public final class f extends t implements jv0.c {

    /* renamed from: a, reason: collision with root package name */
    public final h22.f f85004a;

    /* renamed from: b, reason: collision with root package name */
    public String f85005b;

    /* renamed from: c, reason: collision with root package name */
    public String f85006c;

    /* renamed from: d, reason: collision with root package name */
    public String f85007d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(uk1.d presenterPinalytics, q networkStateStream, h22.f storyPinService) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(storyPinService, "storyPinService");
        this.f85004a = storyPinService;
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        jv0.e view = (jv0.e) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "ideaPinsAffiliateTaggingListener");
        ((k) view).f88372j0 = this;
    }

    public final void p3(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (url.length() == 0) {
            return;
        }
        xj2.c o13 = this.f85004a.k(url, "creator").r(tk2.e.f118017c).l(wj2.c.a()).o(new ev0.g(15, new e(this, url, 0)), new ev0.g(16, new e(this, url, 1)));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        addDisposable(o13);
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        jv0.e view = (jv0.e) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "ideaPinsAffiliateTaggingListener");
        ((k) view).f88372j0 = this;
    }
}
