package oa2;

import com.pinterest.api.model.wy0;
import com.pinterest.ui.components.users.LegoUserRep;
import h32.e3;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import x02.x2;

/* loaded from: classes4.dex */
public final class o extends yk1.c implements s, xr0.b {
    public final l A;
    public final xk2.k B;

    /* renamed from: a, reason: collision with root package name */
    public final nk1.k f93923a;

    /* renamed from: b, reason: collision with root package name */
    public final Function2 f93924b;

    /* renamed from: c, reason: collision with root package name */
    public final Function2 f93925c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f93926d;

    /* renamed from: e, reason: collision with root package name */
    public final Function2 f93927e;

    /* renamed from: f, reason: collision with root package name */
    public final Function1 f93928f;

    /* renamed from: g, reason: collision with root package name */
    public final Function1 f93929g;

    /* renamed from: h, reason: collision with root package name */
    public final kl2.l f93930h;

    /* renamed from: i, reason: collision with root package name */
    public final xr0.b f93931i;

    /* renamed from: j, reason: collision with root package name */
    public final Function1 f93932j;

    /* renamed from: k, reason: collision with root package name */
    public final Function1 f93933k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f93934l;

    /* renamed from: m, reason: collision with root package name */
    public final String f93935m;

    /* renamed from: n, reason: collision with root package name */
    public final Function2 f93936n;

    /* renamed from: o, reason: collision with root package name */
    public final yk1.v f93937o;

    /* renamed from: p, reason: collision with root package name */
    public final x2 f93938p;

    /* renamed from: q, reason: collision with root package name */
    public final b60.b f93939q;

    /* renamed from: r, reason: collision with root package name */
    public final r41.k f93940r;

    /* renamed from: s, reason: collision with root package name */
    public final nk1.l f93941s;

    /* renamed from: t, reason: collision with root package name */
    public wy0 f93942t;

    /* renamed from: u, reason: collision with root package name */
    public nk1.m f93943u;

    /* renamed from: v, reason: collision with root package name */
    public s60.d f93944v;

    /* renamed from: w, reason: collision with root package name */
    public AtomicReference f93945w;

    /* renamed from: x, reason: collision with root package name */
    public AtomicReference f93946x;

    /* renamed from: y, reason: collision with root package name */
    public nk1.g f93947y;

    /* renamed from: z, reason: collision with root package name */
    public s60.c f93948z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(uk1.d presenterPinalytics, nk1.k userFollowActionListener, Function2 contentDescriptionProvider, Function2 titleProvider, Function1 titleTrailingImageProvider, Function2 metadataProvider, Function1 previewImagesProvider, Function1 avatarViewModelProvider, kl2.l actionButtonStateProvider, xr0.b bVar, l lVar, Function1 userNavigatorLogAction, Function1 auxDataProvider, boolean z13, String str, Function2 unfollowConfirmationAction, uj2.q networkStateStream, yk1.v viewResources, x2 userRepository, b60.b activeUserManager, nk1.l userFollowConfirmationProvider) {
        super(presenterPinalytics, networkStateStream);
        r41.k profileNavigator = r41.k.f106176a;
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(userFollowActionListener, "userFollowActionListener");
        Intrinsics.checkNotNullParameter(contentDescriptionProvider, "contentDescriptionProvider");
        Intrinsics.checkNotNullParameter(titleProvider, "titleProvider");
        Intrinsics.checkNotNullParameter(titleTrailingImageProvider, "titleTrailingImageProvider");
        Intrinsics.checkNotNullParameter(metadataProvider, "metadataProvider");
        Intrinsics.checkNotNullParameter(previewImagesProvider, "previewImagesProvider");
        Intrinsics.checkNotNullParameter(avatarViewModelProvider, "avatarViewModelProvider");
        Intrinsics.checkNotNullParameter(actionButtonStateProvider, "actionButtonStateProvider");
        Intrinsics.checkNotNullParameter(userNavigatorLogAction, "userNavigatorLogAction");
        Intrinsics.checkNotNullParameter(auxDataProvider, "auxDataProvider");
        Intrinsics.checkNotNullParameter(unfollowConfirmationAction, "unfollowConfirmationAction");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(profileNavigator, "profileNavigator");
        Intrinsics.checkNotNullParameter(userFollowConfirmationProvider, "userFollowConfirmationProvider");
        this.f93923a = userFollowActionListener;
        this.f93924b = contentDescriptionProvider;
        this.f93925c = titleProvider;
        this.f93926d = titleTrailingImageProvider;
        this.f93927e = metadataProvider;
        this.f93928f = previewImagesProvider;
        this.f93929g = avatarViewModelProvider;
        this.f93930h = actionButtonStateProvider;
        this.f93931i = bVar;
        this.f93932j = userNavigatorLogAction;
        this.f93933k = auxDataProvider;
        this.f93934l = z13;
        this.f93935m = str;
        this.f93936n = unfollowConfirmationAction;
        this.f93937o = viewResources;
        this.f93938p = userRepository;
        this.f93939q = activeUserManager;
        this.f93940r = profileNavigator;
        this.f93941s = userFollowConfirmationProvider;
        h6.r rVar = ck2.i.f27922b;
        xj2.e eVar = new xj2.e(rVar);
        Intrinsics.checkNotNullExpressionValue(eVar, "empty(...)");
        this.f93945w = eVar;
        xj2.e eVar2 = new xj2.e(rVar);
        Intrinsics.checkNotNullExpressionValue(eVar2, "empty(...)");
        this.f93946x = eVar2;
        this.f93947y = new nk1.g(getPinalytics(), null, null, null, new m(this, 4), 62);
        this.f93948z = new s60.c(getPinalytics(), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 62);
        this.A = lVar == null ? new c(new m(this, 1), new n(this, 0), new m(this, 3), 8) : lVar;
        this.B = xk2.m.a(xk2.n.NONE, new m(this, 0));
    }

