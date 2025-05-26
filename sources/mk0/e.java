package mk0;

import androidx.appcompat.widget.c2;
import ap.o;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vy0;
import com.pinterest.api.model.wy0;
import gi.m;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.f0;
import r41.k;
import x02.u2;
import x02.x0;
import x40.f7;
import yk1.n;

/* loaded from: classes5.dex */
public final class e extends yk1.b implements kk0.a {

    /* renamed from: a, reason: collision with root package name */
    public String f87327a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f87328b;

    /* renamed from: c, reason: collision with root package name */
    public final x0 f87329c;

    /* renamed from: d, reason: collision with root package name */
    public final u2 f87330d;

    /* renamed from: e, reason: collision with root package name */
    public final b60.b f87331e;

    /* renamed from: f, reason: collision with root package name */
    public final o f87332f;

    /* renamed from: g, reason: collision with root package name */
    public final w f87333g;

    /* renamed from: h, reason: collision with root package name */
    public final uk1.d f87334h;

    /* renamed from: i, reason: collision with root package name */
    public final a f87335i;

    /* renamed from: j, reason: collision with root package name */
    public final k f87336j;

    /* renamed from: k, reason: collision with root package name */
    public final m f87337k;

    /* renamed from: l, reason: collision with root package name */
    public final kk0.c f87338l;

    /* renamed from: m, reason: collision with root package name */
    public final f0 f87339m;

    /* renamed from: n, reason: collision with root package name */
    public final oc.c f87340n;

    /* renamed from: o, reason: collision with root package name */
    public final x92.b f87341o;

    /* renamed from: p, reason: collision with root package name */
    public final c2 f87342p;

    /* renamed from: q, reason: collision with root package name */
    public v7 f87343q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f87344r;

    /* renamed from: s, reason: collision with root package name */
    public final b f87345s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String boardId, boolean z13, x0 boardRepository, u2 userFeedRepository, b60.b activeUserManager, o uploadContactsUtil, w eventManager, uk1.d presenterPinalytics, m boardInviteUtils, kk0.c cVar, f0 pinalyticsFactory, oc.c apolloClient, x92.b graphQLBoardCollaboratorRemoteDataSource, c2 sharesheetUtils) {
        super(0);
        f boardCollaboratorOrdering = f.f87346a;
        k profileNavigator = k.f106176a;
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(userFeedRepository, "userFeedRepository");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(uploadContactsUtil, "uploadContactsUtil");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(boardCollaboratorOrdering, "boardCollaboratorOrdering");
        Intrinsics.checkNotNullParameter(profileNavigator, "profileNavigator");
        Intrinsics.checkNotNullParameter(boardInviteUtils, "boardInviteUtils");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        Intrinsics.checkNotNullParameter(graphQLBoardCollaboratorRemoteDataSource, "graphQLBoardCollaboratorRemoteDataSource");
        Intrinsics.checkNotNullParameter(sharesheetUtils, "sharesheetUtils");
        this.f87327a = boardId;
        this.f87328b = z13;
        this.f87329c = boardRepository;
        this.f87330d = userFeedRepository;
        this.f87331e = activeUserManager;
        this.f87332f = uploadContactsUtil;
        this.f87333g = eventManager;
        this.f87334h = presenterPinalytics;
        this.f87335i = boardCollaboratorOrdering;
        this.f87336j = profileNavigator;
        this.f87337k = boardInviteUtils;
        this.f87338l = cVar;
        this.f87339m = pinalyticsFactory;
        this.f87340n = apolloClient;
        this.f87341o = graphQLBoardCollaboratorRemoteDataSource;
        this.f87342p = sharesheetUtils;
        this.f87345s = new b(this);
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        kk0.b view = (kk0.b) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        view.W4(this);
        q3();
        this.f87333g.h(this.f87345s);
    }

    @Override // yk1.b
    public final void onUnbind() {
        this.f87333g.j(this.f87345s);
        super.onUnbind();
    }

    public final void p3(List collaborators, List collaboratorsPending) {
        wy0 k13;
        String l33;
        Intrinsics.checkNotNullParameter(collaborators, "collaborators");
        Intrinsics.checkNotNullParameter(collaboratorsPending, "collaboratorsPending");
        v7 board = this.f87343q;
        if (board == null || (k13 = board.k1()) == null) {
            return;
        }
        b60.b bVar = this.f87331e;
        if (bVar.d(k13)) {
            wy0 f13 = ((b60.d) bVar).f();
            l33 = f13 != null ? f13.l3() : null;
        } else {
            l33 = k13.l3();
        }
        vy0 H4 = k13.H4();
        H4.b0(l33);
        wy0 a13 = H4.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        lk0.d dVar = lk0.d.f83648a;
        f7 b13 = lk0.d.b(a13);
        wy0 f14 = ((b60.d) bVar).f();
        List collaborators2 = ((f) this.f87335i).b(b13, f14 != null ? lk0.d.b(f14) : null, collaborators);
        dl0.a a14 = jl0.b.f76936a.a(board);
        kk0.c cVar = this.f87338l;
        if (cVar != null) {
            cVar.S3(a14, gi2.b.h0(collaborators2));
        }
        if (isBound()) {
            kk0.b bVar2 = (kk0.b) getView();
            wy0 Q = com.bumptech.glide.d.Q(bVar);
            Intrinsics.checkNotNullParameter(board, "board");
            Intrinsics.checkNotNullParameter(collaborators2, "collaborators");
            Intrinsics.checkNotNullParameter(collaboratorsPending, "collaboratorsPending");
            bVar2.I(gi2.b.n0(board, collaborators2, collaboratorsPending, this.f87328b, Q.getId()));
        }
    }

    public final void q3() {
        xj2.c E = this.f87329c.R(this.f87327a).E(new pj0.f(13, new d(this, 0)), new pj0.f(14, c.f87322k));
        Intrinsics.checkNotNullExpressionValue(E, "subscribe(...)");
        addDisposable(E);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0070, code lost:
    
        if (kh2.d.e1(r2) != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r3() {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mk0.e.r3():void");
    }

    public final void s3(String boardIdToUpdate) {
        Intrinsics.checkNotNullParameter(boardIdToUpdate, "boardIdToUpdate");
        if (Intrinsics.d(this.f87327a, boardIdToUpdate)) {
            return;
        }
        this.f87327a = boardIdToUpdate;
        q3();
    }
}
