package dm0;

import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.board.organize.f;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import d70.e;
import d70.g;
import dl1.s;
import dm0.d;
import fk2.x;
import hk2.u;
import jc0.m;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import m60.w;
import sq0.c0;
import uj2.l;
import wk1.i;
import wk1.q;
import x02.e0;
import x02.q0;
import x02.s0;
import x02.x0;
import x02.y;

/* loaded from: classes5.dex */
public final class d extends q implements com.pinterest.feature.board.organize.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f55338a;

    /* renamed from: b, reason: collision with root package name */
    public final f f55339b;

    /* renamed from: c, reason: collision with root package name */
    public final y f55340c;

    /* renamed from: d, reason: collision with root package name */
    public final x0 f55341d;

    /* renamed from: e, reason: collision with root package name */
    public final b60.b f55342e;

    /* renamed from: f, reason: collision with root package name */
    public final bq.c f55343f;

    /* renamed from: g, reason: collision with root package name */
    public final vk1.a f55344g;

    /* renamed from: h, reason: collision with root package name */
    public final w f55345h;

    /* renamed from: i, reason: collision with root package name */
    public int f55346i;

    /* renamed from: j, reason: collision with root package name */
    public v7 f55347j;

    /* renamed from: k, reason: collision with root package name */
    public final bq.b f55348k;

    /* renamed from: l, reason: collision with root package name */
    public final bm0.a f55349l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.pinterest.feature.board.organize.presenter.BoardOrganizePresenter$boardModelFilter$1] */
    public d(uk1.d pinalytics, uj2.q networkStateStream, String boardUid, f organizeMode, y boardFeedRepository, x0 boardRepository, b60.b activeUserManager, bq.c boardSortUtils, cm0.b boardRearrangeInteractor, w eventManager) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(boardUid, "boardUid");
        Intrinsics.checkNotNullParameter(organizeMode, "organizeMode");
        Intrinsics.checkNotNullParameter(boardFeedRepository, "boardFeedRepository");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(boardSortUtils, "boardSortUtils");
        Intrinsics.checkNotNullParameter(boardRearrangeInteractor, "boardRearrangeInteractor");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f55338a = boardUid;
        this.f55339b = organizeMode;
        this.f55340c = boardFeedRepository;
        this.f55341d = boardRepository;
        this.f55342e = activeUserManager;
        this.f55343f = boardSortUtils;
        this.f55344g = boardRearrangeInteractor;
        this.f55345h = eventManager;
        bq.b b13 = boardSortUtils.b();
        Intrinsics.checkNotNullExpressionValue(b13, "getMyBoardSortOption(...)");
        this.f55348k = b13;
        ?? r73 = new lk1.a() { // from class: com.pinterest.feature.board.organize.presenter.BoardOrganizePresenter$boardModelFilter$1
            @Override // lk1.a
            public final boolean b(s model) {
                Intrinsics.checkNotNullParameter(model, "model");
                d dVar = d.this;
                if (dVar.f55339b == f.BOARD_ORGANIZE_MODE_REORDER) {
                    return false;
                }
                if (Intrinsics.d(model.getUid(), dVar.f55338a)) {
                    return true;
                }
                if (!(model instanceof v7)) {
                    return false;
                }
                Boolean f13 = ((v7) model).f1();
                Intrinsics.f(f13);
                return f13.booleanValue();
            }
        };
        uk1.d presenterPinalytics = getPresenterPinalytics();
        uj2.q<Boolean> networkStateStream2 = getNetworkStateStream();
        wy0 f13 = ((b60.d) activeUserManager).f();
        String k13 = a.a.k("users/", f13 != null ? f13.getUid() : null, "/boards/feed/");
        f fVar = f.BOARD_ORGANIZE_MODE_MERGE;
        this.f55349l = new bm0.a(presenterPinalytics, networkStateStream2, k13, organizeMode == fVar ? bq.b.ALPHABETICAL : bq.b.CUSTOM, r73, organizeMode, new c(this, 0));
        if (organizeMode == fVar && z.j(boardUid)) {
            throw new IllegalArgumentException("Board uid must be provided for BoardOrganizeContract.BOARD_ORGANIZE_MODE_MERGE mode");
        }
    }

    @Override // y92.e
    public final void D1(int i13) {
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((i) dataSources).b(this.f55349l);
    }

    @Override // y92.e
    public final void c0(int i13, int i14) {
        this.f55349l.n3(i13, i14);
        if (i13 == i14) {
            return;
        }
        this.f55346i = Math.max(this.f55346i, Math.max(i13, i14));
    }

    @Override // y92.e
    public final void o3(int i13, int i14) {
        GestaltButton gestaltButton;
        if (i13 == i14 || (gestaltButton = ((em0.d) ((com.pinterest.feature.board.organize.c) getView())).J0) == null) {
            return;
        }
        gestaltButton.d(new m(true, 25));
    }

    @Override // wk1.q, yk1.p, yk1.b
    public final void onUnbind() {
        em0.d dVar = (em0.d) ((com.pinterest.feature.board.organize.c) getView());
        dVar.E0 = null;
        dVar.H0.h(null);
        super.onUnbind();
    }

    @Override // wk1.q, yk1.p
    /* renamed from: t3, reason: merged with bridge method [inline-methods] */
    public final void r3(com.pinterest.feature.board.organize.c view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((c0) view);
        em0.d dVar = (em0.d) view;
        dVar.E0 = this;
        dVar.H0.h(this);
        int i13 = 1;
        if (b.f55335a[this.f55339b.ordinal()] != 1) {
            fo1.a i73 = dVar.i7();
            if (i73 != null) {
                GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) i73;
                gestaltToolbarImpl.Y(h70.c.merge_board);
                gestaltToolbarImpl.V(h70.c.merge_board_subtitle);
            }
            addDisposable(nl.b.m(this.f55341d.S(this.f55338a), "BoardOrganizePresenter:fetchBoardForMerge", new c(this, i13)));
            return;
        }
        fo1.a i74 = dVar.i7();
        if (i74 != null) {
            GestaltToolbarImpl gestaltToolbarImpl2 = (GestaltToolbarImpl) i74;
            gestaltToolbarImpl2.Y(g.reorder_boards);
            gestaltToolbarImpl2.b(e.view_done_actionbar);
            GestaltButton gestaltButton = (GestaltButton) gestaltToolbarImpl2.findViewById(d70.d.done_btn);
            if (gestaltButton != null) {
                gestaltButton.d(em0.c.f59586k);
                gestaltButton.e(new yb0.b(dVar, 22));
            } else {
                gestaltButton = null;
            }
            dVar.J0 = gestaltButton;
        }
    }

    public final void u3(v7 destination) {
        Intrinsics.checkNotNullParameter(destination, "destinationBoard");
        v7 source = this.f55347j;
        if (source != null) {
            x0 x0Var = this.f55341d;
            x0Var.getClass();
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(destination, "destination");
            String uid = destination.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            String uid2 = source.getUid();
            Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
            l G = x0Var.G(new q0(uid, uid2), destination);
            G.getClass();
            x xVar = new x(new u(G).e(new xo.c(x0Var, source, destination, 17)), new e0(3, new s0(x0Var, 4)), ck2.i.f27924d, ck2.i.f27923c);
            Intrinsics.checkNotNullExpressionValue(xVar, "doOnSubscribe(...)");
            addDisposable(nl.b.k(xVar, "BoardOrganizePresenter:mergeBoards", new k1.q(this, source, destination, 22)));
        }
    }
}
