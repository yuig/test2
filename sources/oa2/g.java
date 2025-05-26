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
import z40.y;

/* loaded from: classes4.dex */
public final class g extends yk1.c implements s, xr0.b {
    public final xk2.v A;
    public final xk2.v B;

    /* renamed from: a, reason: collision with root package name */
    public final nk1.p f93887a;

    /* renamed from: b, reason: collision with root package name */
    public final Function2 f93888b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f93889c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f93890d;

    /* renamed from: e, reason: collision with root package name */
    public final Function2 f93891e;

    /* renamed from: f, reason: collision with root package name */
    public final Function1 f93892f;

    /* renamed from: g, reason: collision with root package name */
    public final Function1 f93893g;

    /* renamed from: h, reason: collision with root package name */
    public final kl2.l f93894h;

    /* renamed from: i, reason: collision with root package name */
    public final xr0.b f93895i;

    /* renamed from: j, reason: collision with root package name */
    public final Function1 f93896j;

    /* renamed from: k, reason: collision with root package name */
    public final Function1 f93897k;

    /* renamed from: l, reason: collision with root package name */
    public final Function1 f93898l;

    /* renamed from: m, reason: collision with root package name */
    public final Function2 f93899m;

    /* renamed from: n, reason: collision with root package name */
    public final yk1.v f93900n;

    /* renamed from: o, reason: collision with root package name */
    public final oc.c f93901o;

    /* renamed from: p, reason: collision with root package name */
    public final r41.k f93902p;

    /* renamed from: q, reason: collision with root package name */
    public final nk1.l f93903q;

    /* renamed from: r, reason: collision with root package name */
    public final String f93904r;

    /* renamed from: s, reason: collision with root package name */
    public y f93905s;

    /* renamed from: t, reason: collision with root package name */
    public nk1.n f93906t;

    /* renamed from: u, reason: collision with root package name */
    public s60.d f93907u;

    /* renamed from: v, reason: collision with root package name */
    public final xj2.e f93908v;

    /* renamed from: w, reason: collision with root package name */
    public AtomicReference f93909w;

    /* renamed from: x, reason: collision with root package name */
    public nk1.g f93910x;

    /* renamed from: y, reason: collision with root package name */
    public s60.c f93911y;

    /* renamed from: z, reason: collision with root package name */
    public final l f93912z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(uk1.d presenterPinalytics, nk1.p userFollowActionListener, Function2 contentDescriptionProvider, Function1 titleProvider, Function1 titleTrailingImageProvider, Function2 metadataProvider, Function1 previewImagesProvider, Function1 avatarViewModelProvider, kl2.l actionButtonStateProvider, xr0.b bVar, l lVar, Function1 userNavigatorLogAction, Function1 auxDataProvider, Function1 moreOptionsAction, Function2 unfollowConfirmationAction, uj2.q networkStateStream, yk1.v viewResources, oc.c apolloClient, nk1.l userFollowConfirmationProvider, String str) {
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
        Intrinsics.checkNotNullParameter(moreOptionsAction, "moreOptionsAction");
        Intrinsics.checkNotNullParameter(unfollowConfirmationAction, "unfollowConfirmationAction");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        Intrinsics.checkNotNullParameter(profileNavigator, "profileNavigator");
        Intrinsics.checkNotNullParameter(userFollowConfirmationProvider, "userFollowConfirmationProvider");
        this.f93887a = userFollowActionListener;
        this.f93888b = contentDescriptionProvider;
        this.f93889c = titleProvider;
        this.f93890d = titleTrailingImageProvider;
        this.f93891e = metadataProvider;
        this.f93892f = previewImagesProvider;
        this.f93893g = avatarViewModelProvider;
        this.f93894h = actionButtonStateProvider;
        this.f93895i = bVar;
        this.f93896j = userNavigatorLogAction;
        this.f93897k = auxDataProvider;
        this.f93898l = moreOptionsAction;
        this.f93899m = unfollowConfirmationAction;
        this.f93900n = viewResources;
        this.f93901o = apolloClient;
        this.f93902p = profileNavigator;
        this.f93903q = userFollowConfirmationProvider;
        this.f93904r = str;
        h6.r rVar = ck2.i.f27922b;
        xj2.e eVar = new xj2.e(rVar);
        Intrinsics.checkNotNullExpressionValue(eVar, "empty(...)");
        this.f93908v = eVar;
        xj2.e eVar2 = new xj2.e(rVar);
        Intrinsics.checkNotNullExpressionValue(eVar2, "empty(...)");
        this.f93909w = eVar2;
        this.f93910x = new nk1.g(getPinalytics(), null, null, null, new d(this, 4), 62);
        this.f93911y = new s60.c(getPinalytics(), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 62);
        this.f93912z = lVar == null ? new c(new d(this, 0), new ha2.j(this, 2), new d(this, 2), new d(this, 3)) : lVar;
        this.A = xk2.m.b(b.f93852m);
        this.B = xk2.m.b(b.f93851l);
    }

