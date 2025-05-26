package s90;

import android.graphics.Bitmap;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.shuffles.core.ui.model.BitmapMaskModel;
import com.pinterest.shuffles.core.ui.model.CutoutModel;
import com.pinterest.shuffles.core.ui.model.MaskModel;
import kh2.k3;
import kh2.p2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n0 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final l82.h0 f111993b;

    /* renamed from: c, reason: collision with root package name */
    public final l82.h0 f111994c;

    public n0(sa0.r cutoutEditorStateTransformer, lt.j pinalyticsStateTransformer) {
        Intrinsics.checkNotNullParameter(cutoutEditorStateTransformer, "cutoutEditorStateTransformer");
        Intrinsics.checkNotNullParameter(pinalyticsStateTransformer, "pinalyticsStateTransformer");
        this.f111993b = b(cutoutEditorStateTransformer, new kotlin.jvm.internal.d0() { // from class: s90.g0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((a) obj).f111957a;
            }
        }, new kotlin.jvm.internal.d0() { // from class: s90.h0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((o0) obj).f111997a;
            }
        }, j0.f111979j);
        this.f111994c = b(pinalyticsStateTransformer, new kotlin.jvm.internal.d0() { // from class: s90.l0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((a) obj).f111961e;
            }
        }, new kotlin.jvm.internal.d0() { // from class: s90.m0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((o0) obj).f111999c;
            }
        }, j0.f111980k);
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        int i13;
        o0 vmState = (o0) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        int i14 = f0.f111971a[vmState.f111998b.ordinal()];
        if (i14 == 1) {
            i13 = d1.collage_cutout_save_button;
        } else if (i14 == 2) {
            i13 = d1.collage_cutout_add_to_composer_button;
        } else {
            if (i14 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = d1.collage_cutout_done_button;
        }
        l82.e d2 = l82.d.d(new a(new sa0.a(), new r0(), false, new t0(i13, 6), new zy.a0()), vmState);
        com.google.firebase.messaging.a0 transformation = this.f111993b.e();
        Intrinsics.checkNotNullParameter(d2, "<this>");
        Intrinsics.checkNotNullParameter(transformation, "transformation");
        transformation.i(d2);
        com.google.firebase.messaging.a0 transformation2 = this.f111994c.e();
        Intrinsics.checkNotNullParameter(d2, "<this>");
        Intrinsics.checkNotNullParameter(transformation2, "transformation");
        transformation2.i(d2);
        return d2.e();
    }

    @Override // l82.d
    public final l82.c0 f(u50.s sVar, u50.o oVar, l82.i0 i0Var, l82.e resultBuilder) {
        MaskModel maskModel;
        BitmapMaskModel bitmapMaskModel;
        MaskModel maskModel2;
        BitmapMaskModel bitmapMaskModel2;
        n event = (n) sVar;
        a priorDisplayState = (a) oVar;
        o0 priorVMState = (o0) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (event instanceof i) {
            l82.f0 transformation = this.f111994c.c(((i) event).f111975a);
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            Intrinsics.checkNotNullParameter(transformation, "transformation");
            transformation.i(resultBuilder);
        } else if (event instanceof h) {
            l82.d0 transformation2 = this.f111993b.d(((h) event).f111973a);
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            Intrinsics.checkNotNullParameter(transformation2, "transformation");
            transformation2.i(resultBuilder);
            resultBuilder.f(new p90.n0(((o0) resultBuilder.f82219b).f111997a.f112191d, 3));
        } else {
            boolean z13 = event instanceof m;
            al1.b bVar = al1.b.f15477a;
            r2 = null;
            r2 = null;
            r72.a aVar = null;
            if (z13) {
                m mVar = (m) event;
                if (mVar instanceof k) {
                    resultBuilder.a(new d0(bVar));
                } else {
                    if (!(mVar instanceof l)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i13 = f0.f111971a[((o0) resultBuilder.f82219b).f111998b.ordinal()];
                    if (i13 == 1) {
                        CutoutModel cutoutModel = ((o0) resultBuilder.f82219b).f111997a.f112189b;
                        if (cutoutModel != null && (maskModel2 = cutoutModel.f51936g) != null && (bitmapMaskModel2 = maskModel2.f51941b) != null) {
                            aVar = bitmapMaskModel2.a();
                        }
                        if (cutoutModel == null || aVar == null) {
                            resultBuilder.a(b.f111963a);
                        } else {
                            resultBuilder.a(new b0(new sa0.e0(k3.F1(((o0) resultBuilder.f82219b).f111997a.f112188a), aVar)));
                        }
                    } else if (i13 == 2) {
                        sa0.s sVar2 = ((o0) resultBuilder.f82219b).f111997a;
                        CutoutModel cutoutModel2 = sVar2.f112189b;
                        if (cutoutModel2 == null) {
                            resultBuilder.a(b.f111963a);
                        } else {
                            resultBuilder.a(new a0(new x0(cutoutModel2, sVar2.f112188a)));
                        }
                    } else {
                        if (i13 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        CutoutModel cutoutModel3 = ((o0) resultBuilder.f82219b).f111997a.f112189b;
                        resultBuilder.a(new a0(new y0(cutoutModel3 != null ? cutoutModel3.f51936g : null)));
                    }
                }
            } else if (event instanceof g) {
                g gVar = (g) event;
                CutoutModel cutoutModel4 = ((o0) resultBuilder.f82219b).f111997a.f112189b;
                r72.a a13 = (cutoutModel4 == null || (maskModel = cutoutModel4.f51936g) == null || (bitmapMaskModel = maskModel.f51941b) == null) ? null : bitmapMaskModel.a();
                if (a13 != null) {
                    if (gVar instanceof e) {
                        resultBuilder.a(new d0(bVar));
                    } else if (gVar instanceof f) {
                        resultBuilder.a(new x(new ta0.f(((f) gVar).f111970a, k3.F1(((o0) resultBuilder.f82219b).f111997a.f112188a), a13, null, 8)));
                    } else {
                        if (!(gVar instanceof d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        resultBuilder.a(new x(new ta0.e(k3.F1(((o0) resultBuilder.f82219b).f111997a.f112188a), a13, null, 4)));
                    }
                }
            } else if (event instanceof c) {
                ta0.d dVar = ((c) event).f111965a;
                if (dVar instanceof ta0.c) {
                    resultBuilder.f(k0.f111983j);
                } else if (dVar instanceof ta0.a) {
                    resultBuilder.f(k0.f111984k);
                    resultBuilder.a(new z(new ta0.k(((ta0.a) dVar).f116846a)));
                } else {
                    if (!(dVar instanceof ta0.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    resultBuilder.f(k0.f111985l);
                    e0[] elements = new e0[3];
                    elements[0] = new d0(bVar);
                    ta0.b bVar2 = (ta0.b) dVar;
                    Bitmap bitmap = bVar2.f116849a;
                    String str = bVar2.f116850b;
                    elements[1] = new z(new ta0.i(bitmap, str));
                    o0 o0Var = (o0) resultBuilder.f82219b;
                    zy.f0 U0 = p2.U0(bVar2.f116851c, str, o0Var.f111999c.f143086a, o0Var.f112000d);
                    elements[2] = U0 != null ? new c0(U0) : null;
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    resultBuilder.b(kotlin.collections.c0.A(elements));
                }
            } else {
                if (!(event instanceof j)) {
                    throw new NoWhenBranchMatchedException();
                }
                sa0.w wVar = ((j) event).f111978a;
                if (wVar instanceof sa0.v) {
                    resultBuilder.f(k0.f111986m);
                } else if (wVar instanceof sa0.u) {
                    resultBuilder.f(k0.f111987n);
                    String sourceId = k3.F1(((o0) resultBuilder.f82219b).f111997a.f112188a);
                    String shuffleAssetId = ((sa0.u) wVar).f112194a;
                    Intrinsics.checkNotNullParameter(sourceId, "sourceId");
                    Intrinsics.checkNotNullParameter(shuffleAssetId, "shuffleAssetId");
                    NavigationImpl L = Navigation.L((ScreenLocation) com.pinterest.screens.m0.f51117a.getValue(), "", ml1.b.MODAL_TRANSITION.getValue());
                    L.m0("com.pinterest.EXTRA_PIN_ID", sourceId);
                    L.m0("com.pinterest.EXTRA_SHUFFLE_ASSET_ID", shuffleAssetId);
                    L.Y1("com.pinterest.EXTRA_PIN_CAN_ADD_TO_COLLAGE", true);
                    L.m0("com.pinterest.EXTRA_BOARD_PICKER_LAUNCH_POINT", "com.pinterest.EXTRA_BOARD_PICKER_LAUNCH_POINT_CUTOUT_TOOL");
                    Intrinsics.checkNotNullExpressionValue(L, "apply(...)");
                    resultBuilder.a(new d0(new al1.a(L)));
                } else {
                    if (!(wVar instanceof sa0.t)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    resultBuilder.f(k0.f111988o);
                    ((sa0.t) wVar).getClass();
                    resultBuilder.a(new z(new ta0.k("Failed to create shuffle asset")));
                }
            }
        }
        return resultBuilder.e();
    }
}
