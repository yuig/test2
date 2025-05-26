package oh1;

import android.content.Context;
import android.text.Editable;
import androidx.appcompat.widget.c2;
import com.pinterest.activity.pin.view.unifiedcomments.CommentComposerView;
import com.pinterest.api.model.AggregatedCommentFeed;
import com.pinterest.api.model.az0;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.dw0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.hx0;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.y2;
import com.pinterest.api.model.z2;
import com.pinterest.api.model.zy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.a5;
import df.j1;
import h32.d4;
import h32.f1;
import h32.g0;
import h32.u0;
import i01.r0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.j4;
import lh0.v0;
import m60.x0;
import net.quikkly.android.utils.BitmapUtils;
import nx.d0;
import nx.d1;
import nx.f0;
import qf1.z;
import rq.a0;
import sq0.c0;
import w1.z0;
import we1.n1;
import x02.a2;
import x02.i2;
import x02.p1;

/* loaded from: classes5.dex */
public abstract class m extends wk1.q implements com.pinterest.feature.unifiedcomments.c, wp0.g {
    public String A;
    public final boolean B;
    public boolean C;
    public qh1.f D;
    public final f E;

    /* renamed from: a, reason: collision with root package name */
    public final nh1.a f94519a;

    /* renamed from: b, reason: collision with root package name */
    public final m60.w f94520b;

    /* renamed from: c, reason: collision with root package name */
    public final x02.u f94521c;

    /* renamed from: d, reason: collision with root package name */
    public final x02.c f94522d;

    /* renamed from: e, reason: collision with root package name */
    public final p1 f94523e;

    /* renamed from: f, reason: collision with root package name */
    public final i2 f94524f;

    /* renamed from: g, reason: collision with root package name */
    public final f0 f94525g;

    /* renamed from: h, reason: collision with root package name */
    public final j4 f94526h;

    /* renamed from: i, reason: collision with root package name */
    public final rg0.s f94527i;

    /* renamed from: j, reason: collision with root package name */
    public final yk1.v f94528j;

    /* renamed from: k, reason: collision with root package name */
    public final qh1.e f94529k;

    /* renamed from: l, reason: collision with root package name */
    public final uk1.d f94530l;

    /* renamed from: m, reason: collision with root package name */
    public final d1 f94531m;

    /* renamed from: n, reason: collision with root package name */
    public final b60.b f94532n;

    /* renamed from: o, reason: collision with root package name */
    public final v0 f94533o;

    /* renamed from: p, reason: collision with root package name */
    public final lb0.r f94534p;

    /* renamed from: q, reason: collision with root package name */
    public final lb0.q f94535q;

    /* renamed from: r, reason: collision with root package name */
    public final String f94536r;

    /* renamed from: s, reason: collision with root package name */
    public f30 f94537s;

    /* renamed from: t, reason: collision with root package name */
    public Long f94538t;

    /* renamed from: u, reason: collision with root package name */
    public HashMap f94539u;

    /* renamed from: v, reason: collision with root package name */
    public final s f94540v;

    /* renamed from: w, reason: collision with root package name */
    public final xk2.k f94541w;

    /* renamed from: x, reason: collision with root package name */
    public String f94542x;

    /* renamed from: y, reason: collision with root package name */
    public String f94543y;

