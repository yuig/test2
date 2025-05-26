package o1;

import androidx.recyclerview.widget.b2;
import ao2.j0;
import bi1.w;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.xs0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import com.pinterest.ui.grid.PinterestRecyclerView;
import e2.g0;
import e2.s;
import e2.v;
import g1.a0;
import h32.f1;
import i2.q1;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lh0.g1;
import lh0.t;
import lh0.z3;
import nx.b0;
import ps0.y;
import tu.d0;
import u50.r;
import vs.z;
import w1.m1;
import wt1.c0;

/* loaded from: classes2.dex */
public final class f implements do2.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92757a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f92758b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f92759c;

    public /* synthetic */ f(int i13, Object obj, Object obj2) {
        this.f92757a = i13;
        this.f92758b = obj;
        this.f92759c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r5, bl2.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof do2.m2
            if (r0 == 0) goto L13
            r0 = r6
            do2.m2 r0 = (do2.m2) r0
            int r1 = r0.f55860t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f55860t = r1
            goto L18
        L13:
            do2.m2 r0 = new do2.m2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f55858r
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f55860t
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            ue.c.H(r6)
            goto L50
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            ue.c.H(r6)
            if (r5 <= 0) goto L53
            java.lang.Object r5 = r4.f92758b
            r6 = r5
            kotlin.jvm.internal.f0 r6 = (kotlin.jvm.internal.f0) r6
            boolean r6 = r6.f80424a
            if (r6 != 0) goto L53
            kotlin.jvm.internal.f0 r5 = (kotlin.jvm.internal.f0) r5
            r5.f80424a = r3
            java.lang.Object r5 = r4.f92759c
            do2.j r5 = (do2.j) r5
            do2.i2 r6 = do2.i2.START
            r0.f55860t = r3
            java.lang.Object r5 = r5.emit(r6, r0)
            if (r5 != r1) goto L50
            return r1
        L50:
            kotlin.Unit r5 = kotlin.Unit.f80348a
            return r5
        L53:
            kotlin.Unit r5 = kotlin.Unit.f80348a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.f.a(int, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(bn0.k r13, bl2.c r14) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.f.c(bn0.k, bl2.c):java.lang.Object");
    }

    public final Object d(f30 f30Var, bl2.c cVar) {
        String str;
        int i13 = this.f92757a;
        Object obj = this.f92759c;
        Object obj2 = this.f92758b;
        switch (i13) {
            case 8:
                y yVar = ro1.c.f108967f;
                String D = com.bumptech.glide.c.D(f30Var);
                z zVar = (z) obj2;
                es.h hVar = zVar.f126540h;
                es.a aVar = zVar.f126537e;
                ro1.b f13 = yVar.f(D, f30Var, hVar, aVar);
                if (f13 == ro1.b.SHOPPING) {
                    str = "Shopping";
                } else if (f13 == ro1.b.LEAD_GEN) {
                    str = "Lead";
                } else if (f13 == ro1.b.CARTING) {
                    str = "Carting";
                } else if (f13 == ro1.b.QUIZ) {
                    str = "Quiz";
                } else if (f13 == ro1.b.SHOWCASE) {
                    str = "Showcase";
                } else if (f13 == ro1.b.COLLECTION) {
                    str = "Collection";
                } else if (b40.r0(f30Var)) {
                    str = "Carousel";
                } else {
                    Boolean Q5 = f30Var.Q5();
                    Intrinsics.checkNotNullExpressionValue(Q5, "getPromotedIsMaxVideo(...)");
                    str = Q5.booleanValue() ? "Max Video" : n60.o.y(f30Var, "getIsThirdPartyAd(...)") ? "Third Party" : ((es.c) aVar).U(f30Var) ? "Idea" : b40.X0(f30Var) ? "Video" : "Regular/Image";
                }
                String str2 = str;
                r rVar = (r) obj;
                boolean C = ((es.c) aVar).C(f30Var);
                com.pinterest.api.model.g t33 = f30Var.t3();
                int intValue = (t33 != null ? t33.k0() : new Integer(0)).intValue();
                ix.d dVar = zVar.f126535c;
                xs0 xs0Var = dVar.f73790f;
                rVar.a(new vs.n(f30Var, str2, C, intValue, (xs0Var == null || dVar.c()) ? null : xs0Var, zVar.f126536d));
                break;
            default:
                d0 d0Var = (d0) obj2;
                nx.d0 d0Var2 = (nx.d0) ((xk2.k) d0Var.f119285g).getValue();
                Intrinsics.checkNotNullExpressionValue(d0Var2, "access$getPinalytics(...)");
                w wVar = (w) ((bi1.y) obj);
                d0Var2.h0((r18 & 1) != 0 ? f1.TAP : wVar.f22883b, (r18 & 2) != 0 ? null : wVar.f22884c, (r18 & 4) != 0 ? null : wVar.f22885d, (r18 & 8) != 0 ? null : f30Var.getF39332b(), (r18 & 32) != 0 ? null : ((b0) d0Var.f119283e).m(f30Var), (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                break;
        }
        return Unit.f80348a;
    }

    public final Object e(j jVar) {
        int i13 = this.f92757a;
        Object obj = this.f92759c;
        Object obj2 = this.f92758b;
        switch (i13) {
            case 0:
                if (jVar instanceof d) {
                    ((List) obj2).add(jVar);
                } else if (jVar instanceof e) {
                    ((List) obj2).remove(((e) jVar).f92756a);
                }
                ((q1) obj).setValue(Boolean.valueOf(!((List) obj2).isEmpty()));
                break;
            case 1:
                if ((jVar instanceof h) || (jVar instanceof d) || (jVar instanceof n)) {
                    ((a0) obj2).a(jVar);
                } else if (jVar instanceof i) {
                    ((a0) obj2).e(((i) jVar).f92763a);
                } else if (jVar instanceof e) {
                    ((a0) obj2).e(((e) jVar).f92756a);
                } else if (jVar instanceof o) {
                    ((a0) obj2).e(((o) jVar).f92767a);
                } else if (jVar instanceof m) {
                    ((a0) obj2).e(((m) jVar).f92765a);
                }
                a0 a0Var = (a0) obj2;
                m1 m1Var = (m1) obj;
                Object[] objArr = a0Var.f63228a;
                int i14 = a0Var.f63229b;
                int i15 = 0;
                for (int i16 = 0; i16 < i14; i16++) {
                    j jVar2 = (j) objArr[i16];
                    if (jVar2 instanceof h) {
                        m1Var.getClass();
                        i15 |= 2;
                    } else if (jVar2 instanceof d) {
                        m1Var.getClass();
                        i15 |= 1;
                    } else if (jVar2 instanceof n) {
                        m1Var.getClass();
                        i15 |= 4;
                    }
                }
                m1Var.f127392a.i(i15);
                break;
            case 2:
            default:
                if (jVar instanceof p) {
                    e2.z zVar = (e2.z) obj2;
                    if (zVar.f56929v) {
                        zVar.O0((p) jVar);
                    } else {
                        zVar.f56930w.a(jVar);
                    }
                } else {
                    e2.z zVar2 = (e2.z) obj2;
                    j0 j0Var = (j0) obj;
                    g0 g0Var = zVar2.f56926s;
                    if (g0Var == null) {
                        g0Var = new g0(zVar2.f56922o, zVar2.f56925r);
                        com.bumptech.glide.c.k0(zVar2);
                        zVar2.f56926s = g0Var;
                    }
                    g0Var.e(jVar, j0Var);
                }
                break;
            case 3:
                if (jVar instanceof n) {
                    n nVar = (n) jVar;
                    e2.a aVar = (e2.a) ((e2.w) obj2);
                    s sVar = aVar.f56826h;
                    if (sVar == null) {
                        sVar = e2.d0.a(aVar.f56825g);
                        aVar.f56826h = sVar;
                        Intrinsics.f(sVar);
                    }
                    v a13 = sVar.a(aVar);
                    a13.a(nVar, aVar.f56821c, aVar.f56829k, aVar.f56830l, ((b3.w) aVar.f56823e.getValue()).f21392a, ((e2.i) aVar.f56824f.getValue()).f56868d, aVar.f56831m);
                    aVar.f56827i.setValue(a13);
                } else if (jVar instanceof o) {
                    n nVar2 = ((o) jVar).f92767a;
                    v vVar = (v) ((e2.a) ((e2.w) obj2)).f56827i.getValue();
                    if (vVar != null) {
                        vVar.d(false);
                    }
                } else if (jVar instanceof m) {
                    n nVar3 = ((m) jVar).f92765a;
                    v vVar2 = (v) ((e2.a) ((e2.w) obj2)).f56827i.getValue();
                    if (vVar2 != null) {
                        vVar2.d(false);
                    }
                } else {
                    ((e2.w) obj2).f56916b.e(jVar, (j0) obj);
                }
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e2  */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object] */
    @Override // do2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r11, bl2.c r12) {
        /*
            Method dump skipped, instructions count: 1014
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.f.emit(java.lang.Object, bl2.c):java.lang.Object");
    }

    public final Object f(c0 c0Var) {
        f30 f30Var;
        f30 f30Var2;
        int i13 = this.f92757a;
        Object obj = this.f92758b;
        Object obj2 = this.f92759c;
        switch (i13) {
            case 13:
                if (c0Var instanceof wt1.y) {
                    pj0.s sVar = (pj0.s) obj;
                    if ((sVar.f100279o instanceof wt1.p) && (sVar.f100280p instanceof wt1.k)) {
                        dl1.s item = sVar.f100281q.getItem(0);
                        if ((item instanceof vh) && Intrinsics.d(((vh) item).q(), "bmi_tab_header")) {
                            pj0.i iVar = (pj0.i) obj2;
                            if (!iVar.f135189f) {
                                iVar.y();
                                Object adapter = sVar.getAdapter();
                                if (adapter != null) {
                                    ((b2) adapter).p(0);
                                }
                            }
                        } else {
                            z3 activate = z3.DO_NOT_ACTIVATE_EXPERIMENT;
                            t tVar = sVar.f100272h;
                            tVar.getClass();
                            Intrinsics.checkNotNullParameter(activate, "activate");
                            if (((g1) tVar.f83479a).g("hfp_bmi_tab_header_android", activate) != null) {
                                pj0.i iVar2 = (pj0.i) obj2;
                                fm1.c value = fm1.c.VISIBLE;
                                iVar2.getClass();
                                Intrinsics.checkNotNullParameter(value, "value");
                                if (value != iVar2.f100243s) {
                                    iVar2.f100243s = value;
                                    v7 v7Var = (v7) iVar2.getItem(0);
                                    if (v7Var != null) {
                                        iVar2.u1(0, v7Var);
                                    }
                                }
                            }
                        }
                    }
                }
                pj0.s sVar2 = (pj0.s) obj;
                sVar2.f100280p = sVar2.f100279o;
                sVar2.f100279o = c0Var;
                break;
            default:
                if (c0Var instanceof wt1.k) {
                    r01.c cVar = (r01.c) obj;
                    i01.t tVar2 = (i01.t) obj2;
                    Set set = r01.c.f105702i;
                    cVar.getClass();
                    cVar.f105709f = i01.h.LOADING;
                    if (cVar.f105707d && (f30Var2 = (f30) cVar.f105708e.invoke()) != null && Intrinsics.d(f30Var2.d5(), Boolean.FALSE)) {
                        PinCloseupFragment pinCloseupFragment = (PinCloseupFragment) tVar2;
                        PinterestRecyclerView pinterestRecyclerView = pinCloseupFragment.G2;
                        if (pinterestRecyclerView != null) {
                            pinterestRecyclerView.f52538h = false;
                            pinterestRecyclerView.m(pinterestRecyclerView.f52539i);
                        }
                        cVar.e(pinCloseupFragment);
                    }
                } else if (c0Var instanceof wt1.y) {
                    r01.c cVar2 = (r01.c) obj;
                    i01.t tVar3 = (i01.t) obj2;
                    Set set2 = r01.c.f105702i;
                    cVar2.getClass();
                    cVar2.f105709f = i01.h.COMPLETE;
                    if (cVar2.f105706c) {
                        cVar2.f105710g = i01.g.COMPLETE;
                    }
                    PinCloseupFragment pinCloseupFragment2 = (PinCloseupFragment) tVar3;
                    pinCloseupFragment2.getClass();
                    pinCloseupFragment2.f46985e2 = System.currentTimeMillis();
                    if (cVar2.f105707d && (f30Var = (f30) cVar2.f105708e.invoke()) != null && Intrinsics.d(f30Var.d5(), Boolean.FALSE)) {
                        PinterestRecyclerView pinterestRecyclerView2 = pinCloseupFragment2.G2;
                        if (pinterestRecyclerView2 != null) {
                            pinterestRecyclerView2.f52538h = true;
                            pinterestRecyclerView2.m(pinterestRecyclerView2.f52539i);
                        }
                        cVar2.e(tVar3);
                    }
                } else {
                    r01.c cVar3 = (r01.c) obj;
                    cVar3.f105709f = i01.h.COMPLETE;
                    if (cVar3.f105706c) {
                        cVar3.f105710g = i01.g.COMPLETE;
                    }
                }
                break;
        }
        return Unit.f80348a;
    }
}
