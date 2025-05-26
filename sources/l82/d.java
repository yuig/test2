package l82;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f82215a = new ArrayList();

    public static void a(String devMessage) {
        Intrinsics.checkNotNullParameter(devMessage, "devMessage");
        vb0.j.f125466a.G(devMessage, new Object[0]);
    }

    public static e d(u50.o initialDisplayState, i0 initialVMState) {
        Intrinsics.checkNotNullParameter(initialDisplayState, "initialDisplayState");
        Intrinsics.checkNotNullParameter(initialVMState, "initialVMState");
        return new e(initialDisplayState, initialVMState);
    }

    public final h0 b(d subTransformer, Function1 displayStateExtractor, Function1 vmStateExtractor, Function2 applyResult) {
        Intrinsics.checkNotNullParameter(subTransformer, "subTransformer");
        Intrinsics.checkNotNullParameter(displayStateExtractor, "displayStateExtractor");
        Intrinsics.checkNotNullParameter(vmStateExtractor, "vmStateExtractor");
        Intrinsics.checkNotNullParameter(applyResult, "applyResult");
        return new h0(subTransformer, new p1.v(4, displayStateExtractor, vmStateExtractor), this.f82215a, applyResult);
    }

    public abstract c0 c(i0 i0Var);

    public final c0 e(u50.s event, u50.o priorDisplayState, i0 priorVMState) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        return f(event, priorDisplayState, priorVMState, new e(priorDisplayState, priorVMState));
    }

    public abstract c0 f(u50.s sVar, u50.o oVar, i0 i0Var, e eVar);
}