    @Override // oa2.s
    public final void G1() {
        ((c) this.f93912z).a();
    }

    @Override // oa2.s
    public final void W2() {
        ((c) this.f93912z).f93857d.invoke();
    }

    @Override // oa2.s
    public final void a0() {
        ((c) this.f93912z).a();
    }

    @Override // xr0.b
    public final e3 d0() {
        xr0.b bVar = this.f93895i;
        if (bVar == null) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar.d0();
        }
        return null;
    }

    @Override // xr0.b
    public final e3 i1() {
        xr0.b bVar = this.f93895i;
        if (bVar == null) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar.i1();
        }
        return null;
    }

    @Override // oa2.s
    public final void k() {
        this.f93912z.k();
    }

    @Override // oa2.s
    public final void l1() {
        ((c) this.f93912z).a();
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        t view = (t) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        view.j4(this);
        ((LegoUserRep) view).g0(this);
        r3(this.f93905s);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.concurrent.atomic.AtomicReference, xj2.c] */
    @Override // yk1.p, yk1.b
    public final void onUnbind() {
        this.f93908v.dispose();
        this.f93909w.dispose();
        super.onUnbind();
    }

    public final boolean q3(y yVar) {
        Boolean j13 = yVar.j();
        boolean booleanValue = j13 != null ? j13.booleanValue() : false;
        Boolean d2 = yVar.d();
        boolean booleanValue2 = d2 != null ? d2.booleanValue() : false;
        wy0 f13 = ((b60.d) ((b60.b) this.B.getValue())).f();
        if (f13 == null || !dl2.b.S1(f13, yVar.a())) {
            return !booleanValue || booleanValue2;
        }
        return false;
    }

    public final void r3(y yVar) {
        if (yVar != null && isBound() && isBound()) {
            t tVar = (t) getView();
            String str = (String) this.f93889c.invoke(yVar);
            Function2 function2 = this.f93891e;
            yk1.v vVar = this.f93900n;
            String str2 = (String) function2.invoke(yVar, vVar);
            Pair pair = (Pair) this.f93890d.invoke(yVar);
            LegoUserRep legoUserRep = (LegoUserRep) tVar;
            legoUserRep.H1(str, ((Number) pair.f80346a).intValue(), (Integer) pair.f80347b, Integer.valueOf(((yk1.a) vVar).f139224a.getDimensionPixelSize(eo1.c.space_400)));
            legoUserRep.P0(str2);
            Function1 function1 = this.f93893g;
            legoUserRep.L0((List) this.f93892f.invoke(yVar), ((a) function1.invoke(yVar)).f93844a, ((a) function1.invoke(yVar)).f93845b);
            Boolean m13 = yVar.m();
            boolean booleanValue = m13 != null ? m13.booleanValue() : false;
            Boolean d2 = yVar.d();
            legoUserRep.G0((yl1.b) this.f93894h.invoke(kh2.d.s(booleanValue, d2 != null ? d2.booleanValue() : false), vVar, Boolean.valueOf(q3(yVar))));
            CharSequence description = (CharSequence) this.f93888b.invoke(yVar, vVar);
            Intrinsics.checkNotNullParameter(description, "description");
            legoUserRep.setContentDescription(description);
        }
    }

    @Override // oa2.s
    public final void y2(i previewImagePosition) {
        Intrinsics.checkNotNullParameter(previewImagePosition, "previewImagePosition");
        c cVar = (c) this.f93912z;
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
        r3(this.f93905s);
    }
}
