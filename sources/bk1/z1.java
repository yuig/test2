package bk1;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.cc;
import com.pinterest.api.model.e30;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.g;
import com.pinterest.api.model.k;
import com.pinterest.api.model.l30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import h32.d4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kh2.u2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import ni1.x2;
import rq.l4;
import so.hc;
import so.ic;
import so.xb;

/* loaded from: classes2.dex */
public final class z1 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final es.a f23388b;

    /* renamed from: c, reason: collision with root package name */
    public final jv.a f23389c;

    /* renamed from: d, reason: collision with root package name */
    public final es.h f23390d;

    /* renamed from: e, reason: collision with root package name */
    public final nx.b0 f23391e;

    /* renamed from: f, reason: collision with root package name */
    public final ur.a f23392f;

    public z1(es.a adFormats, jv.a adsPostClickHelper, es.h adsCommonDisplay, nx.b0 pinAuxHelper, ur.a adsDependencies) {
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(adsPostClickHelper, "adsPostClickHelper");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(adsDependencies, "adsDependencies");
        this.f23388b = adFormats;
        this.f23389c = adsPostClickHelper;
        this.f23390d = adsCommonDisplay;
        this.f23391e = pinAuxHelper;
        this.f23392f = adsDependencies;
    }

    public static h32.i0 F(l82.e eVar, h32.i0 i0Var, h32.u0 u0Var) {
        a2 a2Var = (a2) eVar.f82219b;
        return a2Var.f23179y ? com.bumptech.glide.d.z0(i0Var, new bi1.a0(i0Var, 7)) : a2Var.f23180z ? com.bumptech.glide.d.z0(i0Var, new v1(i0Var, u0Var)) : com.bumptech.glide.d.z0(i0Var, new v1(u0Var, i0Var));
    }

    public static void G(int i13, l82.e eVar) {
        eVar.h(new zx0.d(i13, 26));
    }

    public static void h(f30 f30Var, l82.e eVar) {
        eVar.a(new a1(f30Var));
        a2 a2Var = (a2) eVar.f82219b;
        eVar.h(q1.f23289m);
        String uid = f30Var.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        eVar.a(new y0(uid, a2Var.L, a2Var.M, a2Var.f23157c.f143086a.f67082b));
    }

    public static void r(boolean z13, g2 g2Var, l82.e eVar) {
        if (g2Var != g2.Tooltip || z13) {
            return;
        }
        a2 a2Var = (a2) eVar.f82219b;
        String uid = a2Var.f23155a.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        eVar.a(new y0(uid, a2Var.L, a2Var.M, a2Var.f23157c.f143086a.f67082b));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
    
        if (r4 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        if (r11 != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean t(com.pinterest.api.model.f30 r10, l82.e r11) {
        /*
            l82.i0 r0 = r11.f82219b
            bk1.a2 r0 = (bk1.a2) r0
            if (r10 != 0) goto L8
            com.pinterest.api.model.f30 r10 = r0.f23155a
        L8:
            bk1.d2 r1 = r0.f23167m
            boolean r2 = r1 instanceof bk1.b2
            if (r2 == 0) goto L11
            bk1.b2 r1 = (bk1.b2) r1
            goto L12
        L11:
            r1 = 0
        L12:
            if (r1 == 0) goto L19
            bs.f r1 = r1.f23186b
            if (r1 == 0) goto L19
            goto L1b
        L19:
            bs.e r1 = bs.e.f23844a
        L1b:
            oh1.u r2 = new oh1.u
            r3 = 12
            r2.<init>(r3, r11, r0)
            bs.a r3 = new bs.a
            ni1.x2 r0 = r0.f23158d
            boolean r4 = r0.f90862k
            bk1.u1 r5 = new bk1.u1
            r6 = 1
            r5.<init>(r6, r11)
            r3.<init>(r4, r5)
            bs.a r7 = new bs.a
            bk1.u1 r8 = new bk1.u1
            r9 = 2
            r8.<init>(r9, r11)
            boolean r11 = r0.f90873p0
            r7.<init>(r11, r8)
            java.lang.String r0 = "pin"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r9 = "pinQuarantineResult"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r9)
            java.lang.String r9 = "reportQuarantineFailure"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r9)
            java.lang.String r9 = "amazonExperimentEnabledAndActivation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r9)
            java.lang.String r3 = "targetAccountLinkingExperimentStatusAndActivation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
            boolean r3 = b7.c.A(r10)
            r7 = 0
            if (r3 != 0) goto L78
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            com.pinterest.api.model.g r3 = r10.t3()
            if (r3 == 0) goto Lac
            java.lang.Integer r3 = r3.k0()
            gb0.f r9 = gb0.f.TARGET_HANDSHAKE
            int r9 = r9.getValue()
            int r3 = r3.intValue()
            if (r3 != r9) goto Lac
        L78:
            boolean r3 = r1 instanceof bs.d
            if (r3 == 0) goto L80
            r2.invoke(r1)
            goto Lac
        L80:
            boolean r1 = b7.c.A(r10)
            if (r1 == 0) goto L8b
            r5.invoke()
            if (r4 != 0) goto Lab
        L8b:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            com.pinterest.api.model.g r10 = r10.t3()
            if (r10 == 0) goto Laa
            java.lang.Integer r10 = r10.k0()
            gb0.f r0 = gb0.f.TARGET_HANDSHAKE
            int r0 = r0.getValue()
            int r10 = r10.intValue()
            if (r10 != r0) goto Laa
            r8.invoke()
            if (r11 == 0) goto Laa
            goto Lab
        Laa:
            r6 = r7
        Lab:
            r7 = r6
        Lac:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: bk1.z1.t(com.pinterest.api.model.f30, l82.e):boolean");
    }

    public static void v(l82.e eVar) {
        eVar.a(new m1(new zy.f0(new zy.a(com.bumptech.glide.d.z0(((a2) eVar.f82219b).f23157c.f143086a, q1.f23294r), h32.f1.TAP, null, null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN))));
    }

    public final void A(f30 pin, l82.e eVar, boolean z13) {
        l82.e eVar2;
        h32.c1 c13;
        String str;
        List d2;
        l30 l30Var;
        int i13;
        a2 a2Var = (a2) eVar.f82219b;
        f30 f30Var = a2Var.f23155a;
        zy.l0 l0Var = a2Var.f23157c;
        h32.i0 i0Var = l0Var.f143086a;
        boolean z14 = a2Var.N;
        String uid = (!z14 || Intrinsics.d(f30Var.getUid(), pin.getUid())) ? null : f30Var.getUid();
        String uid2 = pin.getUid();
        es.v vVar = (es.v) this.f23390d;
        Short o13 = vVar.o(f30Var);
        a2 a2Var2 = (a2) eVar.f82219b;
        boolean z15 = a2Var2.W;
        boolean z16 = a2Var2.X;
        x2 x2Var = a2Var.f23158d;
        boolean z17 = x2Var.f90877r0;
        boolean C1 = dl2.b.C1(a2Var);
        ur.a adsDependencies = this.f23392f;
        ur.b bVar = (ur.b) adsDependencies;
        h32.c1 a13 = ek1.c2.a(uid2, f30Var, pin, z14, a2Var.f23173s, a2Var.f23161g, a2Var.f23162h, o13, z15, z16, this.f23388b, z17, C1, x2Var.f90850e, this.f23390d, bVar.f123059b);
        Integer num = a2Var.f23173s;
        int intValue = num != null ? num.intValue() : 0;
        Intrinsics.checkNotNullParameter(pin, "pin");
        es.a adFormats = this.f23388b;
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        nx.b0 pinAuxHelper = this.f23391e;
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(adsDependencies, "adsDependencies");
        HashMap contents = new HashMap();
        if (a2Var.f23171q) {
            contents.put("has_pin_chips", "true");
        }
        boolean z18 = a2Var.f23180z;
        if (z18 && (i13 = a2Var.f23156b) >= 0) {
            contents.put("grid_index", String.valueOf(i13));
        }
        if (a2Var.f23179y || z18) {
            Integer num2 = a2Var.f23174t;
            if (num2 != null) {
                contents.put("index", String.valueOf(num2.intValue()));
            }
            contents.put("closeup_navigation_type", SbaPinRep.CLOSEUP_NAVIGATION_TYPE_CLICK);
        }
        if (((es.c) adFormats).K(pin)) {
            String f03 = com.bumptech.glide.d.f0(pin);
            if (f03 == null) {
                f03 = "";
            }
            contents.put(SbaPinRep.AUXDATA_LEADAD_FORM_ID, f03);
            contents.put(SbaPinRep.AUXDATA_IS_LEAD_AD, SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE);
        }
        Boolean O5 = pin.O5();
        Intrinsics.checkNotNullExpressionValue(O5, "getPromotedIsCatalogCarouselAd(...)");
        if (O5.booleanValue()) {
            cc J3 = pin.J3();
            if (J3 == null || (d2 = J3.d()) == null || (l30Var = (l30) d2.get(a2Var.f23164j)) == null || (str = l30Var.t()) == null) {
                str = "0";
            }
            contents.put("internal_item_id", str);
        }
        if (z14) {
            contents.put("collection_pin_click_position", String.valueOf(intValue));
        }
        ((vr.b) bVar.f123059b).c(pin, contents);
        pinAuxHelper.getClass();
        nx.b0.b(pin, a2Var.f23176v, contents);
        oi1.b.a(pin, contents);
        Intrinsics.checkNotNullParameter(contents, "contents");
        HashMap hashMap = new HashMap(contents);
        if (c0.d.I2(pin)) {
            eVar2 = eVar;
            eVar2.f(new aw0.j(pin, a2Var, a13, f30Var, 21));
        } else {
            eVar2 = eVar;
        }
        h32.g0 g0Var = i0Var.f67084d;
        if (g0Var == null) {
            g0Var = h32.g0.FLOWED_PIN;
        }
        h32.g0 g0Var2 = g0Var;
        h32.i0 z03 = com.bumptech.glide.d.z0(i0Var, q1.f23296t);
        h32.i0 F = F(eVar2, i0Var, a2Var.f23163i);
        c13 = ek1.c2.c(pin.getUid(), f30Var, a2Var.f23161g, a2Var.f23162h, x2Var.f90877r0, false, false, bVar.f123058a, (r29 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : vVar.r(a2Var.f23155a, a2Var.S, a2Var.T, Boolean.valueOf(a2Var.R), Boolean.valueOf(a2Var.U)), (r29 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : null, dl2.b.C1(a2Var), x2Var.f90850e, this.f23390d, bVar.f123059b);
        d4 d4Var = i0Var.f67081a;
        if (d4Var == null) {
            d4Var = d4.UNKNOWN_VIEW;
        }
        d4 d4Var2 = d4Var;
        boolean z19 = num != null && num.intValue() == 0;
        Intrinsics.checkNotNullParameter(eVar2, "<this>");
        eVar2.a(new l1(xb.f114712a));
        eVar2.a(new t0(pin, g0Var2, hashMap, a2Var.f23156b, z03, F, l0Var.f143087b, c13, z13, d4Var2, uid, z14, z19, a13, ((a2) eVar2.f82219b).f23158d.f90891y0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (r4 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(l82.e r25) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bk1.z1.B(l82.e):void");
    }

    public final void C(long j13, l82.e eVar, boolean z13) {
        a2 a2Var = (a2) eVar.f82219b;
        f30 f30Var = a2Var.f23155a;
        es.c cVar = (es.c) this.f23388b;
        if (cVar.B(a2Var.f23164j, f30Var) && cVar.h0(f30Var)) {
            x(j13, eVar, z13);
            return;
        }
        B(eVar);
        if (z13) {
            q(eVar, cVar.i0(f30Var) || cVar.G(f30Var), false);
        }
    }

    public final void D(l82.e eVar, f30 f30Var, b bVar) {
        x2 x2Var = ((a2) eVar.f82219b).f23158d;
        g.b n13 = ((es.v) this.f23390d).n(f30Var, x2Var.f90859i0, x2Var.f90861j0, x2Var.f90867m0, x2Var.f90865l0, r1.f23312m, r1.f23313n);
        int i13 = n13 == null ? -1 : p1.f23281e[n13.ordinal()];
        if (i13 != 1) {
            int i14 = 2;
            if (i13 == 2 || i13 == 3) {
                a2 a2Var = (a2) eVar.f82219b;
                eVar.f(new s1(f30Var, this, a2Var, i14));
                eVar.h(new t1(a2Var, bVar, 2));
                eVar.a(new e1(f30Var));
                return;
            }
            return;
        }
        int i15 = 0;
        if (!ps0.m.m(eVar)) {
            a2 a2Var2 = (a2) eVar.f82219b;
            eVar.f(new s1(f30Var, this, a2Var2, i15));
            eVar.h(new t1(a2Var2, bVar, 0));
        } else {
            a2 a2Var3 = (a2) eVar.f82219b;
            y(f30Var, eVar, false);
            eVar.f(new s1(this, f30Var, a2Var3));
            eVar.h(new t1(a2Var3, bVar, 1));
        }
    }

    public final void E(j2 j2Var, l82.e eVar, boolean z13) {
        int i13 = p1.f23279c[j2Var.ordinal()];
        if (i13 == 1) {
            if (z13) {
                q(eVar, true, true);
            }
        } else if (i13 == 2 && z13) {
            q(eVar, true, false);
        }
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        a2 vmState = (a2) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        l82.e d2 = l82.d.d(new o(), vmState);
        Intrinsics.checkNotNullParameter(d2, "<this>");
        d2.a(a.f23150a);
        if (Intrinsics.d(vmState.f23167m, c2.f23198a)) {
            d2.a(new r0(vmState.f23155a));
        }
        return d2.e();
    }

    @Override // l82.d
    public final l82.c0 f(u50.s sVar, u50.o oVar, l82.i0 i0Var, l82.e resultBuilder) {
        j2 j2Var;
        q0 event = (q0) sVar;
        o priorDisplayState = (o) oVar;
        a2 priorVMState = (a2) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (event instanceof v) {
            wa2.m mVar = ((v) event).f23361a;
            x2 x2Var = ((a2) resultBuilder.f82219b).f23158d;
            resultBuilder.h(new y1(event, mVar, this, ((es.v) this.f23390d).y(priorVMState.f23155a, mVar.O, mVar.N, x2Var.f90845b0, x2Var.f90843a0, x2Var.Z, x2Var.Y), priorVMState, 0));
        } else if (event instanceof w) {
            resultBuilder.h(new x1(event, 1));
        } else if (event instanceof t) {
            resultBuilder.h(new x1(event, 2));
        } else if (event instanceof y) {
            resultBuilder.h(new w1(event, 2));
        } else if (event instanceof p0) {
            n((p0) event, resultBuilder);
        } else if (event instanceof d0) {
            A(((d0) event).j(), resultBuilder, false);
        } else if (Intrinsics.d(event, p.f23276a)) {
            resultBuilder.f(q1.f23299w);
        } else if (event instanceof q) {
            resultBuilder.f(q1.f23300x);
            q qVar = (q) event;
            if (qVar.j()) {
                q(resultBuilder, qVar.l(), qVar.m());
            }
            r(qVar.l(), qVar.k(), resultBuilder);
        } else if (event instanceof r) {
            resultBuilder.f(q1.f23301y);
            resultBuilder.h(q1.f23302z);
            int i13 = p1.f23277a[priorVMState.d().ordinal()];
            if (i13 == 1) {
                r rVar = (r) event;
                l(resultBuilder, rVar.j(), rVar.l(), rVar.i());
            } else if (i13 == 2) {
                r rVar2 = (r) event;
                o(resultBuilder, rVar2.j(), rVar2.l(), rVar2.i());
            } else if (i13 == 3) {
                r rVar3 = (r) event;
                if (rVar3.j()) {
                    j2Var = j2.MDL_SUCCEEDED;
                } else {
                    f30 k13 = rVar3.k();
                    if (k13 != null) {
                        A(k13, resultBuilder, false);
                    }
                    j2Var = j2.MDL_FAILED;
                }
                E(j2Var, resultBuilder, rVar3.l());
            }
        } else if (event instanceof e0) {
            e0 e0Var = (e0) event;
            int i14 = p1.f23278b[e0Var.m().ordinal()];
            if (i14 != 1) {
                if (i14 == 2) {
                    if (e0Var.k()) {
                        h(e0Var.j(), resultBuilder);
                    }
                    if (e0Var.l()) {
                        q(resultBuilder, false, false);
                    }
                } else if (i14 == 3 && e0Var.l()) {
                    q(resultBuilder, false, false);
                }
            } else if (e0Var.k()) {
                a2 a2Var = (a2) resultBuilder.f82219b;
                String uid = a2Var.f23155a.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                resultBuilder.a(new y0(uid, a2Var.i(), a2Var.r(), a2Var.h().f143086a.f67082b));
            }
        } else if (event instanceof f0) {
            if (((a2) resultBuilder.f82219b).p()) {
                resultBuilder.a(new d1(((a2) resultBuilder.f82219b).o(), ((f0) event).j()));
            }
            resultBuilder.h(q1.A);
        } else if (event instanceof u) {
            resultBuilder.h(new w1(event, 0));
        } else if (event instanceof z) {
            z zVar = (z) event;
            resultBuilder.h(new la0.l1(j(((a2) resultBuilder.f82219b).f23155a, zVar.j()), 7));
            x(zVar.i(), resultBuilder, true);
        } else if (event instanceof a0) {
            List j13 = ((a0) event).j();
            if (j13 != null) {
                List list = j13;
                ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((f30) it.next()).s5());
                }
                if (arrayList.contains(priorVMState.f23155a.s5())) {
                    resultBuilder.h(new x1(event, 0));
                }
            }
        } else if (event instanceof b0) {
            resultBuilder.h(new oh1.u(13, event, this));
            a2 a2Var2 = (a2) resultBuilder.f82219b;
            h32.i0 z03 = com.bumptech.glide.d.z0(a2Var2.h().f143086a, q1.f23297u);
            h32.f1 f1Var = h32.f1.PIN_IAB_START;
            f30 f30Var = a2Var2.f23155a;
            String uid2 = f30Var.getUid();
            HashMap hashMap = new HashMap();
            hashMap.put(SbaPinRep.AUX_DATA_IS_MDL_AD, String.valueOf(((es.c) this.f23388b).B(a2Var2.m(), f30Var)));
            Unit unit = Unit.f80348a;
            kotlin.collections.z0.d();
            resultBuilder.a(new m1(new zy.e0(new zy.a(z03, f1Var, uid2, hashMap, null, new h32.w0(null, null, null, null, kotlin.collections.z0.d(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.FALSE, null, null, Long.valueOf(((b0) event).j()), null, null, null, null, null, null, null, null), false, false, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_ARTICLE_SECTION))));
        } else if (event instanceof x) {
            Long f13 = ((a2) resultBuilder.f82219b).f();
            if (f13 != null) {
                a2 a2Var3 = (a2) resultBuilder.f82219b;
                f30 f30Var2 = a2Var3.f23155a;
                h32.i0 z04 = com.bumptech.glide.d.z0(a2Var3.h().f143086a, q1.f23298v);
                h32.f1 f1Var2 = h32.f1.PIN_IAB_DURATION;
                String uid3 = f30Var2.getUid();
                kotlin.collections.z0.d();
                h32.w0 w0Var = new h32.w0(null, null, null, null, kotlin.collections.z0.d(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.FALSE, null, null, Long.valueOf(((x) event).j() - f13.longValue()), null, null, null, null, null, null, null, null);
                HashMap hashMap2 = new HashMap();
                bs1.c.G1(SbaPinRep.AUX_DATA_VIDEO_ID, b40.i0(f30Var2), hashMap2);
                ((vr.b) ((ur.b) this.f23392f).f123059b).c(f30Var2, hashMap2);
                resultBuilder.a(new m1(new zy.e0(new zy.a(z04, f1Var2, uid3, hashMap2, null, w0Var, false, false, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_ARTICLE_SECTION))));
            } else {
                String k14 = ((x) event).k();
                String uid4 = ((a2) resultBuilder.f82219b).f23155a.getUid();
                Intrinsics.checkNotNullExpressionValue(uid4, "getUid(...)");
                resultBuilder.a(new k1(new ni1.g(k14, uid4)));
            }
        } else if (Intrinsics.d(event, c0.f23196a)) {
            z(resultBuilder, false, null, null, g2.Tooltip);
        } else if ((event instanceof s) && Intrinsics.d(((s) event).f23318d, priorVMState.f23155a.getUid())) {
            resultBuilder.h(new w1(event, 1));
        }
        return resultBuilder.e();
    }

    public final void g(long j13, l82.e eVar, boolean z13) {
        g.b n13;
        f30 f30Var;
        a2 a2Var = (a2) eVar.f82219b;
        x2 x2Var = a2Var.f23158d;
        boolean z14 = x2Var.f90859i0;
        r1 r1Var = r1.f23309j;
        boolean z15 = x2Var.f90867m0;
        boolean z16 = x2Var.f90865l0;
        es.h hVar = this.f23390d;
        f30 f30Var2 = a2Var.f23155a;
        n13 = ((es.v) hVar).n(f30Var2, z14, x2Var.f90861j0, z15, z16, r1Var, es.f.f59980i);
        es.c cVar = (es.c) this.f23388b;
        boolean i03 = cVar.i0(f30Var2);
        hc hcVar = hc.f113451a;
        if (i03 && u(eVar)) {
            int i13 = a2Var.f23164j;
            if ((cVar.D(i13, f30Var2) || cVar.B(i13, f30Var2)) && !b40.U0(f30Var2)) {
                com.pinterest.api.model.g t33 = f30Var2.t3();
                if (t33 != null && Intrinsics.d(t33.g0(), Boolean.TRUE)) {
                    eVar.a(new l1(hcVar));
                }
                B(eVar);
                if (z13) {
                    q(eVar, true, false);
                }
                eVar.f(new zp.u0(13, f30Var2));
                return;
            }
        }
        if (cVar.G(f30Var2)) {
            com.pinterest.api.model.g t34 = f30Var2.t3();
            if (t34 != null && Intrinsics.d(t34.g0(), Boolean.TRUE)) {
                eVar.a(new l1(hcVar));
            }
            if (c0.d.I2(f30Var2)) {
                eVar.f(new oh1.u(11, f30Var2, eVar));
            }
            B(eVar);
            if (z13) {
                q(eVar, true, false);
            }
            eVar.h(new w1.d(j13, 8));
            return;
        }
        if (n13 == g.b.ENABLED_EXPANSION_ICON || n13 == g.b.ENABLED_EXPANSION_OVERLAY) {
            m(eVar);
            return;
        }
        Boolean R4 = f30Var2.R4();
        Intrinsics.checkNotNullExpressionValue(R4, "getIsEligibleForWebCloseup(...)");
        if ((R4.booleanValue() || ((cVar.O(f30Var2) && b40.X0(f30Var2) && !f30Var2.R4().booleanValue()) || n60.o.B(f30Var2, "getIsPromoted(...)") || b40.U0(f30Var2))) && !cVar.U(f30Var2)) {
            x2 x2Var2 = a2Var.f23158d;
            f30Var = f30Var2;
            if (!((es.v) this.f23390d).b0(f30Var2, x2Var2.O, x2Var2.P, new u1(4, eVar), new u1(5, eVar))) {
                boolean z17 = ((a2) eVar.f82219b).N;
                eVar.h(q1.f23291o);
                A(f30Var, eVar, true ^ z17);
                if (z13) {
                    q(eVar, z17, false);
                    return;
                }
                return;
            }
        } else {
            f30Var = f30Var2;
        }
        if (!a2Var.P) {
            if (ps0.m.m(eVar)) {
                y(f30Var, eVar, z13);
                return;
            } else {
                eVar.f(new fd1.h(z13, 25));
                return;
            }
        }
        a2 a2Var2 = (a2) eVar.f82219b;
        String str = a2Var2.Q;
        if (str != null) {
            zy.l0 l0Var = a2Var2.f23157c;
            eVar.d(new u0(str, a2Var2.f23155a, null, false, F(eVar, l0Var.f143086a, a2Var2.f23163i), null, null, false, l0Var.f143087b, false, false, 3584), new m1(new zy.e0(new zy.a(com.bumptech.glide.d.z0(l0Var.f143086a, q1.f23295s), h32.f1.VIEW_WEBSITE_100, a2Var2.f23155a.getUid(), null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM))));
        }
        if (z13) {
            q(eVar, false, false);
        }
    }

    public final h32.c1 i(f30 f30Var, a2 a2Var, f30 f30Var2) {
        String uid;
        h32.c1 a13;
        if (f30Var2 == null || (uid = f30Var2.getUid()) == null) {
            uid = f30Var.getUid();
        }
        String str = uid;
        f30 f30Var3 = f30Var2 == null ? f30Var : f30Var2;
        boolean z13 = a2Var.N;
        Short o13 = ((es.v) this.f23390d).o(f30Var);
        boolean C1 = dl2.b.C1(a2Var);
        boolean z14 = a2Var.f23158d.f90850e;
        ur.b bVar = (ur.b) this.f23392f;
        a13 = ek1.c2.a(str, f30Var, f30Var3, z13, a2Var.f23173s, a2Var.f23161g, a2Var.f23162h, o13, false, false, bVar.f123058a, false, C1, z14, this.f23390d, bVar.f123059b);
        return a13;
    }

    public final h32.u0 j(f30 f30Var, boolean z13) {
        if (((es.c) this.f23388b).M(f30Var)) {
            return z13 ? h32.u0.AD_CLICKTHROUGH_MEDIA : h32.u0.AD_CLICKTHROUGH_TITLE;
        }
        return null;
    }

    public final HashMap k(l82.e eVar) {
        a2 a2Var = (a2) eVar.f82219b;
        int i13 = a2Var.f23175u;
        Integer num = a2Var.f23173s;
        return new oi1.t(a2Var.f23155a, a2Var.f23156b, a2Var.f23171q, a2Var.f23172r, num != null ? num.intValue() : 0, a2Var.f23174t, i13, a2Var.f23176v, a2Var.f23177w, a2Var.f23178x, a2Var.f23179y, a2Var.f23180z, a2Var.A, a2Var.B, a2Var.f23170p, a2Var.N, a2Var.f23164j, this.f23388b, this.f23391e, this.f23392f, a2Var.W, a2Var.X).a();
    }

    public final void l(l82.e eVar, boolean z13, boolean z14, long j13) {
        if (!z13) {
            C(j13, eVar, z14);
        } else if (z14) {
            q(eVar, true, true);
        }
    }

    public final void m(l82.e eVar) {
        a2 a2Var = (a2) eVar.f82219b;
        h32.i0 i0Var = a2Var.f23157c.f143086a;
        h32.f1 f1Var = h32.f1.DL_AD_CLOSEUP_OVERLAY_CLICKTHROUGH;
        f30 f30Var = a2Var.f23155a;
        String uid = f30Var.getUid();
        HashMap k13 = k(eVar);
        String uid2 = f30Var.getUid();
        Boolean valueOf = Boolean.valueOf(a2Var.R);
        Boolean valueOf2 = Boolean.valueOf(a2Var.U);
        es.v vVar = (es.v) this.f23390d;
        x32.e eVar2 = a2Var.S;
        String str = a2Var.T;
        f30 f30Var2 = a2Var.f23155a;
        x32.b r13 = vVar.r(f30Var2, eVar2, str, valueOf, valueOf2);
        Short o13 = vVar.o(f30Var);
        x2 x2Var = a2Var.f23158d;
        eVar.d(new m1(new zy.f0(new zy.a(i0Var, f1Var, uid, k13, ek1.c2.c(uid2, f30Var2, a2Var.f23161g, a2Var.f23162h, x2Var.f90877r0, a2Var.W, a2Var.X, this.f23388b, r13, o13, dl2.b.C1(a2Var), x2Var.f90850e, this.f23390d, ((ur.b) this.f23392f).f123059b), null, false, false, RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL))), new f1(f30Var));
        z(eVar, true, null, null, g2.Other);
    }

    public final void n(p0 p0Var, l82.e eVar) {
        h32.u0 u0Var;
        h32.c1 c13;
        String uid;
        g.b n13;
        f30 f30Var = ((a2) eVar.f82219b).f23155a;
        es.c cVar = (es.c) this.f23388b;
        if (!cVar.M(f30Var)) {
            u0Var = null;
        } else if (p0Var instanceof m0) {
            u0Var = h32.u0.AD_CLICKTHROUGH_MEDIA;
        } else if (p0Var instanceof o0) {
            u0Var = h32.u0.AD_CLICKTHROUGH_PROMOTER_NAME;
        } else if (p0Var instanceof h0) {
            u0Var = h32.u0.AD_CLICKTHROUGH_CHIN_CTA;
        } else if (p0Var instanceof j0) {
            u0Var = h32.u0.AD_CLICKTHROUGH_EXPAND;
        } else if (p0Var instanceof g0) {
            u0Var = h32.u0.AD_CLICKTHROUGH_TITLE;
        } else if (p0Var instanceof l0) {
            u0Var = h32.u0.AD_CLICKTHROUGH_TITLE;
        } else if (p0Var instanceof n0) {
            u0Var = h32.u0.AD_CLICKTHROUGH_PROMO_METADATA;
        } else if (p0Var instanceof k0) {
            u0Var = h32.u0.AD_CLICKTHROUGH_DISCLOSURE;
        } else {
            if (!(p0Var instanceof i0)) {
                throw new NoWhenBranchMatchedException();
            }
            u0Var = h32.u0.PIN_GRID_CLICKTHROUGH_BUTTON;
        }
        eVar.h(new oh1.u(10, u0Var, this));
        boolean z13 = p0Var instanceof m0;
        es.h hVar = this.f23390d;
        ur.a aVar = this.f23392f;
        if (z13) {
            long i13 = p0Var.i();
            if (((a2) eVar.f82219b).f23171q) {
                G(0, eVar);
            }
            a2 a2Var = (a2) eVar.f82219b;
            HashMap hashMap = a2Var.f23170p;
            Integer num = a2Var.f23173s;
            oi1.t tVar = new oi1.t(a2Var.f23155a, a2Var.f23156b, a2Var.f23171q, a2Var.f23172r, num != null ? num.intValue() : 0, a2Var.f23174t, a2Var.f23175u, a2Var.f23176v, a2Var.f23177w, a2Var.f23178x, a2Var.f23179y, a2Var.f23180z, a2Var.A, a2Var.B, hashMap, a2Var.N, a2Var.f23164j, this.f23388b, this.f23391e, this.f23392f, false, false);
            zy.l0 l0Var = a2Var.f23157c;
            h32.i0 source = l0Var.f143086a;
            Intrinsics.checkNotNullParameter(source, "source");
            d4 d4Var = source.f67081a;
            h32.u0 u0Var2 = a2Var.C;
            if (u0Var2 == null) {
                u0Var2 = h32.u0.PIN_SOURCE_IMAGE;
            }
            h32.u0 u0Var3 = u0Var2;
            h32.g0 g0Var = l0Var.f143086a.f67084d;
            if (g0Var == null) {
                g0Var = h32.g0.FLOWED_PIN;
            }
            h32.i0 i0Var = new h32.i0(d4Var, source.f67082b, source.f67083c, g0Var, source.f67085e, u0Var3);
            h32.f1 f1Var = h32.f1.TAP;
            f30 f30Var2 = a2Var.f23155a;
            String uid2 = f30Var2.getUid();
            HashMap a13 = tVar.a();
            String uid3 = f30Var2.getUid();
            Boolean valueOf = Boolean.valueOf(a2Var.R);
            Boolean valueOf2 = Boolean.valueOf(a2Var.U);
            es.v vVar = (es.v) hVar;
            f30 f30Var3 = a2Var.f23155a;
            x32.b r13 = vVar.r(f30Var3, a2Var.S, a2Var.T, valueOf, valueOf2);
            Short o13 = vVar.o(f30Var2);
            x2 x2Var = a2Var.f23158d;
            eVar.a(new m1(new zy.f0(new zy.a(i0Var, f1Var, uid2, a13, ek1.c2.c(uid3, f30Var3, a2Var.f23161g, a2Var.f23162h, x2Var.f90877r0, a2Var.W, a2Var.X, this.f23388b, r13, o13, dl2.b.C1(a2Var), x2Var.f90850e, this.f23390d, ((ur.b) aVar).f123059b), null, false, false, RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL))));
            x(i13, eVar, true);
            return;
        }
        if (p0Var instanceof o0) {
            long i14 = p0Var.i();
            a2 a2Var2 = (a2) eVar.f82219b;
            qa2.a aVar2 = a2Var2.K;
            if (aVar2 == qa2.a.UNDEFINED) {
                eVar.a(new k1(new ni1.f()));
            } else {
                Pair p03 = kh2.b0.p0(aVar2, a2Var2.f23155a, a2Var2.f23154J);
                if (p03 != null) {
                    h32.u0 u0Var4 = (h32.u0) p03.f80346a;
                    String str = (String) p03.f80347b;
                    h32.i0 source2 = a2Var2.f23157c.f143086a;
                    Intrinsics.checkNotNullParameter(source2, "source");
                    eVar.a(new m1(new zy.f0(new zy.a(new h32.i0(source2.f67081a, source2.f67082b, source2.f67083c, source2.f67084d, source2.f67085e, u0Var4), h32.f1.TAP, str, null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_PEAR_EXPLORER_HEADER))));
                }
            }
            x(i14, eVar, true);
            return;
        }
        if (p0Var instanceof j0) {
            a2 a2Var3 = (a2) eVar.f82219b;
            x2 x2Var2 = a2Var3.f23158d;
            n13 = ((es.v) hVar).n(a2Var3.f23155a, x2Var2.f90859i0, x2Var2.f90861j0, x2Var2.f90867m0, x2Var2.f90865l0, r1.f23310k, es.f.f59980i);
            if (n13 == g.b.ENABLED_EXPANSION_ICON) {
                m(eVar);
                return;
            } else if (cVar.U(a2Var3.f23155a)) {
                z(eVar, true, null, null, g2.Other);
                return;
            } else {
                A(((a2) eVar.f82219b).f23155a, eVar, true);
                q(eVar, false, false);
                return;
            }
        }
        if (p0Var instanceof l0) {
            l0 l0Var2 = (l0) p0Var;
            if (l0Var2.l()) {
                f30 j13 = l0Var2.j();
                int k13 = l0Var2.k();
                long i15 = l0Var2.i();
                int i16 = k13 + 1;
                if (((a2) eVar.f82219b).N) {
                    G(i16, eVar);
                    z(eVar, true, j13, Integer.valueOf(i16), g2.Other);
                    return;
                } else {
                    x(i15, eVar, false);
                    q(eVar, false, false);
                    return;
                }
            }
            f30 j14 = l0Var2.j();
            e30 R6 = ((a2) eVar.f82219b).f23155a.R6();
            R6.v2(((a2) eVar.f82219b).f23159e);
            f30 a14 = R6.a();
            Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
            zy.l0 pinalyticsVMState = ((a2) eVar.f82219b).f23157c;
            Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
            if (com.bumptech.glide.c.c1(pinalyticsVMState.f143086a)) {
                a2 a2Var4 = (a2) eVar.f82219b;
                boolean z14 = a2Var4.f23160f;
                zy.l0 l0Var3 = a2Var4.f23157c;
                h32.g0 g0Var2 = z14 ? l0Var3.f143086a.f67084d : h32.g0.FLOWED_PIN;
                Integer num2 = a2Var4.f23173s;
                HashMap a15 = new oi1.t(a14, a2Var4.f23156b, true, false, num2 != null ? num2.intValue() : 0, a2Var4.f23174t, a2Var4.f23175u, a2Var4.f23176v, a2Var4.f23177w, a2Var4.f23178x, a2Var4.f23179y, a2Var4.f23180z, a2Var4.A, a2Var4.B, null, a2Var4.N, a2Var4.f23164j, this.f23388b, this.f23391e, this.f23392f, false, false).a();
                h32.i0 source3 = l0Var3.f143086a;
                Intrinsics.checkNotNullParameter(source3, "source");
                eVar.a(new m1(new zy.f0(new zy.a(new h32.i0(source3.f67081a, source3.f67082b, source3.f67083c, g0Var2, source3.f67085e, h32.u0.VISUAL_LINK_CHIP), h32.f1.TAP, a14.getUid(), a15, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM))));
            }
            a2 a2Var5 = (a2) eVar.f82219b;
            if (j14 == null || (uid = j14.getUid()) == null) {
                uid = a2Var5.f23155a.getUid();
            }
            Intrinsics.f(uid);
            eVar.a(new y0(uid, a2Var5.L, a2Var5.M, a2Var5.f23157c.f143086a.f67082b));
            q(eVar, false, false);
            return;
        }
        if (!(p0Var instanceof h0)) {
            if ((p0Var instanceof g0) || (p0Var instanceof n0)) {
                if (((a2) eVar.f82219b).N) {
                    G(-1, eVar);
                }
                x(p0Var.i(), eVar, true);
                return;
            }
            if (!(p0Var instanceof k0)) {
                if (p0Var instanceof i0) {
                    m(eVar);
                    return;
                }
                return;
            }
            h32.u0 u0Var5 = ((a2) eVar.f82219b).f23163i;
            long i17 = p0Var.i();
            v(eVar);
            eVar.a(new m1(new zy.f0(new zy.a(com.bumptech.glide.d.z0(((a2) eVar.f82219b).f23157c.f143086a, q1.f23293q), h32.f1.AD_DISCLOSURE_CLICKTHROUGH, ((a2) eVar.f82219b).f23155a.getUid(), k(eVar), null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM))));
            a2 a2Var6 = (a2) eVar.f82219b;
            f30 f30Var4 = a2Var6.f23155a;
            com.pinterest.api.model.g t33 = f30Var4.t3();
            String Z = t33 != null ? t33.Z() : null;
            if (Z == null || kotlin.text.z.j(Z)) {
                return;
            }
            zy.l0 l0Var4 = a2Var6.f23157c;
            h32.i0 F = F(eVar, l0Var4.f143086a, u0Var5);
            HashMap k14 = k(eVar);
            String uid4 = f30Var4.getUid();
            es.v vVar2 = (es.v) hVar;
            x32.b r14 = vVar2.r(a2Var6.f23155a, a2Var6.S, a2Var6.T, Boolean.valueOf(a2Var6.R), Boolean.valueOf(a2Var6.U));
            Short o14 = vVar2.o(a2Var6.f23155a);
            x2 x2Var3 = a2Var6.f23158d;
            eVar.a(new u0(Z, f30Var4, k14, false, F, F, ek1.c2.c(uid4, f30Var4, a2Var6.f23161g, a2Var6.f23162h, x2Var3.f90877r0, a2Var6.W, a2Var6.X, this.f23388b, r14, o14, dl2.b.C1(a2Var6), x2Var3.f90850e, this.f23390d, ((ur.b) aVar).f123059b), false, l0Var4.f143087b, true, false, 2048));
            q(eVar, true, false);
            eVar.h(new w1.d(i17, 7));
            return;
        }
        long i18 = p0Var.i();
        a2 a2Var7 = (a2) eVar.f82219b;
        f30 f30Var5 = a2Var7.f23155a;
        d2 d2Var = a2Var7.f23167m;
        b2 b2Var = d2Var instanceof b2 ? (b2) d2Var : null;
        boolean z15 = b2Var != null ? b2Var.f23187c : false;
        if (df.j1.J0(f30Var5) && z15) {
            eVar.f(new bi1.a0(a2Var7, 6));
            q(eVar, true, false);
            return;
        }
        boolean t13 = t(null, eVar);
        boolean u13 = u(eVar);
        if (a2Var7.N) {
            eVar.h(q1.f23290n);
        }
        a2 a2Var8 = (a2) eVar.f82219b;
        boolean a16 = this.f23389c.a(a2Var8.f23155a, a2Var8.f23158d.H, new u1(3, eVar));
        boolean s13 = s(eVar);
        if (!t13 && u13 && !a16 && !b40.U0(f30Var5)) {
            r14 = 1;
        }
        if (s13 && r14 != 0 && cVar.G(f30Var5)) {
            D(eVar, f30Var5, b.CHIN_CTA);
            return;
        }
        if (t13 || !u13) {
            C(i18, eVar, true);
            return;
        }
        a2 a2Var9 = (a2) eVar.f82219b;
        f30 f30Var6 = a2Var9.f23155a;
        String uid5 = f30Var6.getUid();
        String uid6 = f30Var6.getUid();
        x2 x2Var4 = a2Var9.f23158d;
        ur.b bVar = (ur.b) aVar;
        c13 = ek1.c2.c(uid5, f30Var6, a2Var9.f23161g, uid6, x2Var4.f90877r0, false, false, bVar.f123058a, (r29 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : null, (r29 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : null, dl2.b.C1(a2Var9), x2Var4.f90850e, this.f23390d, bVar.f123059b);
        eVar.f(new ed1.m(f30Var6, c13, a2Var9, 20));
        eVar.h(q1.f23288l);
    }

    public final void o(l82.e eVar, boolean z13, boolean z14, long j13) {
        if (!z13) {
            g(j13, eVar, z14);
        } else if (z14) {
            q(eVar, true, true);
        }
    }

    public final j2 p(f30 f30Var, l82.e eVar, boolean z13, boolean z14) {
        boolean u13 = u(eVar);
        if (z13 || t(f30Var, eVar) || !u13) {
            A(f30Var, eVar, false);
            return j2.MDL_FAILED;
        }
        f30 f30Var2 = ((a2) eVar.f82219b).f23155a;
        String uid = f30Var.getUid();
        a2 a2Var = (a2) eVar.f82219b;
        Integer num = a2Var.f23173s;
        boolean z15 = a2Var.f23161g;
        String uid2 = f30Var2.getUid();
        Short o13 = ((es.v) this.f23390d).o(f30Var2);
        a2 a2Var2 = (a2) eVar.f82219b;
        h32.c1 a13 = ek1.c2.a(uid, f30Var2, f30Var, true, num, z15, uid2, o13, a2Var2.W, a2Var2.X, this.f23388b, a2Var2.f23158d.f90877r0, dl2.b.C1(a2Var2), ((a2) eVar.f82219b).f23158d.f90850e, this.f23390d, ((ur.b) this.f23392f).f123059b);
        i(f30Var2, (a2) eVar.f82219b, f30Var);
        eVar.f(new z9.n(f30Var, z14, f30Var2, a13, eVar));
        eVar.h(q1.f23292p);
        return j2.MDL_PENDING;
    }

    public final void q(l82.e eVar, boolean z13, boolean z14) {
        es.a aVar;
        HashMap hashMap;
        l82.e eVar2;
        com.pinterest.api.model.k L;
        e30 R6 = ((a2) eVar.f82219b).f23155a.R6();
        R6.v2(((a2) eVar.f82219b).f23159e);
        f30 pin = R6.a();
        Intrinsics.checkNotNullExpressionValue(pin, "build(...)");
        if (pin.R3() != null) {
            eVar.a(new w0(pin));
        }
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(pin, "pin");
        es.a adFormats = this.f23388b;
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        boolean t13 = ((es.c) adFormats).t(pin);
        ur.a adsDependencies = this.f23392f;
        if (t13) {
            eVar.a(new l1(ic.f113468a));
            if (((a2) eVar.f82219b).f23158d.f90869n0) {
                if (p1.f23280d[((vr.b) ((ur.b) adsDependencies).f123059b).d(pin).ordinal()] == 1) {
                    if (z13) {
                        String uid = pin.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                        eVar.a(new j1(new zw.e(uid)));
                    } else {
                        String uid2 = pin.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                        eVar.a(new j1(new zw.d(uid2)));
                    }
                }
            }
        }
        zy.l0 pinalyticsVMState = ((a2) eVar.f82219b).f23157c;
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        if (com.bumptech.glide.c.c1(pinalyticsVMState.f143086a)) {
            a2 a2Var = (a2) eVar.f82219b;
            boolean z15 = a2Var.f23161g;
            boolean z16 = a2Var.f23160f;
            zy.l0 l0Var = a2Var.f23157c;
            h32.g0 g0Var = z16 ? l0Var.f143086a.f67084d : null;
            Integer num = a2Var.f23173s;
            int intValue = num != null ? num.intValue() : 0;
            x2 x2Var = a2Var.f23158d;
            boolean z17 = x2Var.f90886w;
            Intrinsics.checkNotNullParameter(pin, "pin");
            nx.q commerceData = a2Var.f23177w;
            Intrinsics.checkNotNullParameter(commerceData, "commerceData");
            es.a adFormats2 = this.f23388b;
            Intrinsics.checkNotNullParameter(adFormats2, "adFormats");
            nx.b0 pinAuxHelper = this.f23391e;
            Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
            Intrinsics.checkNotNullParameter(adsDependencies, "adsDependencies");
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = a2Var.f23170p;
            if (hashMap3 != null) {
                hashMap2.putAll(hashMap3);
            }
            hashMap2.put("closeup_navigation_type", SbaPinRep.CLOSEUP_NAVIGATION_TYPE_CLICK);
            int i13 = a2Var.f23156b;
            if (i13 >= 0) {
                hashMap2.put("grid_index", String.valueOf(i13));
            }
            ur.b bVar = (ur.b) adsDependencies;
            ((vr.b) bVar.f123059b).c(pin, hashMap2);
            pinAuxHelper.e(pin, hashMap2, commerceData);
            if (z13) {
                hashMap2.put("click_type", "clickthrough");
            }
            es.c cVar = (es.c) adFormats2;
            int i14 = a2Var.f23164j;
            if (cVar.B(i14, pin)) {
                aVar = adFormats2;
                hashMap2.put("clickthrough_source", "u'grid");
                hashMap2.put(SbaPinRep.AUX_DATA_IS_MDL_AD, "true");
                hashMap2.put("mdl_did_succeed", String.valueOf(z14));
            } else {
                aVar = adFormats2;
            }
            if (a2Var.N) {
                hashMap2.put("collection_pin_click_position", String.valueOf(intValue));
            }
            oi1.b.a(pin, hashMap2);
            oi1.b.b(hashMap2, a2Var.f23166l, pin, Integer.valueOf(a2Var.f23165k), true, pinAuxHelper);
            if (n60.o.B(pin, "getIsPromoted(...)") && z17) {
                hashMap = hashMap2;
                ((vr.b) bVar.f123059b).a(pin, hashMap);
            } else {
                hashMap = hashMap2;
            }
            if (cVar.J(pin)) {
                Intrinsics.checkNotNullParameter(hashMap, "<this>");
                Intrinsics.checkNotNullParameter(pin, "pin");
                com.pinterest.api.model.g t33 = pin.t3();
                if (t33 != null && (L = t33.L()) != null) {
                    k.b i15 = L.i();
                    if (i15 != null) {
                        hashMap.put("ads_creative_type", String.valueOf(i15.getValue()));
                    }
                    k.a h10 = L.h();
                    if (h10 != null) {
                        hashMap.put("ads_closeup_type", String.valueOf(h10.getValue()));
                    }
                    k.c j13 = L.j();
                    if (j13 != null) {
                        hashMap.put("ads_destination_type", String.valueOf(j13.getValue()));
                    }
                    k.d k13 = L.k();
                    if (k13 != null) {
                        hashMap.put("ads_media_type", String.valueOf(k13.getValue()));
                    }
                }
            }
            boolean z18 = a2Var.f23179y;
            boolean z19 = a2Var.f23180z;
            Integer num2 = a2Var.f23174t;
            String str = a2Var.A;
            Boolean bool = a2Var.B;
            boolean z23 = a2Var.f23176v;
            HashMap contents = hashMap;
            kg.a.a(hashMap, pin, z18, z19, num2, str, bool, z23, a2Var.f23175u, a2Var.f23178x, i14, aVar, pinAuxHelper);
            Intrinsics.checkNotNullParameter(contents, "contents");
            HashMap hashMap4 = new HashMap(contents);
            String uid3 = pin.getUid();
            Boolean valueOf = Boolean.valueOf(a2Var.R);
            Boolean valueOf2 = Boolean.valueOf(a2Var.U);
            es.v vVar = (es.v) this.f23390d;
            h32.c1 c13 = ek1.c2.c(uid3, pin, z15, a2Var.f23162h, x2Var.f90877r0, a2Var.W, a2Var.X, this.f23388b, vVar.r(a2Var.f23155a, a2Var.S, a2Var.T, valueOf, valueOf2), vVar.o(a2Var.f23155a), dl2.b.C1(a2Var), x2Var.f90850e, this.f23390d, bVar.f123059b);
            if (z13 && z23) {
                eVar2 = eVar;
                eVar2.a(new n1(new ni1.s(pin, true)));
            } else {
                eVar2 = eVar;
            }
            h32.i0 source = l0Var.f143086a;
            Intrinsics.checkNotNullParameter(source, "source");
            eVar2.a(new m1(new zy.f0(new zy.a(new h32.i0(source.f67081a, source.f67082b, source.f67083c, g0Var, source.f67085e, a2Var.f23163i), h32.f1.PIN_CLICK, pin.getUid(), hashMap4, c13, null, false, false, RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL))));
        }
    }

    public final boolean s(l82.e eVar) {
        a2 a2Var = (a2) eVar.f82219b;
        f30 f30Var = a2Var.f23155a;
        x2 x2Var = a2Var.f23158d;
        boolean z13 = x2Var.f90859i0;
        u1 u1Var = new u1(0, eVar);
        r1 r1Var = r1.f23311l;
        es.v vVar = (es.v) this.f23390d;
        g.b n13 = vVar.n(f30Var, z13, x2Var.f90861j0, x2Var.f90867m0, x2Var.f90865l0, u1Var, r1Var);
        vVar.getClass();
        int i13 = n13 == null ? -1 : es.j.f59987b[n13.ordinal()];
        return i13 == 2 || i13 == 3 || i13 == 5;
    }

    public final boolean u(l82.e eVar) {
        a2 a2Var = (a2) eVar.f82219b;
        f30 f30Var = a2Var.f23155a;
        boolean C1 = dl2.b.C1(a2Var);
        yj1.d dVar = new yj1.d(a2Var, 1);
        es.v vVar = (es.v) this.f23390d;
        boolean N = vVar.N(f30Var, C1, dVar);
        boolean L = vVar.L(f30Var, N);
        if (N) {
            return L && a2Var.N;
        }
        return true;
    }

    public final void w(f30 f30Var, l82.e eVar) {
        es.c cVar = (es.c) this.f23388b;
        if (cVar.U(f30Var) || cVar.x(f30Var)) {
            a2 a2Var = (a2) eVar.f82219b;
            String str = a2Var.Q;
            if (str == null) {
                str = "";
            }
            zy.l0 l0Var = a2Var.f23157c;
            eVar.a(new s0(f30Var, str, l0Var.f143086a, l0Var.f143087b));
        }
    }

    public final void x(long j13, l82.e resultBuilder, boolean z13) {
        bc2.q S0;
        f30 pin = ((a2) resultBuilder.f82219b).f23155a;
        if (b40.R0(pin)) {
            Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
            Intrinsics.checkNotNullParameter(pin, "pin");
            if (!u2.V0(pin, resultBuilder)) {
                resultBuilder.a(new g1(pin));
            }
        } else if (b40.X0(pin)) {
            Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
            Intrinsics.checkNotNullParameter(pin, "pin");
            if (!u2.V0(pin, resultBuilder) && (S0 = dl2.b.S0(pin, 0)) != null) {
                String uid = pin.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                resultBuilder.a(new h1(uid, S0, bc2.m.PIN_CLOSEUP, b40.Q0(pin)));
            }
        }
        boolean t13 = t(null, resultBuilder);
        boolean u13 = u(resultBuilder);
        boolean s13 = s(resultBuilder);
        a2 a2Var = (a2) resultBuilder.f82219b;
        boolean z14 = (t13 || !u13 || this.f23389c.a(a2Var.f23155a, a2Var.f23158d.H, new u1(3, resultBuilder)) || b40.U0(pin)) ? false : true;
        if (s13 || !z14) {
            if (s13 && z14 && ((es.c) this.f23388b).G(pin)) {
                D(resultBuilder, pin, b.NAVIGATE_TO_CLOSEUP_COMPREHENSIVE);
                return;
            } else {
                g(j13, resultBuilder, z13);
                return;
            }
        }
        a2 a2Var2 = (a2) resultBuilder.f82219b;
        f30 f30Var = a2Var2.f23155a;
        boolean z15 = a2Var2.N;
        if (z15 && a2Var2.f23173s == null) {
            G(0, resultBuilder);
        }
        a2 a2Var3 = (a2) resultBuilder.f82219b;
        String uid2 = f30Var.getUid();
        Integer num = a2Var3.f23173s;
        Short o13 = ((es.v) this.f23390d).o(f30Var);
        a2 a2Var4 = (a2) resultBuilder.f82219b;
        boolean z16 = a2Var4.W;
        x2 x2Var = a2Var3.f23158d;
        resultBuilder.f(new k1.b0(f30Var, z13, ek1.c2.a(uid2, f30Var, f30Var, z15, num, a2Var3.f23161g, a2Var3.f23162h, o13, z16, a2Var4.X, this.f23388b, x2Var.f90877r0, dl2.b.C1(a2Var3), x2Var.f90850e, this.f23390d, ((ur.b) this.f23392f).f123059b), a2Var3, 17));
        resultBuilder.h(q1.f23287k);
    }

    public final void y(f30 f30Var, l82.e eVar, boolean z13) {
        w(f30Var, eVar);
        if (((a2) eVar.f82219b).N) {
            E(p(f30Var, eVar, true, z13), eVar, z13);
        } else {
            eVar.a(new b1(f30Var, z13, g2.Comprehensive));
            eVar.a(c1.f23197a);
        }
    }

    public final void z(l82.e eVar, boolean z13, f30 f30Var, Integer num, g2 g2Var) {
        if (!ps0.m.m(eVar)) {
            eVar.f(new z9.n(9, f30Var, eVar, num, g2Var, z13));
            eVar.h(new l4(num, 9));
            return;
        }
        eVar.h(new l4(num, 8));
        if (f30Var == null) {
            f30Var = ((a2) eVar.f82219b).f23155a;
        }
        w(f30Var, eVar);
        if (((a2) eVar.f82219b).N) {
            E(p(f30Var, eVar, false, z13), eVar, z13);
        } else {
            eVar.a(new b1(f30Var, z13, g2Var));
            eVar.a(c1.f23197a);
        }
    }
}
