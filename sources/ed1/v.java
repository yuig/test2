package ed1;

import ao2.v0;
import com.pinterest.api.model.v7;
import com.pinterest.feature.sharesheet.view.SharesheetBoardPreviewContainer;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.n4;
import h32.f1;
import h32.u0;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import x02.i2;
import x02.x0;

/* loaded from: classes5.dex */
public final class v extends yk1.c implements cd1.e {

    /* renamed from: a, reason: collision with root package name */
    public final b60.b f58711a;

    /* renamed from: b, reason: collision with root package name */
    public final i2 f58712b;

    /* renamed from: c, reason: collision with root package name */
    public final x0 f58713c;

    /* renamed from: d, reason: collision with root package name */
    public final i12.d f58714d;

    /* renamed from: e, reason: collision with root package name */
    public final ll.j f58715e;

    /* renamed from: f, reason: collision with root package name */
    public final x52.n f58716f;

    /* renamed from: g, reason: collision with root package name */
    public final m60.w f58717g;

    /* renamed from: h, reason: collision with root package name */
    public final an0.h f58718h;

    /* renamed from: i, reason: collision with root package name */
    public final qz.i f58719i;

    /* renamed from: j, reason: collision with root package name */
    public final String f58720j;

    /* renamed from: k, reason: collision with root package name */
    public final i91.b f58721k;

    /* renamed from: l, reason: collision with root package name */
    public v7 f58722l;

    /* renamed from: m, reason: collision with root package name */
    public final t f58723m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(uk1.e pinalyticsFactory, uj2.q networkStateStream, b60.b activeUserManager, i2 pinRepository, x0 boardRepository, i12.d boardVideoTemplateRepository, ll.j templateMapper, x52.n boardPreviewVideoHelper, m60.w eventManager, an0.h experimentHelper, qz.i pinsFetcher, String boardId, i91.b boardPreviewState) {
        super(((uk1.a) pinalyticsFactory).g(), networkStateStream);
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(boardVideoTemplateRepository, "boardVideoTemplateRepository");
        Intrinsics.checkNotNullParameter(templateMapper, "templateMapper");
        Intrinsics.checkNotNullParameter(boardPreviewVideoHelper, "boardPreviewVideoHelper");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(experimentHelper, "experimentHelper");
        Intrinsics.checkNotNullParameter(pinsFetcher, "pinsFetcher");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(boardPreviewState, "boardPreviewState");
        this.f58711a = activeUserManager;
        this.f58712b = pinRepository;
        this.f58713c = boardRepository;
        this.f58714d = boardVideoTemplateRepository;
        this.f58715e = templateMapper;
        this.f58716f = boardPreviewVideoHelper;
        this.f58717g = eventManager;
        this.f58718h = experimentHelper;
        this.f58719i = pinsFetcher;
        this.f58720j = boardId;
        this.f58721k = boardPreviewState;
        this.f58723m = new t(this);
    }

    @Override // an0.o
    public final void C() {
        if (isBound()) {
            ((SharesheetBoardPreviewContainer) getView()).setLoadState(yk1.i.ERROR);
        }
    }

    @Override // an0.o
    public final void X(an0.g previewConfig) {
        Intrinsics.checkNotNullParameter(previewConfig, "previewConfig");
        if (isBound()) {
            ((SharesheetBoardPreviewContainer) getView()).setLoadState(yk1.i.LOADED);
        }
    }

    @Override // yk1.p, yk1.b
    public final void onUnbind() {
        super.onUnbind();
        this.f58717g.j(this.f58723m);
        x52.n nVar = this.f58716f;
        nVar.c();
        nVar.f133896f.dispose();
        nVar.f133896f = new xj2.b();
        nVar.f133897g = null;
        nVar.f133901k = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q3(com.pinterest.api.model.v7 r18, bl2.c r19) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ed1.v.q3(com.pinterest.api.model.v7, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r3(com.pinterest.api.model.v7 r5, bl2.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ed1.s
            if (r0 == 0) goto L13
            r0 = r6
            ed1.s r0 = (ed1.s) r0
            int r1 = r0.f58706t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58706t = r1
            goto L18
        L13:
            ed1.s r0 = new ed1.s
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f58704r
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f58706t
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            ue.c.H(r6)
            goto L55
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            ue.c.H(r6)
            java.lang.String r6 = r5.getUid()
            java.lang.String r2 = "getUid(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            java.lang.Integer r5 = r5.l1()
            java.lang.String r2 = "getPinCount(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
            int r5 = r5.intValue()
            r0.f58706t = r3
            qz.i r2 = r4.f58719i
            r3 = 25
            java.lang.Object r6 = r2.b(r6, r5, r3, r0)
            if (r6 != r1) goto L55
            return r1
        L55:
            com.pinterest.api.adapter.coroutine.NetworkResponse r6 = (com.pinterest.api.adapter.coroutine.NetworkResponse) r6
            java.lang.Object r5 = kh2.k3.f0(r6)
            qz.j r5 = (qz.j) r5
            if (r5 == 0) goto L62
            java.util.List r5 = r5.f105410a
            goto L63
        L62:
            r5 = 0
        L63:
            if (r5 != 0) goto L67
            kotlin.collections.q0 r5 = kotlin.collections.q0.f80391a
        L67:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ed1.v.r3(com.pinterest.api.model.v7, bl2.c):java.lang.Object");
    }

    @Override // yk1.p
    /* renamed from: s3, reason: merged with bridge method [inline-methods] */
    public final void r3(SharesheetBoardPreviewContainer view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        Intrinsics.checkNotNullParameter(this, "listener");
        view.f45338l = this;
        view.f48408s = this;
        ao2.j0 scope = getScope();
        ko2.f fVar = v0.f20219a;
        kotlin.jvm.internal.j.z(scope, ((bo2.e) ho2.q.f69782a).f23612f, null, new u(this, this.f58720j, null), 2);
        this.f58717g.h(this.f58723m);
    }

    public final void t3() {
        v7 v7Var = this.f58722l;
        if (v7Var == null) {
            return;
        }
        ScreenLocation screenLocation = (ScreenLocation) n4.f51146c.getValue();
        Pair pair = new Pair("com.pinterest.EXTRA_BOARD_ID", v7Var.getUid());
        Pair pair2 = new Pair("com.pinterest.EXTRA_BOARD_NAME", v7Var.j1());
        Pair pair3 = new Pair("ARG_BOARD_PINS_COUNT", v7Var.l1());
        i91.b bVar = this.f58721k;
        this.f58717g.d(Navigation.v1(screenLocation, e0.t.j(pair, pair2, pair3, new Pair("ARG_PREVIEW_STATE", bVar))));
        nx.d0 pinalytics = getPinalytics();
        f1 f1Var = f1.TAP;
        String uid = v7Var.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        h32.i0 l03 = kh2.b0.l0(uid, u0.EDIT_BUTTON);
        String uid2 = v7Var.getUid();
        Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
        pinalytics.U(l03, f1Var, null, null, kh2.b0.u0(uid2, bVar.f71799b, null), false);
    }
}
