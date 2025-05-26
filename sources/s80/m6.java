package s80;

import android.graphics.PointF;
import com.pinterest.collagesCoreLibrary.model.CutoutPickerOrigin;
import com.pinterest.shuffles.core.ui.model.CutoutModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m6 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final l82.h0 f111679b;

    /* renamed from: c, reason: collision with root package name */
    public final l82.h0 f111680c;

    public m6(t80.c0 emptyStateCarouselTransformer, lt.j pinalyticsStateTransformer) {
        Intrinsics.checkNotNullParameter(emptyStateCarouselTransformer, "emptyStateCarouselTransformer");
        Intrinsics.checkNotNullParameter(pinalyticsStateTransformer, "pinalyticsStateTransformer");
        this.f111679b = b(pinalyticsStateTransformer, new kotlin.jvm.internal.d0() { // from class: s80.i6
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((j) obj).f111602k;
            }
        }, new kotlin.jvm.internal.d0() { // from class: s80.j6
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((n6) obj).f111725q;
            }
        }, e6.f111522k);
        this.f111680c = b(emptyStateCarouselTransformer, n3.f111691l, new kotlin.jvm.internal.d0() { // from class: s80.d6
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((n6) obj).f111723o;
            }
        }, e6.f111521j);
    }

    public static void g(m6 m6Var, l82.e eVar, h32.u0 u0Var, h32.g0 g0Var, h32.a4 a4Var, h32.f1 f1Var, HashMap hashMap, int i13) {
        h32.u0 u0Var2 = (i13 & 1) != 0 ? null : u0Var;
        h32.g0 g0Var2 = (i13 & 2) != 0 ? null : g0Var;
        h32.a4 a4Var2 = (i13 & 4) != 0 ? null : a4Var;
        h32.f1 f1Var2 = (i13 & 8) != 0 ? h32.f1.TAP : f1Var;
        HashMap hashMap2 = (i13 & 16) != 0 ? new HashMap() : hashMap;
        m6Var.getClass();
        eVar.a(kh2.c3.M((n6) eVar.f82219b, u0Var2, g0Var2, a4Var2, null, f1Var2, hashMap2, 8));
    }

    public static void h(l82.e eVar) {
        b7 b7Var = ((j) eVar.f82218a).f111598g.f111881a;
        if (b7Var == b7.Tips) {
            return;
        }
        if (b7Var != b7.None) {
            q(eVar, b7.TipsGoBack, false);
            return;
        }
        n6 n6Var = (n6) eVar.f82219b;
        if (n6Var.f111713e) {
            eVar.a(new a6(u6.f111816a));
            return;
        }
        boolean z13 = n6Var.f111727s;
        m4 m4Var = m4.f111677a;
        if (z13) {
            eVar.d(m4Var, new n5(false), e5.f111520a);
        } else {
            eVar.h(n3.f111693n);
            eVar.d(m4Var, new n5(false));
        }
    }

    public static void k(l82.e eVar, List list, int i13) {
        if (!((n6) eVar.f82219b).f111713e) {
            eVar.b(list);
            return;
        }
        eVar.a(v4.f111829a);
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        eVar.a(e.f111505a);
        eVar.f(new r1.j0(i13, 11));
        eVar.h(new w1.g(list, 9));
    }

    public static void m(l82.e eVar, String str, boolean z13) {
        eVar.f(new rq.l2(str, 22));
        if (z13) {
            eVar.h(new rq.l2(str, 23));
        }
    }

    public static void n(m6 m6Var, l82.e eVar) {
        u50.o oVar = eVar.f82218a;
        float f13 = ((j) oVar).f111607p.f111573b;
        float f14 = ((j) oVar).f111607p.f111574c;
        m6Var.getClass();
        eVar.f(new k6(f13, f14, false));
    }

    public static void o(l82.e eVar, boolean z13) {
        eVar.f(new cp.t(z13, 12));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0097, code lost:
    
        if (oe.f.T0(r1) != false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void p(l82.e r8) {
        /*
            u50.o r0 = r8.f82218a
            s80.j r0 = (s80.j) r0
            l82.i0 r1 = r8.f82219b
            s80.n6 r1 = (s80.n6) r1
            boolean r2 = r1.f111712d
            if (r2 == 0) goto L12
            s80.n3 r0 = s80.n3.F
            r8.f(r0)
            return
        L12:
            l62.a r2 = r0.f111592a
            boolean r2 = kh2.j.Y(r2)
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L22
            boolean r2 = r1.f111730v
            if (r2 != 0) goto L22
            r2 = r3
            goto L23
        L22:
            r2 = r4
        L23:
            s80.z6 r5 = r0.f111598g
            s80.b7 r5 = r5.f111881a
            s80.b7 r6 = s80.b7.None
            if (r5 == r6) goto L2c
            r4 = r3
        L2c:
            s80.t6 r5 = r0.f111596e
            boolean r5 = r5.f111806b
            s80.v6 r6 = r0.f111600i
            boolean r6 = r6.f111833c
            s80.i r7 = r0.f111607p
            boolean r7 = r7.f111572a
            if (r2 == 0) goto Lbe
            if (r4 != 0) goto Lbe
            if (r5 != 0) goto Lbe
            if (r6 != 0) goto Lbe
            if (r7 != 0) goto Lbe
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            s80.w6 r4 = r0.f111601j
            t80.d r5 = r4.f111840a
            java.util.List r5 = r5.f116683a
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ r3
            if (r5 == 0) goto L99
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            t80.d r0 = r4.f111840a
            java.util.List r0 = r0.f116683a
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r3
            if (r2 == 0) goto L93
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r2 = r0 instanceof java.util.Collection
            if (r2 == 0) goto L77
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L77
            goto L93
        L77:
            java.util.Iterator r0 = r0.iterator()
        L7b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L93
            java.lang.Object r2 = r0.next()
            u80.j r2 = (u80.j) r2
            u80.g r2 = r2.f120953g
            java.util.List r2 = r2.f120938b
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r3
            if (r2 == 0) goto L7b
            goto Lae
        L93:
            boolean r0 = oe.f.T0(r1)
            if (r0 == 0) goto Lae
        L99:
            t80.d0 r0 = r1.f111723o
            boolean r0 = r0.f116685b
            if (r0 != 0) goto Lae
            s80.l5 r0 = new s80.l5
            t80.u r1 = new t80.u
            r1.<init>()
            r0.<init>(r1)
            java.util.List r0 = kotlin.collections.e0.b(r0)
            goto Lb0
        Lae:
            kotlin.collections.q0 r0 = kotlin.collections.q0.f80391a
        Lb0:
            cp.t r1 = new cp.t
            r2 = 14
            r1.<init>(r5, r2)
            r8.f(r1)
            r8.b(r0)
            return
        Lbe:
            s80.n3 r0 = s80.n3.G
            r8.f(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s80.m6.p(l82.e):void");
    }

    public static void q(l82.e eVar, b7 b7Var, boolean z13) {
        Pair pair;
        z6 z6Var = ((j) eVar.f82218a).f111598g;
        b7 b7Var2 = z6Var.f111881a;
        if (b7Var2 == b7Var) {
            return;
        }
        eVar.f(new k1.b0(z6Var, b7Var, eVar, z13, 3));
        s(eVar);
        b7 b7Var3 = ((j) eVar.f82218a).f111598g.f111881a;
        int[] iArr = c6.f111488b;
        int i13 = iArr[b7Var3.ordinal()];
        boolean z14 = i13 == 1 || i13 == 6 || i13 == 7 || i13 == 8;
        b7 b7Var4 = b7.None;
        eVar.d(new y4(z14), new x4(b7Var3 == b7Var4));
        j jVar = (j) eVar.f82218a;
        n6 n6Var = (n6) eVar.f82219b;
        b7 b7Var5 = jVar.f111598g.f111881a;
        int i14 = iArr[b7Var5.ordinal()];
        if (i14 == 1 || i14 == 2) {
            pair = new Pair(Boolean.TRUE, Boolean.valueOf(oe.f.R0(n6Var)));
        } else {
            Boolean bool = Boolean.FALSE;
            pair = new Pair(bool, bool);
        }
        boolean booleanValue = ((Boolean) pair.f80346a).booleanValue();
        boolean booleanValue2 = ((Boolean) pair.f80347b).booleanValue();
        int i15 = iArr[b7Var5.ordinal()];
        eVar.f(new sq.c(1, booleanValue, booleanValue2, i15 == 1 || i15 == 2 || b7Var5 == b7.AddCutoutInstruct));
        p(eVar);
        eVar.h(new mz.c(z6Var, 24));
        if (b7Var2 == b7Var4 || b7Var != b7Var4) {
            return;
        }
        eVar.a(x5.f111848a);
    }

    public static void r(l82.e eVar, boolean z13) {
        eVar.f(new cp.t(z13, 15));
    }

    public static void s(l82.e eVar) {
        n6 n6Var = (n6) eVar.f82219b;
        j jVar = (j) eVar.f82218a;
        b7 b7Var = jVar.f111598g.f111881a;
        boolean Y = kh2.j.Y(jVar.f111592a);
        int[] iArr = c6.f111488b;
        int i13 = iArr[b7Var.ordinal()];
        boolean z13 = i13 == 1 || i13 == 14 || i13 == 15;
        boolean z14 = z13 && iArr[b7Var.ordinal()] == 1;
        eVar.f(new l6(z13 || b7Var == b7.InitialWelcome, z14, z13, n6Var, z14 || b7Var == b7.TipsGoBack || b7Var == b7.Tips, Y));
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        u50.i0 i0Var2;
        n6 vmState = (n6) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        Intrinsics.checkNotNullParameter(vmState, "<this>");
        String str = (String) vmState.f111729u.get("android_curation_collage_composer_top_navigation");
        boolean z13 = v50.a.a(str) || v50.a.b(str);
        w80.x1 x1Var = g2.f111543a;
        if (z13) {
            int i13 = m60.x0.next;
            String[] formatArgs = new String[0];
            Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
            i0Var2 = new u50.k0(i13, new ArrayList(0));
        } else {
            i0Var2 = u50.h0.f120562a;
        }
        w80.x1 e13 = w80.x1.e(x1Var, null, null, null, null, null, i0Var2, false, z13, 95);
        w80.b e14 = w80.b.e(g2.f111544b, false, oe.f.R0(vmState), false, false, false, false, 61);
        h hVar = g2.f111545c;
        boolean z14 = hVar.f111564b;
        hVar.getClass();
        h hVar2 = new h(z13, z14);
        w6 w6Var = g2.f111550h;
        l82.e resultBuilder = l82.d.d(new j(e13, e14, hVar2, w6.e(w6Var, null, oe.f.T0(vmState) ? null : w6Var.f111841b, false, 5), z13, 65009), vmState);
        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
        l82.h0 lens = this.f111679b;
        Intrinsics.checkNotNullParameter(lens, "lens");
        Intrinsics.checkNotNullParameter(lens, "$lens");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        lens.b(resultBuilder);
        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
        l82.h0 lens2 = this.f111680c;
        Intrinsics.checkNotNullParameter(lens2, "lens");
        Intrinsics.checkNotNullParameter(lens2, "$lens");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        lens2.b(resultBuilder);
        b6[] b6VarArr = new b6[2];
        Intrinsics.checkNotNullParameter(vmState, "<this>");
        String str2 = (String) vmState.f111729u.get("android_curation_composer_bypass_image_upload_check");
        b6VarArr[0] = new p4(v50.a.a(str2) || v50.a.b(str2));
        b6VarArr[1] = r4.f111783a;
        ArrayList l13 = kotlin.collections.f0.l(b6VarArr);
        String str3 = vmState.f111709a;
        if (!kotlin.text.z.j(str3)) {
            l13.add(new i5(str3));
        } else {
            String str4 = vmState.f111711c;
            if (true ^ kotlin.text.z.j(str4)) {
                l13.add(new j5(str4));
            } else {
                l13.add(u5.f111815a);
            }
        }
        if (vmState.f111727s) {
            l13.add(f5.f111535a);
        }
        resultBuilder.b(l13);
        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
        resultBuilder.a(d.f111490a);
        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
        resultBuilder.a(f.f111524a);
        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
        resultBuilder.a(a.f111459a);
        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
        resultBuilder.a(c.f111475a);
        return resultBuilder.e();
    }

    @Override // l82.d
    public final l82.c0 f(u50.s sVar, u50.o oVar, l82.i0 i0Var, l82.e resultBuilder) {
        a2 event = (a2) sVar;
        j priorDisplayState = (j) oVar;
        n6 priorVMState = (n6) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        l(event, resultBuilder);
        return resultBuilder.e();
    }

    public final void i(CutoutModel cutoutModel, sa0.d0 d0Var, CutoutPickerOrigin cutoutPickerOrigin, l82.e eVar) {
        l82.h h4Var;
        String value = ((n6) eVar.f82219b).f111717i;
        if (((j) eVar.f82218a).f111598g.f111881a == b7.AddCutoutInstruct) {
            q(eVar, b7.ReorderCutoutWelcome, true);
        }
        int i13 = d0Var == null ? -1 : c6.f111487a[d0Var.ordinal()];
        h32.f1 f1Var = i13 != 1 ? i13 != 2 ? (value == null || value.length() == 0) ? h32.f1.COLLAGE_COMPOSER_CUTOUT_ADDED : h32.f1.COLLAGE_COMPOSER_ITEM_SWAPPED : h32.f1.COLLAGE_COMPOSER_USER_PHOTO_ADDED : h32.f1.COLLAGE_COMPOSER_CAMERA_ADDED;
        if (value == null || value.length() == 0) {
            h4Var = new h4(cutoutModel);
        } else {
            int i14 = r72.a2.f106437b;
            Intrinsics.checkNotNullParameter(value, "value");
            h4Var = new t4(cutoutModel, value);
        }
        eVar.a(h4Var);
        g(this, eVar, null, null, (f1Var != h32.f1.COLLAGE_COMPOSER_CUTOUT_ADDED || cutoutPickerOrigin == null) ? null : ya0.b.a(cutoutPickerOrigin), f1Var, kh2.d.j(((n6) eVar.f82219b).f111709a, null), 3);
    }

    public final l82.e j(g1 g1Var, l82.e eVar) {
        eVar.h(n3.B);
        eVar.a(l4.f111661a);
        Iterator it = g1Var.f111542a.iterator();
        while (it.hasNext()) {
            l((a2) it.next(), eVar);
        }
        return eVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final l82.e l(a2 a2Var, l82.e resultBuilder) {
        Object obj;
        Object obj2;
        List list;
        Object obj3;
        List list2;
        if (a2Var instanceof d1) {
            ll1.d event = ((d1) a2Var).f111492a;
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            l82.h0 lens = this.f111679b;
            Intrinsics.checkNotNullParameter(lens, "lens");
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(lens, "$lens");
            Intrinsics.checkNotNullParameter(event, "$event");
            Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
            lens.a(event, resultBuilder);
        } else if (a2Var instanceof g1) {
            j((g1) a2Var, resultBuilder);
        } else if (a2Var instanceof i1) {
            resultBuilder.a(k4.f111636a);
        } else if (a2Var instanceof c1) {
            resultBuilder.h(n3.f111704y);
            resultBuilder.a(new a5(((c1) a2Var).f111477a));
        } else if (a2Var instanceof b1) {
            resultBuilder.a(new g5(((b1) a2Var).f111470a ? qa0.f.collage_remix_load_failed : qa0.f.collage_draft_load_failed));
        } else if (a2Var instanceof o0) {
            o0 o0Var = (o0) a2Var;
            resultBuilder.h(new mz.c(o0Var, 19));
            p(resultBuilder);
            resultBuilder.a(new i5(o0Var.f111733a));
        } else if (a2Var instanceof s1) {
            s1 s1Var = (s1) a2Var;
            resultBuilder.h(new mz.c(s1Var, 21));
            p(resultBuilder);
            j5 j5Var = new j5(s1Var.f111789a);
            n6 n6Var = (n6) resultBuilder.f82219b;
            Intrinsics.checkNotNullParameter(n6Var, "<this>");
            String id3 = s1Var.f111789a;
            Intrinsics.checkNotNullParameter(id3, "id");
            resultBuilder.d(j5Var, kh2.c3.M(n6Var, null, null, null, id3, h32.f1.COLLAGE_COMPOSER_COLLAGE_REMIXED, null, 39));
        } else {
            boolean z13 = a2Var instanceof t1;
            b bVar = b.f111468a;
            if (z13) {
                resultBuilder.h(new mz.c((t1) a2Var, 22));
                resultBuilder.d(new q5(kg.t.R0(((j) resultBuilder.f82218a).f111592a), oe.f.S0((n6) resultBuilder.f82219b), false, 4));
                if (oe.f.o((n6) resultBuilder.f82219b, "control_bottomsheet") || oe.f.p((n6) resultBuilder.f82219b, "enabled_bottomsheet")) {
                    Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                    resultBuilder.a(bVar);
                }
            } else {
                if (a2Var instanceof h1) {
                    h1 h1Var = (h1) a2Var;
                    b7 b7Var = ((j) resultBuilder.f82218a).f111598g.f111881a;
                    boolean R0 = oe.f.R0((n6) resultBuilder.f82219b);
                    l62.w wVar = h1Var.f111566a;
                    if (wVar instanceof l62.g) {
                        if (!((j) resultBuilder.f82218a).f111596e.f111806b && (b7Var == b7.None || b7Var == b7.ChangeBackgroundColorInstruct)) {
                            o(resultBuilder, true);
                            if (b7Var == b7.ChangeBackgroundColorInstruct) {
                                q(resultBuilder, b7.ChangeBackgroundColorActive, false);
                            }
                        }
                    } else if (wVar instanceof l62.h) {
                        boolean z14 = ((j) resultBuilder.f82218a).f111596e.f111806b;
                        boolean z15 = ((n6) resultBuilder.f82219b).f111726r;
                        if (b7Var == b7.None && !z14 && z15) {
                            PointF pointF = ((l62.h) wVar).f81641a;
                            resultBuilder.f(new k6(pointF.x, pointF.y, true));
                        }
                    } else if (wVar instanceof l62.m) {
                        if (R0) {
                            l62.m mVar = (l62.m) wVar;
                            resultBuilder.d(new r5(mVar.f81661a, false));
                            g(this, resultBuilder, h32.u0.COLLAGE_COMPOSER_ITEM, null, null, h32.f1.TAP, kh2.d.j(((n6) resultBuilder.f82219b).f111709a, r72.a2.a(mVar.f81661a)), 6);
                        }
                    } else if (wVar instanceof l62.n) {
                        resultBuilder.f(new mz.c(new w80.f1(), 23));
                        r(resultBuilder, false);
                        resultBuilder.h(new g6(wVar, 0));
                    } else if (wVar instanceof l62.o) {
                        resultBuilder.f(new mz.c(null, 23));
                        r(resultBuilder, true);
                    } else if (wVar instanceof l62.q) {
                        resultBuilder.h(new g6(wVar, 1));
                        r(resultBuilder, false);
                        g(this, resultBuilder, null, null, null, h32.f1.COLLAGE_COMPOSER_LAYER_REORDER, kh2.d.j(((n6) resultBuilder.f82219b).f111709a, null), 7);
                        if (b7Var == b7.ReorderCutoutInstruct || b7Var == b7.ReorderCutoutInstructTryAgain) {
                            q(resultBuilder, b7.ReorderCutoutInstructWhilePressing, false);
                        }
                    } else if (wVar instanceof l62.r) {
                        Integer num = ((n6) resultBuilder.f82219b).f111719k;
                        r10 = num == null || num.intValue() != ((l62.r) wVar).f81687b;
                        Pair pair = r10 ? new Pair(b7.ChangeBackgroundColorWelcome, null) : new Pair(b7.ReorderCutoutInstructTryAgain, null);
                        b7 b7Var2 = (b7) pair.f80346a;
                        Void r13 = (Void) pair.f80347b;
                        resultBuilder.h(n3.f111703x);
                        r(resultBuilder, true);
                        if (b7Var == b7.ReorderCutoutInstructWhilePressing) {
                            q(resultBuilder, b7Var2, r10);
                            resultBuilder.b(kotlin.collections.f0.k(r13));
                        }
                    } else {
                        boolean z16 = wVar instanceof l62.i;
                        if (z16 || (wVar instanceof l62.j)) {
                            if (((n6) resultBuilder.f82219b).f111719k != null) {
                                Pair pair2 = z16 ? new Pair(h32.u0.COLLAGE_COMPOSER_ITEM_DELETE, r72.a2.a(((l62.i) wVar).f81642a)) : wVar instanceof l62.j ? new Pair(h32.u0.COLLAGE_COMPOSER_ITEM_DUPLICATE, r72.a2.a(((l62.j) wVar).f81644a)) : new Pair(null, null);
                                g(this, resultBuilder, (h32.u0) pair2.f80346a, null, null, h32.f1.LONG_PRESS, kh2.d.j(((n6) resultBuilder.f82219b).f111709a, (String) pair2.f80347b), 6);
                            }
                        } else if (wVar instanceof l62.t) {
                            Integer num2 = ((l62.t) wVar).f81690b;
                            if (num2 == null) {
                                boolean z17 = ((j) resultBuilder.f82218a).f111609r;
                                resultBuilder.f(new mz.c(null, 23));
                                r(resultBuilder, z17);
                            } else {
                                p62.a aVar = (p62.a) g2.f111554l.get(num2);
                                if (aVar != null) {
                                    w80.e1 e1Var = new w80.e1(aVar.f98925b);
                                    boolean z18 = ((j) resultBuilder.f82218a).f111609r;
                                    resultBuilder.f(new mz.c(e1Var, 23));
                                    r(resultBuilder, z18);
                                }
                            }
                        }
                    }
                    resultBuilder.a(new o4(h1Var.f111566a));
                } else if (a2Var instanceof k) {
                    h(resultBuilder);
                } else if (a2Var instanceof m0) {
                    m0 m0Var = (m0) a2Var;
                    i(m0Var.f111670a, m0Var.f111671b, m0Var.f111672c, resultBuilder);
                } else if (a2Var instanceof e1) {
                    e1 e1Var2 = (e1) a2Var;
                    resultBuilder.a(new p5(e1Var2.f111507a, e1Var2.f111508b));
                } else if (a2Var instanceof x) {
                    x xVar = (x) a2Var;
                    if (xVar instanceof t) {
                        String str = ((t) xVar).f111797a.f81612d;
                        resultBuilder.f(new f6(xVar, 0));
                        m(resultBuilder, str, true);
                        s(resultBuilder);
                    } else if (xVar instanceof w) {
                        resultBuilder.a(new r5(((w) xVar).f111834a.f106721a, true));
                        g(this, resultBuilder, null, null, null, h32.f1.COLLAGE_COMPOSER_TEXT_ADDED, kh2.d.j(((n6) resultBuilder.f82219b).f111709a, null), 7);
                    } else if (xVar instanceof s) {
                        resultBuilder.h(new f6(xVar, 1));
                        s(resultBuilder);
                        p(resultBuilder);
                    } else if (xVar instanceof v) {
                        v vVar = (v) xVar;
                        if (vVar.f111817a) {
                            n6 n6Var2 = (n6) resultBuilder.f82219b;
                            List list3 = n6Var2.f111716h;
                            if (list3 == null) {
                                list3 = kotlin.collections.q0.f80391a;
                            }
                            String str2 = vVar.f111818b;
                            if (str2 != null) {
                                zy.f0 U0 = kh2.p2.U0(n6Var2.f111709a.length() == 0 && n6Var2.f111713e, str2, n6Var2.f111725q.f143086a, n6Var2.f111728t);
                                m5 m5Var = U0 != null ? new m5(U0) : null;
                                if (m5Var != null) {
                                    resultBuilder.a(m5Var);
                                }
                            }
                            resultBuilder.b(list3);
                            resultBuilder.h(n3.f111696q);
                        }
                        resultBuilder.f(n3.f111697r);
                        resultBuilder.h(n3.f111698s);
                    } else if (xVar instanceof r) {
                        resultBuilder.h(n3.f111699t);
                    } else {
                        if (!(xVar instanceof u)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        resultBuilder.f(n3.f111700u);
                    }
                } else {
                    int i13 = 13;
                    if (a2Var instanceof w0) {
                        w0 w0Var = (w0) a2Var;
                        if (w0Var instanceof t0) {
                            o(resultBuilder, true);
                        } else if (w0Var instanceof s0) {
                            resultBuilder.f(new cp.t(r10, i13));
                            r(resultBuilder, true);
                            p(resultBuilder);
                        } else if (w0Var instanceof r0) {
                            resultBuilder.f(new mz.c(w0Var, 20));
                        } else if (w0Var instanceof u0) {
                            resultBuilder.f(new cp.t(r10, i13));
                            r(resultBuilder, true);
                            if (!((u0) w0Var).f111808a) {
                                p(resultBuilder);
                            }
                        } else {
                            if (!(w0Var instanceof v0)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            v0 v0Var = (v0) w0Var;
                            resultBuilder.d(new i4(v0Var.f111819a, v0Var.f111820b, v0Var.f111821c));
                            g(this, resultBuilder, null, null, null, h32.f1.COLLAGE_COMPOSER_DRAWING_ADDED, kh2.d.j(((n6) resultBuilder.f82219b).f111709a, null), 7);
                        }
                    } else if (a2Var instanceof z1) {
                        z1 z1Var = (z1) a2Var;
                        if (z1Var instanceof u1) {
                            h(resultBuilder);
                        } else if (z1Var instanceof y1) {
                            resultBuilder.a(z4.f111880a);
                            g(this, resultBuilder, h32.u0.UNDO_BUTTON, null, null, null, null, 30);
                        } else if (z1Var instanceof x1) {
                            resultBuilder.a(s4.f111794a);
                        } else if (z1Var instanceof w1) {
                            k(resultBuilder, kotlin.collections.f0.k(new s5(((n6) resultBuilder.f82219b).f111710b)), l7.saving_overlay_label);
                            g(this, resultBuilder, h32.u0.NEXT_BUTTON, null, null, null, kh2.d.j(((n6) resultBuilder.f82219b).f111709a, null), 14);
                        } else {
                            if (!(z1Var instanceof v1)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            b7 b7Var3 = ((j) resultBuilder.f82218a).f111598g.f111881a;
                            if (b7Var3 == b7.Tips || b7Var3 == b7.TipsGoBack) {
                                q(resultBuilder, b7.None, false);
                            }
                            n6 n6Var3 = (n6) resultBuilder.f82219b;
                            Intrinsics.checkNotNullParameter(n6Var3, "<this>");
                            String str3 = (String) n6Var3.f111729u.get("android_curation_duplicate_collage");
                            boolean z19 = v50.a.a(str3) || v50.a.b(str3);
                            boolean isEmpty = ((j) resultBuilder.f82218a).f111592a.f81609a.isEmpty();
                            yk2.o oVar = new yk2.o();
                            oVar.addAll(s6.f111796a);
                            if (!isEmpty) {
                                yk2.o oVar2 = new yk2.o();
                                oVar2.add(r6.StartNewCollage);
                                if (z19) {
                                    oVar2.add(r6.DuplicateCollage);
                                }
                                oVar2.add(r6.SaveAndExit);
                                oVar.addAll(kotlin.collections.g1.a(oVar2));
                            }
                            resultBuilder.d(new c5(kotlin.collections.g1.a(oVar)));
                        }
                    } else if (a2Var instanceof q) {
                        q qVar = (q) a2Var;
                        resultBuilder.h(n3.f111694o);
                        if (((j) resultBuilder.f82218a).f111598g.f111881a == b7.InitialWelcome) {
                            q(resultBuilder, b7.None, false);
                        }
                        if (qVar instanceof n) {
                            resultBuilder.f(new cp.t(r3, i13));
                            r(resultBuilder, false);
                            resultBuilder.f(n3.f111695p);
                            g(this, resultBuilder, h32.u0.COLLAGE_COMPOSER_DRAWING_TOOL_BUTTON, null, null, null, null, 30);
                        } else if (qVar instanceof l) {
                            List R02 = kg.t.R0(((j) resultBuilder.f82218a).f111592a);
                            boolean o13 = oe.f.o((n6) resultBuilder.f82219b, "control_bottomsheet");
                            boolean p13 = oe.f.p((n6) resultBuilder.f82219b, "enabled_bottomsheet");
                            resultBuilder.d(new q5(R02, oe.f.S0((n6) resultBuilder.f82219b), false, 4));
                            if (o13 || p13) {
                                Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                                resultBuilder.a(bVar);
                            }
                            g(this, resultBuilder, h32.u0.COLLAGE_COMPOSER_CUTOUT_PICKER_BUTTON, null, null, null, null, 30);
                        } else if (qVar instanceof p) {
                            resultBuilder.a(j4.f111629a);
                            g(this, resultBuilder, h32.u0.COLLAGE_COMPOSER_TEXT_TOOL_BUTTON, null, null, null, null, 30);
                        } else if (qVar instanceof m) {
                            resultBuilder.a(o5.f111739a);
                            g(this, resultBuilder, h32.u0.COLLAGE_COMPOSER_CAMERA_TOOL_BUTTON, null, null, null, null, 30);
                        } else {
                            if (!(qVar instanceof o)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            g(this, resultBuilder, h32.u0.COLLAGE_COMPOSER_ASSET_PICKER_TOOL_BUTTON, null, null, null, null, 30);
                        }
                    } else if (a2Var instanceof k0) {
                        k0 k0Var = (k0) a2Var;
                        j jVar = (j) resultBuilder.f82218a;
                        if (!jVar.f111600i.f111833c) {
                            boolean z23 = k0Var instanceof h0;
                            z6 z6Var = jVar.f111598g;
                            if (z23) {
                                String str4 = ((n6) resultBuilder.f82219b).f111720l;
                                b7 b7Var4 = z6Var.f111881a;
                                o(resultBuilder, false);
                                m(resultBuilder, str4, false);
                                p(resultBuilder);
                                if (b7Var4 == b7.ChangeBackgroundColorActive) {
                                    q(resultBuilder, b7.ChangeBackgroundColorComplete, true);
                                    b7 b7Var5 = b7.Tips;
                                    zn2.a aVar2 = zn2.b.f142311b;
                                    resultBuilder.a(new y5(b7Var5, dl2.b.P2(5, zn2.d.SECONDS)));
                                }
                            } else if (k0Var instanceof i0) {
                                b7 b7Var6 = z6Var.f111881a;
                                String str5 = jVar.f111592a.f81612d;
                                o(resultBuilder, false);
                                p(resultBuilder);
                                resultBuilder.d(new w4(str5));
                                if (b7Var6 == b7.ChangeBackgroundColorActive) {
                                    q(resultBuilder, b7.ChangeBackgroundColorComplete, true);
                                    b7 b7Var7 = b7.Tips;
                                    zn2.a aVar3 = zn2.b.f142311b;
                                    resultBuilder.a(new y5(b7Var7, dl2.b.P2(5, zn2.d.SECONDS)));
                                }
                            } else if (k0Var instanceof g0) {
                                m(resultBuilder, kotlin.jvm.internal.r.s0(((g0) k0Var).f111541a), false);
                            } else if (!(k0Var instanceof j0)) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if ((k0Var instanceof h0) || Intrinsics.d(k0Var, i0.f111575a)) {
                            o(resultBuilder, false);
                        } else if (k0Var instanceof g0) {
                            resultBuilder.f(new rq.l2(kotlin.jvm.internal.r.s0(((g0) k0Var).f111541a), 24));
                            o(resultBuilder, false);
                        } else if (!(k0Var instanceof j0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (!(a2Var instanceof q0)) {
                        boolean z24 = a2Var instanceof f0;
                        m4 m4Var = m4.f111677a;
                        e5 e5Var = e5.f111520a;
                        n3 n3Var = n3.f111692m;
                        if (z24) {
                            f0 f0Var = (f0) a2Var;
                            if (f0Var instanceof c0) {
                                resultBuilder.f(n3Var);
                                resultBuilder.a(new w5(b7.RevisitWelcome));
                                g(this, resultBuilder, h32.u0.COLLAGE_COMPOSER_NEXT_TRAY_HOW_COLLAGING_WORKS, null, null, null, null, 30);
                            } else if (f0Var instanceof a0) {
                                resultBuilder.f(n3.f111701v);
                            } else if (f0Var instanceof b0) {
                                k(resultBuilder, kotlin.collections.f0.j(u4.f111814a, new g5(l7.collage_duplicated_toast)), l7.duplicating_overlay_label);
                                g(this, resultBuilder, h32.u0.COLLAGE_COMPOSER_NEXT_TRAY_DUPLICATE_COLLAGE, null, null, null, null, 30);
                            } else if (f0Var instanceof e0) {
                                k(resultBuilder, kotlin.collections.e0.b(m4Var), l7.saving_overlay_label);
                                g(this, resultBuilder, h32.u0.COLLAGE_COMPOSER_NEXT_TRAY_START_NEW_COLLAGE, null, null, null, null, 30);
                                resultBuilder.h(n3.f111702w);
                            } else {
                                if (!(f0Var instanceof d0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                b6[] elements = {m4Var, new n5(true), e5Var};
                                Intrinsics.checkNotNullParameter(elements, "elements");
                                k(resultBuilder, kotlin.collections.c0.A(elements), l7.saving_overlay_label);
                                g(this, resultBuilder, h32.u0.COLLAGE_COMPOSER_NEXT_TRAY_SAVE_AND_EXIT, null, null, null, null, 30);
                            }
                        } else if (a2Var instanceof r1) {
                            r1 r1Var = (r1) a2Var;
                            j jVar2 = (j) resultBuilder.f82218a;
                            List list4 = jVar2.f111592a.f81609a;
                            b7 b7Var8 = jVar2.f111598g.f111881a;
                            Pair pair3 = new Pair(b7Var8, null);
                            if (r1Var instanceof m1) {
                                resultBuilder.f(new h6(r1Var, 0));
                            } else if (r1Var instanceof o1) {
                                resultBuilder.h(new h6(r1Var, 1));
                                resultBuilder.f(n3.C);
                                q(resultBuilder, ((o1) r1Var).f111734a, false);
                            } else if (r1Var instanceof k1) {
                                boolean S0 = oe.f.S0((n6) resultBuilder.f82219b);
                                n6 n6Var4 = (n6) resultBuilder.f82219b;
                                boolean z25 = n6Var4.f111724p;
                                boolean o14 = oe.f.o(n6Var4, "control_pullup");
                                boolean p14 = oe.f.p((n6) resultBuilder.f82219b, "enabled_pullup");
                                if (S0 && !z25) {
                                    resultBuilder.d(new q5(null, true, true, 1));
                                }
                                if (o14 || p14) {
                                    Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                                    resultBuilder.a(bVar);
                                }
                            } else if (r1Var instanceof j1) {
                                resultBuilder.f(n3.D);
                            } else if (r1Var instanceof n1) {
                                switch (c6.f111488b[b7Var8.ordinal()]) {
                                    case 1:
                                    case 4:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 13:
                                        b7 b7Var9 = (b7) pair3.f80346a;
                                        b6 b6Var = (b6) pair3.f80347b;
                                        q(resultBuilder, b7Var9, false);
                                        resultBuilder.b(kotlin.collections.f0.k(b6Var));
                                        break;
                                    case 2:
                                        pair3 = new Pair(b7.AddCutoutInstruct, null);
                                        b7 b7Var92 = (b7) pair3.f80346a;
                                        b6 b6Var2 = (b6) pair3.f80347b;
                                        q(resultBuilder, b7Var92, false);
                                        resultBuilder.b(kotlin.collections.f0.k(b6Var2));
                                        break;
                                    case 3:
                                        pair3 = new Pair(b7.AddCutoutInstruct, null);
                                        b7 b7Var922 = (b7) pair3.f80346a;
                                        b6 b6Var22 = (b6) pair3.f80347b;
                                        q(resultBuilder, b7Var922, false);
                                        resultBuilder.b(kotlin.collections.f0.k(b6Var22));
                                        break;
                                    case 5:
                                        if (list4.size() == 1) {
                                            n6 n6Var5 = (n6) resultBuilder.f82219b;
                                            Intrinsics.checkNotNullParameter(n6Var5, "<this>");
                                            y6 y6Var = (y6) n6Var5.f111721m.get(b7.ReorderCutoutWelcome);
                                            CutoutModel cutoutModel = (y6Var == null || (list2 = y6Var.f111868i) == null) ? null : (CutoutModel) CollectionsKt.firstOrNull(list2);
                                            obj3 = cutoutModel != null ? new h4(cutoutModel) : new v5(z80.t.Background);
                                        } else {
                                            obj3 = null;
                                        }
                                        pair3 = new Pair(b7.ReorderCutoutInstruct, obj3);
                                        b7 b7Var9222 = (b7) pair3.f80346a;
                                        b6 b6Var222 = (b6) pair3.f80347b;
                                        q(resultBuilder, b7Var9222, false);
                                        resultBuilder.b(kotlin.collections.f0.k(b6Var222));
                                        break;
                                    case 9:
                                        pair3 = new Pair(b7.ChangeBackgroundColorInstruct, null);
                                        b7 b7Var92222 = (b7) pair3.f80346a;
                                        b6 b6Var2222 = (b6) pair3.f80347b;
                                        q(resultBuilder, b7Var92222, false);
                                        resultBuilder.b(kotlin.collections.f0.k(b6Var2222));
                                        break;
                                    case 14:
                                        pair3 = new Pair(b7.None, null);
                                        b7 b7Var922222 = (b7) pair3.f80346a;
                                        b6 b6Var22222 = (b6) pair3.f80347b;
                                        q(resultBuilder, b7Var922222, false);
                                        resultBuilder.b(kotlin.collections.f0.k(b6Var22222));
                                        break;
                                    case 15:
                                        pair3 = new Pair(b7.None, null);
                                        b7 b7Var9222222 = (b7) pair3.f80346a;
                                        b6 b6Var222222 = (b6) pair3.f80347b;
                                        q(resultBuilder, b7Var9222222, false);
                                        resultBuilder.b(kotlin.collections.f0.k(b6Var222222));
                                        break;
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                            } else if (r1Var instanceof p1) {
                                switch (c6.f111488b[b7Var8.ordinal()]) {
                                    case 1:
                                    case 13:
                                    case 14:
                                        b7 b7Var10 = (b7) pair3.f80346a;
                                        b6 b6Var3 = (b6) pair3.f80347b;
                                        q(resultBuilder, b7Var10, false);
                                        resultBuilder.b(kotlin.collections.f0.k(b6Var3));
                                        break;
                                    case 2:
                                        pair3 = new Pair(b7.TipsGoBack, null);
                                        b7 b7Var102 = (b7) pair3.f80346a;
                                        b6 b6Var32 = (b6) pair3.f80347b;
                                        q(resultBuilder, b7Var102, false);
                                        resultBuilder.b(kotlin.collections.f0.k(b6Var32));
                                        break;
                                    case 3:
                                        pair3 = new Pair(b7.Tips, null);
                                        b7 b7Var1022 = (b7) pair3.f80346a;
                                        b6 b6Var322 = (b6) pair3.f80347b;
                                        q(resultBuilder, b7Var1022, false);
                                        resultBuilder.b(kotlin.collections.f0.k(b6Var322));
                                        break;
                                    case 4:
                                        if (list4.isEmpty()) {
                                            n6 n6Var6 = (n6) resultBuilder.f82219b;
                                            Intrinsics.checkNotNullParameter(n6Var6, "<this>");
                                            y6 y6Var2 = (y6) n6Var6.f111721m.get(b7.ReorderCutoutWelcome);
                                            CutoutModel cutoutModel2 = (y6Var2 == null || (list = y6Var2.f111867h) == null) ? null : (CutoutModel) CollectionsKt.firstOrNull(list);
                                            obj2 = cutoutModel2 != null ? new h4(cutoutModel2) : new v5(z80.t.Foreground);
                                        } else {
                                            obj2 = null;
                                        }
                                        pair3 = new Pair(b7.ReorderCutoutWelcome, obj2);
                                        b7 b7Var10222 = (b7) pair3.f80346a;
                                        b6 b6Var3222 = (b6) pair3.f80347b;
                                        q(resultBuilder, b7Var10222, false);
                                        resultBuilder.b(kotlin.collections.f0.k(b6Var3222));
                                        break;
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                        pair3 = new Pair(b7.ChangeBackgroundColorWelcome, null);
                                        b7 b7Var102222 = (b7) pair3.f80346a;
                                        b6 b6Var32222 = (b6) pair3.f80347b;
                                        q(resultBuilder, b7Var102222, false);
                                        resultBuilder.b(kotlin.collections.f0.k(b6Var32222));
                                        break;
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                        pair3 = new Pair(b7.Tips, null);
                                        b7 b7Var1022222 = (b7) pair3.f80346a;
                                        b6 b6Var322222 = (b6) pair3.f80347b;
                                        q(resultBuilder, b7Var1022222, false);
                                        resultBuilder.b(kotlin.collections.f0.k(b6Var322222));
                                        break;
                                    case 15:
                                        pair3 = new Pair(((n6) resultBuilder.f82219b).f111722n, null);
                                        b7 b7Var10222222 = (b7) pair3.f80346a;
                                        b6 b6Var3222222 = (b6) pair3.f80347b;
                                        q(resultBuilder, b7Var10222222, false);
                                        resultBuilder.b(kotlin.collections.f0.k(b6Var3222222));
                                        break;
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                            } else if (r1Var instanceof l1) {
                                i(((l1) r1Var).f111642a, null, null, resultBuilder);
                            } else {
                                if (!(r1Var instanceof q1)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                q(resultBuilder, ((q1) r1Var).f111770a, false);
                            }
                        } else if (a2Var instanceof l0) {
                            zb0.f fVar = ((l0) a2Var).f111641a;
                            if (fVar instanceof zb0.b) {
                                resultBuilder.d(m4Var, new n5(false));
                                g(this, resultBuilder, h32.u0.DISCARD_CHANGES_BUTTON, null, null, null, null, 30);
                            } else if (fVar instanceof zb0.c) {
                                b6[] elements2 = {m4Var, new n5(true), e5Var};
                                Intrinsics.checkNotNullParameter(elements2, "elements");
                                k(resultBuilder, kotlin.collections.c0.A(elements2), l7.saving_overlay_label);
                                g(this, resultBuilder, h32.u0.SAVE_CHANGES_BUTTON, null, null, null, null, 30);
                            }
                        } else if (a2Var instanceof a1) {
                            a1 a1Var = (a1) a2Var;
                            if (a1Var instanceof y0) {
                                y0 y0Var = (y0) a1Var;
                                t80.h event2 = y0Var.f111852a;
                                Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                                l82.h0 lens2 = this.f111680c;
                                Intrinsics.checkNotNullParameter(lens2, "lens");
                                Intrinsics.checkNotNullParameter(event2, "event");
                                Intrinsics.checkNotNullParameter(lens2, "$lens");
                                Intrinsics.checkNotNullParameter(event2, "$event");
                                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                                lens2.a(event2, resultBuilder);
                                t80.h hVar = y0Var.f111852a;
                                if (hVar instanceof t80.f) {
                                    p(resultBuilder);
                                } else {
                                    u80.j jVar3 = t80.t.f116737a;
                                    Intrinsics.checkNotNullParameter(hVar, "<this>");
                                    if (hVar instanceof t80.e) {
                                        t80.b bVar2 = t80.c.Companion;
                                        int i14 = ((t80.e) hVar).f116689a;
                                        bVar2.getClass();
                                        Iterator<E> it = t80.c.getEntries().iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                obj = null;
                                                break;
                                            }
                                            Object next = it.next();
                                            if (((t80.c) next).ordinal() == i14) {
                                                obj = next;
                                                break;
                                            }
                                        }
                                        if (((t80.c) obj) == t80.c.Onboarding) {
                                            resultBuilder.f(n3Var);
                                            resultBuilder.a(new w5(b7.RevisitWelcome));
                                        }
                                    }
                                }
                            } else {
                                if (!(a1Var instanceof z0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                resultBuilder.f(n3.A);
                                g(this, resultBuilder, h32.u0.DISMISS_BUTTON, h32.g0.COLLAGE_DRAFTS_LARGE_PROMPT, null, null, null, 28);
                            }
                        } else if (a2Var instanceof n0) {
                            ta0.p pVar = ((n0) a2Var).f111683a;
                            if (Intrinsics.d(pVar, ta0.o.f116891a)) {
                                resultBuilder.d(new g5(qa0.f.collage_download_success));
                            } else if (pVar instanceof ta0.m) {
                                resultBuilder.d(new g5(((ta0.m) pVar).f116889a));
                            }
                        } else if (a2Var instanceof y) {
                            n(this, resultBuilder);
                            resultBuilder.a(q4.f111773a);
                        } else if (a2Var instanceof z) {
                            n(this, resultBuilder);
                        } else if (a2Var instanceof x0) {
                            resultBuilder.f(n3.E);
                        } else {
                            if (!(a2Var instanceof f1)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            resultBuilder.d(new g5(l7.toast_disabled_media_app));
                        }
                    } else {
                        if (!(((q0) a2Var) instanceof p0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        String str6 = ((n6) resultBuilder.f82219b).f111718j;
                        if (str6 != null) {
                            resultBuilder.h(n3.f111705z);
                            resultBuilder.a(new n4(str6));
                        }
                    }
                }
            }
        }
        return resultBuilder;
    }
}
