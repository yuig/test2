package px0;

import com.pinterest.feature.ideaPinCreation.closeup.view.r0;
import dl1.s;
import hs1.t;
import i32.l;
import i32.y0;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import lh0.h2;
import m60.g0;
import nx.d0;
import om0.m1;
import sq0.b0;
import wk1.q;
import wt1.c0;
import wt1.k;
import wt1.p;
import x02.w1;
import x40.uc;
import xk2.m;
import xk2.v;
import z40.n;

/* loaded from: classes5.dex */
public final class i extends q implements rb2.q {

    /* renamed from: a, reason: collision with root package name */
    public final w1 f101606a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f101607b;

    /* renamed from: c, reason: collision with root package name */
    public w12.a f101608c;

    /* renamed from: d, reason: collision with root package name */
    public final h2 f101609d;

    /* renamed from: e, reason: collision with root package name */
    public final sq0.f f101610e;

    /* renamed from: f, reason: collision with root package name */
    public final nx0.d f101611f;

    /* renamed from: g, reason: collision with root package name */
    public final nx0.c f101612g;

    /* renamed from: h, reason: collision with root package name */
    public final v f101613h;

    /* renamed from: i, reason: collision with root package name */
    public final v f101614i;

    /* renamed from: j, reason: collision with root package name */
    public final qb2.a f101615j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(uk1.d presenterPinalytics, uj2.q networkStateStream, w1 newsHubRepository, w12.b newsHubService, uo.a graphQLNewsHubDataSource, oc.c apolloClient, h12.a boardInviteApi, no1.d contactRequestRemoteDataSource, nu1.a inAppNavigator, g0 pageSizeProvider, sx0.b sectionTitle) {
        super(presenterPinalytics, networkStateStream);
        nx0.d dVar;
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(newsHubRepository, "newsHubRepository");
        Intrinsics.checkNotNullParameter(newsHubService, "newsHubService");
        Intrinsics.checkNotNullParameter(graphQLNewsHubDataSource, "graphQLNewsHubDataSource");
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        Intrinsics.checkNotNullParameter(boardInviteApi, "boardInviteApi");
        Intrinsics.checkNotNullParameter(contactRequestRemoteDataSource, "contactRequestRemoteDataSource");
        Intrinsics.checkNotNullParameter(inAppNavigator, "inAppNavigator");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(sectionTitle, "sectionTitle");
        this.f101606a = newsHubRepository;
        this.f101608c = w12.a.None;
        h2 b13 = h2.f83379b.b();
        this.f101609d = b13;
        sq0.f fVar = new sq0.f(t.a(), new hf0.b(), pageSizeProvider, e0.b(new qx0.b(0)), 8);
        this.f101610e = fVar;
        if (b13.d()) {
            d0 pinalytics = getPinalytics();
            Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
            Intrinsics.checkNotNullParameter(inAppNavigator, "inAppNavigator");
            Intrinsics.checkNotNullParameter(newsHubService, "newsHubService");
            Intrinsics.checkNotNullParameter(graphQLNewsHubDataSource, "graphQLNewsHubDataSource");
            dVar = new nx0.d();
            dVar.o(296, new xv.g(pinalytics, inAppNavigator, newsHubService, graphQLNewsHubDataSource));
        } else {
            dVar = null;
        }
        nx0.d dVar2 = dVar;
        this.f101611f = dVar2;
        this.f101612g = new nx0.c(b13, sectionTitle, presenterPinalytics, inAppNavigator, newsHubService, graphQLNewsHubDataSource, dVar2, fVar);
        this.f101613h = m.b(new m1(27, boardInviteApi, contactRequestRemoteDataSource));
        this.f101614i = m.b(new m1(28, apolloClient, this));
        this.f101615j = new qb2.a();
    }

