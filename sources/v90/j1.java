package v90;

import android.graphics.Bitmap;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.shuffles.core.ui.model.BitmapMaskModel;
import com.pinterest.shuffles.core.ui.model.CutoutModel;
import com.pinterest.shuffles.core.ui.model.MaskModel;
import java.util.HashMap;
import kh2.g3;
import kh2.k3;
import kh2.p2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j1 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final l82.h0 f124922b;

    public j1(lt.j pinalyticsStateTransformer) {
        Intrinsics.checkNotNullParameter(pinalyticsStateTransformer, "pinalyticsStateTransformer");
        this.f124922b = b(pinalyticsStateTransformer, new kotlin.jvm.internal.d0() { // from class: v90.g1
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((a) obj).f124856d;
            }
        }, new kotlin.jvm.internal.d0() { // from class: v90.h1
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((k1) obj).f124929e;
            }
        }, i1.f124919i);
    }

    public static p0 h(j1 j1Var, k1 k1Var, h32.u0 u0Var) {
        h32.f1 f1Var = h32.f1.TAP;
        HashMap hashMap = new HashMap();
        j1Var.getClass();
        return new p0(g3.p0(k1Var.f124929e, null, u0Var, null, null, f1Var, hashMap, 19));
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        int i13;
        k1 vmState = (k1) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        int i14 = d1.f124878a[vmState.f124926b.ordinal()];
        if (i14 == 1) {
            i13 = s90.d1.collage_cutout_save_button;
        } else if (i14 == 2) {
            i13 = s90.d1.collage_cutout_add_to_composer_button;
        } else {
            if (i14 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = s90.d1.collage_cutout_done_button;
        }
        l82.e resultBuilder = l82.d.d(new a(new s90.r0(), false, new s90.t0(i13, 6), new zy.a0(), new y62.g(), new x62.p(), n1.SELECT, t90.f.f116791e, x62.n.BRUSH, k0.f124924a, false), vmState);
        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
        l82.h0 lens = this.f124922b;
        Intrinsics.checkNotNullParameter(lens, "lens");
        Intrinsics.checkNotNullParameter(lens, "$lens");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        lens.b(resultBuilder);
        resultBuilder.a(new u0(vmState.f124925a, vmState.f124928d));
        return resultBuilder.e();
    }

    @Override // l82.d
    public final l82.c0 f(u50.s sVar, u50.o oVar, l82.i0 i0Var, l82.e resultBuilder) {
        MaskModel maskModel;
        BitmapMaskModel bitmapMaskModel;
        z event = (z) sVar;
        a priorDisplayState = (a) oVar;
        k1 priorVMState = (k1) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (event instanceof h) {
            ll1.d event2 = ((h) event).f124899a;
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            l82.h0 lens = this.f124922b;
            Intrinsics.checkNotNullParameter(lens, "lens");
            Intrinsics.checkNotNullParameter(event2, "event");
            Intrinsics.checkNotNullParameter(lens, "$lens");
            Intrinsics.checkNotNullParameter(event2, "$event");
            Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
            lens.a(event2, resultBuilder);
        } else {
            boolean z13 = event instanceof y;
            al1.b bVar = al1.b.f15477a;
            BitmapMaskModel bitmapMaskModel2 = null;
            if (z13) {
                y yVar = (y) event;
                if (yVar instanceof w) {
                    resultBuilder.a(new b1(bVar));
                } else {
                    if (!(yVar instanceof x)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i13 = d1.f124878a[((k1) resultBuilder.f82219b).f124926b.ordinal()];
                    if (i13 == 1) {
                        resultBuilder.a(new r0(k3.F1(((k1) resultBuilder.f82219b).f124925a), ((x) yVar).f124969a));
                    } else if (i13 == 2) {
                        resultBuilder.a(new q0(((x) yVar).f124969a));
                    } else {
                        if (i13 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        MaskModel maskModel2 = ((x) yVar).f124969a;
                        if (maskModel2 == null) {
                            r72.i1 mask = ((a) resultBuilder.f82218a).f124857e.f137939f;
                            Intrinsics.checkNotNullParameter(mask, "mask");
                            String str = mask.f106498a;
                            if (str == null) {
                                str = null;
                            }
                            r72.a aVar = mask.f106499b;
                            if (aVar != null) {
                                r72.j1 j1Var = aVar.f106431a;
                                bitmapMaskModel2 = new BitmapMaskModel(j1Var.f106506a, j1Var.f106507b, j1Var.f106508c, j1Var.f106509d, aVar.f106432b);
                            }
                            maskModel2 = new MaskModel(str, bitmapMaskModel2);
                        }
                        resultBuilder.a(new n0(new s90.y0(maskModel2)));
                    }
                }
            } else if (event instanceof g) {
                g gVar = (g) event;
                CutoutModel cutoutModel = ((k1) resultBuilder.f82219b).f124930f;
                r72.a a13 = (cutoutModel == null || (maskModel = cutoutModel.f51936g) == null || (bitmapMaskModel = maskModel.f51941b) == null) ? null : bitmapMaskModel.a();
                if (a13 != null) {
                    if (gVar instanceof e) {
                        resultBuilder.a(new b1(bVar));
                    } else if (gVar instanceof f) {
                        resultBuilder.a(new l0(new ta0.f(((f) gVar).f124892a, k3.F1(((k1) resultBuilder.f82219b).f124925a), a13, null, 8)));
                    } else {
                        if (!(gVar instanceof d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        resultBuilder.a(new l0(new ta0.e(k3.F1(((k1) resultBuilder.f82219b).f124925a), a13, null, 4)));
                    }
                }
            } else if (event instanceof c) {
                ta0.d dVar = ((c) event).f124871a;
                if (dVar instanceof ta0.c) {
                    resultBuilder.f(e1.f124883j);
                } else if (dVar instanceof ta0.a) {
                    resultBuilder.f(e1.f124884k);
                    resultBuilder.a(new m0(new ta0.k(((ta0.a) dVar).f116846a)));
                } else {
                    if (!(dVar instanceof ta0.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    resultBuilder.f(e1.f124885l);
                    c1[] elements = new c1[3];
                    elements[0] = new b1(bVar);
                    ta0.b bVar2 = (ta0.b) dVar;
                    Bitmap bitmap = bVar2.f116849a;
                    String str2 = bVar2.f116850b;
                    elements[1] = new m0(new ta0.i(bitmap, str2));
                    k1 k1Var = (k1) resultBuilder.f82219b;
                    zy.f0 U0 = p2.U0(bVar2.f116851c, str2, k1Var.f124929e.f143086a, k1Var.f124927c);
                    elements[2] = U0 != null ? new p0(U0) : null;
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    resultBuilder.b(kotlin.collections.c0.A(elements));
                }
            } else if (event instanceof v) {
                sa0.w wVar = ((v) event).f124965a;
                if (wVar instanceof sa0.v) {
                    resultBuilder.f(e1.f124887n);
                } else if (wVar instanceof sa0.u) {
                    resultBuilder.f(e1.f124888o);
                    String sourceId = k3.F1(((k1) resultBuilder.f82219b).f124925a);
                    String shuffleAssetId = ((sa0.u) wVar).f112194a;
                    Intrinsics.checkNotNullParameter(sourceId, "sourceId");
                    Intrinsics.checkNotNullParameter(shuffleAssetId, "shuffleAssetId");
                    NavigationImpl L = Navigation.L((ScreenLocation) com.pinterest.screens.m0.f51117a.getValue(), "", ml1.b.MODAL_TRANSITION.getValue());
                    L.m0("com.pinterest.EXTRA_PIN_ID", sourceId);
                    L.m0("com.pinterest.EXTRA_SHUFFLE_ASSET_ID", shuffleAssetId);
                    L.Y1("com.pinterest.EXTRA_PIN_CAN_ADD_TO_COLLAGE", true);
                    L.m0("com.pinterest.EXTRA_BOARD_PICKER_LAUNCH_POINT", "com.pinterest.EXTRA_BOARD_PICKER_LAUNCH_POINT_CUTOUT_TOOL");
                    Intrinsics.checkNotNullExpressionValue(L, "apply(...)");
                    resultBuilder.a(new b1(new al1.a(L)));
                } else {
                    if (!(wVar instanceof sa0.t)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    resultBuilder.f(e1.f124889p);
                    ((sa0.t) wVar).getClass();
                    resultBuilder.a(new m0(new ta0.k("Failed to create shuffle asset")));
                }
            } else if (event instanceof m) {
                resultBuilder.a(b.f124867b);
            } else if (event instanceof o) {
                resultBuilder.h(e1.f124890q);
                resultBuilder.a(new t0(((o) event).f124949a));
            } else if (event instanceof t) {
                resultBuilder.f(new p90.n0((t) event, 8));
            } else if (event instanceof n) {
                x62.s sVar2 = ((n) event).f124947a;
                resultBuilder.a(new s0(sVar2));
                if (sVar2 instanceof x62.r) {
                    resultBuilder.f(new p90.n0((x62.r) sVar2, 11));
                }
            } else if (event instanceof q) {
                resultBuilder.f(new p90.n0(event, 9));
            } else if (event instanceof l) {
                g((l) event, resultBuilder);
            } else if (event instanceof j) {
                j jVar = (j) event;
                resultBuilder.h(new p90.n0(jVar, 6));
                BitmapMaskModel bitmapMaskModel3 = jVar.f124920a.f51936g.f51941b;
                resultBuilder.a(bitmapMaskModel3 != null ? new o0(new sa0.e0(jVar.f124921b, bitmapMaskModel3.a())) : b.f124866a);
            } else if (event instanceof i) {
                i iVar = (i) event;
                resultBuilder.h(new p90.n0(iVar, 5));
                resultBuilder.a(new n0(new s90.x0(iVar.f124903a, ((k1) resultBuilder.f82219b).f124925a)));
            } else if (event instanceof k) {
                resultBuilder.a(b.f124866a);
            } else if (event instanceof s) {
                resultBuilder.a(w0.f124968a);
            } else if (event instanceof r) {
                resultBuilder.a(v0.f124966a);
            } else {
                if (!(event instanceof p)) {
                    throw new NoWhenBranchMatchedException();
                }
                MaskModel maskModel3 = ((p) event).f124951a;
                if (maskModel3 != null) {
                    resultBuilder.a(new z0(maskModel3.a()));
                }
                g(new l(n1.SELECT, null), resultBuilder);
                resultBuilder.a(h(this, (k1) resultBuilder.f82219b, h32.u0.CUTOUT_TOOL_REFINE_CONFIRM_BUTTON));
            }
        }
        return resultBuilder.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008e, code lost:
    
        if (r2 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(v90.l r9, l82.e r10) {
        /*
            r8 = this;
            r0 = 1
            r1 = 2
            v90.n1 r2 = r9.f124932a
            p90.n0 r3 = new p90.n0
            r4 = 10
            r3.<init>(r2, r4)
            r10.f(r3)
            v90.n1 r2 = v90.n1.REFINE
            v90.p1 r3 = r9.f124933b
            v90.n1 r4 = r9.f124932a
            if (r4 != r2) goto L67
            l82.i0 r2 = r10.f82219b
            v90.k1 r2 = (v90.k1) r2
            boolean r2 = r2.f124931g
            if (r2 == 0) goto L28
            v90.x0 r2 = v90.x0.f124970a
            r10.a(r2)
            v90.e1 r2 = v90.e1.f124886m
            r10.h(r2)
        L28:
            if (r3 == 0) goto L67
            p90.n0 r2 = new p90.n0
            r5 = 7
            r2.<init>(r3, r5)
            r10.f(r2)
            v90.y0 r2 = new v90.y0
            x62.n r5 = r3.getMode()
            r2.<init>(r5)
            l82.i0 r5 = r10.f82219b
            v90.k1 r5 = (v90.k1) r5
            int[] r6 = v90.d1.f124879b
            int r7 = r3.ordinal()
            r6 = r6[r7]
            if (r6 == r0) goto L55
            if (r6 != r1) goto L4f
            h32.u0 r6 = h32.u0.CUTOUT_TOOL_REFINE_ERASE_BUTTON
            goto L57
        L4f:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L55:
            h32.u0 r6 = h32.u0.CUTOUT_TOOL_REFINE_ADD_BUTTON
        L57:
            v90.p0 r5 = h(r8, r5, r6)
            v90.c1[] r6 = new v90.c1[r1]
            r7 = 0
            r6[r7] = r2
            r6[r0] = r5
            l82.h[] r6 = (l82.h[]) r6
            r10.d(r6)
        L67:
            t80.r r2 = new t80.r
            r5 = 11
            r2.<init>(r5, r8, r9)
            r10.f(r2)
            l82.i0 r9 = r10.f82219b
            v90.k1 r9 = (v90.k1) r9
            if (r3 == 0) goto L90
            int[] r2 = v90.d1.f124879b
            int r3 = r3.ordinal()
            r2 = r2[r3]
            if (r2 == r0) goto L8c
            if (r2 != r1) goto L86
            h32.u0 r2 = h32.u0.CUTOUT_TOOL_REFINE_ERASE_BUTTON
            goto L8e
        L86:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L8c:
            h32.u0 r2 = h32.u0.CUTOUT_TOOL_REFINE_ADD_BUTTON
        L8e:
            if (r2 != 0) goto La9
        L90:
            int[] r2 = v90.d1.f124880c
            int r3 = r4.ordinal()
            r2 = r2[r3]
            if (r2 == r0) goto La6
            if (r2 != r1) goto La0
            h32.u0 r0 = h32.u0.CUTOUT_TOOL_REFINE_BUTTON
        L9e:
            r2 = r0
            goto La9
        La0:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        La6:
            h32.u0 r0 = h32.u0.CUTOUT_TOOL_LASSO_BUTTON
            goto L9e
        La9:
            v90.p0 r9 = h(r8, r9, r2)
            r10.a(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v90.j1.g(v90.l, l82.e):void");
    }
}