    @Override // oa2.s
    public final void G1() {
        ((c) this.A).a();
    }

    @Override // oa2.s
    public final void a0() {
        ((c) this.A).a();
    }

    @Override // xr0.b
    public final e3 d0() {
        xr0.b bVar = this.f93931i;
        if (bVar == null) {
            bVar = (xr0.b) this.B.getValue();
        }
        if (bVar != null) {
            return bVar.d0();
        }
        return null;
    }

    @Override // xr0.b
    public final e3 i1() {
        xr0.b bVar = this.f93931i;
        if (bVar == null) {
            bVar = (xr0.b) this.B.getValue();
        }
        if (bVar != null) {
            return bVar.i1();
        }
        return null;
    }

    @Override // oa2.s
    public final void k() {
        this.A.k();
    }

    @Override // oa2.s
    public final void l1() {
        ((c) this.A).a();
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        t view = (t) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        view.j4(this);
        ((LegoUserRep) view).g0(this);
        u3(this.f93942t);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.atomic.AtomicReference, xj2.c] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.concurrent.atomic.AtomicReference, xj2.c] */
    @Override // yk1.p, yk1.b
    public final void onUnbind() {
        this.f93945w.dispose();
        this.f93946x.dispose();
        super.onUnbind();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (dl2.b.S1(r0, r2) == true) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q3(com.pinterest.api.model.wy0 r4) {
        /*
            r3 = this;
            b60.b r0 = r3.f93939q
            b60.d r0 = (b60.d) r0
            com.pinterest.api.model.wy0 r0 = r0.f()
            r1 = 1
            if (r0 == 0) goto L1e
            if (r4 == 0) goto L12
            java.lang.String r2 = r4.getF39332b()
            goto L13
        L12:
            r2 = 0
        L13:
            if (r2 != 0) goto L17
            java.lang.String r2 = ""
        L17:
            boolean r0 = dl2.b.S1(r0, r2)
            if (r0 != r1) goto L1e
            goto L38
        L1e:
            java.lang.Boolean r0 = r4.J3()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L39
            java.lang.Boolean r4 = r4.R2()
            java.lang.String r0 = "getExplicitlyFollowedByMe(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L38
            goto L39
        L38:
            r1 = 0
        L39:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: oa2.o.q3(com.pinterest.api.model.wy0):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.atomic.AtomicReference, xj2.c] */
    public final void r3(nk1.m mVar, wy0 wy0Var) {
        this.f93946x.dispose();
        Object F = mVar.h().A(wj2.c.a()).F(new e82.b(21, new ha2.i(7, this, wy0Var)), new e82.b(22, e.B), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        this.f93946x = (AtomicReference) F;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.atomic.AtomicReference, xj2.c] */
    public final void s3(String str) {
        this.f93945w.dispose();
        Object F = this.f93938p.C(str).F(new e82.b(23, new n(this, 1)), new e82.b(24, e.C), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        this.f93945w = (AtomicReference) F;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.concurrent.atomic.AtomicReference, xj2.c] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.concurrent.atomic.AtomicReference, xj2.c] */
    public final void t3(wy0 user) {
        nk1.m mVar;
        Intrinsics.checkNotNullParameter(user, "user");
        wy0 wy0Var = this.f93942t;
        String str = null;
        String f39332b = wy0Var != null ? wy0Var.getF39332b() : null;
        this.f93942t = user;
        if (Intrinsics.d(f39332b, user.getF39332b())) {
            if (this.f93946x.isDisposed() && (mVar = this.f93943u) != null) {
                r3(mVar, user);
            }
            if (this.f93945w.isDisposed()) {
                String f39332b2 = user.getF39332b();
                Intrinsics.checkNotNullExpressionValue(f39332b2, "getUid(...)");
                s3(f39332b2);
            }
        } else {
            String f39332b3 = user.getF39332b();
            Intrinsics.checkNotNullExpressionValue(f39332b3, "getUid(...)");
            s60.c a13 = s60.c.a(this.f93948z, f39332b3);
            this.f93948z = a13;
            this.f93944v = new s60.d(a13, this.f93938p);
            String f39332b4 = user.getF39332b();
            nk1.m mVar2 = this.f93943u;
            if (mVar2 != null) {
                str = mVar2.f91112a.getF39332b();
                Intrinsics.checkNotNullExpressionValue(str, "getUid(...)");
            }
            if (!Intrinsics.d(f39332b4, str)) {
                nk1.g a14 = nk1.g.a(this.f93947y, user.getF39332b());
                this.f93947y = a14;
                f2.o a15 = this.f93941s.a(false);
                nk1.k kVar = this.f93923a;
                nk1.m mVar3 = new nk1.m(user, a14, a15, kVar.f91140a, kVar.f91141b, kVar.f91142c, null, null, this.f93935m, 960);
                r3(mVar3, user);
                this.f93943u = mVar3;
            }
            s3(f39332b3);
        }
        u3(this.f93942t);
    }

    public final void u3(wy0 wy0Var) {
        if (wy0Var != null && isBound() && isBound()) {
            t tVar = (t) getView();
            Function2 function2 = this.f93925c;
            yk1.v vVar = this.f93937o;
            String str = (String) function2.invoke(wy0Var, vVar);
            String str2 = (String) this.f93927e.invoke(wy0Var, vVar);
            Pair pair = (Pair) this.f93926d.invoke(wy0Var);
            LegoUserRep legoUserRep = (LegoUserRep) tVar;
            legoUserRep.H1(str, ((Number) pair.f80346a).intValue(), (Integer) pair.f80347b, Integer.valueOf(((yk1.a) vVar).f139224a.getDimensionPixelSize(eo1.c.space_400)));
            legoUserRep.P0(str2);
            Function1 function1 = this.f93929g;
            legoUserRep.L0((List) this.f93928f.invoke(wy0Var), ((a) function1.invoke(wy0Var)).f93844a, ((a) function1.invoke(wy0Var)).f93845b);
            Boolean s22 = wy0Var.s2();
            Intrinsics.checkNotNullExpressionValue(s22, "getBlockedByMe(...)");
            legoUserRep.G0((yl1.b) this.f93930h.invoke(kh2.d.s(s22.booleanValue(), c0.d.d2(wy0Var)), vVar, Boolean.valueOf(q3(wy0Var))));
            CharSequence description = (CharSequence) this.f93924b.invoke(wy0Var, vVar);
            Intrinsics.checkNotNullParameter(description, "description");
            legoUserRep.setContentDescription(description);
        }
    }

    @Override // oa2.s
    public final void y2(i previewImagePosition) {
        Intrinsics.checkNotNullParameter(previewImagePosition, "previewImagePosition");
        c cVar = (c) this.A;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(previewImagePosition, "previewImagePosition");
        cVar.a();
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(yk1.r rVar) {
        t view = (t) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        view.j4(this);
        ((LegoUserRep) view).g0(this);
        u3(this.f93942t);
    }
}
