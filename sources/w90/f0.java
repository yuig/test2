package w90;

import android.graphics.Bitmap;
import com.pinterest.collage.draftpicker.screens.CollageDraftPickerLocation;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.n0;
import h32.f1;
import kh2.p2;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f0 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final l82.h0 f128533b;

    /* renamed from: c, reason: collision with root package name */
    public final l82.h0 f128534c;

    public f0(o82.i0 listTransformer, lt.j pinalyticsStateTransformer) {
        Intrinsics.checkNotNullParameter(listTransformer, "listTransformer");
        Intrinsics.checkNotNullParameter(pinalyticsStateTransformer, "pinalyticsStateTransformer");
        this.f128533b = b(listTransformer, new kotlin.jvm.internal.d0() { // from class: w90.a0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((b) obj).f128521b;
            }
        }, new kotlin.jvm.internal.d0() { // from class: w90.b0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((g0) obj).f128540e;
            }
        }, c0.f128525j);
        this.f128534c = b(pinalyticsStateTransformer, new kotlin.jvm.internal.d0() { // from class: w90.d0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((b) obj).f128522c;
            }
        }, new kotlin.jvm.internal.d0() { // from class: w90.e0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((g0) obj).f128541f;
            }
        }, c0.f128526k);
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        g0 vmState = (g0) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        l82.e d2 = l82.d.d(new b(false, new o82.a0(), new zy.a0()), vmState);
        com.google.firebase.messaging.a0 transformation = this.f128533b.e();
        Intrinsics.checkNotNullParameter(d2, "<this>");
        Intrinsics.checkNotNullParameter(transformation, "transformation");
        transformation.i(d2);
        com.google.firebase.messaging.a0 transformation2 = this.f128534c.e();
        Intrinsics.checkNotNullParameter(d2, "<this>");
        Intrinsics.checkNotNullParameter(transformation2, "transformation");
        transformation2.i(d2);
        return d2.e();
    }

    @Override // l82.d
    public final l82.c0 f(u50.s sVar, u50.o oVar, l82.i0 i0Var, l82.e resultBuilder) {
        i event = (i) sVar;
        b priorDisplayState = (b) oVar;
        g0 priorVMState = (g0) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (event instanceof g) {
            l82.d0 transformation = this.f128534c.d(((g) event).f128535a);
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            Intrinsics.checkNotNullParameter(transformation, "transformation");
            transformation.i(resultBuilder);
        } else if (event instanceof h) {
            l82.f0 transformation2 = this.f128533b.c(((h) event).f128545a);
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            Intrinsics.checkNotNullParameter(transformation2, "transformation");
            transformation2.i(resultBuilder);
        } else if (event instanceof f) {
            resultBuilder.d(new y(al1.b.f15477a));
        } else if (event instanceof e) {
            e eVar = (e) event;
            resultBuilder.a(priorVMState.f128539d ? new y(new al1.g(kotlin.collections.f0.j((ScreenLocation) n0.f51138a.getValue(), CollageDraftPickerLocation.COLLAGE_DRAFT_PICKER), al1.n.b(new Pair("com.pinterest.EXTRA_COLLAGE_PICKER_RESULT_KEY_COLLAGE_ID", eVar.f128530a)))) : new t(new ta0.f(eVar.f128530a, priorVMState.f128536a, null, priorVMState.f128537b, 4)));
        } else if (event instanceof d) {
            resultBuilder.a(priorVMState.f128539d ? new y(new al1.g(kotlin.collections.f0.j((ScreenLocation) n0.f51138a.getValue(), CollageDraftPickerLocation.COLLAGE_DRAFT_PICKER), al1.n.a(new Pair("com.pinterest.EXTRA_COLLAGE_PICKER_RESULT_KEY_NEW_COLLAGE", Boolean.TRUE)))) : new t(new ta0.e(priorVMState.f128536a, null, priorVMState.f128537b, 2)));
        } else if (event instanceof c) {
            ta0.d dVar = ((c) event).f128524a;
            if (Intrinsics.d(dVar, ta0.c.f116852a)) {
                resultBuilder.f(l.f128565n);
            } else if (dVar instanceof ta0.a) {
                resultBuilder.f(l.f128566o);
                resultBuilder.a(new u(new ta0.k(((ta0.a) dVar).f116846a)));
            } else if (dVar instanceof ta0.b) {
                g0 g0Var = (g0) resultBuilder.f82219b;
                boolean z13 = (kg.p.H(g0Var, "enabled") || kg.p.H(g0Var, "employees")) && !g0Var.f128544i.f("collage_has_navigated_to_composer", false);
                boolean H = kg.p.H(g0Var, "enabled_always");
                a aVar = a.f128518a;
                if (g0Var.f128543h && (z13 || H)) {
                    w wVar = new w(new zy.f0(new zy.a(com.bumptech.glide.d.z0(((g0) resultBuilder.f82219b).f128541f.f143086a, l.f128567p), f1.TAP, null, null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN)));
                    x xVar = new x(true);
                    NavigationImpl w13 = Navigation.w1((ScreenLocation) n0.f51139b.getValue());
                    ta0.b bVar = (ta0.b) dVar;
                    w13.m0("CutoutComposerExtras.EXTRA_DRAFT_COLLAGE_ID", bVar.f116850b);
                    w13.Y1("CutoutComposerExtras.EXTRA_NAVIGATED_FROM_ADDING", true);
                    Unit unit = Unit.f80348a;
                    Intrinsics.checkNotNullExpressionValue(w13, "apply(...)");
                    y yVar = new y(new al1.h(w13));
                    g0 g0Var2 = (g0) resultBuilder.f82219b;
                    zy.f0 U0 = p2.U0(bVar.f116851c, bVar.f116850b, g0Var2.f128541f.f143086a, g0Var2.f128538c);
                    z[] elements = {wVar, xVar, yVar, U0 != null ? new w(U0) : null};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    resultBuilder.b(kotlin.collections.c0.A(elements));
                    Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                    resultBuilder.a(aVar);
                } else {
                    x xVar2 = new x(false);
                    y yVar2 = new y(new al1.f(kotlin.collections.f0.j((ScreenLocation) n0.f51138a.getValue(), CollageDraftPickerLocation.COLLAGE_DRAFT_PICKER)));
                    ta0.b bVar2 = (ta0.b) dVar;
                    Bitmap bitmap = bVar2.f116849a;
                    String str = bVar2.f116850b;
                    u uVar = new u(new ta0.i(bitmap, str));
                    g0 g0Var3 = (g0) resultBuilder.f82219b;
                    zy.f0 U02 = p2.U0(bVar2.f116851c, str, g0Var3.f128541f.f143086a, g0Var3.f128538c);
                    z[] elements2 = {xVar2, yVar2, uVar, U02 != null ? new w(U02) : null};
                    Intrinsics.checkNotNullParameter(elements2, "elements");
                    resultBuilder.b(kotlin.collections.c0.A(elements2));
                    Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                    resultBuilder.a(aVar);
                }
            }
        }
        return resultBuilder.e();
    }
}
