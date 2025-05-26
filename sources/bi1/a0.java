package bi1;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import androidx.recyclerview.widget.b2;
import bk1.a2;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.following.view.lego.FollowButton;
import com.pinterest.framework.multisection.datasource.pagedlist.e0;
import com.pinterest.framework.multisection.datasource.pagedlist.r0;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.framework.screens.ScreenManager$Companion;
import dl1.q0;
import ek1.r1;
import ek1.s1;
import ek1.v1;
import ey.u1;
import h32.h0;
import h32.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import sq0.c0;
import u50.k0;
import v.d3;
import yi1.f0;

/* loaded from: classes5.dex */
public final class a0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f22827i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f22828j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(Object obj, int i13) {
        super(1);
        this.f22827i = i13;
        this.f22828j = obj;
    }

    public final ek1.r b(ek1.r it) {
        int i13 = this.f22827i;
        Object obj = this.f22828j;
        switch (i13) {
            case 11:
                Intrinsics.checkNotNullParameter(it, "it");
                yi1.d dVar = (yi1.d) obj;
                List<u50.o> list = it.f59328a;
                ArrayList arrayList = new ArrayList(g0.q(list, 10));
                for (u50.o oVar : list) {
                    if (oVar instanceof yi1.l) {
                        oVar = yi1.l.e((yi1.l) oVar, dVar);
                    }
                    arrayList.add(oVar);
                }
                return ek1.r.e(it, arrayList, null, null, false, null, 30);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return ek1.r.e(it, null, (az.b) obj, null, false, null, 29);
        }
    }

    public final r1 e(r1 it) {
        int i13 = this.f22827i;
        Object obj = this.f22828j;
        switch (i13) {
            case 9:
                Intrinsics.checkNotNullParameter(it, "it");
                return r1.b(it, null, null, 0, null, null, null, false, false, null, 0, null, null, false, false, null, false, false, null, null, false, false, false, false, null, null, false, false, false, null, null, false, ((yi1.u) ((f0) obj)).f139160a, false, false, false, -1, 4063231);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return r1.b(it, null, null, 0, new ek1.d(0, ((s1) ((v1) obj)).f59368a), null, null, false, false, null, 0, null, null, false, false, null, false, false, null, null, false, false, false, false, null, null, false, false, false, null, null, false, null, false, false, false, -129, 4194303);
        }
    }

    public final void f(l82.n start) {
        int i13 = this.f22827i;
        Object obj = this.f22828j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(start, "$this$start");
                l82.n.b(start, ((b0) obj).f22832c);
                break;
            default:
                Intrinsics.checkNotNullParameter(start, "$this$buildAndStart");
                l82.n.b(start, (li1.m) obj);
                break;
        }
    }

    public final void h(rn1.k bind) {
        int i13 = this.f22827i;
        Object obj = this.f22828j;
        switch (i13) {
            case 28:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f108897l = ql1.l.attribution_sponsored_label;
                bind.h(vn1.g.BODY_100);
                bind.e(ql1.n.attribution_sponsored_label_text);
                bind.f108898m = new k0(ql1.n.attribution_sponsored_label_text);
                bind.b(vn1.c.SUBTLE);
                if (((ql1.c) obj).f104076b) {
                    bind.f108894i = new rm1.d(new rm1.e(rm1.n.ARROW_UP_RIGHT, rm1.h.XS), rm1.c.SUBTLE, null, 0, null, 28);
                }
                fm1.a importantForAccessibility = fm1.a.YES;
                Intrinsics.checkNotNullParameter(importantForAccessibility, "importantForAccessibility");
                bind.f108905t = importantForAccessibility;
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                ql1.d dVar = (ql1.d) obj;
                bind.g(dVar.f104077a);
                bind.f108898m = dVar.f104077a;
                fm1.a importantForAccessibility2 = fm1.a.YES;
                Intrinsics.checkNotNullParameter(importantForAccessibility2, "importantForAccessibility");
                bind.f108905t = importantForAccessibility2;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13;
        com.pinterest.framework.multisection.datasource.pagedlist.g gVar;
        sq0.f fVar;
        int i14 = this.f22827i;
        boolean z13 = true;
        Object obj2 = this.f22828j;
        switch (i14) {
            case 0:
                f((l82.n) obj);
                return Unit.f80348a;
            case 1:
                Integer retryCount = (Integer) obj;
                Intrinsics.checkNotNullParameter(retryCount, "retryCount");
                ((gi2.b) obj2).getClass();
                return uj2.q.M(10 * retryCount.intValue(), TimeUnit.SECONDS, tk2.e.f118017c);
            case 2:
                List<gb2.i> list = (List) obj;
                Intrinsics.f(list);
                ii1.e eVar = (ii1.e) obj2;
                for (gb2.i iVar : list) {
                    eVar.f72323d.put(iVar.f64753a, iVar);
                    if (iVar.f64755c.compareTo(wa2.o.UI_ONLY) > 0) {
                        r4 = 1;
                    }
                }
                if (r4 != 0) {
                    for (dl1.s sVar : eVar.d()) {
                        if (sVar instanceof f30) {
                            gb2.i iVar2 = (gb2.i) eVar.f72323d.get(((f30) sVar).getUid());
                            if (iVar2 != null) {
                                if (iVar2.f64755c.compareTo(wa2.o.UI_ONLY) > 0 && ((i13 = ii1.c.f72317a[iVar2.f64754b.ordinal()]) == 1 || i13 == 2 || i13 == 3)) {
                                    Object adapter = eVar.getAdapter();
                                    if (adapter != null) {
                                        ((b2) adapter).h();
                                    }
                                }
                            }
                        }
                    }
                }
                return Unit.f80348a;
            case 3:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, ((li1.a) obj2).f83538c, null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 4:
                f((l82.n) obj);
                return Unit.f80348a;
            case 5:
                Intrinsics.checkNotNullParameter((rl1.q) obj, "it");
                return ((bj1.d) obj2).f22968a;
            case 6:
                bk1.o it2 = (bk1.o) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                bk1.g gVar2 = new bk1.g(((a2) obj2).f23155a);
                it2.getClass();
                return bk1.o.e(gVar2);
            case 7:
                h0 update = (h0) obj;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67045d = ((i0) obj2).f67084d;
                return Unit.f80348a;
            case 8:
                dk1.b it3 = (dk1.b) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                List list2 = it3.f55161a;
                vi1.a[] elements = (vi1.a[]) obj2;
                Intrinsics.checkNotNullParameter(list2, "<this>");
                Intrinsics.checkNotNullParameter(elements, "elements");
                ArrayList pieceDisplayStates = new ArrayList(list2.size() + elements.length);
                pieceDisplayStates.addAll(list2);
                kotlin.collections.k0.v(pieceDisplayStates, elements);
                Intrinsics.checkNotNullParameter(pieceDisplayStates, "pieceDisplayStates");
                return new dk1.b(pieceDisplayStates);
            case 9:
                return e((r1) obj);
            case 10:
                return e((r1) obj);
            case 11:
                return b((ek1.r) obj);
            case 12:
                return b((ek1.r) obj);
            case 13:
                fk1.w it4 = (fk1.w) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                return fk1.w.b(it4, null, ((fk1.g) ((fk1.j) obj2)).f62351a, null, null, false, null, null, false, false, false, false, null, 16777151);
            case 14:
                gk1.l state = (gk1.l) obj;
                Intrinsics.checkNotNullParameter(state, "state");
                return gk1.l.e(state, CollectionsKt.m0((jj1.d) obj2, state.f65239a), null, null, 6);
            case 15:
                f30 f30Var = (f30) obj;
                hk1.a aVar = (hk1.a) obj2;
                aVar.getClass();
                Intrinsics.f(f30Var);
                aVar.f69339b.W(f30Var);
                return Unit.f80348a;
            case 16:
                wy0 item = (wy0) obj;
                pk1.c cVar = (pk1.c) obj2;
                Intrinsics.f(item);
                cVar.getClass();
                ArrayList arrayList = new ArrayList();
                int i15 = 0;
                for (Object obj3 : cVar.d()) {
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    if (Intrinsics.d(((dl1.s) obj3).getUid(), item.getUid())) {
                        arrayList.add(Integer.valueOf(i15));
                    }
                    i15 = i16;
                }
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    int intValue = ((Number) it5.next()).intValue();
                    Intrinsics.checkNotNullParameter(item, "item");
                    vb0.j.f125466a.S(intValue >= 0 && intValue < cVar.f49127q.size(), intValue + " is out of range", new Object[0]);
                    cVar.V(new e0(intValue, item, 8));
                }
                return Unit.f80348a;
            case 17:
                nk1.h hVar = (nk1.h) obj;
                Intrinsics.f(hVar);
                ((FollowButton) obj2).d(hVar);
                return Unit.f80348a;
            case 18:
                Throwable th3 = (Throwable) obj;
                switch (i14) {
                    case 18:
                        c0 access$getView = wk1.q.access$getView((wk1.q) obj2);
                        Intrinsics.f(th3);
                        access$getView.displayError(th3);
                        break;
                    default:
                        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj2);
                        break;
                }
                return Unit.f80348a;
            case 19:
                wt1.c0 c0Var = (wt1.c0) obj;
                if (c0Var instanceof wt1.m) {
                    com.pinterest.framework.multisection.datasource.pagedlist.g gVar3 = (com.pinterest.framework.multisection.datasource.pagedlist.g) obj2;
                    sq0.f fVar2 = gVar3.f49106d;
                    if (fVar2 != null) {
                        tl1.i iVar3 = c0Var.f131096b;
                        Intrinsics.g(iVar3, "null cannot be cast to non-null type com.pinterest.multisection.datasource.StatefulList.State.Insert.Payload<M of com.pinterest.framework.multisection.datasource.pagedlist.GraphQLDynamicGridPagedList.onBind.<no name provided>.invoke$lambda$0>");
                        com.pinterest.framework.multisection.datasource.pagedlist.g.u(gVar3, fVar2, ((wt1.l) iVar3).f131122b.size());
                    }
                } else if ((c0Var instanceof wt1.y) && (fVar = (gVar = (com.pinterest.framework.multisection.datasource.pagedlist.g) obj2).f49106d) != null) {
                    tl1.i iVar4 = c0Var.f131096b;
                    Intrinsics.g(iVar4, "null cannot be cast to non-null type com.pinterest.multisection.datasource.StatefulList.State.SetAll.Payload<M of com.pinterest.framework.multisection.datasource.pagedlist.GraphQLDynamicGridPagedList.onBind.<no name provided>.invoke$lambda$1>");
                    com.pinterest.framework.multisection.datasource.pagedlist.g.u(gVar, fVar, ((wt1.x) iVar4).f131130b.size());
                }
                return Unit.f80348a;
            case 20:
                wt1.c0 it6 = (wt1.c0) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                if (it6 instanceof wt1.v) {
                    return uj2.q.y(new sq0.u());
                }
                androidx.recyclerview.widget.w wVar = it6.f131095a;
                return wVar != null ? uj2.q.y(new sq0.q(wVar)) : it6 instanceof wt1.j ? uj2.q.y(new sq0.t(0, ((com.pinterest.framework.multisection.datasource.pagedlist.s) obj2).f49180s.size())) : it6 instanceof wt1.z ? uj2.q.y(new sq0.r(0, ((com.pinterest.framework.multisection.datasource.pagedlist.s) obj2).f49180s.size())) : jk2.h0.f76488a;
            case 21:
                sq0.v vVar = (sq0.v) obj;
                com.pinterest.framework.multisection.datasource.pagedlist.v vVar2 = (com.pinterest.framework.multisection.datasource.pagedlist.v) obj2;
                boolean z14 = vVar2.f49196g;
                boolean z15 = vVar2.f49192c;
                r0 r0Var = vVar2.f49190a;
                boolean z16 = (z15 || r0Var.a() > 0) && !vVar2.f49198i;
                ArrayList arrayList2 = vVar2.f49193d;
                int size = arrayList2.size();
                vVar2.f49196g = z16;
                uk2.f fVar3 = vVar2.f49195f;
                if (size != 0) {
                    if (!z14 && z16) {
                        fVar3.c(new sq0.r(0, size));
                    } else if (z14 && !z16) {
                        fVar3.c(new sq0.t(0, size));
                    }
                }
                boolean t03 = r0Var.t0();
                if (vVar2.f49198i || (!vVar2.f49191b ? r0Var.a() <= 0 || t03 : t03)) {
                    z13 = false;
                }
                boolean z17 = vVar2.f49197h;
                int size2 = vVar2.f49194e.size();
                int size3 = vVar2.f49196g ? arrayList2.size() + r0Var.a() : r0Var.a();
                vVar2.f49197h = z13;
                if (size2 != 0) {
                    if (!z17 && z13) {
                        fVar3.c(new sq0.r(size3, size2));
                    } else if (z17 && !z13) {
                        fVar3.c(new sq0.t(size3, size2));
                    }
                }
                r4 = vVar2.f49196g ? arrayList2.size() : 0;
                if (vVar instanceof sq0.q) {
                    ((sq0.q) vVar).f115031a.a(new com.pinterest.framework.multisection.datasource.pagedlist.u(r4, fVar3));
                } else if (vVar instanceof sq0.u) {
                    fVar3.c(vVar);
                } else if (vVar instanceof sq0.r) {
                    sq0.r rVar = (sq0.r) vVar;
                    fVar3.c(new sq0.r(rVar.f115032a + r4, rVar.f115033b));
                } else if (vVar instanceof sq0.t) {
                    sq0.t tVar = (sq0.t) vVar;
                    fVar3.c(new sq0.t(tVar.f115036a + r4, tVar.f115037b));
                } else if (vVar instanceof sq0.p) {
                    sq0.p pVar = (sq0.p) vVar;
                    fVar3.c(new sq0.p(pVar.f115029a + r4, pVar.f115030b));
                } else {
                    if (!(vVar instanceof sq0.s)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sq0.s sVar2 = (sq0.s) vVar;
                    fVar3.c(new sq0.s(sVar2.f115034a + r4, sVar2.f115035b + r4));
                }
                Unit unit = Unit.f80348a;
                el.a.B(unit);
                return unit;
            case 22:
                u1 u1Var = (u1) obj;
                cl1.c cVar2 = (cl1.c) obj2;
                Intrinsics.f(u1Var);
                cVar2.getClass();
                String str = "process perfEvent [" + u1Var + "] coexist id [" + u1Var.b() + "]";
                d3 d3Var = cVar2.f27987g;
                d3Var.getClass();
                d3.e(str);
                if (u1Var instanceof py.i) {
                    cVar2.r(u1Var.b(), (Set) d3Var.f123428d);
                } else if (u1Var instanceof ty.d) {
                    cVar2.r(u1Var.b(), (Set) d3Var.f123430f);
                } else if (u1Var instanceof ly.i) {
                    cVar2.r(((ly.i) u1Var).f85105c, (Set) d3Var.f123432h);
                }
                d3.e("fully rendered? [" + d3Var.d() + "] details: " + d3Var);
                if (d3Var.d() && !cVar2.f27985e) {
                    new ly.c(s92.o.COMPLETE).i();
                    Unit unit2 = Unit.f80348a;
                    cVar2.n();
                }
                return Unit.f80348a;
            case 23:
                dl1.s sVar3 = (dl1.s) obj;
                Intrinsics.f(sVar3);
                ((dl1.l) obj2).W(sVar3);
                return Unit.f80348a;
            case 24:
                dl1.s it7 = (dl1.s) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                return Boolean.valueOf(((q0) obj2).f55272e.a(it7));
            case 25:
                Throwable th4 = (Throwable) obj;
                switch (i14) {
                    case 18:
                        c0 access$getView2 = wk1.q.access$getView((wk1.q) obj2);
                        Intrinsics.f(th4);
                        access$getView2.displayError(th4);
                        break;
                    default:
                        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj2);
                        break;
                }
                return Unit.f80348a;
            case 26:
                ScreenDescription end = (ScreenDescription) obj;
                Intrinsics.checkNotNullParameter(end, "end");
                return Boolean.valueOf(Intrinsics.d(end, (ScreenDescription) obj2));
            case 27:
                ScreenDescription it8 = (ScreenDescription) obj;
                Intrinsics.checkNotNullParameter(it8, "it");
                com.pinterest.framework.screens.s sVar4 = (com.pinterest.framework.screens.s) obj2;
                ScreenManager$Companion screenManager$Companion = com.pinterest.framework.screens.s.f49224n;
                if (sVar4.q(it8)) {
                    com.pinterest.framework.screens.l lVar = sVar4.f49228c;
                    if (((il1.b) lVar).g(it8) instanceof ml1.q) {
                        com.pinterest.framework.screens.m g13 = ((il1.b) lVar).g(it8);
                        Intrinsics.g(g13, "null cannot be cast to non-null type com.pinterest.framework.screens.transition.ScreenTransitionListener");
                        ((ml1.q) g13).e3();
                    }
                }
                return Unit.f80348a;
            case 28:
                h((rn1.k) obj);
                return Unit.f80348a;
            default:
                h((rn1.k) obj);
                return Unit.f80348a;
        }
    }
}
