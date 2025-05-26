package r31;

import b60.d;
import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nr0.e;
import nr0.l;
import nr0.m;
import qz.f0;
import so.n6;
import so.oa;
import so.r8;
import so.v1;
import u31.f;
import wk1.c;
import wk1.i;
import wk1.n;
import x02.x2;

/* loaded from: classes5.dex */
public final class b extends n implements o31.a {

    /* renamed from: a, reason: collision with root package name */
    public final w f106091a;

    /* renamed from: b, reason: collision with root package name */
    public final d31.a f106092b;

    /* renamed from: c, reason: collision with root package name */
    public final p31.a f106093c;

    /* renamed from: d, reason: collision with root package name */
    public long f106094d;

    /* renamed from: e, reason: collision with root package name */
    public final a f106095e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String userId, c params, v1 scheduledPinsPreviewFetchedListFactory, w eventManager, m viewBinderDelegateFactory, b60.b activeUserManager, x2 userRepository) {
        super(params);
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(scheduledPinsPreviewFetchedListFactory, "scheduledPinsPreviewFetchedListFactory");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(viewBinderDelegateFactory, "viewBinderDelegateFactory");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f106091a = eventManager;
        wy0 f13 = ((d) activeUserManager).f();
        boolean z13 = false;
        if (f13 != null && dl2.b.S1(f13, userId)) {
            z13 = true;
        }
        uk1.d presenterPinalytics = getPresenterPinalytics();
        qa2.n nVar = params.f130131b;
        l viewBinderDelegate = ((n6) viewBinderDelegateFactory).a(presenterPinalytics, nVar.f103320a, nVar, params.f130137h);
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(viewBinderDelegate, "viewBinderDelegate");
        d31.a aVar = new d31.a(a.a.p(new StringBuilder("business/users/"), userId, "/bizpro/feed/"), viewBinderDelegate, null, null, null, null, null, null, null, 0L, null, 8188);
        f0 f0Var = new f0();
        f0Var.e("fields", n00.b.a(z13 ? n00.c.PIN_STATS_PIN_FEED_WITH_BOARD_SECTION : n00.c.PIN_STATS_PIN_FEED));
        f0Var.c(15, "page_size");
        aVar.f49121k = f0Var;
        this.f106092b = aVar;
        r8 r8Var = scheduledPinsPreviewFetchedListFactory.f114666a;
        x2 x2Var = (x2) r8Var.f114090a.f113800m3.get();
        oa oaVar = r8Var.f114090a;
        this.f106093c = new p31.a(userId, x2Var, (k22.m) oaVar.Y4.get(), (b60.b) oaVar.f113850p0.get());
        this.f106095e = new a(this);
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        i iVar = (i) dataSources;
        iVar.b(this.f106093c);
        iVar.b(this.f106092b);
    }

    @Override // wk1.n, wk1.q, yk1.p, yk1.b
    public final void onUnbind() {
        this.f106091a.j(this.f106095e);
        super.onUnbind();
    }

    @Override // wk1.n, wk1.q, yk1.p
    /* renamed from: u3, reason: merged with bridge method [inline-methods] */
    public final void r3(o31.b view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((e) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((f) view).V0 = this;
        this.f106091a.h(this.f106095e);
    }

    public final void v3() {
        if (isBound()) {
            long currentTimeMillis = System.currentTimeMillis();
            boolean z13 = currentTimeMillis - this.f106094d > 300000;
            if (z13) {
                this.f106094d = currentTimeMillis;
            }
            if (z13) {
                this.f106093c.i2();
            }
        }
    }
}
