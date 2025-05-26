package w01;

import com.pinterest.activity.pin.view.unifiedcomments.CommentsImagesView;
import com.pinterest.api.model.az0;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.lx0;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.z2;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import h32.d4;
import h32.f1;
import h32.u0;
import h32.v0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nx.d1;
import rq.j4;
import x02.a2;
import x02.i2;
import x02.p1;

/* loaded from: classes5.dex */
public final class m0 extends i01.c implements i01.q {

    /* renamed from: a, reason: collision with root package name */
    public final String f127061a;

    /* renamed from: b, reason: collision with root package name */
    public f30 f127062b;

    /* renamed from: c, reason: collision with root package name */
    public final i2 f127063c;

    /* renamed from: d, reason: collision with root package name */
    public final b11.g f127064d;

    /* renamed from: e, reason: collision with root package name */
    public final nx.d0 f127065e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f127066f;

    /* renamed from: g, reason: collision with root package name */
    public final b60.b f127067g;

    /* renamed from: h, reason: collision with root package name */
    public final x02.u f127068h;

    /* renamed from: i, reason: collision with root package name */
    public final p1 f127069i;

    /* renamed from: j, reason: collision with root package name */
    public final m60.w f127070j;

    /* renamed from: k, reason: collision with root package name */
    public final yk1.v f127071k;

    /* renamed from: l, reason: collision with root package name */
    public final z20.c f127072l;

    /* renamed from: m, reason: collision with root package name */
    public final qh1.e f127073m;

    /* renamed from: n, reason: collision with root package name */
    public final d1 f127074n;

    /* renamed from: o, reason: collision with root package name */
    public final lh0.a0 f127075o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f127076p;

    /* renamed from: q, reason: collision with root package name */
    public xj2.b f127077q;

    /* renamed from: r, reason: collision with root package name */
    public List f127078r;

    /* renamed from: s, reason: collision with root package name */
    public rp0.d f127079s;

    /* renamed from: t, reason: collision with root package name */
    public rp0.d f127080t;

    /* renamed from: u, reason: collision with root package name */
    public final uk1.d f127081u;

    /* renamed from: v, reason: collision with root package name */
    public qh1.f f127082v;

    /* renamed from: w, reason: collision with root package name */
    public v0 f127083w;

    /* renamed from: x, reason: collision with root package name */
    public final oh1.s f127084x;

