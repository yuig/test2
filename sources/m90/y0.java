package m90;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.hi0;
import com.pinterest.collagesCoreLibrary.model.CutoutPickerOrigin;
import com.pinterest.collagesCoreLibrary.model.CutoutPickerPage;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.shuffles.core.ui.model.BitmapMaskModel;
import com.pinterest.shuffles.core.ui.model.CutoutModel;
import com.pinterest.shuffles.core.ui.model.MaskModel;
import kh2.g3;
import kh2.k3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import r72.a2;

/* loaded from: classes5.dex */
public final class y0 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final l82.h0 f86717b;

    /* renamed from: c, reason: collision with root package name */
    public final l82.h0 f86718c;

    public y0(lt.j pinalyticsStateTransformer, o82.i0 multiSectionStateTransformer) {
        Intrinsics.checkNotNullParameter(pinalyticsStateTransformer, "pinalyticsStateTransformer");
        Intrinsics.checkNotNullParameter(multiSectionStateTransformer, "multiSectionStateTransformer");
        this.f86717b = b(pinalyticsStateTransformer, new kotlin.jvm.internal.d0() { // from class: m90.w0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((b) obj).f86630g;
            }
        }, new kotlin.jvm.internal.d0() { // from class: m90.x0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((a1) obj).f86622e;
            }
        }, v.f86707l);
        this.f86718c = b(multiSectionStateTransformer, new kotlin.jvm.internal.d0() { // from class: m90.u0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((b) obj).f86626c;
            }
        }, new kotlin.jvm.internal.d0() { // from class: m90.v0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((a1) obj).f86621d;
            }
        }, v.f86706k);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    @Override // l82.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final l82.c0 c(l82.i0 r12) {
        /*
            r11 = this;
            m90.a1 r12 = (m90.a1) r12
            java.lang.String r0 = "vmState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            m90.e0 r0 = r12.f86618a
            boolean r1 = r0 instanceof m90.b0
            u50.h0 r2 = u50.h0.f120562a
            if (r1 == 0) goto L13
            m90.c1 r0 = m90.c1.f86641a
        L11:
            r5 = r0
            goto L2c
        L13:
            boolean r1 = r0 instanceof m90.d0
            if (r1 == 0) goto L26
            m90.d1 r1 = new m90.d1
            m90.d0 r0 = (m90.d0) r0
            java.lang.String r0 = r0.f86643a
            u50.f0 r0 = bs1.c.h2(r0)
            r1.<init>(r0)
            r5 = r1
            goto L2c
        L26:
            m90.d1 r0 = new m90.d1
            r0.<init>(r2)
            goto L11
        L2c:
            m90.e0 r0 = r12.f86618a
            boolean r1 = r0 instanceof m90.d0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L36
        L34:
            r7 = r4
            goto L3c
        L36:
            boolean r1 = r0 instanceof m90.b0
            if (r1 == 0) goto L3b
            goto L34
        L3b:
            r7 = r3
        L3c:
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
            java.lang.String r6 = "android_curation_collage_composer_drawer_pullup"
            java.util.Map r8 = r12.f86623f
            java.lang.Object r6 = r8.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            boolean r8 = v50.a.a(r6)
            if (r8 != 0) goto L57
            boolean r6 = v50.a.b(r6)
            if (r6 == 0) goto L58
        L57:
            r3 = r4
        L58:
            r8 = r3 ^ 1
            boolean r3 = r0 instanceof m90.b0
            if (r3 == 0) goto L66
            m90.b0 r0 = (m90.b0) r0
            com.pinterest.collagesCoreLibrary.model.CutoutPickerPage r0 = r0.f86631a
            u50.i0 r2 = r0.a()
        L66:
            r4 = r2
            m90.b r0 = new m90.b
            o82.a0 r6 = new o82.a0
            r6.<init>()
            zy.a0 r10 = new zy.a0
            r10.<init>()
            boolean r9 = r12.f86620c
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            l82.e r12 = l82.d.d(r0, r12)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
            l82.h0 r0 = r11.f86717b
            java.lang.String r2 = "lens"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r3 = "$lens"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r4 = "resultBuilder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r4)
            r0.b(r12)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
            l82.h0 r0 = r11.f86718c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r4)
            r0.b(r12)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
            m90.a r0 = m90.a.f86616a
            r12.a(r0)
            l82.c0 r12 = r12.e()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: m90.y0.c(l82.i0):l82.c0");
    }

    @Override // l82.d
    public final l82.c0 f(u50.s sVar, u50.o oVar, l82.i0 i0Var, l82.e resultBuilder) {
        CutoutPickerOrigin cutoutPickerOrigin;
        f30 u13;
        wa0.c W;
        m event = (m) sVar;
        b priorDisplayState = (b) oVar;
        a1 priorVMState = (a1) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (event instanceof g) {
            ll1.d event2 = ((g) event).f86651a;
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            l82.h0 lens = this.f86717b;
            Intrinsics.checkNotNullParameter(lens, "lens");
            Intrinsics.checkNotNullParameter(event2, "event");
            Intrinsics.checkNotNullParameter(lens, "$lens");
            Intrinsics.checkNotNullParameter(event2, "$event");
            Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
            lens.a(event2, resultBuilder);
        } else if (event instanceof h) {
            o82.g0 event3 = ((h) event).f86656a;
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            l82.h0 lens2 = this.f86718c;
            Intrinsics.checkNotNullParameter(lens2, "lens");
            Intrinsics.checkNotNullParameter(event3, "event");
            Intrinsics.checkNotNullParameter(lens2, "$lens");
            Intrinsics.checkNotNullParameter(event3, "$event");
            Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
            lens2.a(event3, resultBuilder);
        } else {
            h32.u0 u0Var = null;
            r6 = null;
            r6 = null;
            r6 = null;
            CutoutModel cutoutModel = null;
            if (event instanceof i) {
                i iVar = (i) event;
                f30 f30Var = iVar.f86661a;
                Intrinsics.checkNotNullParameter(f30Var, "<this>");
                hi0 s63 = f30Var.s6();
                if (s63 != null && (u13 = s63.u()) != null) {
                    String s13 = s63.s();
                    BitmapMaskModel A = k3.A(s63);
                    if ((s13 != null || A != null) && (W = kh2.j1.W(u13, false)) != null) {
                        int i13 = a2.f106437b;
                        String uid = u13.getUid();
                        MaskModel maskModel = new MaskModel(s13, A);
                        String uid2 = s63.getUid();
                        String H = b40.H(f30Var);
                        int i14 = W.f128625b;
                        String str = W.f128624a;
                        cutoutModel = new CutoutModel(str, i14, W.f128626c, "none", str, uid, maskModel, uid2, H, false);
                    }
                }
                e0 e0Var = ((a1) resultBuilder.f82219b).f86618a;
                Intrinsics.checkNotNullParameter(e0Var, "<this>");
                if (e0Var instanceof b0) {
                    CutoutPickerPage cutoutPickerPage = ((b0) e0Var).f86631a;
                    Intrinsics.checkNotNullParameter(cutoutPickerPage, "<this>");
                    if (cutoutPickerPage instanceof CutoutPickerPage.OriginPage) {
                        cutoutPickerOrigin = ((CutoutPickerPage.OriginPage) cutoutPickerPage).f44681a;
                    } else {
                        if (!(cutoutPickerPage instanceof CutoutPickerPage.BoardPage)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        cutoutPickerOrigin = CutoutPickerOrigin.None;
                    }
                } else {
                    cutoutPickerOrigin = CutoutPickerOrigin.None;
                }
                if (cutoutModel != null) {
                    resultBuilder.a(new m0(cutoutModel, cutoutPickerOrigin));
                } else {
                    String uid3 = iVar.f86661a.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid3, "getUid(...)");
                    resultBuilder.a(new q0(uid3, cutoutPickerOrigin));
                }
            } else if (event instanceof d) {
                d dVar = (d) event;
                String uid4 = dVar.f86642a.getUid();
                Intrinsics.checkNotNullExpressionValue(uid4, "getUid(...)");
                String j13 = dVar.f86642a.j1();
                Intrinsics.checkNotNullExpressionValue(j13, "getName(...)");
                resultBuilder.a(new r0(new CutoutPickerPage.BoardPage(uid4, j13), f0.f86648a));
            } else if (event instanceof e) {
                za0.e eVar = CutoutPickerOrigin.Companion;
                int i15 = ((e) event).f86646a;
                eVar.getClass();
                CutoutPickerOrigin a13 = za0.e.a(i15);
                t0[] t0VarArr = new t0[2];
                a1 a1Var = (a1) resultBuilder.f82219b;
                Intrinsics.checkNotNullParameter(a13, "<this>");
                int[] iArr = z0.f86720a;
                int i16 = iArr[a13.ordinal()];
                if (i16 == 1) {
                    u0Var = h32.u0.COLLAGE_COMPOSER_COMMUNITY_CUTOUTS_CUTOUTS_FOR_YOU_CARD;
                } else if (i16 == 2) {
                    u0Var = h32.u0.COLLAGE_COMPOSER_PICKER_BOARDS_CARD;
                } else if (i16 == 3) {
                    u0Var = h32.u0.COLLAGE_COMPOSER_PICKER_YOUR_CUTOUTS_CARD;
                } else if (i16 == 4) {
                    u0Var = h32.u0.COLLAGE_COMPOSER_PICKER_RECENT_SAVES_CARD;
                }
                t0VarArr[0] = new l0(g3.p0(a1Var.f86622e, null, u0Var, null, null, null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL));
                t0VarArr[1] = new r0(new CutoutPickerPage.OriginPage(a13), iArr[a13.ordinal()] != 2 ? f0.f86648a : 2);
                resultBuilder.d(t0VarArr);
            } else if (event instanceof k) {
                if (!(((k) event) instanceof j)) {
                    throw new NoWhenBranchMatchedException();
                }
                e0 e0Var2 = ((a1) resultBuilder.f82219b).f86618a;
                resultBuilder.a(new p0(e0Var2 instanceof d0 ? ((d0) e0Var2).f86643a : ""));
            } else if (event instanceof c) {
                resultBuilder.a(n0.f86678a);
            } else if (event instanceof f) {
                resultBuilder.a(o0.f86681a);
            } else {
                if (!(event instanceof l)) {
                    throw new NoWhenBranchMatchedException();
                }
                resultBuilder.f(new mz.c(event, 28));
            }
        }
        return resultBuilder.e();
    }
}