    @Override // rb2.q
    public final void N2(String boardId) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Iterator it = CollectionsKt.F0(t3().f135191h).iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            s sVar = (s) it.next();
            if ((sVar instanceof pb2.a) && Intrinsics.d(((pb2.a) sVar).f99499a.f39332b, boardId)) {
                break;
            } else {
                i13++;
            }
        }
        if (i13 != -1) {
            t3().removeItem(i13);
        }
    }

    @Override // rb2.q
    public final void U1() {
    }

    @Override // rb2.q
    public final void W() {
        t3().i2();
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        if (this.f101609d.d()) {
            nx0.d dVar = this.f101611f;
            if (dVar != null) {
                ((wk1.i) dataSources).b(dVar);
            }
            wk1.i iVar = (wk1.i) dataSources;
            iVar.b(t3());
            iVar.b(u3());
            iVar.b(this.f101615j);
        }
        ((wk1.i) dataSources).b(this.f101612g);
    }

    @Override // rb2.q
    public final void b1(String conversationId) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Iterator it = u3().f49103a.d().iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            } else if (Intrinsics.d(((pb2.f) it.next()).getUid(), conversationId)) {
                break;
            } else {
                i13++;
            }
        }
        if (i13 != -1) {
            u3().removeItem(i13);
        }
    }

    @Override // rb2.q
    public final void c2(String contactRequestId) {
        boolean d2;
        Intrinsics.checkNotNullParameter(contactRequestId, "contactRequestId");
        Iterator it = CollectionsKt.F0(t3().f135191h).iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            s sVar = (s) it.next();
            if (sVar instanceof pb2.c) {
                d2 = Intrinsics.d(((uc) ((pb2.c) sVar).f99501a).f133465b, contactRequestId);
            } else if (sVar instanceof pb2.b) {
                d2 = Intrinsics.d(((uc) ((pb2.b) sVar).f99500a).f133465b, contactRequestId);
            } else {
                continue;
                i13++;
            }
            if (d2) {
                break;
            } else {
                i13++;
            }
        }
        if (i13 != -1) {
            t3().removeItem(i13);
        }
    }

    @Override // rb2.q
    public final void f1() {
        u3().i2();
    }

    @Override // wk1.q
    public final void onStateUpdated(c0 state, wt1.d0 remoteList) {
        tl1.i iVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(remoteList, "remoteList");
        super.onStateUpdated(state, remoteList);
        if ((remoteList instanceof nx0.d) && (state instanceof wt1.m)) {
            ((sx0.g) ((mx0.c) getView())).E8(0, false);
        }
        if (state instanceof k) {
            this.f101607b = true;
            return;
        }
        if (isBound() && this.f101607b && (state instanceof p) && (iVar = state.f131096b) != null && iVar.f118095a > 0) {
            sx0.g gVar = (sx0.g) ((mx0.c) getView());
            gVar.getClass();
            ur0.g.g(y0.ANDROID_NOTIFICATIONS_TAKEOVER, gVar, null);
            this.f101607b = false;
        }
    }

    @Override // wk1.q, yk1.p, yk1.b
    public final void onUnbind() {
        sx0.g gVar = (sx0.g) ((mx0.c) getView());
        if (gVar.f115624z0 == null) {
            Intrinsics.r("educationHelper");
            throw null;
        }
        v vVar = zf0.f.f141903e;
        if (zf0.f.f(y0.ANDROID_NOTIFICATIONS_TAKEOVER, new l[]{l.ANDROID_NEWS_HUB_SCROLL_PROMPT})) {
            gVar.f7().d(new dg0.c(dg0.b.DISMISS));
        }
        ((sx0.g) ((mx0.c) getView())).L0 = null;
        super.onUnbind();
    }

    public final qb2.d t3() {
        return (qb2.d) this.f101613h.getValue();
    }

    @Override // rb2.q
    public final void u2(n conversation) {
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        Iterator it = u3().f49103a.d().iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            } else if (Intrinsics.d(((pb2.f) it.next()).getUid(), ((oo1.a) conversation).f96820c)) {
                break;
            } else {
                i13++;
            }
        }
        if (i13 != -1) {
            u3().u1(i13, new pb2.e(conversation));
        }
    }

    public final com.pinterest.framework.multisection.datasource.pagedlist.g u3() {
        return (com.pinterest.framework.multisection.datasource.pagedlist.g) this.f101614i.getValue();
    }

    @Override // wk1.q, yk1.p
    /* renamed from: v3, reason: merged with bridge method [inline-methods] */
    public final void r3(mx0.c view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((sq0.c0) view);
        sx0.g gVar = (sx0.g) view;
        gVar.L0 = this;
        if (this.f101609d.d()) {
            gVar.M0 = this;
        }
        xj2.c F = this.f101606a.f131518b.A(wj2.c.a()).F(new hx0.a(9, new r0(28, this, view)), new hx0.a(10, d.f101593q), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
        if (isBound()) {
            yk1.n view2 = getView();
            b0 b0Var = view2 instanceof b0 ? (b0) view2 : null;
            if (b0Var == null) {
                return;
            }
            b0Var.addItemVisibilityChangeListener(new h(0, this, b0Var));
        }
    }
}
