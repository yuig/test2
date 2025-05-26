package pj0;

import g4.u;
import i32.y0;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import lh0.n1;
import lh0.t;
import m60.g0;
import m60.w;
import nx.b0;
import nx.d1;
import so.n6;
import t3.s1;
import wt1.c0;
import x02.i2;
import x02.x0;
import x02.z0;
import yk1.v;

/* loaded from: classes5.dex */
public class s extends e implements fl0.a, mj0.a {

    /* renamed from: r, reason: collision with root package name */
    public static final List f100264r = f0.j(x22.c.HF_STRUCTURED_FEED_STORY, x22.c.HOME_FEED_SWIPE);

    /* renamed from: a, reason: collision with root package name */
    public final hk0.m f100265a;

    /* renamed from: b, reason: collision with root package name */
    public final x22.c f100266b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f100267c;

    /* renamed from: d, reason: collision with root package name */
    public final z32.f f100268d;

    /* renamed from: e, reason: collision with root package name */
    public final x0 f100269e;

    /* renamed from: f, reason: collision with root package name */
    public final i2 f100270f;

    /* renamed from: g, reason: collision with root package name */
    public final rg0.s f100271g;

    /* renamed from: h, reason: collision with root package name */
    public final t f100272h;

    /* renamed from: i, reason: collision with root package name */
    public final g70.h f100273i;

    /* renamed from: j, reason: collision with root package name */
    public n1 f100274j;

    /* renamed from: k, reason: collision with root package name */
    public final q f100275k;

    /* renamed from: l, reason: collision with root package name */
    public final String f100276l;

    /* renamed from: m, reason: collision with root package name */
    public final String f100277m;

    /* renamed from: n, reason: collision with root package name */
    public final w f100278n;

    /* renamed from: o, reason: collision with root package name */
    public c0 f100279o;

    /* renamed from: p, reason: collision with root package name */
    public c0 f100280p;

