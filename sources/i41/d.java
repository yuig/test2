package i41;

import a11.n;
import a41.m;
import a41.p;
import a41.u;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.pinterest.api.model.b90;
import com.pinterest.api.model.vz0;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.profile.lego.header.view.LegoUserProfileHeader;
import com.pinterest.gestalt.text.GestaltText;
import h41.f;
import j41.h;
import kh2.r;
import kh2.u2;
import kk2.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import m60.w;
import nx.f0;
import pk.a0;
import px0.g;
import qb0.j;
import r41.e;
import r41.i;
import rq.y;
import u50.i0;
import uj2.q;
import w01.e0;
import x02.x2;
import xk2.k;
import yk1.v;

/* loaded from: classes5.dex */
public final class d extends yk1.c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final String f71518a;

    /* renamed from: b, reason: collision with root package name */
    public final e f71519b;

    /* renamed from: c, reason: collision with root package name */
    public final i f71520c;

    /* renamed from: d, reason: collision with root package name */
    public final m f71521d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f71522e;

    /* renamed from: f, reason: collision with root package name */
    public final Function1 f71523f;

    /* renamed from: g, reason: collision with root package name */
    public final v f71524g;

    /* renamed from: h, reason: collision with root package name */
    public final x2 f71525h;

    /* renamed from: i, reason: collision with root package name */
    public final w f71526i;

    /* renamed from: j, reason: collision with root package name */
    public final f0 f71527j;

    /* renamed from: k, reason: collision with root package name */
    public final qb0.f f71528k;

    /* renamed from: l, reason: collision with root package name */
    public final d30.a f71529l;

    /* renamed from: m, reason: collision with root package name */
    public final b60.b f71530m;

    /* renamed from: n, reason: collision with root package name */
    public final yq.e f71531n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f71532o;

    /* renamed from: p, reason: collision with root package name */
    public wy0 f71533p;

    /* renamed from: q, reason: collision with root package name */
    public final k f71534q;

    /* renamed from: r, reason: collision with root package name */
    public vz0 f71535r;

    /* renamed from: s, reason: collision with root package name */
    public l f71536s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String userId, e profileDisplay, i viewingMode, n clickthroughHelper, m overlayVisibilityListener, uk1.d presenterPinalytics, q networkStateStream, boolean z13, p followAction, v resources, x2 userRepository, w eventManager, f0 pinalyticsFactory, qb0.a formatter, d30.a verifiedMerchantService, b60.b activeUserManager, yq.e pincodeCreateModalFactory) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(profileDisplay, "profileDisplay");
        Intrinsics.checkNotNullParameter(viewingMode, "viewingMode");
        Intrinsics.checkNotNullParameter(clickthroughHelper, "clickthroughHelper");
        Intrinsics.checkNotNullParameter(overlayVisibilityListener, "overlayVisibilityListener");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(followAction, "followAction");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Intrinsics.checkNotNullParameter(verifiedMerchantService, "verifiedMerchantService");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(pincodeCreateModalFactory, "pincodeCreateModalFactory");
        this.f71518a = userId;
        this.f71519b = profileDisplay;
        this.f71520c = viewingMode;
        this.f71521d = overlayVisibilityListener;
        this.f71522e = z13;
        this.f71523f = followAction;
        this.f71524g = resources;
        this.f71525h = userRepository;
        this.f71526i = eventManager;
        this.f71527j = pinalyticsFactory;
        this.f71528k = formatter;
        this.f71529l = verifiedMerchantService;
        this.f71530m = activeUserManager;
        this.f71531n = pincodeCreateModalFactory;
        this.f71532o = profileDisplay == e.Business;
        this.f71534q = xk2.m.a(xk2.n.NONE, new e0(this, 20));
    }

    public final void B3(wy0 user) {
        LegoUserProfileHeader legoUserProfileHeader = (LegoUserProfileHeader) ((h41.e) getView());
        legoUserProfileHeader.getClass();
        Intrinsics.checkNotNullParameter(user, "user");
        int i13 = 9;
        legoUserProfileHeader.f47542h.H2(new y(9, user));
        String name = user.U2();
        if (name == null) {
            name = "";
        }
        LegoUserProfileHeader legoUserProfileHeader2 = (LegoUserProfileHeader) ((h41.e) getView());
        legoUserProfileHeader2.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        a0.p(legoUserProfileHeader2.f47543i, name);
        h41.e eVar = (h41.e) getView();
        boolean z13 = !z.j(name);
        LegoUserProfileHeader legoUserProfileHeader3 = (LegoUserProfileHeader) eVar;
        legoUserProfileHeader3.getClass();
        legoUserProfileHeader3.f47543i.i(new i31.a(z13, 8));
        v3(user);
        t3(user);
        LegoUserProfileHeader.t0(((LegoUserProfileHeader) ((h41.e) getView())).f47556v, false);
        LegoUserProfileHeader legoUserProfileHeader4 = (LegoUserProfileHeader) ((h41.e) getView());
        legoUserProfileHeader4.N = false;
        legoUserProfileHeader4.r0();
        LegoUserProfileHeader legoUserProfileHeader5 = (LegoUserProfileHeader) ((h41.e) getView());
        legoUserProfileHeader5.P = false;
        legoUserProfileHeader5.r0();
        LegoUserProfileHeader legoUserProfileHeader6 = (LegoUserProfileHeader) ((h41.e) getView());
        legoUserProfileHeader6.getClass();
        legoUserProfileHeader6.f47544j.i(new i31.a(false, i13));
        r.r(((LegoUserProfileHeader) ((h41.e) getView())).f47560z, d7.b.Z(false));
        LegoUserProfileHeader legoUserProfileHeader7 = (LegoUserProfileHeader) ((h41.e) getView());
        LegoUserProfileHeader.t0(legoUserProfileHeader7.f47545k, false);
        LegoUserProfileHeader.t0(legoUserProfileHeader7.B, false);
        LegoUserProfileHeader.t0(legoUserProfileHeader7.C, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D3(com.pinterest.api.model.wy0 r25) {
        /*
            Method dump skipped, instructions count: 1119
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i41.d.D3(com.pinterest.api.model.wy0):void");
    }

    public final void q3(wy0 wy0Var) {
        boolean z13;
        c92.n nVar;
        b90 f43 = wy0Var.f4();
        String f13 = f43 != null ? f43.f() : null;
        if (this.f71532o) {
            Boolean u43 = wy0Var.u4();
            Intrinsics.checkNotNullExpressionValue(u43, "getShowCreatorProfile(...)");
            if (u43.booleanValue()) {
                z13 = true;
                nVar = h41.a.f67627b;
                if (z13 || f43 == null || f13 == null || f13.length() == 0) {
                    ((LegoUserProfileHeader) ((h41.e) getView())).g0(nVar);
                }
                if (z.i("image", f13, true)) {
                    String O = el.a.O(f43);
                    if (O == null) {
                        O = "";
                    }
                    nVar = new h41.c(null, O);
                }
                ((LegoUserProfileHeader) ((h41.e) getView())).g0(nVar);
                return;
            }
        }
        z13 = false;
        nVar = h41.a.f67627b;
        if (z13) {
        }
        ((LegoUserProfileHeader) ((h41.e) getView())).g0(nVar);
    }

    public final void r3(c92.n media) {
        Intrinsics.checkNotNullParameter(media, "media");
        if (isBound()) {
            LegoUserProfileHeader legoUserProfileHeader = (LegoUserProfileHeader) ((h41.e) getView());
            legoUserProfileHeader.getClass();
            Intrinsics.checkNotNullParameter(media, "media");
            legoUserProfileHeader.g0(media);
            y31.k Z = legoUserProfileHeader.Z();
            h onCancel = new h(legoUserProfileHeader, 4);
            y31.q qVar = (y31.q) Z;
            ViewGroup coverMediaContainer = legoUserProfileHeader.f47538d;
            qVar.getClass();
            Intrinsics.checkNotNullParameter(coverMediaContainer, "coverMediaContainer");
            Intrinsics.checkNotNullParameter(media, "media");
            Intrinsics.checkNotNullParameter(onCancel, "onCancel");
            coverMediaContainer.post(new ja.y(media, qVar, onCancel, 23));
        }
    }

    public final void s3(wy0 user) {
        Intrinsics.checkNotNullParameter(user, "user");
        if (user != null && isBound()) {
            if (!ai0.a.d(user, this.f71530m) || user.R2().booleanValue()) {
                D3(user);
            } else {
                B3(user);
            }
        }
        this.f71533p = user;
    }

    public final void t3(wy0 wy0Var) {
        boolean z13 = ai0.a.d(wy0Var, this.f71530m) && this.f71522e && !wy0Var.R2().booleanValue() && !this.f71520c.isPublic();
        LegoUserProfileHeader legoUserProfileHeader = (LegoUserProfileHeader) ((h41.e) getView());
        legoUserProfileHeader.getClass();
        legoUserProfileHeader.E.d(new i31.a(z13, 7));
    }

    public final void u3(wy0 wy0Var) {
        if (ai0.a.d(wy0Var, this.f71530m) && !wy0Var.R2().booleanValue()) {
            LegoUserProfileHeader.t0(((LegoUserProfileHeader) ((h41.e) getView())).f47556v, false);
            return;
        }
        v vVar = this.f71524g;
        qb0.f fVar = this.f71528k;
        String M = r.M(wy0Var, vVar, fVar);
        String a13 = j.a(M);
        String uid = wy0Var.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        String o13 = wy0Var.o();
        if (o13 == null) {
            o13 = "";
        }
        g gVar = new g((Object) this, (Object) uid, (Object) o13, 4);
        Integer V2 = wy0Var.V2();
        Intrinsics.checkNotNullExpressionValue(V2, "getFollowerCount(...)");
        h41.g metadata = new h41.g(M, a13, gVar, V2.intValue() > 0);
        int intValue = wy0Var.X2().intValue();
        Integer r33 = wy0Var.r3();
        Intrinsics.checkNotNullExpressionValue(r33, "getInterestFollowingCount(...)");
        int max = Math.max(0, intValue - r33.intValue());
        String quantityString = ((yk1.a) vVar).f139224a.getQuantityString(oz1.d.plural_following_only_lowercase, max, new Object[0]);
        ((qb0.a) fVar).getClass();
        String D = a.a.D(j.b(max), " ", quantityString);
        h41.g metadata2 = new h41.g(D, j.a(D), new b01.c(14, this, wy0Var), max > 0);
        LegoUserProfileHeader legoUserProfileHeader = (LegoUserProfileHeader) ((h41.e) getView());
        LegoUserProfileHeader.t0(legoUserProfileHeader.f47556v, (M.length() == 0 && D.length() == 0) ? false : true);
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        legoUserProfileHeader.k0(legoUserProfileHeader.f47557w, metadata);
        Intrinsics.checkNotNullParameter(metadata2, "metadata");
        legoUserProfileHeader.k0(legoUserProfileHeader.f47558x, metadata2);
    }

    public final void v3(wy0 wy0Var) {
        Boolean J3 = wy0Var.J3();
        Intrinsics.checkNotNullExpressionValue(J3, "getIsPrivateProfile(...)");
        if (J3.booleanValue()) {
            LegoUserProfileHeader legoUserProfileHeader = (LegoUserProfileHeader) ((h41.e) getView());
            legoUserProfileHeader.getClass();
            Drawable f03 = bs1.c.f0(legoUserProfileHeader, sm1.b.ic_lock_gestalt, Integer.valueOf(eo1.b.color_themed_icon_default), null, 4);
            y31.k Z = legoUserProfileHeader.Z();
            GestaltText gestaltText = legoUserProfileHeader.f47543i;
            i0 i0Var = gestaltText.l().f108849g;
            Context context = legoUserProfileHeader.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            gestaltText.i(new j41.i(((y31.q) Z).e(i0Var.a(context).toString(), f03, 1, new h(legoUserProfileHeader, 1)), 0));
        }
    }

    public final boolean w3(wy0 wy0Var) {
        wy0 f13 = ((b60.d) this.f71530m).f();
        if (f13 == null) {
            return false;
        }
        String uid = wy0Var != null ? wy0Var.getUid() : null;
        if (uid == null) {
            uid = "";
        }
        return dl2.b.S1(f13, uid);
    }

    @Override // yk1.p
    /* renamed from: x3, reason: merged with bridge method [inline-methods] */
    public final void r3(h41.e view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        LegoUserProfileHeader legoUserProfileHeader = (LegoUserProfileHeader) view;
        m listener = this.f71521d;
        Intrinsics.checkNotNullParameter(listener, "listener");
        legoUserProfileHeader.R = listener;
        Intrinsics.checkNotNullParameter(this, "listener");
        legoUserProfileHeader.K = this;
        wy0 wy0Var = this.f71533p;
        if (wy0Var != null) {
            if (!ai0.a.d(wy0Var, this.f71530m) || wy0Var.R2().booleanValue()) {
                D3(wy0Var);
            } else {
                B3(wy0Var);
            }
        }
        xj2.c F = this.f71525h.B().F(new u(17, new a(this, 1)), new u(18, b.f71515k), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
    }

    public final void z3() {
        if (isBound()) {
            h41.e eVar = (h41.e) getView();
            vz0 vz0Var = this.f71535r;
            LegoUserProfileHeader legoUserProfileHeader = (LegoUserProfileHeader) eVar;
            se2.a aVar = legoUserProfileHeader.F;
            if (aVar == null) {
                Intrinsics.r("eventManager");
                throw null;
            }
            w wVar = (w) ((bf2.b) aVar).get();
            lu1.b bVar = legoUserProfileHeader.H;
            if (bVar != null) {
                wVar.d(new jc0.v(u2.J(vz0Var, bVar), false, 0L, 30));
            } else {
                Intrinsics.r("baseActivityHelper");
                throw null;
            }
        }
    }
}
