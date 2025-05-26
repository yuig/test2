package c61;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.a4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o82.q1;

/* loaded from: classes5.dex */
public final class j1 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final l82.h0 f26580b;

    /* renamed from: c, reason: collision with root package name */
    public final l82.h0 f26581c;

    /* renamed from: d, reason: collision with root package name */
    public final l82.h0 f26582d;

    public j1(o82.i0 multiSectionStateTransformer, lt.j impressionStateTransformer) {
        lt.j pinalyticsLifecycleStateTransformer = new lt.j(2);
        Intrinsics.checkNotNullParameter(multiSectionStateTransformer, "multiSectionStateTransformer");
        Intrinsics.checkNotNullParameter(impressionStateTransformer, "impressionStateTransformer");
        Intrinsics.checkNotNullParameter(pinalyticsLifecycleStateTransformer, "pinalyticsLifecycleStateTransformer");
        this.f26580b = b(impressionStateTransformer, new kotlin.jvm.internal.d0() { // from class: c61.c1
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((k) obj).f26593k;
            }
        }, new kotlin.jvm.internal.d0() { // from class: c61.d1
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((k1) obj).f26598c;
            }
        }, e1.f26534j);
        this.f26581c = b(multiSectionStateTransformer, new kotlin.jvm.internal.d0() { // from class: c61.f1
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((k) obj).f26585c;
            }
        }, new kotlin.jvm.internal.d0() { // from class: c61.g1
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((k1) obj).f26599d;
            }
        }, e1.f26535k);
        this.f26582d = b(pinalyticsLifecycleStateTransformer, new kotlin.jvm.internal.d0() { // from class: c61.h1
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((k) obj).f26592j;
            }
        }, new kotlin.jvm.internal.d0() { // from class: c61.i1
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((k1) obj).f26598c;
            }
        }, e1.f26536l);
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        k1 vmState = (k1) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        l82.e resultBuilder = l82.d.d(new k(false, false, new o82.a0(), false, false, false, false, false, false, new zy.a0(), zy.b.f143058a), vmState);
        resultBuilder.b(kotlin.collections.e0.b(new z0(sy.e.f115640a)));
        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
        l82.h0 lens = this.f26581c;
        Intrinsics.checkNotNullParameter(lens, "lens");
        Intrinsics.checkNotNullParameter(lens, "$lens");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        lens.b(resultBuilder);
        return resultBuilder.e();
    }

    @Override // l82.d
    public final l82.c0 f(u50.s sVar, u50.o oVar, l82.i0 i0Var, l82.e resultBuilder) {
        y event = (y) sVar;
        k priorDisplayState = (k) oVar;
        k1 priorVMState = (k1) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        k1 k1Var = (k1) resultBuilder.f82219b;
        if (event instanceof o) {
            h32.i0 source = k1Var.f26598c.f143086a;
            Intrinsics.checkNotNullParameter(source, "source");
            resultBuilder.d(t0.f26641a, new r0(new zy.f0(new zy.a(new h32.i0(source.f67081a, source.f67082b, source.f67083c, h32.g0.SEARCH_BOX, source.f67085e, h32.u0.SEARCH_BOX_TEXT_INPUT), h32.f1.TAP, null, null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN))));
        } else if (event instanceof u) {
            h32.i0 source2 = k1Var.f26598c.f143086a;
            Intrinsics.checkNotNullParameter(source2, "source");
            resultBuilder.d(new r0(new zy.f0(new zy.a(new h32.i0(source2.f67081a, a4.SEARCH_TAB, source2.f67083c, h32.g0.SEARCH_BOX, source2.f67085e, h32.u0.SEARCH_BOX_VOICE_INPUT), h32.f1.VIEW, null, null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN))));
        } else if (event instanceof t) {
            h32.i0 source3 = k1Var.f26598c.f143086a;
            Intrinsics.checkNotNullParameter(source3, "source");
            resultBuilder.d(u0.f26643a, new r0(new zy.f0(new zy.a(new h32.i0(source3.f67081a, a4.SEARCH_TAB, source3.f67083c, h32.g0.SEARCH_BOX, source3.f67085e, h32.u0.SEARCH_BOX_VOICE_INPUT), h32.f1.TAP, null, null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN))));
        } else if (event instanceof m) {
            h32.i0 source4 = k1Var.f26598c.f143086a;
            Intrinsics.checkNotNullParameter(source4, "source");
            resultBuilder.d(v0.f26645a, new r0(new zy.f0(new zy.a(new h32.i0(source4.f67081a, source4.f67082b, source4.f67083c, h32.g0.SEARCH_BOX, source4.f67085e, h32.u0.FLASHLIGHT_CAMERA_BUTTON), h32.f1.TAP, null, null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN))));
        } else if (event instanceof s) {
            resultBuilder.f(g.f26557y);
        } else if (event instanceof r) {
            resultBuilder.f(new j41.i(event, 11));
        } else if (event instanceof x) {
            x xVar = (x) event;
            o82.g0 g0Var = xVar.f26647a;
            if (g0Var instanceof o82.f0) {
                q1 q1Var = ((o82.f0) g0Var).f93580b;
                if (q1Var instanceof o82.m1) {
                    if (!priorVMState.f26601f) {
                        resultBuilder.f(g.f26558z);
                    }
                    List list = ((o82.m1) q1Var).f93667a;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (obj instanceof j0) {
                            arrayList.add(obj);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((j0) it.next()).c());
                    }
                    resultBuilder.a(new q0(arrayList2));
                } else if (q1Var instanceof o82.z0) {
                    List list2 = ((o82.z0) q1Var).f93764a;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : list2) {
                        if (obj2 instanceof j0) {
                            arrayList3.add(obj2);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(kotlin.collections.g0.q(arrayList3, 10));
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(((j0) it2.next()).c());
                    }
                    resultBuilder.a(new q0(arrayList4));
                } else if (q1Var instanceof o82.a1) {
                    resultBuilder.f(g.A);
                } else if (q1Var instanceof o82.c1) {
                    resultBuilder.a(new z0(sy.d.f115639a));
                }
            }
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            l82.h0 lens = this.f26581c;
            Intrinsics.checkNotNullParameter(lens, "lens");
            o82.g0 event2 = xVar.f26647a;
            Intrinsics.checkNotNullParameter(event2, "event");
            Intrinsics.checkNotNullParameter(lens, "$lens");
            Intrinsics.checkNotNullParameter(event2, "$event");
            Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
            lens.a(event2, resultBuilder);
        } else if (event instanceof q) {
            resultBuilder.f(g.B);
        } else if (event instanceof n) {
            resultBuilder.f(g.C);
        } else if (event instanceof p) {
            resultBuilder.a(new a1(new mb0.b(((p) event).f26633a)));
        } else if (event instanceof w) {
            zy.l event3 = ((w) event).f26646a;
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            l82.h0 lens2 = this.f26580b;
            Intrinsics.checkNotNullParameter(lens2, "lens");
            Intrinsics.checkNotNullParameter(event3, "event");
            Intrinsics.checkNotNullParameter(lens2, "$lens");
            Intrinsics.checkNotNullParameter(event3, "$event");
            Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
            lens2.a(event3, resultBuilder);
        } else if (event instanceof v) {
            ll1.d event4 = ((v) event).f26644a;
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            l82.h0 lens3 = this.f26582d;
            Intrinsics.checkNotNullParameter(lens3, "lens");
            Intrinsics.checkNotNullParameter(event4, "event");
            Intrinsics.checkNotNullParameter(lens3, "$lens");
            Intrinsics.checkNotNullParameter(event4, "$event");
            Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
            lens3.a(event4, resultBuilder);
        } else if ((event instanceof l) && !priorVMState.f26600e) {
            resultBuilder.h(g.D);
            if (priorVMState.f26601f) {
                resultBuilder.g(g.f26555w, g.f26556x);
            }
        }
        return resultBuilder.e();
    }
}