    /* renamed from: q, reason: collision with root package name */
    public final m f100281q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(nj0.a data, hk0.m sourceModelType, x22.c referrerType, wk1.c parameters, boolean z13, boolean z14, boolean z15, z32.f fVar, x0 boardRepository, z0 boardSectionRepository, i2 pinRepository, i92.k toastUtils, rg0.s experiences, v viewResources, com.pinterest.feature.pin.j pinAction, d1 trackingParamAttacher, g0 pageSizeProvider, nr0.m dynamicGridViewBinderDelegateFactory, t boardMoreIdeasLibraryExperiments, com.pinterest.feature.pin.r repinAnimationUtil, w eventManager, b0 pinAuxHelper, g70.h boardNavigator) {
        super(parameters, pinRepository);
        u videoUtil = or.a.f97245a;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(sourceModelType, "sourceModelType");
        Intrinsics.checkNotNullParameter(referrerType, "referrerType");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(boardSectionRepository, "boardSectionRepository");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        Intrinsics.checkNotNullParameter(videoUtil, "videoUtil");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(pinAction, "pinAction");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(dynamicGridViewBinderDelegateFactory, "dynamicGridViewBinderDelegateFactory");
        Intrinsics.checkNotNullParameter(boardMoreIdeasLibraryExperiments, "boardMoreIdeasLibraryExperiments");
        Intrinsics.checkNotNullParameter(repinAnimationUtil, "repinAnimationUtil");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f100265a = sourceModelType;
        this.f100266b = referrerType;
        this.f100267c = z14;
        this.f100268d = fVar;
        this.f100269e = boardRepository;
        this.f100270f = pinRepository;
        this.f100271g = experiences;
        this.f100272h = boardMoreIdeasLibraryExperiments;
        this.f100273i = boardNavigator;
        this.f100275k = new q();
        String str = data.f90970a;
        this.f100276l = str;
        String str2 = data.f90971b;
        this.f100277m = str2;
        this.f100278n = parameters.f130134e;
        int i13 = n.f100257a[sourceModelType.ordinal()];
        String k13 = i13 != 1 ? i13 != 2 ? "" : a.a.k("board/sections/", str2, "/ideas/feed/") : a.a.k("boards/", str, "/ideas/feed/");
        uk1.d presenterPinalytics = getPresenterPinalytics();
        qa2.n nVar = parameters.f130131b;
        uk1.d presenterPinalytics2 = getPresenterPinalytics();
        qa2.n nVar2 = parameters.f130131b;
        this.f100281q = new m(data, sourceModelType, k13, z13, this, pinRepository, boardRepository, boardSectionRepository, presenterPinalytics, pinAction, trackingParamAttacher, nVar, toastUtils, viewResources, ((n6) dynamicGridViewBinderDelegateFactory).a(presenterPinalytics2, nVar2.f103320a, nVar2, parameters.f130137h), pageSizeProvider, z15, repinAnimationUtil, eventManager, pinAuxHelper, boardMoreIdeasLibraryExperiments, new jh0.d(this, 6), new r(this, 0), boardNavigator);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (r3.l("hfp_visual_tabs_android") == false) goto L9;
     */
    @Override // wk1.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void addDataSources(vq0.a r11) {
        /*
            r10 = this;
            java.lang.String r0 = "dataSources"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            x22.c r0 = x22.c.HOME_FEED_SWIPE
            lh0.t r1 = r10.f100272h
            x22.c r2 = r10.f100266b
            if (r2 != r0) goto L27
            r1.getClass()
            lh0.z3 r0 = lh0.a4.f83297a
            lh0.z0 r3 = r1.f83479a
            lh0.g1 r3 = (lh0.g1) r3
            java.lang.String r4 = "enabled"
            java.lang.String r5 = "hfp_visual_tabs_android"
            boolean r0 = r3.o(r5, r4, r0)
            if (r0 != 0) goto L95
            boolean r0 = r3.l(r5)
            if (r0 == 0) goto L27
            goto L95
        L27:
            z32.f r0 = r10.f100268d
            z32.f r3 = z32.f.MODULE_IN_FEED
            if (r0 == r3) goto L95
            java.util.List r0 = pj0.s.f100264r
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L95
            pj0.i r0 = new pj0.i
            nx.d0 r6 = r10.getPinalytics()
            lh0.n1 r7 = r10.f100274j
            r9 = 0
            if (r7 == 0) goto L8f
            x02.x0 r4 = r10.f100269e
            x02.i2 r5 = r10.f100270f
            java.lang.String r3 = r10.f100276l
            g70.h r8 = r10.f100273i
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r2 = r11
            wk1.i r2 = (wk1.i) r2
            r2.b(r0)
            lh0.z3 r2 = lh0.z3.DO_NOT_ACTIVATE_EXPERIMENT
            r1.getClass()
            java.lang.String r3 = "activate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            lh0.z0 r1 = r1.f83479a
            lh0.g1 r1 = (lh0.g1) r1
            java.lang.String r3 = "hfp_bmi_tab_header_android"
            java.lang.String r1 = r1.g(r3, r2)
            if (r1 == 0) goto L81
            fm1.c r1 = fm1.c.INVISIBLE
            java.lang.String r2 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            fm1.c r2 = r0.f100243s
            if (r1 == r2) goto L81
            r0.f100243s = r1
            r1 = 0
            java.lang.Object r2 = r0.getItem(r1)
            com.pinterest.api.model.v7 r2 = (com.pinterest.api.model.v7) r2
            if (r2 == 0) goto L81
            r0.u1(r1, r2)
        L81:
            ao2.j0 r1 = r10.getScope()
            pj0.p r2 = new pj0.p
            r2.<init>(r10, r0, r9)
            r0 = 3
            kotlin.jvm.internal.j.z(r1, r9, r9, r2, r0)
            goto L95
        L8f:
            java.lang.String r11 = "hairballExperiments"
            kotlin.jvm.internal.Intrinsics.r(r11)
            throw r9
        L95:
            pj0.m r0 = r10.f100281q
            wk1.i r11 = (wk1.i) r11
            r11.b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pj0.s.addDataSources(vq0.a):void");
    }

    @Override // wk1.q, yk1.b
    public void onActivate() {
        p3();
        if (!this.f100267c && this.f100281q.f49127q.size() == 0) {
            if (isBound()) {
                ((yq0.t) ((mj0.c) getView())).setLoadState(yk1.i.LOADING);
            }
            loadData();
        }
        HashMap hashMap = new HashMap();
        hashMap.put(rg0.o.CONTEXT_BOARD_ID.getValue(), this.f100276l);
        int i13 = o.f100258a[this.f100265a.ordinal()];
        addDisposable(nl.b.s(s1.f(((dh0.d) this.f100271g).g(i13 != 1 ? i13 != 2 ? y0.ANDROID_OWN_BOARD_MORE_IDEAS_TAKEOVER : y0.ANDROID_OWN_BOARD_SECTION_MORE_IDEAS_TAKEOVER : y0.ANDROID_OWN_BOARD_MORE_IDEAS_TAKEOVER, hashMap, new tg0.c(false, false)).H(tk2.e.f118017c), "observeOn(...)"), new r(this, 1), null, null, 6));
        if (isBound()) {
            ((yq0.t) ((mj0.c) getView())).mvpMaybeToggleOfflineEmptyStateVisibility();
        }
        if (isBound()) {
            this.f100278n.d(new r70.h(((mj0.c) getView()).t3(), false));
        }
    }

    @Override // wk1.n, yk1.b
    public final void onDeactivate() {
        super.onDeactivate();
        if (u3().T.f95379p) {
            u3().T.f95379p = false;
            x0 x0Var = this.f100269e;
            x0Var.getClass();
            String boardId = this.f100276l;
            Intrinsics.checkNotNullParameter(boardId, "boardId");
            x0Var.P.c(new Pair(boardId, this.f100277m));
        }
    }

    @Override // wk1.n, wk1.q, yk1.p, yk1.b
    public final void onUnbind() {
        this.f100278n.j(this.f100275k);
        super.onUnbind();
    }

    @Override // wk1.q
    public final boolean shouldLoadDataOnBind() {
        return this.f100267c;
    }

    public final d u3() {
        return this.f100281q;
    }

    @Override // wk1.n, wk1.q, yk1.p
    /* renamed from: v3, reason: merged with bridge method [inline-methods] */
    public final void r3(mj0.c view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((nr0.e) view);
        view.j6(this);
        this.f100278n.h(this.f100275k);
    }
}
