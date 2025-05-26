package l82;

import ao2.j0;
import ao2.k2;
import do2.f2;
import do2.g2;
import do2.s1;
import do2.z1;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;

/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f82283a;

    /* renamed from: b, reason: collision with root package name */
    public final d f82284b;

    /* renamed from: c, reason: collision with root package name */
    public final p f82285c;

    /* renamed from: d, reason: collision with root package name */
    public final f2 f82286d;

    /* renamed from: e, reason: collision with root package name */
    public final f2 f82287e;

    /* renamed from: f, reason: collision with root package name */
    public m82.b f82288f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f82289g;

    /* renamed from: h, reason: collision with root package name */
    public final f2 f82290h;

    /* renamed from: i, reason: collision with root package name */
    public k2 f82291i;

    /* renamed from: j, reason: collision with root package name */
    public c0 f82292j;

    public y(j0 scope, d stateTransformer, p tuning) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        Intrinsics.checkNotNullParameter(tuning, "tuning");
        this.f82283a = scope;
        this.f82284b = stateTransformer;
        this.f82285c = tuning;
        this.f82286d = g2.b(0, Integer.MAX_VALUE, null, 5);
        this.f82287e = g2.b(1, 0, null, 6);
        this.f82290h = g2.b(0, 0, null, 7);
    }

    public static /* synthetic */ u50.o i(y yVar, i0 i0Var, boolean z13, Function1 function1, int i13) {
        if ((i13 & 2) != 0) {
            z13 = true;
        }
        if ((i13 & 4) != 0) {
            function1 = u.f82266l;
        }
        return yVar.h(i0Var, z13, function1);
    }

    public final void a(g sep, Function1 requestConverter, Function1 eventConverter, String str) {
        Intrinsics.checkNotNullParameter(sep, "sep");
        Intrinsics.checkNotNullParameter(requestConverter, "requestConverter");
        Intrinsics.checkNotNullParameter(eventConverter, "eventConverter");
        if (this.f82289g) {
            throw new IllegalStateException("Cannot add a SEP after the engine has already been started");
        }
        kotlin.jvm.internal.j.z(this.f82283a, null, null, new t(this, requestConverter, sep, str, eventConverter, null), 3);
    }

    public final void c(m82.a debugger) {
        Intrinsics.checkNotNullParameter(debugger, "debugger");
        this.f82288f = debugger;
    }

    public final do2.i d() {
        return l0.V(new z1(this.f82287e));
    }

    public final c e() {
        return new c(this.f82283a, this.f82286d, this.f82288f);
    }

    public final u50.o f(i0 i0Var, boolean z13) {
        d dVar = this.f82284b;
        c0 c13 = dVar.c(i0Var);
        this.f82292j = c13;
        f2 f2Var = this.f82287e;
        if (z13) {
            f2Var.b(c13.f82212a);
        }
        z1 z1Var = new z1(this.f82286d);
        this.f82289g = true;
        m82.b observer = this.f82288f;
        if (observer != null) {
            Intrinsics.checkNotNullParameter(observer, "observer");
            dVar.f82215a.add(observer);
        }
        m82.b bVar = this.f82288f;
        if (bVar != null) {
            ((m82.a) bVar).f(c13.f82212a, c13.f82213b, c13.f82214c);
        }
        s1 s1Var = new s1(new o(c13.f82212a, c13.f82213b), new x(this, f2Var, null), z1Var);
        ao2.l0 l0Var = com.bumptech.glide.c.f29749b ? ao2.l0.DEFAULT : ao2.l0.UNDISPATCHED;
        CoroutineContext plus = new ao2.i0("EventsProcessing").plus(this.f82285c.f82245a);
        v vVar = new v(s1Var, null);
        j0 j0Var = this.f82283a;
        this.f82291i = kotlin.jvm.internal.j.y(j0Var, plus, l0Var, vVar);
        kotlin.jvm.internal.j.z(j0Var, new ao2.i0("InitialSideEffects"), null, new w(c13, this, null), 2);
        return c13.f82212a;
    }

    public final u50.o g(i0 i0Var, boolean z13) {
        if (!this.f82289g) {
            return null;
        }
        this.f82289g = false;
        k2 k2Var = this.f82291i;
        if (k2Var != null) {
            k2Var.cancel((CancellationException) null);
        }
        this.f82286d.l();
        this.f82287e.l();
        return f(i0Var, z13);
    }

    public final u50.o h(i0 initialState, boolean z13, Function1 onStart) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(onStart, "onStart");
        if (this.f82289g) {
            return null;
        }
        onStart.invoke(new n(this));
        return f(initialState, z13);
    }

    public final u50.o j(i0 restartState, boolean z13) {
        Intrinsics.checkNotNullParameter(restartState, "restartState");
        u50.o g13 = this.f82289g ? g(restartState, z13) : i(this, restartState, z13, null, 4);
        if (g13 != null) {
            return g13;
        }
        throw new IllegalStateException("Initial display state must be produced");
    }
}
