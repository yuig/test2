package rk1;

import android.content.Context;
import android.view.View;
import c71.l;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import ha2.i;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nk1.o;
import nk1.p;
import oa2.q;
import oa2.r;
import oa2.t;
import r41.k;
import so.d2;
import so.oa;
import so.r8;
import so.s8;
import t3.s1;
import vq0.h;
import x02.x2;
import xk2.v;
import yk1.m;
import yk1.n;
import z40.y;

/* loaded from: classes5.dex */
public final class g extends h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108493a;

    /* renamed from: b, reason: collision with root package name */
    public final uk1.d f108494b;

    /* renamed from: c, reason: collision with root package name */
    public final Function2 f108495c;

    /* renamed from: d, reason: collision with root package name */
    public final Function2 f108496d;

    /* renamed from: e, reason: collision with root package name */
    public final Function1 f108497e;

    /* renamed from: f, reason: collision with root package name */
    public final Function2 f108498f;

    /* renamed from: g, reason: collision with root package name */
    public final Function1 f108499g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f108500h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f108501i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f108502j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(Function1 function1, uk1.d dVar, l lVar, d2 d2Var, e41.b bVar, e41.e eVar, int i13) {
        this(function1, dVar, o.f91161a, oa2.f.f93879k, oa2.f.f93880l, (i13 & 32) != 0 ? oa2.e.f93866p : lVar, d2Var, (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? a.f108478j : bVar, (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? d.f108487l : eVar);
        this.f108493a = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, xj2.c] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, oa2.t] */
    /* JADX WARN: Type inference failed for: r2v16, types: [yk1.m] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, oa2.t] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.concurrent.atomic.AtomicReference, xj2.c] */
    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        oa2.g gVar;
        String str = null;
        oa2.o oVar = null;
        switch (this.f108493a) {
            case 0:
                ?? view = (t) nVar;
                Intrinsics.checkNotNullParameter(view, "view");
                y user = (y) this.f108497e.invoke(obj);
                if (user != null) {
                    View view2 = view instanceof View ? (View) view : null;
                    if (view2 != null) {
                        m j13 = s1.j(view2);
                        if (!(j13 instanceof oa2.g)) {
                            j13 = null;
                        }
                        gVar = (oa2.g) j13;
                    } else {
                        gVar = null;
                    }
                    if (gVar != null) {
                        Intrinsics.checkNotNullParameter(user, "user");
                        y yVar = gVar.f93905s;
                        String a13 = yVar != null ? yVar.a() : null;
                        gVar.f93905s = user;
                        if (!Intrinsics.d(a13, user.a())) {
                            s60.c a14 = s60.c.a(gVar.f93911y, user.a());
                            gVar.f93911y = a14;
                            gVar.f93907u = new s60.d(a14);
                            String a15 = user.a();
                            nk1.n nVar2 = gVar.f93906t;
                            if (nVar2 != null) {
                                str = nVar2.f91112a.getId();
                                Intrinsics.checkNotNullExpressionValue(str, "getUid(...)");
                            }
                            if (!Intrinsics.d(a15, str)) {
                                nk1.g a16 = nk1.g.a(gVar.f93910x, user.a());
                                gVar.f93910x = a16;
                                f2.o a17 = gVar.f93903q.a(false);
                                p pVar = gVar.f93887a;
                                Function2 function2 = pVar.f91162a;
                                v vVar = gVar.A;
                                x2 x2Var = (x2) vVar.getValue();
                                Context context = kb0.a.f79058b;
                                nk1.n nVar3 = new nk1.n(user, x2Var, a16, new ok1.f(gVar.f93910x, (x2) vVar.getValue(), gVar.f93901o, true, null, 48), gVar.f93904r, ((oa) ((so1.b) ep.b.g(so1.b.class))).F2(), a17, function2, pVar.f91163b, pVar.f91164c);
                                gVar.f93909w.dispose();
                                ?? F = nVar3.h().A(wj2.c.a()).F(new e82.b(17, new i(5, gVar, user)), new e82.b(18, oa2.e.f93862l), ck2.i.f27923c, ck2.i.f27924d);
                                Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
                                gVar.f93909w = (AtomicReference) F;
                                gVar.f93906t = nVar3;
                            }
                        }
                        gVar.r3(gVar.f93905s);
                        break;
                    }
                }
                break;
            default:
                ?? view3 = (t) nVar;
                wy0 model = (wy0) obj;
                Intrinsics.checkNotNullParameter(view3, "view");
                Intrinsics.checkNotNullParameter(model, "model");
                View view4 = view3 instanceof View ? (View) view3 : null;
                if (view4 != null) {
                    ?? j14 = s1.j(view4);
                    oVar = j14 instanceof oa2.o ? j14 : null;
                }
                if (oVar != null) {
                    oVar.t3(model);
                    break;
                }
                break;
        }
    }

    @Override // vq0.h
    public final m f() {
        int i13 = this.f108493a;
        Object obj = this.f108501i;
        Object obj2 = this.f108500h;
        Object obj3 = this.f108502j;
        switch (i13) {
            case 0:
                p pVar = (p) obj;
                Function1 function1 = (Function1) obj2;
                oa2.e eVar = oa2.e.f93867q;
                oa2.e eVar2 = oa2.e.f93868r;
                oa2.e eVar3 = oa2.e.f93865o;
                q qVar = r.f93960i;
                oa2.e eVar4 = oa2.e.f93863m;
                oa2.e eVar5 = oa2.e.f93864n;
                r8 r8Var = ((d2) obj3).f113380a;
                uj2.q qVar2 = (uj2.q) r8Var.f114090a.f113947u9.get();
                s8 s8Var = r8Var.f114091b;
                yk1.v vVar = (yk1.v) s8Var.C.get();
                oc.c cVar = (oc.c) r8Var.f114090a.f113907s5.get();
                k kVar = k.f106176a;
                return new oa2.g(this.f108494b, pVar, this.f108495c, eVar, eVar2, this.f108496d, this.f108499g, eVar3, qVar, null, null, eVar4, eVar5, function1, this.f108498f, qVar2, vVar, cVar, new nk1.l((i92.k) s8Var.f114255d.f113921t1.get(), 1), null);
            default:
                return oa2.p.a((oa2.p) obj3, this.f108494b, (nk1.k) obj2, this.f108495c, null, null, this.f108496d, this.f108497e, this.f108498f, (kl2.l) obj, this.f108499g, null, false, null, 60568);
        }
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        switch (this.f108493a) {
            default:
                wy0 model = (wy0) obj;
                Intrinsics.checkNotNullParameter(model, "model");
            case 0:
                return null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(uk1.d dVar, nk1.k kVar, oa2.f fVar, oa2.f fVar2, q qVar, Function1 function1, oa2.p pVar) {
        this(dVar, kVar, fVar, fVar2, qVar, function1, pVar, a.f108480l, d.f108488m);
        this.f108493a = 1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(uk1.d pinalytics, nk1.k userFollowActionListener, oa2.p legoUserRepPresenterFactory, Function2 unfollowConfirmationAction, Function1 userNavigatorLogAction) {
        this(pinalytics, userFollowActionListener, r.f93953b, r.f93957f, r.f93960i, r.f93958g, legoUserRepPresenterFactory, unfollowConfirmationAction, userNavigatorLogAction);
        this.f108493a = 1;
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(userFollowActionListener, "userFollowActionListener");
        Intrinsics.checkNotNullParameter(legoUserRepPresenterFactory, "legoUserRepPresenterFactory");
        Intrinsics.checkNotNullParameter(unfollowConfirmationAction, "unfollowConfirmationAction");
        Intrinsics.checkNotNullParameter(userNavigatorLogAction, "userNavigatorLogAction");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(uk1.d dVar, nk1.k kVar, oa2.p pVar, us0.a aVar) {
        this(dVar, kVar, pVar, a.f108481m, aVar);
        this.f108493a = 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g(uk1.d r9, oa2.f r10, oa2.p r11) {
        /*
            r8 = this;
            k61.b r6 = k61.b.f78398i
            r0 = 1
            r8.f108493a = r0
            java.lang.String r0 = "pinalytics"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "contentDescriptionProvider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "previewImagesProvider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "legoUserRepPresenterFactory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            nk1.k r2 = oa2.r.f93952a
            oa2.f r4 = oa2.r.f93957f
            oa2.q r5 = oa2.r.f93960i
            r0 = r8
            r1 = r9
            r3 = r10
            r7 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rk1.g.<init>(uk1.d, oa2.f, oa2.p):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(uk1.d pinalytics, oa2.p legoUserRepPresenterFactory) {
        this(pinalytics, r.f93952a, r.f93953b, r.f93957f, r.f93960i, r.f93958g, legoUserRepPresenterFactory);
        this.f108493a = 1;
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(legoUserRepPresenterFactory, "legoUserRepPresenterFactory");
    }

    public g(Function1 extractData, uk1.d pinalytics, p userFollowActionListener, Function2 contentDescriptionProvider, Function2 metadataProvider, Function1 previewImagesProvider, d2 graphQLLegoUserRepPresenterFactory, Function2 unfollowConfirmationAction, Function1 moreOptionsAction) {
        this.f108493a = 0;
        Intrinsics.checkNotNullParameter(extractData, "extractData");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(userFollowActionListener, "userFollowActionListener");
        Intrinsics.checkNotNullParameter(contentDescriptionProvider, "contentDescriptionProvider");
        Intrinsics.checkNotNullParameter(metadataProvider, "metadataProvider");
        Intrinsics.checkNotNullParameter(previewImagesProvider, "previewImagesProvider");
        Intrinsics.checkNotNullParameter(graphQLLegoUserRepPresenterFactory, "graphQLLegoUserRepPresenterFactory");
        Intrinsics.checkNotNullParameter(unfollowConfirmationAction, "unfollowConfirmationAction");
        Intrinsics.checkNotNullParameter(moreOptionsAction, "moreOptionsAction");
        this.f108497e = extractData;
        this.f108494b = pinalytics;
        this.f108501i = userFollowActionListener;
        this.f108495c = contentDescriptionProvider;
        this.f108496d = metadataProvider;
        this.f108499g = previewImagesProvider;
        this.f108502j = graphQLLegoUserRepPresenterFactory;
        this.f108498f = unfollowConfirmationAction;
        this.f108500h = moreOptionsAction;
    }

    public g(uk1.d pinalytics, nk1.k userFollowActionListener, oa2.f contentDescriptionProvider, oa2.f metadataProvider, q actionButtonStateProvider, Function1 previewImagesProvider, oa2.p legoUserRepPresenterFactory, Function2 unfollowConfirmationAction, Function1 userNavigatorLogAction) {
        this.f108493a = 1;
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(userFollowActionListener, "userFollowActionListener");
        Intrinsics.checkNotNullParameter(contentDescriptionProvider, "contentDescriptionProvider");
        Intrinsics.checkNotNullParameter(metadataProvider, "metadataProvider");
        Intrinsics.checkNotNullParameter(actionButtonStateProvider, "actionButtonStateProvider");
        Intrinsics.checkNotNullParameter(previewImagesProvider, "previewImagesProvider");
        Intrinsics.checkNotNullParameter(legoUserRepPresenterFactory, "legoUserRepPresenterFactory");
        Intrinsics.checkNotNullParameter(unfollowConfirmationAction, "unfollowConfirmationAction");
        Intrinsics.checkNotNullParameter(userNavigatorLogAction, "userNavigatorLogAction");
        this.f108494b = pinalytics;
        this.f108500h = userFollowActionListener;
        this.f108495c = contentDescriptionProvider;
        this.f108496d = metadataProvider;
        this.f108501i = actionButtonStateProvider;
        this.f108497e = previewImagesProvider;
        this.f108502j = legoUserRepPresenterFactory;
        this.f108498f = unfollowConfirmationAction;
        this.f108499g = userNavigatorLogAction;
    }
}