    /* renamed from: z, reason: collision with root package name */
    public String f94544z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(nh1.a metadata, m60.w eventManager, x02.u aggregatedCommentRepository, a12.d aggregatedCommentService, x02.c aggregatedCommentFeedRepository, p1 didItRepository, i2 pinRepository, f0 pinalyticsFactory, j4 experiments, rg0.s experiences, yk1.v viewResources, qh1.e commentUtils, ap.o uploadContactsUtil, uk1.d commentsUIEventLoggerPresenterPinalytics, uk1.d presenterPinalytics, uj2.q networkStateStream, d1 trackingParamAttacher, b60.b activeUserManager, v0 diditLibraryExperiments, lb0.r prefsManagerUser, lb0.q prefsManagerPersisted, c2 sharesheetUtils) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(aggregatedCommentRepository, "aggregatedCommentRepository");
        Intrinsics.checkNotNullParameter(aggregatedCommentService, "aggregatedCommentService");
        Intrinsics.checkNotNullParameter(aggregatedCommentFeedRepository, "aggregatedCommentFeedRepository");
        Intrinsics.checkNotNullParameter(didItRepository, "didItRepository");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(commentUtils, "commentUtils");
        Intrinsics.checkNotNullParameter(uploadContactsUtil, "uploadContactsUtil");
        Intrinsics.checkNotNullParameter(commentsUIEventLoggerPresenterPinalytics, "commentsUIEventLoggerPresenterPinalytics");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(diditLibraryExperiments, "diditLibraryExperiments");
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        Intrinsics.checkNotNullParameter(sharesheetUtils, "sharesheetUtils");
        this.f94519a = metadata;
        this.f94520b = eventManager;
        this.f94521c = aggregatedCommentRepository;
        this.f94522d = aggregatedCommentFeedRepository;
        this.f94523e = didItRepository;
        this.f94524f = pinRepository;
        this.f94525g = pinalyticsFactory;
        this.f94526h = experiments;
        this.f94527i = experiences;
        this.f94528j = viewResources;
        this.f94529k = commentUtils;
        this.f94530l = commentsUIEventLoggerPresenterPinalytics;
        this.f94531m = trackingParamAttacher;
        this.f94532n = activeUserManager;
        this.f94533o = diditLibraryExperiments;
        this.f94534p = prefsManagerUser;
        this.f94535q = prefsManagerPersisted;
        this.f94536r = metadata.f90533a;
        this.f94539u = new HashMap();
        d0 d0Var = presenterPinalytics.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        this.f94540v = new s(aggregatedCommentService, d0Var);
        this.f94541w = xk2.m.a(xk2.n.NONE, new g(this, 1));
        this.f94542x = metadata.f90540h;
        this.f94543y = metadata.f90541i;
        this.f94544z = metadata.f90542j;
        this.A = metadata.f90543k;
        this.B = metadata.f90551s;
        this.E = new f(this);
    }

    public static boolean H3(f30 f30Var) {
        dw0 A6;
        if (W3()) {
            if (j1.U0((f30Var == null || (A6 = f30Var.A6()) == null) ? null : A6.f())) {
                return true;
            }
        }
        return false;
    }

    public static boolean W3() {
        return !hf0.b.q();
    }

    public static final void t3(m mVar, int i13, f30 f30Var) {
        mVar.getClass();
        boolean H3 = H3(f30Var);
        mVar.x3().P(H3 ? 1 : 0, new hx0(i13, f30Var));
        mVar.D3(e.f94493q);
    }

    public final int B3(String str, String str2) {
        int i13 = 0;
        if (Intrinsics.d(str2, "aggregatedcomment")) {
            for (dl1.s sVar : x3().d()) {
                if (!(sVar instanceof z2) || !Intrinsics.d(((z2) sVar).getUid(), str)) {
                    i13++;
                }
            }
            return -1;
        }
        if (!Intrinsics.d(str2, "userdiditdata")) {
            throw new IllegalStateException("Unsupported comment type");
        }
        for (dl1.s sVar2 : x3().d()) {
            if (!(sVar2 instanceof az0) || !Intrinsics.d(((az0) sVar2).getUid(), str)) {
                i13++;
            }
        }
        return -1;
        return i13;
    }

    public final void D3(Function1 function1) {
        com.pinterest.feature.unifiedcomments.d dVar;
        if (!isBound() || (dVar = (com.pinterest.feature.unifiedcomments.d) getViewIfBound()) == null) {
            return;
        }
        function1.invoke(dVar);
    }

    public final boolean F3(rp0.d comment) {
        Intrinsics.checkNotNullParameter(comment, "comment");
        return !comment.x() && Intrinsics.d(this.f94539u.get(comment.u()), Boolean.TRUE);
    }

    public final void G3(z2 z2Var, rp0.d dVar, AggregatedCommentFeed aggregatedCommentFeed) {
        Object obj;
        Object obj2;
        List d2 = x3().d();
        ListIterator listIterator = d2.listIterator(d2.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj2 = null;
                break;
            }
            obj2 = listIterator.previous();
            dl1.s sVar = (dl1.s) obj2;
            if ((sVar instanceof z2) && Intrinsics.d(n10.a.e((z2) sVar), dVar.v())) {
                break;
            }
        }
        dl1.s sVar2 = (dl1.s) obj2;
        Integer valueOf = sVar2 != null ? Integer.valueOf(x3().d().indexOf(sVar2)) : null;
        int B3 = B3(dVar.v(), dVar.k());
        if (valueOf != null) {
            B3 = valueOf.intValue();
        }
        if (aggregatedCommentFeed != null) {
            if (!aggregatedCommentFeed.y(z2Var)) {
                dl1.s item = x3().getItem(B3);
                boolean d13 = Intrinsics.d(item != null ? item.getUid() : null, z2Var.getUid());
                boolean z13 = dVar.v() != null;
                if (!d13 && z13) {
                    n10.a.g(z2Var, dVar.v());
                    n10.a.f(z2Var, dVar.k());
                    x3().P(B3 + 1, z2Var);
                }
                if (B3(dVar.v(), "aggregatedcomment") != -1) {
                    h4(dVar);
                }
            }
            obj = Unit.f80348a;
        }
        if (obj == null) {
            n10.a.g(z2Var, dVar.v());
            n10.a.f(z2Var, dVar.k());
            x3().P(B3 + 1, z2Var);
        }
        D3(new zx0.d(B3, 23));
    }

    public final boolean I3(f30 f30Var) {
        wy0 n13;
        return com.bumptech.glide.d.o0((f30Var == null || (n13 = b40.n(f30Var)) == null) ? null : Boolean.valueOf(this.f94532n.d(n13)));
    }

    public final void J3() {
        if (x3().f49127q.size() == 0) {
            D3(e.f94500x);
            return;
        }
        f30 f30Var = this.f94537s;
        Intrinsics.f(f30Var);
        if (H3(f30Var) && x3().f49127q.size() == 2) {
            D3(e.f94501y);
        } else if (W3() && x3().f49127q.size() == 1) {
            D3(e.f94502z);
        }
    }

    @Override // com.pinterest.feature.unifiedcomments.c
    public void K(rp0.d comment, rh1.x actionType) {
        int value;
        Intrinsics.checkNotNullParameter(comment, "comment");
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        switch (c.f94482a[actionType.ordinal()]) {
            case 1:
                qh1.f fVar = this.D;
                if (fVar == null) {
                    Intrinsics.r("commentsUIEventLogger");
                    throw null;
                }
                fVar.b("on_comment_tap", comment);
                D3(e.C);
                getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.CLOSEUP_COMMENT, (r18 & 4) != 0 ? null : g0.PIN_CLOSEUP_COMMENTS, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                return;
            case 2:
                D3(e.D);
                return;
            case 3:
                qh1.f fVar2 = this.D;
                if (fVar2 == null) {
                    Intrinsics.r("commentsUIEventLogger");
                    throw null;
                }
                fVar2.b("on_overflow_tap", comment);
                Y3(comment);
                return;
            case 4:
                qh1.f fVar3 = this.D;
                if (fVar3 == null) {
                    Intrinsics.r("commentsUIEventLogger");
                    throw null;
                }
                fVar3.b("on_like_tap", comment);
                f4(comment, true);
                return;
            case 5:
                qh1.f fVar4 = this.D;
                if (fVar4 == null) {
                    Intrinsics.r("commentsUIEventLogger");
                    throw null;
                }
                fVar4.b("on_unlike_tap", comment);
                f4(comment, false);
                return;
            case 6:
                qh1.f fVar5 = this.D;
                if (fVar5 == null) {
                    Intrinsics.r("commentsUIEventLogger");
                    throw null;
                }
                fVar5.b("on_helpful_tap", comment);
                e4(comment, true);
                return;
            case 7:
                qh1.f fVar6 = this.D;
                if (fVar6 == null) {
                    Intrinsics.r("commentsUIEventLogger");
                    throw null;
                }
                fVar6.b("on_not_helpful_tap", comment);
                e4(comment, false);
                return;
            case 8:
                qh1.f fVar7 = this.D;
                if (fVar7 == null) {
                    Intrinsics.r("commentsUIEventLogger");
                    throw null;
                }
                fVar7.b("on_view_likes_tap", comment);
                if (comment.h() > 0) {
                    NavigationImpl z03 = Navigation.z0((ScreenLocation) a5.f50534c.getValue(), comment.v());
                    if (comment instanceof rp0.b) {
                        value = mr0.c.COMMENT_PARENT.getValue();
                    } else {
                        if (!(comment instanceof rp0.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        value = mr0.c.DID_IT_PARENT.getValue();
                    }
                    z03.z(value, "com.pinterest.EXTRA_LIKE_PARENT_TYPE");
                    this.f94520b.d(z03);
                    return;
                }
                return;
            case 9:
                qh1.f fVar8 = this.D;
                if (fVar8 == null) {
                    Intrinsics.r("commentsUIEventLogger");
                    throw null;
                }
                fVar8.b("on_reply_tap", comment);
                if (this.f94537s != null) {
                    if (this.f94526h.b()) {
                        D3(new ic1.c(29, comment, this));
                        return;
                    }
                    d0 pinalytics = getPinalytics();
                    f30 f30Var = this.f94537s;
                    Intrinsics.f(f30Var);
                    String uid = f30Var.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    f30 f30Var2 = this.f94537s;
                    Intrinsics.f(f30Var2);
                    this.f94529k.n(pinalytics, uid, (r36 & 4) != 0 ? "" : b40.g(f30Var2), (r36 & 8) != 0 ? null : null, (r36 & 16) != 0 ? null : null, null, null, (r36 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : comment, (r36 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : null, (r36 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : null, (r36 & 1024) != 0 ? false : false, (r36 & 2048) != 0 ? null : null, (r36 & 4096) != 0 ? null : null, (r36 & 8192) != 0 ? Boolean.FALSE : null, (r36 & 16384) != 0 ? false : false, (r36 & 32768) != 0 ? false : false, false);
                    return;
                }
                wy0 w13 = comment.w();
                if (w13 != null) {
                    String uid2 = w13.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                    this.f94544z = uid2;
                    this.A = dl2.b.j1(w13);
                }
                if (comment.x()) {
                    String m13 = comment.m();
                    if (m13 == null) {
                        return;
                    }
                    this.f94542x = m13;
                    String l13 = comment.l();
                    if (l13 == null) {
                        return;
                    }
                    this.f94543y = l13;
                    D3(new d(this, 11));
                } else {
                    this.f94542x = comment.v();
                    this.f94543y = comment.k();
                }
                if (this.f94529k.k(getPinalytics(), new h(this, 0))) {
                    return;
                }
                g4();
                return;
            case 10:
                qh1.f fVar9 = this.D;
                if (fVar9 == null) {
                    Intrinsics.r("commentsUIEventLogger");
                    throw null;
                }
                fVar9.b("on_view_replies_tap", comment);
                Z3(null, comment);
                return;
            case 11:
                qh1.f fVar10 = this.D;
                if (fVar10 == null) {
                    Intrinsics.r("commentsUIEventLogger");
                    throw null;
                }
                fVar10.b("on_hide_replies_tap", comment);
                Pair u13 = comment.u();
                if (x3().V.containsKey(comment.v())) {
                    x3().W.add(comment.v());
                }
                Object obj = this.f94539u.get(u13);
                Boolean bool = Boolean.FALSE;
                if (Intrinsics.d(obj, bool)) {
                    return;
                }
                this.f94539u.put(u13, bool);
                i4(comment);
                j4(null, comment);
                return;
            case 12:
                qh1.f fVar11 = this.D;
                if (fVar11 == null) {
                    Intrinsics.r("commentsUIEventLogger");
                    throw null;
                }
                fVar11.b("on_photo_tap", comment);
                D3(new n1(comment, 25));
                return;
            case 13:
                qh1.f fVar12 = this.D;
                if (fVar12 == null) {
                    Intrinsics.r("commentsUIEventLogger");
                    throw null;
                }
                fVar12.b("on_text_long_press", comment);
                Y3(comment);
                return;
            default:
                return;
        }
    }

    @Override // wk1.q, yk1.p
    /* renamed from: K3, reason: merged with bridge method [inline-methods] */
    public void r3(com.pinterest.feature.unifiedcomments.d view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((c0) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((rh1.k) view).Z0 = this;
        x02.u uVar = this.f94521c;
        uj2.q B = uVar.B();
        dh1.b bVar = new dh1.b(15, new d(this, 0));
        dh1.b bVar2 = new dh1.b(16, e.f94486j);
        ck2.c cVar = ck2.i.f27923c;
        a2 a2Var = ck2.i.f27924d;
        xj2.c F = B.F(bVar, bVar2, cVar, a2Var);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
        xj2.c F2 = uVar.z().F(new dh1.b(17, new d(this, 1)), new dh1.b(18, e.f94487k), cVar, a2Var);
        Intrinsics.checkNotNullExpressionValue(F2, "subscribe(...)");
        addDisposable(F2);
        xj2.c F3 = this.f94523e.B().F(new dh1.b(19, new d(this, 2)), new dh1.b(20, e.f94488l), cVar, a2Var);
        Intrinsics.checkNotNullExpressionValue(F3, "subscribe(...)");
        addDisposable(F3);
        this.f94520b.h(this.E);
        d4 f50469j0 = view.getF50469j0();
        d0 d0Var = this.f94530l.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        this.D = new qh1.f(f50469j0, d0Var);
        String str = this.f94519a.f90553u;
        if (str != null) {
            getPresenterPinalytics().f122383e = str;
        }
        int i13 = cd.b.f27547a;
        this.f94538t = Long.valueOf(System.currentTimeMillis());
        if (W3()) {
            x3().f49129s.H(tk2.e.f118017c).A(wj2.c.a()).F(new dh1.b(21, new d(this, 6)), new dh1.b(22, new d(this, 7)), cVar, a2Var);
        }
        String str2 = this.f94536r;
        if (str2.length() <= 0 || this.f94537s != null) {
            return;
        }
        xj2.c o13 = this.f94524f.Q(str2).s().o(new dh1.b(12, new d(this, 3)), new dh1.b(13, new d(this, 4)));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        addDisposable(o13);
    }

    public final void L3(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinUid");
        qh1.f fVar = this.D;
        if (fVar == null) {
            Intrinsics.r("commentsUIEventLogger");
            throw null;
        }
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        fVar.b("on_attached_pin_tap", null);
        D3(e.E);
        this.f94520b.d(Navigation.z0((ScreenLocation) a5.f50533b.getValue(), pinId));
    }

    public final void M3(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userUid");
        qh1.f fVar = this.D;
        if (fVar == null) {
            Intrinsics.r("commentsUIEventLogger");
            throw null;
        }
        Intrinsics.checkNotNullParameter(userId, "userId");
        fVar.b("on_user_tap", null);
        D3(e.F);
        r41.k.f106176a.d(userId, r41.b.BaseComments);
    }

    public final void N3() {
        D3(new d(this, 8));
        J3();
    }

    public final void Q3(AggregatedCommentFeed aggregatedCommentFeed, rp0.d dVar, int i13, z2 z2Var) {
        int B3 = B3(dVar.v(), dVar.k());
        if (B3 < 0) {
            return;
        }
        List<z2> q13 = aggregatedCommentFeed.q();
        Intrinsics.checkNotNullExpressionValue(q13, "getItems(...)");
        for (z2 z2Var2 : q13) {
            Intrinsics.f(z2Var2);
            n10.a.g(z2Var2, dVar.v());
            n10.a.f(z2Var2, dVar.k());
            Iterator it = x3().d().iterator();
            int i14 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (!Intrinsics.d(((dl1.s) it.next()).getUid(), z2Var2.getUid())) {
                    i14++;
                } else if (i14 == -1) {
                }
            }
            x3().P(B3 + 1, z2Var2);
        }
        xj2.c F = this.f94522d.h(i13, aggregatedCommentFeed).F(new dh1.b(24, new a0(this, dVar, i13, 14)), new dh1.b(25, e.f94495s), new px0.b(z2Var, this, dVar, aggregatedCommentFeed, 2), ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
    }

    public final void R3(String commentId, String originalText, kl2.l translationStatusChangeCallback) {
        Intrinsics.checkNotNullParameter(commentId, "commentId");
        Intrinsics.checkNotNullParameter(originalText, "originalText");
        Intrinsics.checkNotNullParameter(translationStatusChangeCallback, "translationStatusChangeCallback");
        this.f94540v.b(commentId, originalText, translationStatusChangeCallback, new i(this, 0));
    }

    public final void S3(int i13) {
        mh1.d x33 = x3();
        x33.Z();
        qz.f0 f0Var = x33.f49121k;
        if (f0Var != null) {
            f0Var.e("feed_type", i13 == ob2.f.sort_by_newest ? z20.b.RECENT_COMMENT_FEED_TYPE.getValue() : z20.b.RANKED_COMMENT_FEED_TYPE.getValue());
        }
        x33.n();
        this.f94539u = new HashMap();
    }

    public final void T3(String userId) {
        wy0 w13;
        Intrinsics.checkNotNullParameter(userId, "userId");
        for (dl1.s sVar : x3().d()) {
            String str = null;
            rp0.d bVar = sVar instanceof z2 ? new rp0.b((z2) sVar) : sVar instanceof az0 ? new rp0.c((az0) sVar) : null;
            if (bVar != null && (w13 = bVar.w()) != null) {
                str = w13.getUid();
            }
            if (Intrinsics.d(str, userId)) {
                x3().X(bVar.v());
                z3().b(bVar);
            }
        }
    }

    public final void U3(String str) {
        int i13;
        z zVar = new z(str, 21);
        Iterator it = x3().d().iterator();
        int i14 = 0;
        while (true) {
            i13 = -1;
            if (!it.hasNext()) {
                i14 = -1;
                break;
            } else if (((Boolean) zVar.invoke(it.next())).booleanValue()) {
                break;
            } else {
                i14++;
            }
        }
        if (i14 < 0) {
            z3().d(1);
            return;
        }
        List d2 = x3().d();
        ListIterator listIterator = d2.listIterator(d2.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            } else if (((Boolean) zVar.invoke(listIterator.previous())).booleanValue()) {
                i13 = listIterator.nextIndex();
                break;
            }
        }
        if (i14 == i13) {
            x3().removeItem(i14);
        } else {
            x3().Y(i14, i13 + 1);
        }
        z3().d((i13 - i14) + 2);
    }

    public final boolean V3(rp0.d comment) {
        Intrinsics.checkNotNullParameter(comment, "comment");
        return !comment.x() || Intrinsics.d(this.f94539u.get(comment.t()), Boolean.TRUE);
    }

    public final boolean X3(f30 f30Var) {
        return (I3(f30Var) && b40.f0(f30Var) == 0 && b40.Q0(f30Var) && !f30Var.Q3().booleanValue()) || (I3(f30Var) ^ true);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Y3(rp0.d r30) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oh1.m.Y3(rp0.d):void");
    }

    public final void Z3(z2 z2Var, rp0.d parent) {
        int value;
        Intrinsics.checkNotNullParameter(parent, "parent");
        Pair u13 = parent.u();
        boolean d2 = Intrinsics.d(this.f94539u.get(u13), Boolean.FALSE);
        boolean z13 = z2Var != null;
        boolean z14 = this.f94539u.get(parent.u()) != null;
        boolean contains = x3().W.contains(parent.v());
        boolean z15 = x3().W.contains(parent.v()) && parent.o() == 1;
        if (!z14 || ((contains && z13) || z15)) {
            j jVar = new j(4, this, m.class, "onRepliesLoaded", "onRepliesLoaded(Lcom/pinterest/api/model/AggregatedCommentFeed;Lcom/pinterest/feature/comment/unifiedcomments/model/UnifiedComment;ILcom/pinterest/api/model/AggregatedComment;)V", 0);
            if (parent instanceof rp0.b) {
                value = x02.b.REQUEST_FROM_AGGREGATED_COMMENT.getValue();
            } else {
                if (!(parent instanceof rp0.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                value = x02.b.REQUEST_FROM_DID_IT.getValue();
            }
            int i13 = value;
            xj2.c F = this.f94522d.f(new String[]{parent.v()}, i13).F(new a(0, new z0(jVar, parent, i13, z2Var, 7)), new a(1, e.f94499w), new r0(11), ck2.i.f27924d);
            Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
            addDisposable(F);
        } else if (d2 || (z2Var != null && !x3().d().contains(z2Var))) {
            j4(z2Var, parent);
        }
        if (x3().W.contains(parent.v())) {
            x3().V.remove(parent.v());
            x3().W.remove(parent.v());
        }
        this.f94539u.put(u13, Boolean.TRUE);
        i4(parent);
        if (!z13 || B3(parent.v(), "aggregatedcomment") == -1) {
            return;
        }
        h4(parent);
    }

    public final void a4(Context context, Editable editable, String str, String str2, rp0.d dVar, rp0.d dVar2, boolean z13) {
        f30 f30Var;
        if (editable == null || (f30Var = this.f94537s) == null) {
            return;
        }
        if (z13) {
            mf0.l lVar = new mf0.l();
            lVar.q7(((yk1.a) this.f94528j).f139224a.getString(x0.notification_uploading));
            this.f94520b.d(new of0.a(lVar));
        }
        if (dVar != null) {
            d0 pinalytics = getPinalytics();
            uk1.d presenterPinalytics = getPresenterPinalytics();
            k kVar = new k(this, 0);
            yk1.n view = getView();
            Intrinsics.checkNotNullExpressionValue(view, "<get-view>(...)");
            addDisposable(qh1.e.f(this.f94529k, pinalytics, presenterPinalytics, f30Var, editable, dVar, z13, kVar, null, new h(view, 1), RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN));
            return;
        }
        if (dVar2 != null) {
            addDisposable(this.f94529k.e(getPinalytics(), f30Var, editable, dVar2, z13, new k(this, 1), null));
            D3(e.K);
            return;
        }
        if (str == null) {
            d0 pinalytics2 = getPinalytics();
            uk1.d presenterPinalytics2 = getPresenterPinalytics();
            k kVar2 = new k(this, 4);
            yk1.n view2 = getView();
            Intrinsics.checkNotNullExpressionValue(view2, "<get-view>(...)");
            addDisposable(qh1.e.c(this.f94529k, pinalytics2, presenterPinalytics2, f30Var, editable, null, z13, kVar2, null, new h(view2, 4), RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN));
            return;
        }
        if (str2 == null || str2.length() == 0) {
            this.f94529k.p(context, str, new z9.n(this, f30Var, editable, str, z13, 6));
            return;
        }
        d0 pinalytics3 = getPinalytics();
        uk1.d presenterPinalytics3 = getPresenterPinalytics();
        k kVar3 = new k(this, 3);
        yk1.n view3 = getView();
        Intrinsics.checkNotNullExpressionValue(view3, "<get-view>(...)");
        addDisposable(qh1.e.c(this.f94529k, pinalytics3, presenterPinalytics3, f30Var, editable, str2, z13, kVar3, null, new h(view3, 3), RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN));
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((wk1.i) dataSources).b(x3());
    }

    @Override // com.pinterest.feature.unifiedcomments.c
    public void d3() {
        this.f94542x = "";
        this.f94543y = "";
        this.f94544z = "";
        this.A = "";
        D3(new fd1.h(false, 20));
        D3(e.I);
    }

    public final String d4(String commentId) {
        Intrinsics.checkNotNullParameter(commentId, "commentId");
        s sVar = this.f94540v;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(commentId, "commentId");
        if (sVar.f94571d.get(commentId) == rh1.y.TRANSLATED) {
            return (String) sVar.f94570c.get(commentId);
        }
        return null;
    }

    public final void e4(rp0.d dVar, boolean z13) {
        hk2.u c03;
        boolean z14 = dVar instanceof rp0.b;
        String str = this.f94536r;
        if (z14) {
            z2 z2Var = ((rp0.b) dVar).f109053a;
            x02.u uVar = this.f94521c;
            c03 = z13 ? uVar.g0(z2Var, str) : uVar.i0(z2Var, str);
        } else {
            if (!(dVar instanceof rp0.c)) {
                throw new NoWhenBranchMatchedException();
            }
            az0 az0Var = ((rp0.c) dVar).f109054a;
            p1 p1Var = this.f94523e;
            c03 = z13 ? p1Var.c0(az0Var, str) : p1Var.e0(az0Var, str);
        }
        ek2.f i13 = c03.i(new r0(10), new dh1.b(23, e.M));
        Intrinsics.checkNotNullExpressionValue(i13, "subscribe(...)");
        addDisposable(i13);
    }

    public final void f4(rp0.d dVar, boolean z13) {
        uj2.l b03;
        if (dVar.i() && z13) {
            return;
        }
        boolean z14 = dVar instanceof rp0.b;
        String str = this.f94536r;
        if (z14) {
            z2 z2Var = ((rp0.b) dVar).f109053a;
            x02.u uVar = this.f94521c;
            b03 = z13 ? uVar.f0(z2Var, str) : uVar.h0(z2Var, str);
        } else {
            if (!(dVar instanceof rp0.c)) {
                throw new NoWhenBranchMatchedException();
            }
            az0 az0Var = ((rp0.c) dVar).f109054a;
            p1 p1Var = this.f94523e;
            b03 = z13 ? p1Var.b0(az0Var, str) : p1Var.d0(az0Var, str);
        }
        dh1.b bVar = new dh1.b(26, new qf1.f0(this, z13, 1));
        dh1.b bVar2 = new dh1.b(27, l.f94510j);
        ck2.c cVar = ck2.i.f27923c;
        b03.getClass();
        hk2.b bVar3 = new hk2.b(bVar, bVar2, cVar);
        b03.f(bVar3);
        Intrinsics.checkNotNullExpressionValue(bVar3, "subscribe(...)");
        addDisposable(bVar3);
    }

    public final void g4() {
        com.pinterest.feature.unifiedcomments.d dVar = (com.pinterest.feature.unifiedcomments.d) getView();
        if (!kotlin.text.z.j(this.A)) {
            String replyTo = this.A;
            rh1.k kVar = (rh1.k) dVar;
            kVar.getClass();
            Intrinsics.checkNotNullParameter(replyTo, "replyTo");
            CommentComposerView Y8 = kVar.Y8();
            String string = kVar.getResources().getString(ob2.f.comment_replying_to, replyTo);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            Y8.b1(string);
        }
        rh1.k kVar2 = (rh1.k) dVar;
        kVar2.Y8().G0(rf0.c.unified_comments_reply_composer_hint);
        if (kVar2.Y8().g0(null)) {
            return;
        }
        kVar2.Y8().H0();
    }

    public final void h4(rp0.d dVar) {
        dl1.s a13;
        int B3 = B3(dVar.v(), "aggregatedcomment");
        if (B3 != -1) {
            if (Intrinsics.d(dVar.k(), "aggregatedcomment")) {
                y2 c03 = ((rp0.b) dVar).f109053a.c0();
                Integer num = c03.f43881d;
                if (num == null) {
                    num = 0;
                }
                c03.b(Integer.valueOf(num.intValue() + 1));
                a13 = c03.a();
            } else {
                zy0 V = ((rp0.c) dVar).f109054a.V();
                Integer num2 = V.f44511c;
                if (num2 == null) {
                    num2 = 0;
                }
                V.b(Integer.valueOf(num2.intValue() + 1));
                a13 = V.a();
            }
            x3().u1(B3, a13);
        }
    }

    public final void i4(rp0.d dVar) {
        dl1.s sVar;
        mh1.d x33 = x3();
        if (dVar instanceof rp0.b) {
            sVar = ((rp0.b) dVar).f109053a;
        } else {
            if (!(dVar instanceof rp0.c)) {
                throw new NoWhenBranchMatchedException();
            }
            sVar = ((rp0.c) dVar).f109054a;
        }
        x33.T(sVar);
    }

    public final void j4(z2 z2Var, rp0.d dVar) {
        String v13 = dVar.v();
        List d2 = x3().d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : d2) {
            if (obj instanceof z2) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            z2 z2Var2 = (z2) it.next();
            if (Intrinsics.d(n10.a.e(z2Var2), v13)) {
                x3().T(z2Var2);
            }
        }
        if (z2Var != null) {
            G3(z2Var, dVar, null);
        }
    }

    @Override // wk1.q, yk1.p
    public final void onNetworkLost() {
        super.onNetworkLost();
        D3(e.G);
    }

    @Override // wk1.q, yk1.p
    public final void onNetworkRegained() {
        super.onNetworkRegained();
        f30 f30Var = this.f94537s;
        boolean z13 = false;
        if (f30Var != null && X3(f30Var)) {
            z13 = true;
        }
        D3(new fd1.h(z13, 19));
    }

    @Override // wk1.q, sq0.a0
    public void onRecyclerRefresh() {
        D3(e.H);
        super.onRecyclerRefresh();
    }

    @Override // wk1.q, yk1.p, yk1.b
    public final void onUnbind() {
        HashMap hashMap;
        d0 pinalytics = getPinalytics();
        f1 f1Var = f1.COMMENT_FEED_CLOSED;
        g0 g0Var = g0.COMMENT_FEED;
        Long l13 = this.f94538t;
        if (l13 != null) {
            long longValue = l13.longValue();
            hashMap = new HashMap();
            int i13 = cd.b.f27547a;
            hashMap.put("time_in_ms", String.valueOf(System.currentTimeMillis() - longValue));
        } else {
            hashMap = null;
        }
        pinalytics.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : null, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : this.f94536r, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        this.f94520b.j(this.E);
        super.onUnbind();
    }

    @Override // wk1.q
    public final boolean shouldLoadDataOnBind() {
        return false;
    }

    @Override // com.pinterest.feature.unifiedcomments.c
    public void u(Context context, Editable editable, String str, String str2, rp0.d dVar, rp0.d dVar2, List list) {
        uj2.q a03;
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.f94542x.length() <= 0 || !j1.U0(this.f94543y)) {
            String.valueOf(editable);
            a4(context, editable, str, str2, dVar, dVar2, false);
            return;
        }
        String valueOf = String.valueOf(editable);
        List list2 = list == null ? q0.f80391a : list;
        hl0.u uVar = new hl0.u(this, context, editable, str, str2, dVar, dVar2, list, 2);
        mf0.l lVar = new mf0.l();
        lVar.q7((String) this.f94541w.getValue());
        this.f94520b.d(new of0.a(lVar));
        if (this.f94543y.length() == 0) {
            uVar.invoke();
        }
        String str3 = this.f94543y;
        boolean d2 = Intrinsics.d(str3, "aggregatedcomment");
        x02.u uVar2 = this.f94521c;
        if (d2) {
            a03 = uVar2.c0(this.f94542x, valueOf, this.f94536r, null, list2, false);
        } else {
            if (!Intrinsics.d(str3, "userdiditdata")) {
                throw new IllegalStateException(a.a.j("Unsupported comment type, comment type is ", this.f94543y));
            }
            a03 = x02.u.a0(48, uVar2, this.f94542x, valueOf, this.f94536r, list2, false);
        }
        xj2.c F = a03.F(new dh1.b(28, new d(this, 10)), new dh1.b(29, e.L), new g51.h(this, 13), ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
    }

    public final boolean u3(f30 f30Var, wy0 wy0Var) {
        if (!com.bumptech.glide.d.o0(wy0Var != null ? Boolean.valueOf(this.f94532n.d(wy0Var)) : null)) {
            Boolean I3 = f30Var.I3();
            Intrinsics.checkNotNullExpressionValue(I3, "getCanDeleteDidItAndComments(...)");
            if (!I3.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public final boolean v3(f30 f30Var, rp0.d dVar) {
        wy0 F = b40.F(f30Var);
        return com.bumptech.glide.d.o0(F != null ? Boolean.valueOf(this.f94532n.d(F)) : null) && !dVar.x();
    }

    public final void w3() {
        rp0.d bVar;
        ArrayList arrayList = new ArrayList();
        for (dl1.s sVar : x3().d()) {
            if (sVar instanceof az0) {
                bVar = new rp0.c((az0) sVar);
            } else {
                Intrinsics.g(sVar, "null cannot be cast to non-null type com.pinterest.api.model.AggregatedComment");
                bVar = new rp0.b((z2) sVar);
            }
            if (!bVar.x() && Intrinsics.d(this.f94539u.get(bVar.u()), Boolean.TRUE) && !arrayList.contains(sVar)) {
                arrayList.add(sVar);
                this.f94539u.put(bVar.u(), null);
                x3().T(sVar);
            }
        }
    }

    public abstract mh1.d x3();

    public abstract r z3();
}
