package dt0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import h32.u0;
import kotlin.jvm.internal.Intrinsics;
import l82.h0;
import o82.d1;
import o82.f0;
import o82.g0;
import o82.i0;
import o82.k1;
import o82.n1;
import zy.l0;

/* loaded from: classes5.dex */
public final class z extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final h0 f56263b;

    public z(i0 multiSectionStateTransformer) {
        Intrinsics.checkNotNullParameter(multiSectionStateTransformer, "multiSectionStateTransformer");
        this.f56263b = b(multiSectionStateTransformer, new kotlin.jvm.internal.d0() { // from class: dt0.v
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((a) obj).f56222d;
            }
        }, new kotlin.jvm.internal.d0() { // from class: dt0.w
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((a0) obj).f56227d;
            }
        }, x.f56258i);
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        a0 vmState = (a0) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        l82.e resultBuilder = l82.d.d(new a(xp1.d.homefeed_tuner_filter_title_selection_all, xp1.d.homefeed_tuner_filter_subtitle_selection_all, xp1.d.homefeed_tuner_pin_recommendations_empty_experiment_uup, new o82.a0(), false), vmState);
        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
        h0 lens = this.f56263b;
        Intrinsics.checkNotNullParameter(lens, "lens");
        Intrinsics.checkNotNullParameter(lens, "$lens");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        lens.b(resultBuilder);
        return resultBuilder.e();
    }

    @Override // l82.d
    public final l82.c0 f(u50.s sVar, u50.o oVar, l82.i0 i0Var, l82.e resultBuilder) {
        ts0.b bVar;
        h event = (h) sVar;
        a priorDisplayState = (a) oVar;
        a0 priorVMState = (a0) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        boolean z13 = event instanceof g;
        h0 lens = this.f56263b;
        if (z13) {
            g0 event2 = ((g) event).f56239a;
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            Intrinsics.checkNotNullParameter(lens, "lens");
            Intrinsics.checkNotNullParameter(event2, "event");
            Intrinsics.checkNotNullParameter(lens, "$lens");
            Intrinsics.checkNotNullParameter(event2, "$event");
            Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
            lens.a(event2, resultBuilder);
        } else if (event instanceof c) {
            ha2.b bVar2 = ((c) event).f56229a;
            resultBuilder.a(new q(new zy.a(h32.i0.a(priorVMState.f56226c.f143086a, null, null, null, u0.HOME_FEED_CONTROL_PANEL_ACTIVITY_TAB_FILTER_TYPE_DROPDOWN, 95), f1.TAP, null, null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN)));
            resultBuilder.a(new p(bVar2));
        } else {
            boolean z14 = event instanceof d;
            n1 n1Var = n1.f93676a;
            if (z14) {
                int i13 = ((d) event).f56236a;
                ts0.b.Companion.getClass();
                ts0.b[] values = ts0.b.values();
                int length = values.length;
                int i14 = 0;
                while (true) {
                    if (i14 >= length) {
                        bVar = null;
                        break;
                    }
                    bVar = values[i14];
                    int i15 = length;
                    if (bVar.ordinal() == i13) {
                        break;
                    }
                    i14++;
                    length = i15;
                }
                if (bVar == null) {
                    bVar = ts0.b.All;
                }
                ts0.b bVar3 = bVar;
                if (bVar3 != priorVMState.f56224a) {
                    resultBuilder.h(new lq0.f1(bVar3, 21));
                    int i16 = u.f56255a[bVar3.ordinal()];
                    l0 l0Var = priorVMState.f56226c;
                    if (i16 == 1) {
                        resultBuilder.a(new q(new zy.a(h32.i0.a(l0Var.f143086a, null, null, null, u0.HOME_FEED_CONTROL_PANEL_ACTIVITY_TAB_FILTER_TYPE_DROPDOWN_OPTION_ALL, 95), f1.TAP, null, null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN)));
                        g0[] events = {new f0(0, n1Var)};
                        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                        Intrinsics.checkNotNullParameter(lens, "lens");
                        Intrinsics.checkNotNullParameter(events, "events");
                        Intrinsics.checkNotNullParameter(events, "$events");
                        Intrinsics.checkNotNullParameter(lens, "$lens");
                        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                        for (g0 g0Var : events) {
                            lens.a(g0Var, resultBuilder);
                        }
                        resultBuilder.f(y.f56259j);
                    } else if (i16 == 2) {
                        resultBuilder.a(new q(new zy.a(h32.i0.a(l0Var.f143086a, null, null, null, u0.HOME_FEED_CONTROL_PANEL_ACTIVITY_TAB_FILTER_TYPE_DROPDOWN_OPTION_SAVED, 95), f1.TAP, null, null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN)));
                        g0[] events2 = {new f0(0, d1.f93561a)};
                        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                        Intrinsics.checkNotNullParameter(lens, "lens");
                        Intrinsics.checkNotNullParameter(events2, "events");
                        Intrinsics.checkNotNullParameter(events2, "$events");
                        Intrinsics.checkNotNullParameter(lens, "$lens");
                        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                        for (g0 g0Var2 : events2) {
                            lens.a(g0Var2, resultBuilder);
                        }
                        resultBuilder.f(y.f56260k);
                    } else if (i16 == 3) {
                        resultBuilder.a(new q(new zy.a(h32.i0.a(l0Var.f143086a, null, null, null, u0.HOME_FEED_CONTROL_PANEL_ACTIVITY_TAB_FILTER_TYPE_DROPDOWN_OPTION_VIEWED, 95), f1.TAP, null, null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN)));
                        g0[] events3 = {new f0(0, n1Var)};
                        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                        Intrinsics.checkNotNullParameter(lens, "lens");
                        Intrinsics.checkNotNullParameter(events3, "events");
                        Intrinsics.checkNotNullParameter(events3, "$events");
                        Intrinsics.checkNotNullParameter(lens, "$lens");
                        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                        for (g0 g0Var3 : events3) {
                            lens.a(g0Var3, resultBuilder);
                        }
                        resultBuilder.f(y.f56261l);
                    }
                    resultBuilder.f(new lq0.f1(priorDisplayState, 22));
                }
            } else if (event instanceof b) {
                resultBuilder.h(new lq0.f1(priorVMState, 23));
                g0[] events4 = {new f0(1, k1.f93643a)};
                Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                Intrinsics.checkNotNullParameter(lens, "lens");
                Intrinsics.checkNotNullParameter(events4, "events");
                Intrinsics.checkNotNullParameter(events4, "$events");
                Intrinsics.checkNotNullParameter(lens, "$lens");
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                for (g0 g0Var4 : events4) {
                    lens.a(g0Var4, resultBuilder);
                }
            } else if (event instanceof e) {
                resultBuilder.a(new r(priorVMState.f56226c.f143086a));
            } else if (event instanceof f) {
                g0[] events5 = {new f0(0, n1Var)};
                Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                Intrinsics.checkNotNullParameter(lens, "lens");
                Intrinsics.checkNotNullParameter(events5, "events");
                Intrinsics.checkNotNullParameter(events5, "$events");
                Intrinsics.checkNotNullParameter(lens, "$lens");
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                for (g0 g0Var5 : events5) {
                    lens.a(g0Var5, resultBuilder);
                }
            }
        }
        return resultBuilder.e();
    }
}
