package ct0;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.a2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import l82.c0;
import l82.h0;
import o82.g0;
import o82.i0;
import o82.y0;

/* loaded from: classes5.dex */
public final class y extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final h0 f53172b;

    public y(i0 multiSectionStateTransformer) {
        Intrinsics.checkNotNullParameter(multiSectionStateTransformer, "multiSectionStateTransformer");
        this.f53172b = b(multiSectionStateTransformer, new d0() { // from class: ct0.v
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((h) obj).f53146b;
            }
        }, new d0() { // from class: ct0.w
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((z) obj).f53173a;
            }
        }, x.f53171i);
    }

    @Override // l82.d
    public final c0 c(l82.i0 i0Var) {
        int i13;
        z vmState = (z) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        o82.a0 a0Var = new o82.a0(f0.j(new y0(null, null, false, 7), new y0(null, null, false, 7)));
        if (hf0.b.q()) {
            i13 = hf0.b.f69004d;
        } else {
            hf0.b.m();
            i13 = 3;
        }
        l82.e resultBuilder = l82.d.d(new h(i13, a0Var, xp1.d.homefeed_tuner_topics_empty_experiment_uup, eo1.a.hft_interest_vertical_spacing, eo1.a.hft_interest_horizontal_spacing, eo1.d.ic_one_tap_saved_success_nonpds, eo1.d.ic_one_tap_save_lego_nonpds), vmState);
        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
        h0 lens = this.f53172b;
        Intrinsics.checkNotNullParameter(lens, "lens");
        Intrinsics.checkNotNullParameter(lens, "$lens");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        lens.b(resultBuilder);
        return resultBuilder.e();
    }

    @Override // l82.d
    public final c0 f(u50.s sVar, u50.o oVar, l82.i0 i0Var, l82.e resultBuilder) {
        l event = (l) sVar;
        h priorDisplayState = (h) oVar;
        z priorVMState = (z) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (!(event instanceof k)) {
            if (event instanceof j) {
                NavigationImpl r03 = Navigation.r0((ScreenLocation) a2.f50511e.getValue(), ((j) event).f53153a);
                Intrinsics.checkNotNullExpressionValue(r03, "create(...)");
                resultBuilder.a(new f(new al1.a(r03)));
                return resultBuilder.e();
            }
            if (!(event instanceof i)) {
                throw new NoWhenBranchMatchedException();
            }
            resultBuilder.a(new f(al1.b.f15477a));
            return resultBuilder.e();
        }
        g0[] events = {((k) event).f53154a};
        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
        h0 lens = this.f53172b;
        Intrinsics.checkNotNullParameter(lens, "lens");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(events, "$events");
        Intrinsics.checkNotNullParameter(lens, "$lens");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        for (g0 g0Var : events) {
            lens.a(g0Var, resultBuilder);
        }
        return resultBuilder.e();
    }
}
