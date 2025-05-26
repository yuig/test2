package jp;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.multisection.datasource.pagedlist.r0;
import cp.u;
import dl1.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k1.v0;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lh0.p0;
import qz.f0;
import rb2.p;
import rb2.q;
import wk1.n;
import x40.uc;
import xk2.m;
import xk2.v;

/* loaded from: classes3.dex */
public final class h extends n implements q {

    /* renamed from: a, reason: collision with root package name */
    public final oc.c f77260a;

    /* renamed from: b, reason: collision with root package name */
    public final p0 f77261b;

    /* renamed from: c, reason: collision with root package name */
    public final no1.d f77262c;

    /* renamed from: d, reason: collision with root package name */
    public final v f77263d;

    /* renamed from: e, reason: collision with root package name */
    public final ep.f f77264e;

    /* renamed from: f, reason: collision with root package name */
    public final v f77265f;

    /* renamed from: g, reason: collision with root package name */
    public final ep.e f77266g;

    /* renamed from: h, reason: collision with root package name */
    public final qb2.a f77267h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(wk1.c params, h12.a boardInviteApi, u20.d sendShareServiceWrapper, oc.c apolloClient, p0 conversationExperiments, no1.d contactRequestRemoteDataSource, qz.a cache, b60.b activeUserManager) {
        super(params);
        vd0.a c13;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(boardInviteApi, "boardInviteApi");
        Intrinsics.checkNotNullParameter(sendShareServiceWrapper, "sendShareServiceWrapper");
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        Intrinsics.checkNotNullParameter(conversationExperiments, "conversationExperiments");
        Intrinsics.checkNotNullParameter(contactRequestRemoteDataSource, "contactRequestRemoteDataSource");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f77260a = apolloClient;
        this.f77261b = conversationExperiments;
        this.f77262c = contactRequestRemoteDataSource;
        this.f77263d = m.b(new e(this, 0));
        f0 f0Var = new f0();
        f0Var.c(15, "page_size");
        f0Var.e("add_fields", n00.b.a(n00.c.SEND_SHARE_CONTACT));
        f0Var.e("hide_group_conversations", "false");
        vd0.c a13 = cache.a(f0Var);
        this.f77264e = new ep.f(sendShareServiceWrapper, getPinalytics(), a13 == null || ((c13 = a13.c("data")) != null && c13.d() == 0), activeUserManager, new e(this, 1));
        this.f77265f = m.b(new v0(27, boardInviteApi, this));
        this.f77266g = new ep.e(sendShareServiceWrapper);
        this.f77267h = new qb2.a();
    }

    @Override // rb2.q
    public final void N2(String boardId) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Iterator it = CollectionsKt.F0(u3().f135191h).iterator();
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
            u3().removeItem(i13);
        }
    }

    @Override // rb2.q
    public final void U1() {
        this.f77264e.n();
    }

    @Override // rb2.q
    public final void W() {
        u3().i2();
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        wk1.i iVar = (wk1.i) dataSources;
        iVar.b(this.f77264e);
        com.pinterest.framework.multisection.datasource.pagedlist.v vVar = new com.pinterest.framework.multisection.datasource.pagedlist.v((r0) u3(), false, 4);
        vVar.k(RecyclerViewTypes.VIEW_TYPE_INBOX_HEADER);
        iVar.b(vVar);
        com.pinterest.framework.multisection.datasource.pagedlist.v vVar2 = new com.pinterest.framework.multisection.datasource.pagedlist.v((r0) v3(), false, 4);
        vVar2.k(RecyclerViewTypes.VIEW_TYPE_MESSAGES_HEADER);
        iVar.b(vVar2);
        com.pinterest.framework.multisection.datasource.pagedlist.v vVar3 = new com.pinterest.framework.multisection.datasource.pagedlist.v((r0) this.f77266g, false, 4);
        vVar3.k(RecyclerViewTypes.VIEW_TYPE_CONTACTS_HEADER);
        iVar.b(vVar3);
        iVar.b(this.f77267h);
    }

    @Override // rb2.q
    public final void b1(String conversationId) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Iterator it = v3().f49103a.d().iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            } else if (Intrinsics.d(((z40.n) it.next()).a(), conversationId)) {
                break;
            } else {
                i13++;
            }
        }
        if (i13 != -1) {
            v3().removeItem(i13);
        }
    }

    @Override // rb2.q
    public final void c2(String contactRequestId) {
        boolean d2;
        Intrinsics.checkNotNullParameter(contactRequestId, "contactRequestId");
        Iterator it = CollectionsKt.F0(u3().f135191h).iterator();
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
            u3().removeItem(i13);
        }
    }

    @Override // wk1.n
    public final List convertToPlankModels(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ArrayList arrayList = new ArrayList();
        for (Object obj : items) {
            if (obj instanceof s) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // rb2.q
    public final void f1() {
        v3().i2();
    }

    @Override // rb2.q
    public final void u2(z40.n conversation) {
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        Iterator it = v3().f49103a.d().iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            } else if (Intrinsics.d(((z40.n) it.next()).a(), ((oo1.a) conversation).f96820c)) {
                break;
            } else {
                i13++;
            }
        }
        if (i13 != -1) {
            v3().u1(i13, conversation);
        }
    }

    public final ep.i u3() {
        return (ep.i) this.f77265f.getValue();
    }

    public final com.pinterest.framework.multisection.datasource.pagedlist.g v3() {
        return (com.pinterest.framework.multisection.datasource.pagedlist.g) this.f77263d.getValue();
    }

    public final void w3(wk1.e eVar) {
        xj2.c F = eVar.m().F(new vo.a(28, new ba.s(8, this, eVar)), new vo.a(29, g.f77254k), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
    }

    @Override // wk1.n, wk1.q, yk1.p
    /* renamed from: x3, reason: merged with bridge method [inline-methods] */
    public final void r3(p view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((nr0.e) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((u) view).S0 = this;
        w3(v3());
        w3(u3());
        xj2.c F = this.f77264e.K1().F(new d(0, new z3.m(view, 12)), new d(1, g.f77255l), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
    }
}
