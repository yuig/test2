package m82;

import do2.x1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l82.c0;
import l82.g;
import l82.h;
import l82.i0;
import u50.o;
import u50.s;

/* loaded from: classes4.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final List f86536a;

    public a(ArrayList debuggers) {
        Intrinsics.checkNotNullParameter(debuggers, "debuggers");
        this.f86536a = debuggers;
    }

    public final void a(h effectRequest) {
        Intrinsics.checkNotNullParameter(effectRequest, "effectRequest");
        Iterator it = this.f86536a.iterator();
        while (it.hasNext()) {
            ((a) ((b) it.next())).a(effectRequest);
        }
    }

    public final void b(i0 priorVmState, i0 nextVmState, o priorDisplayState, o nextDisplayState, List sideEffectRequests) {
        Intrinsics.checkNotNullParameter(priorVmState, "priorVmState");
        Intrinsics.checkNotNullParameter(nextVmState, "nextVmState");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(nextDisplayState, "nextDisplayState");
        Intrinsics.checkNotNullParameter(sideEffectRequests, "sideEffectRequests");
        Iterator it = this.f86536a.iterator();
        while (it.hasNext()) {
            ((a) ((b) it.next())).b(priorVmState, nextVmState, priorDisplayState, nextDisplayState, sideEffectRequests);
        }
    }

    public final void c(g sep, h effect) {
        Intrinsics.checkNotNullParameter(sep, "sep");
        Intrinsics.checkNotNullParameter(effect, "effect");
        Iterator it = this.f86536a.iterator();
        while (it.hasNext()) {
            ((a) ((b) it.next())).c(sep, effect);
        }
    }

    public final void d(Object obj, c0 subResult) {
        s subEvent = (s) obj;
        Intrinsics.checkNotNullParameter(subEvent, "subEvent");
        Intrinsics.checkNotNullParameter(subResult, "subResult");
        Iterator it = this.f86536a.iterator();
        while (it.hasNext()) {
            ((a) ((b) it.next())).d(subEvent, subResult);
        }
    }

    public final void e(x1 channel, s event, String str) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(event, "event");
        Iterator it = this.f86536a.iterator();
        while (it.hasNext()) {
            ((a) ((b) it.next())).e(channel, event, str);
        }
    }

    public final void f(o initialDS, i0 initialVMState, List initialSideEffectRequests) {
        Intrinsics.checkNotNullParameter(initialDS, "initialDS");
        Intrinsics.checkNotNullParameter(initialVMState, "initialVMState");
        Intrinsics.checkNotNullParameter(initialSideEffectRequests, "initialSideEffectRequests");
        Iterator it = this.f86536a.iterator();
        while (it.hasNext()) {
            ((a) ((b) it.next())).f(initialDS, initialVMState, initialSideEffectRequests);
        }
    }

    public final void g(s event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Iterator it = this.f86536a.iterator();
        while (it.hasNext()) {
            ((a) ((b) it.next())).g(event);
        }
    }
}
