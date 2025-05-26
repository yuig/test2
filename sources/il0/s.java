package il0;

import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import l82.c0;
import l82.h0;
import l82.i0;

/* loaded from: classes5.dex */
public final class s extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final h0 f72543b;

    /* renamed from: c, reason: collision with root package name */
    public final h0 f72544c;

    public s(lt.j floatingToolbarStateTransformer, lt.j organizeFloatingToolbarStateTransformer) {
        Intrinsics.checkNotNullParameter(floatingToolbarStateTransformer, "floatingToolbarStateTransformer");
        Intrinsics.checkNotNullParameter(organizeFloatingToolbarStateTransformer, "organizeFloatingToolbarStateTransformer");
        this.f72543b = b(floatingToolbarStateTransformer, new d0() { // from class: il0.m
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((a) obj).f72524c;
            }
        }, new d0() { // from class: il0.n
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((t) obj).f72545a;
            }
        }, o.f72536j);
        this.f72544c = b(organizeFloatingToolbarStateTransformer, new d0() { // from class: il0.p
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((a) obj).f72525d;
            }
        }, new d0() { // from class: il0.q
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((t) obj).f72546b;
            }
        }, o.f72537k);
    }

    @Override // l82.d
    public final c0 c(i0 i0Var) {
        t vmState = (t) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        l82.e resultBuilder = l82.d.d(new a(false, null, new sk0.d(), new tk0.e((ArrayList) null, (xm0.a) null, (tk0.a) null, 15)), vmState);
        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
        h0 lens = this.f72543b;
        Intrinsics.checkNotNullParameter(lens, "lens");
        Intrinsics.checkNotNullParameter(lens, "$lens");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        lens.b(resultBuilder);
        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
        h0 lens2 = this.f72544c;
        Intrinsics.checkNotNullParameter(lens2, "lens");
        Intrinsics.checkNotNullParameter(lens2, "$lens");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        lens2.b(resultBuilder);
        return resultBuilder.e();
    }

    @Override // l82.d
    public final c0 f(u50.s sVar, u50.o oVar, i0 i0Var, l82.e resultBuilder) {
        f event = (f) sVar;
        a priorDisplayState = (a) oVar;
        t priorVMState = (t) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (event instanceof c) {
            resultBuilder.a(new j(((c) event).f72527a));
        } else if (event instanceof b) {
            resultBuilder.a(i.f72532a);
        } else if (event instanceof d) {
            sk0.i event2 = ((d) event).f72528a;
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            h0 lens = this.f72543b;
            Intrinsics.checkNotNullParameter(lens, "lens");
            Intrinsics.checkNotNullParameter(event2, "event");
            Intrinsics.checkNotNullParameter(lens, "$lens");
            Intrinsics.checkNotNullParameter(event2, "$event");
            Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
            lens.a(event2, resultBuilder);
        } else {
            if (!(event instanceof e)) {
                throw new NoWhenBranchMatchedException();
            }
            tk0.q event3 = ((e) event).f72529a;
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            h0 lens2 = this.f72544c;
            Intrinsics.checkNotNullParameter(lens2, "lens");
            Intrinsics.checkNotNullParameter(event3, "event");
            Intrinsics.checkNotNullParameter(lens2, "$lens");
            Intrinsics.checkNotNullParameter(event3, "$event");
            Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
            lens2.a(event3, resultBuilder);
        }
        return resultBuilder.e();
    }
}
