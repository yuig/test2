package ns;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import h32.a4;
import h32.d4;
import h32.f1;
import java.util.ArrayList;
import java.util.Iterator;
import kh2.g3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o82.h1;
import o82.i2;
import o82.m1;
import o82.n1;

/* loaded from: classes3.dex */
public final class k0 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f91927b;

    /* renamed from: c, reason: collision with root package name */
    public final l82.h0 f91928c;

    /* renamed from: d, reason: collision with root package name */
    public final l82.h0 f91929d;

    public k0(l82.d pinalyticsStateTransformer, l82.d multiSectionStateTransformer, int i13) {
        this.f91927b = i13;
        if (i13 == 1) {
            Intrinsics.checkNotNullParameter(pinalyticsStateTransformer, "pinalyticsStateTransformer");
            Intrinsics.checkNotNullParameter(multiSectionStateTransformer, "multiSectionStateTransformer");
            this.f91928c = b(multiSectionStateTransformer, new kotlin.jvm.internal.d0() { // from class: h90.x
                @Override // kotlin.jvm.internal.d0, rl2.t
                public final Object get(Object obj) {
                    return ((d) obj).f68241a;
                }
            }, new kotlin.jvm.internal.d0() { // from class: h90.y
                @Override // kotlin.jvm.internal.d0, rl2.t
                public final Object get(Object obj) {
                    return ((f0) obj).f68255i;
                }
            }, h90.a0.f68234j);
            this.f91929d = b(pinalyticsStateTransformer, new kotlin.jvm.internal.d0() { // from class: h90.b0
                @Override // kotlin.jvm.internal.d0, rl2.t
                public final Object get(Object obj) {
                    return ((d) obj).f68242b;
                }
            }, new kotlin.jvm.internal.d0() { // from class: h90.c0
                @Override // kotlin.jvm.internal.d0, rl2.t
                public final Object get(Object obj) {
                    return ((f0) obj).f68254h;
                }
            }, h90.a0.f68235k);
            return;
        }
        if (i13 != 2) {
            Intrinsics.checkNotNullParameter(pinalyticsStateTransformer, "multiSectionStateTransformer");
            Intrinsics.checkNotNullParameter(multiSectionStateTransformer, "pinalyticsLifecycleStateTransformer");
            this.f91928c = b(pinalyticsStateTransformer, new kotlin.jvm.internal.d0() { // from class: ns.d0
                @Override // kotlin.jvm.internal.d0, rl2.t
                public final Object get(Object obj) {
                    return ((c) obj).f91903e;
                }
            }, new kotlin.jvm.internal.d0() { // from class: ns.e0
                @Override // kotlin.jvm.internal.d0, rl2.t
                public final Object get(Object obj) {
                    return ((l0) obj).f91935d;
                }
            }, h0.f91916j);
            this.f91929d = b(multiSectionStateTransformer, new kotlin.jvm.internal.d0() { // from class: ns.i0
                @Override // kotlin.jvm.internal.d0, rl2.t
                public final Object get(Object obj) {
                    return ((c) obj).f91904f;
                }
            }, new kotlin.jvm.internal.d0() { // from class: ns.j0
                @Override // kotlin.jvm.internal.d0, rl2.t
                public final Object get(Object obj) {
                    return ((l0) obj).f91936e;
                }
            }, h0.f91917k);
            return;
        }
        Intrinsics.checkNotNullParameter(pinalyticsStateTransformer, "floatingToolbarStateTransformer");
        Intrinsics.checkNotNullParameter(multiSectionStateTransformer, "organizeFloatingToolbarStateTransformer");
        this.f91928c = b(pinalyticsStateTransformer, new kotlin.jvm.internal.d0() { // from class: vn0.h
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((a) obj).f126252a;
            }
        }, new kotlin.jvm.internal.d0() { // from class: vn0.i
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((m) obj).f126265a;
            }
        }, vn0.j.f126260j);
        this.f91929d = b(multiSectionStateTransformer, new kotlin.jvm.internal.d0() { // from class: vn0.k
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((a) obj).f126253b;
            }
        }, new kotlin.jvm.internal.d0() { // from class: vn0.l
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((m) obj).f126266b;
            }
        }, vn0.j.f126261k);
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        int i13 = this.f91927b;
        l82.h0 lens = this.f91928c;
        switch (i13) {
            case 0:
                l0 vmState = (l0) i0Var;
                Intrinsics.checkNotNullParameter(vmState, "vmState");
                l82.e resultBuilder = l82.d.d(new c(false, false, false, false, new o82.a0(), new zy.a0()), vmState);
                Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                Intrinsics.checkNotNullParameter(lens, "lens");
                Intrinsics.checkNotNullParameter(lens, "$lens");
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                lens.b(resultBuilder);
                return resultBuilder.e();
            case 1:
                h90.f0 vmState2 = (h90.f0) i0Var;
                Intrinsics.checkNotNullParameter(vmState2, "vmState");
                l82.e d2 = l82.d.d(new h90.d(new o82.a0(), new zy.a0()), vmState2);
                com.google.firebase.messaging.a0 transformation = lens.e();
                Intrinsics.checkNotNullParameter(d2, "<this>");
                Intrinsics.checkNotNullParameter(transformation, "transformation");
                transformation.i(d2);
                return d2.e();
            default:
                vn0.m vmState3 = (vn0.m) i0Var;
                Intrinsics.checkNotNullParameter(vmState3, "vmState");
                l82.e d13 = l82.d.d(new vn0.a(new sk0.d(), new tk0.e((ArrayList) null, (xm0.a) null, (tk0.a) null, 15)), vmState3);
                com.google.firebase.messaging.a0 transformation2 = lens.e();
                Intrinsics.checkNotNullParameter(d13, "<this>");
                Intrinsics.checkNotNullParameter(transformation2, "transformation");
                transformation2.i(d13);
                com.google.firebase.messaging.a0 transformation3 = this.f91929d.e();
                Intrinsics.checkNotNullParameter(d13, "<this>");
                Intrinsics.checkNotNullParameter(transformation3, "transformation");
                transformation3.i(d13);
                return d13.e();
        }
    }

    @Override // l82.d
    public final l82.c0 f(u50.s sVar, u50.o oVar, l82.i0 i0Var, l82.e resultBuilder) {
        int i13 = 0;
        int i14 = this.f91927b;
        l82.h0 lens = this.f91929d;
        l82.h0 lens2 = this.f91928c;
        switch (i14) {
            case 0:
                h event = (h) sVar;
                c priorDisplayState = (c) oVar;
                l0 priorVMState = (l0) i0Var;
                Intrinsics.checkNotNullParameter(event, "event");
                Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
                Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                if (Intrinsics.d(event, e.f91908a)) {
                    resultBuilder.f(o.f91945k);
                    return resultBuilder.e();
                }
                if (event instanceof d) {
                    resultBuilder.f(new tq.a0(event, 14));
                    return resultBuilder.e();
                }
                if (!(event instanceof g)) {
                    if (!(event instanceof f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ll1.d event2 = ((f) event).f91910a;
                    Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                    Intrinsics.checkNotNullParameter(lens, "lens");
                    Intrinsics.checkNotNullParameter(event2, "event");
                    Intrinsics.checkNotNullParameter(lens, "$lens");
                    Intrinsics.checkNotNullParameter(event2, "$event");
                    Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                    lens.a(event2, resultBuilder);
                    return resultBuilder.e();
                }
                g gVar = (g) event;
                o82.g0 g0Var = gVar.f91913a;
                if ((g0Var instanceof o82.f0) && (((o82.f0) g0Var).f93580b instanceof m1) && priorVMState.f91934c) {
                    resultBuilder.h(o.f91946l);
                    resultBuilder.a(new b0(new k92.n(new k92.c(new u50.k0(js.e.promoted_pin_preview_toast), null, null, true, 62), null)));
                }
                Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                Intrinsics.checkNotNullParameter(lens2, "lens");
                o82.g0 event3 = gVar.f91913a;
                Intrinsics.checkNotNullParameter(event3, "event");
                Intrinsics.checkNotNullParameter(lens2, "$lens");
                Intrinsics.checkNotNullParameter(event3, "$event");
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                lens2.a(event3, resultBuilder);
                return resultBuilder.e();
            case 1:
                h90.i event4 = (h90.i) sVar;
                h90.d priorDisplayState2 = (h90.d) oVar;
                h90.f0 priorVMState2 = (h90.f0) i0Var;
                Intrinsics.checkNotNullParameter(event4, "event");
                Intrinsics.checkNotNullParameter(priorDisplayState2, "priorDisplayState");
                Intrinsics.checkNotNullParameter(priorVMState2, "priorVMState");
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                if (event4 instanceof h90.e) {
                    l82.f0 transformation = lens2.c(((h90.e) event4).f68244a);
                    Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                    Intrinsics.checkNotNullParameter(transformation, "transformation");
                    transformation.i(resultBuilder);
                } else if (event4 instanceof h90.g) {
                    l82.f0 transformation2 = lens.c(((h90.g) event4).f68257a);
                    Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                    Intrinsics.checkNotNullParameter(transformation2, "transformation");
                    transformation2.i(resultBuilder);
                } else if (event4 instanceof h90.h) {
                    h90.f0 f0Var = (h90.f0) resultBuilder.f82219b;
                    h90.h hVar = (h90.h) event4;
                    String id3 = hVar.f68260a.getUid();
                    Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
                    Intrinsics.checkNotNullParameter(f0Var, "<this>");
                    Intrinsics.checkNotNullParameter(id3, "id");
                    d4 d4Var = d4.FEED;
                    a4 a4Var = a4.FEED_COLLAGE_ITEM_RELATED_ITEMS;
                    h90.u uVar = new h90.u(g3.o0(f0Var.f68254h, h32.g0.FLOWED_PIN, null, f1.TAP, a4Var, d4Var, id3, f0Var.f68256j));
                    String pinId = hVar.f68260a.getUid();
                    Intrinsics.checkNotNullExpressionValue(pinId, "getUid(...)");
                    Intrinsics.checkNotNullParameter(pinId, "pinId");
                    NavigationImpl z03 = Navigation.z0((ScreenLocation) com.pinterest.screens.k0.f51022b.getValue(), pinId);
                    Intrinsics.checkNotNullExpressionValue(z03, "create(...)");
                    resultBuilder.d(uVar, new h90.v(new al1.a(z03)));
                } else {
                    if (!(event4 instanceof h90.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Iterator it = priorVMState2.f68255i.f93634a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            i2 i2Var = (i2) it.next();
                            if (!(i2Var.f93619a instanceof i90.j) || !(i2Var.f93620b instanceof o82.k)) {
                                i13++;
                            }
                        } else {
                            i13 = -1;
                        }
                    }
                    if (i13 >= 0 && i13 < priorVMState2.f68255i.f93634a.size()) {
                        bk.f.H(new o82.f0(i13, n1.f93676a), resultBuilder, lens2);
                        bk.f.H(new o82.f0(i13, h1.f93609a), resultBuilder, lens2);
                    }
                }
                return resultBuilder.e();
            default:
                vn0.d event5 = (vn0.d) sVar;
                vn0.a priorDisplayState3 = (vn0.a) oVar;
                Intrinsics.checkNotNullParameter(event5, "event");
                Intrinsics.checkNotNullParameter(priorDisplayState3, "priorDisplayState");
                Intrinsics.checkNotNullParameter((vn0.m) i0Var, "priorVMState");
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                if (event5 instanceof vn0.b) {
                    l82.f0 transformation3 = lens2.c(((vn0.b) event5).f126254a);
                    Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                    Intrinsics.checkNotNullParameter(transformation3, "transformation");
                    transformation3.i(resultBuilder);
                } else {
                    if (!(event5 instanceof vn0.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    l82.f0 transformation4 = lens.c(((vn0.c) event5).f126255a);
                    Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                    Intrinsics.checkNotNullParameter(transformation4, "transformation");
                    transformation4.i(resultBuilder);
                }
                return resultBuilder.e();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(o82.i0 i0Var) {
        this(i0Var, new lt.j(2), 0);
        this.f91927b = 0;
    }
}