    /* renamed from: y, reason: collision with root package name */
    public final k0 f127085y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(String str, f30 f30Var, i2 pinRepository, b11.g gVar, nx.d0 d0Var, uk1.e presenterPinalyticsFactory, boolean z13, b60.b activeUserManager, x02.u aggregatedCommentRepository, a12.d aggregatedCommentService, p1 didItRepository, m60.w eventManager, yk1.v viewResources, z20.c unifiedCommentService, qh1.e commentUtils, d1 trackingParamAttacher, lh0.a0 experiments) {
        super(0);
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(presenterPinalyticsFactory, "presenterPinalyticsFactory");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(aggregatedCommentRepository, "aggregatedCommentRepository");
        Intrinsics.checkNotNullParameter(aggregatedCommentService, "aggregatedCommentService");
        Intrinsics.checkNotNullParameter(didItRepository, "didItRepository");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(unifiedCommentService, "unifiedCommentService");
        Intrinsics.checkNotNullParameter(commentUtils, "commentUtils");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f127061a = str;
        this.f127062b = f30Var;
        this.f127063c = pinRepository;
        this.f127064d = gVar;
        this.f127065e = d0Var;
        this.f127066f = z13;
        this.f127067g = activeUserManager;
        this.f127068h = aggregatedCommentRepository;
        this.f127069i = didItRepository;
        this.f127070j = eventManager;
        this.f127071k = viewResources;
        this.f127072l = unifiedCommentService;
        this.f127073m = commentUtils;
        this.f127074n = trackingParamAttacher;
        this.f127075o = experiments;
        this.f127078r = kotlin.collections.q0.f80391a;
        uk1.d g13 = ((uk1.a) presenterPinalyticsFactory).g();
        this.f127081u = g13;
        nx.d0 d0Var2 = g13.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var2, "getPinalytics(...)");
        this.f127084x = new oh1.s(aggregatedCommentService, d0Var2);
        this.f127085y = new k0(this);
    }

    public static final void p3(m0 m0Var, rp0.d commentPreview) {
        m0Var.f127079s = commentPreview;
        m0Var.f127080t = null;
        f30 pin = m0Var.f127062b;
        if (pin != null) {
            j4 j4Var = (j4) ((i01.r) m0Var.getView());
            j4Var.getClass();
            Intrinsics.checkNotNullParameter(pin, "pin");
            Intrinsics.checkNotNullParameter(commentPreview, "commentPreview");
            j4Var.s(pin, commentPreview, rq.c.Comment);
            pk.a0.k0(j4Var.f109312l);
            bs1.c.X0(j4Var.f109313m);
            bs1.c.X0(j4Var.f109315o);
            j4Var.k();
        }
    }

    public static final void q3(m0 m0Var, rp0.d dVar) {
        f30 f30Var = m0Var.f127062b;
        if (f30Var == null) {
            return;
        }
        String v13 = dVar.v();
        rp0.d dVar2 = m0Var.f127079s;
        if (Intrinsics.d(v13, dVar2 != null ? dVar2.v() : null)) {
            m0Var.f127079s = dVar;
            ((j4) ((i01.r) m0Var.getView())).s(f30Var, m0Var.f127079s, rq.c.Comment);
            return;
        }
        rp0.d dVar3 = m0Var.f127080t;
        if (Intrinsics.d(v13, dVar3 != null ? dVar3.v() : null)) {
            m0Var.f127080t = dVar;
            ((j4) ((i01.r) m0Var.getView())).s(f30Var, m0Var.f127080t, rq.c.Reply);
        }
    }

    public static void v3(m0 m0Var, String str, String str2, int i13) {
        if ((i13 & 1) != 0) {
            str = "";
        }
        if ((i13 & 2) != 0) {
            str2 = "";
        }
        f30 f30Var = m0Var.f127062b;
        if (f30Var == null) {
            return;
        }
        NavigationImpl L = Navigation.L(com.pinterest.screens.i0.a(), b40.g(f30Var), (!hf0.b.q() ? ml1.b.DEFAULT_TRANSITION : ml1.b.NO_TRANSITION).getValue());
        L.m0("com.pinterest.EXTRA_PIN_ID", f30Var.getId());
        wy0 n13 = b40.n(f30Var);
        L.m0("com.pinterest.EXTRA_USER_ID", n13 != null ? n13.getId() : null);
        wy0 n14 = b40.n(f30Var);
        L.m0("com.pinterest.EXTRA_USERNAME", n14 != null ? n14.z4() : null);
        L.m0("com.pinterest.EXTRA_COMMENT_ID", str);
        L.m0("com.pinterest.EXTRA_COMMENT_TYPE", str2);
        L.m0("com.pinterest.EXTRA_COMPOSE_REPLY_TO_COMMENT_ID", "");
        L.m0("com.pinterest.EXTRA_COMPOSE_REPLY_TO_COMMENT_TYPE", "");
        L.m0("com.pinterest.EXTRA_COMPOSE_REPLY_TO_USER_ID", null);
        L.m0("com.pinterest.EXTRA_COMPOSE_REPLY_TO_USER_NAME", null);
        Boolean j43 = f30Var.j4();
        Intrinsics.checkNotNullExpressionValue(j43, "getDoneByMe(...)");
        L.Y1("com.pinterest.EXTRA_PIN_DONE_BY_ME", j43.booleanValue());
        L.Y1("com.pinterest.EXTRA_PIN_ELIGIBLE_FOR_TRIED_IT", b40.z0(f30Var));
        m0Var.f127070j.d(L);
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        wy0 f13;
        yk1.n view = (i01.r) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((j4) view).f109319s = this;
        this.f127070j.h(this.f127085y);
        xj2.b bVar = new xj2.b();
        addDisposable(bVar);
        this.f127077q = bVar;
        if (this.f127066f) {
            String str = this.f127061a;
            if (str != null) {
                addDisposable(nl.b.s(this.f127063c.S(str), new i0(this, 3), null, null, 6));
                return;
            }
            return;
        }
        f30 f30Var = this.f127062b;
        if (f30Var == null || (f13 = ((b60.d) this.f127067g).f()) == null) {
            return;
        }
        ((j4) ((i01.r) getView())).i(f30Var, f13);
        if (this.f127076p) {
            u3();
        } else {
            t3();
        }
        s3();
        String b13 = this.f127074n.b(f30Var);
        if (b13 != null) {
            v0 v0Var = new v0();
            v0Var.G = b13;
            this.f127083w = v0Var;
        }
    }

    @Override // yk1.b
    public final void onUnbind() {
        this.f127070j.j(this.f127085y);
        super.onUnbind();
    }

    public final rp0.d r3(rq.c cVar) {
        int i13 = h0.f127040a[cVar.ordinal()];
        if (i13 == 1) {
            return this.f127079s;
        }
        if (i13 == 2) {
            return this.f127080t;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void s3() {
        f30 newPin = this.f127062b;
        if (newPin == null) {
            return;
        }
        d4 viewType = ((i01.r) getView()).getViewType();
        nx.d0 d0Var = this.f127081u.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        qh1.f fVar = new qh1.f(viewType, d0Var);
        this.f127082v = fVar;
        String b13 = this.f127074n.b(newPin);
        Intrinsics.checkNotNullParameter(newPin, "newPin");
        fVar.f103916c = newPin;
        fVar.f103917d = b13;
    }

    public final void t3() {
        f30 f30Var = this.f127062b;
        if (f30Var == null) {
            return;
        }
        int i13 = 1;
        if (b40.f0(f30Var) == 0) {
            this.f127078r = kotlin.collections.q0.f80391a;
            this.f127079s = null;
            this.f127080t = null;
            this.f127076p = true;
            u3();
            return;
        }
        xj2.c o13 = this.f127072l.a(b40.g(f30Var), n00.b.a(n00.c.UNIFIED_COMMENTS_PREVIEW_FIELDS), SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE).r(tk2.e.f118017c).l(wj2.c.a()).o(new h(20, new i0(this, i13)), new h(21, new i0(this, 2)));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        addDisposable(o13);
    }

    public final void u3() {
        f30 pin;
        wy0 user;
        if (!isBound() || !this.f127076p || (pin = this.f127062b) == null || (user = ((b60.d) this.f127067g).f()) == null) {
            return;
        }
        i01.r rVar = (i01.r) getView();
        List images = this.f127078r;
        rp0.d dVar = this.f127079s;
        rp0.d dVar2 = this.f127080t;
        j4 j4Var = (j4) rVar;
        j4Var.getClass();
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(images, "imagePreviews");
        Boolean Q3 = pin.Q3();
        Intrinsics.checkNotNullExpressionValue(Q3, "getCommentsDisabled(...)");
        if (Q3.booleanValue()) {
            j4Var.n();
        } else if (dVar == null) {
            j4Var.o(pin, user);
        } else {
            j4Var.k();
            j4Var.f109311k.i(new zp.v0(pin, false));
            CommentsImagesView commentsImagesView = j4Var.f109313m;
            commentsImagesView.getClass();
            Intrinsics.checkNotNullParameter(pin, "pin");
            if (b40.z0(pin)) {
                pin.j4().booleanValue();
            }
            Intrinsics.checkNotNullParameter(images, "images");
            images.size();
            bs1.c.X0(commentsImagesView);
            j4Var.s(pin, dVar, rq.c.Comment);
            j4Var.s(pin, dVar2, rq.c.Reply);
            j4Var.f109316p.T0(user);
        }
        xj2.b bVar = this.f127077q;
        if (bVar != null) {
            bVar.d();
            uj2.q B = this.f127068h.B();
            h hVar = new h(24, new i0(this, 4));
            h hVar2 = new h(25, j0.f127050m);
            ck2.c cVar = ck2.i.f27923c;
            a2 a2Var = ck2.i.f27924d;
            bVar.a(B.F(hVar, hVar2, cVar, a2Var));
            bVar.a(this.f127069i.B().F(new h(26, new i0(this, 5)), new h(27, j0.f127051n), cVar, a2Var));
        }
    }

    @Override // i01.c
    public final void updatePin(f30 updatedPin) {
        Intrinsics.checkNotNullParameter(updatedPin, "updatedPin");
        f30 f30Var = this.f127062b;
        boolean z13 = !Intrinsics.d(f30Var != null ? b40.g(f30Var) : null, b40.g(updatedPin));
        this.f127062b = updatedPin;
        if (isBound() && z13) {
            t3();
        }
    }

    public final void w3(rq.c viewType) {
        qh1.f fVar;
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        rp0.d r33 = r3(viewType);
        if (r33 != null && (fVar = this.f127082v) != null) {
            fVar.b("on_comment_tap", r33);
        }
        nx.d0 d0Var = this.f127081u.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.CLOSEUP_COMMENT, (r18 & 4) != 0 ? null : h32.g0.PIN_CLOSEUP_COMMENTS, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        v3(this, null, null, 31);
    }

    public final void x3(boolean z13, rq.c viewType) {
        uj2.l d03;
        String id3;
        String id4;
        String id5;
        String id6;
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        rp0.d r33 = r3(viewType);
        if (r33 != null) {
            if (z13) {
                qh1.f fVar = this.f127082v;
                if (fVar != null) {
                    fVar.b("on_like_tap", r33);
                }
            } else {
                qh1.f fVar2 = this.f127082v;
                if (fVar2 != null) {
                    fVar2.b("on_unlike_tap", r33);
                }
            }
            String str = "";
            if (r33 instanceof rp0.b) {
                z2 z2Var = ((rp0.b) r33).f109053a;
                x02.u uVar = this.f127068h;
                if (z13) {
                    f30 f30Var = this.f127062b;
                    if (f30Var != null && (id6 = f30Var.getId()) != null) {
                        str = id6;
                    }
                    d03 = uVar.f0(z2Var, str);
                } else {
                    f30 f30Var2 = this.f127062b;
                    if (f30Var2 != null && (id5 = f30Var2.getId()) != null) {
                        str = id5;
                    }
                    d03 = uVar.h0(z2Var, str);
                }
            } else {
                if (!(r33 instanceof rp0.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                az0 az0Var = ((rp0.c) r33).f109054a;
                p1 p1Var = this.f127069i;
                if (z13) {
                    f30 f30Var3 = this.f127062b;
                    if (f30Var3 != null && (id4 = f30Var3.getId()) != null) {
                        str = id4;
                    }
                    d03 = p1Var.b0(az0Var, str);
                } else {
                    f30 f30Var4 = this.f127062b;
                    if (f30Var4 != null && (id3 = f30Var4.getId()) != null) {
                        str = id3;
                    }
                    d03 = p1Var.d0(az0Var, str);
                }
            }
            h hVar = new h(18, j0.f127048k);
            h hVar2 = new h(19, j0.f127049l);
            ck2.c cVar = ck2.i.f27923c;
            d03.getClass();
            hk2.b bVar = new hk2.b(hVar, hVar2, cVar);
            d03.f(bVar);
            Intrinsics.checkNotNullExpressionValue(bVar, "subscribe(...)");
            addDisposable(bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [rp0.b] */
    public final void z3(lx0 preview) {
        Intrinsics.checkNotNullParameter(preview, "preview");
        List n13 = preview.n();
        if (n13 == null) {
            n13 = kotlin.collections.q0.f80391a;
        }
        this.f127078r = n13;
        az0 q13 = preview.q();
        z2 k13 = preview.k();
        rp0.b bVar = null;
        this.f127079s = q13 != null ? new rp0.c(q13) : k13 != null ? new rp0.b(k13) : null;
        z2 l13 = preview.l();
        if (l13 != null) {
            rp0.d dVar = this.f127079s;
            n10.a.g(l13, dVar != null ? dVar.v() : null);
            rp0.d dVar2 = this.f127079s;
            n10.a.f(l13, dVar2 != null ? dVar2.k() : null);
            bVar = new rp0.b(l13);
        }
        this.f127080t = bVar;
        this.f127076p = true;
        u3();
    }
}
