package p90;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.shuffles.core.ui.model.CutoutModel;
import kh2.g3;
import kh2.k3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t0 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final l82.h0 f99225b;

    /* renamed from: c, reason: collision with root package name */
    public final l82.h0 f99226c;

    /* renamed from: d, reason: collision with root package name */
    public final l82.h0 f99227d;

    public t0(sa0.r cutoutEditorStateTransformer, o82.i0 multiSectionStateTransformer, lt.j pinalyticsStateTransformer) {
        Intrinsics.checkNotNullParameter(cutoutEditorStateTransformer, "cutoutEditorStateTransformer");
        Intrinsics.checkNotNullParameter(multiSectionStateTransformer, "multiSectionStateTransformer");
        Intrinsics.checkNotNullParameter(pinalyticsStateTransformer, "pinalyticsStateTransformer");
        this.f99225b = b(cutoutEditorStateTransformer, new kotlin.jvm.internal.d0() { // from class: p90.k0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((b) obj).f99170b;
            }
        }, new kotlin.jvm.internal.d0() { // from class: p90.l0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((u0) obj).f99230a;
            }
        }, m0.f99198j);
        this.f99226c = b(multiSectionStateTransformer, new kotlin.jvm.internal.d0() { // from class: p90.p0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((b) obj).f99171c;
            }
        }, new kotlin.jvm.internal.d0() { // from class: p90.q0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((u0) obj).f99231b;
            }
        }, m0.f99199k);
        this.f99227d = b(pinalyticsStateTransformer, new kotlin.jvm.internal.d0() { // from class: p90.r0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((b) obj).f99172d;
            }
        }, new kotlin.jvm.internal.d0() { // from class: p90.s0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((u0) obj).f99232c;
            }
        }, m0.f99200l);
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        u0 vmState = (u0) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        Intrinsics.checkNotNullParameter(vmState, "<this>");
        String str = (String) vmState.f99234e.get("android_curation_collage_composer_drawer_pullup");
        l82.e d2 = l82.d.d(new b(z.f99250a, new sa0.a(), new o82.a0(), new zy.a0(), !(v50.a.a(str) || v50.a.b(str))), vmState);
        bk.f.T(d2, this.f99225b);
        bk.f.T(d2, this.f99226c);
        bk.f.T(d2, this.f99227d);
        return d2.e();
    }

    @Override // l82.d
    public final l82.c0 f(u50.s sVar, u50.o oVar, l82.i0 i0Var, l82.e resultBuilder) {
        String F1;
        l event = (l) sVar;
        b priorDisplayState = (b) oVar;
        u0 priorVMState = (u0) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (event instanceof e) {
            l82.f0 transformation = this.f99227d.c(((e) event).f99183a);
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            Intrinsics.checkNotNullParameter(transformation, "transformation");
            transformation.i(resultBuilder);
        } else if (event instanceof f) {
            l82.f0 transformation2 = this.f99226c.c(((f) event).f99185a);
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            Intrinsics.checkNotNullParameter(transformation2, "transformation");
            transformation2.i(resultBuilder);
        } else if (event instanceof d) {
            l82.d0 transformation3 = this.f99225b.d(((d) event).f99181a);
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            Intrinsics.checkNotNullParameter(transformation3, "transformation");
            transformation3.i(resultBuilder);
            resultBuilder.f(new n0(((u0) resultBuilder.f82219b).f99230a.f112189b, 0));
        } else if (event instanceof g) {
            String uid = ((g) event).f99188a.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            resultBuilder.a(new g0(uid, ((u0) resultBuilder.f82219b).f99233d));
        } else {
            boolean z13 = event instanceof k;
            e0 e0Var = e0.f99184a;
            if (z13) {
                k kVar = (k) event;
                if (kVar instanceof i) {
                    resultBuilder.a(e0Var);
                } else if (kVar instanceof j) {
                    sa0.s sVar2 = ((u0) resultBuilder.f82219b).f99230a;
                    CutoutModel cutoutModel = sVar2.f112189b;
                    if (cutoutModel == null || (F1 = cutoutModel.f51935f) == null) {
                        F1 = k3.F1(sVar2.f112188a);
                    }
                    resultBuilder.a(new h0(F1));
                } else {
                    if (!(kVar instanceof h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    u0 u0Var = (u0) resultBuilder.f82219b;
                    CutoutModel cutoutModel2 = u0Var.f99230a.f112189b;
                    if (cutoutModel2 == null) {
                        throw new IllegalArgumentException((new o0(0, h.f99191a, h.class, "debugName", "debugName()Ljava/lang/String;", 0) + " event should never be emitted when no cutout is selected").toString());
                    }
                    resultBuilder.d(new d0(g3.p0(u0Var.f99232c, null, h32.u0.ADD_BUTTON, null, null, null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL)), new f0(cutoutModel2, u0Var.f99233d));
                }
            } else {
                if (!(event instanceof c)) {
                    throw new NoWhenBranchMatchedException();
                }
                resultBuilder.a(e0Var);
            }
        }
        return resultBuilder.e();
    }
}
