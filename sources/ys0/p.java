package ys0;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import l82.c0;
import l82.h0;
import o82.a0;
import o82.g0;
import o82.i0;

/* loaded from: classes5.dex */
public final class p extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final h0 f140124b;

    public p(i0 multiSectionStateTransformer) {
        Intrinsics.checkNotNullParameter(multiSectionStateTransformer, "multiSectionStateTransformer");
        this.f140124b = b(multiSectionStateTransformer, new d0() { // from class: ys0.m
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((b) obj).f140111a;
            }
        }, new d0() { // from class: ys0.n
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((q) obj).f140126b;
            }
        }, o.f140123i);
    }

    @Override // l82.d
    public final c0 c(l82.i0 i0Var) {
        q vmState = (q) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        l82.e d2 = l82.d.d(new b(new a0()), vmState);
        com.google.firebase.messaging.a0 transformation = this.f140124b.e();
        Intrinsics.checkNotNullParameter(d2, "<this>");
        Intrinsics.checkNotNullParameter(transformation, "transformation");
        transformation.i(d2);
        return d2.e();
    }

    @Override // l82.d
    public final c0 f(u50.s sVar, u50.o oVar, l82.i0 i0Var, l82.e resultBuilder) {
        e event = (e) sVar;
        b priorDisplayState = (b) oVar;
        q priorVMState = (q) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (event instanceof d) {
            g0 event2 = ((d) event).f140113a;
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            h0 lens = this.f140124b;
            Intrinsics.checkNotNullParameter(lens, "lens");
            Intrinsics.checkNotNullParameter(event2, "event");
            Intrinsics.checkNotNullParameter(lens, "$lens");
            Intrinsics.checkNotNullParameter(event2, "$event");
            Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
            lens.a(event2, resultBuilder);
        } else if (event instanceof c) {
            resultBuilder.a(new j(priorVMState.f140125a.f143086a));
        }
        return resultBuilder.e();
    }
}
