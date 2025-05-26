package bo2;

import android.os.Handler;
import android.os.Looper;
import ao2.e2;
import ao2.g0;
import ao2.h2;
import ao2.o;
import ao2.o1;
import ao2.v0;
import ao2.x0;
import ho2.q;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lb.x;
import ql2.s;

/* loaded from: classes2.dex */
public final class e extends f {

    /* renamed from: c, reason: collision with root package name */
    public final Handler f23609c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23610d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f23611e;

    /* renamed from: f, reason: collision with root package name */
    public final e f23612f;

    public e(Handler handler) {
        this(handler, null, false);
    }

    @Override // ao2.r0
    public final x0 a(long j13, final Runnable runnable, CoroutineContext coroutineContext) {
        if (this.f23609c.postDelayed(runnable, s.d(j13, 4611686018427387903L))) {
            return new x0() { // from class: bo2.c
                @Override // ao2.x0
                public final void dispose() {
                    e.this.f23609c.removeCallbacks(runnable);
                }
            };
        }
        o(coroutineContext, runnable);
        return h2.f20160a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (eVar.f23609c == this.f23609c && eVar.f23611e == this.f23611e) {
                return true;
            }
        }
        return false;
    }

    @Override // ao2.r0
    public final void f(long j13, o oVar) {
        final x xVar = new x(16, oVar, this);
        if (this.f23609c.postDelayed(xVar, s.d(j13, 4611686018427387903L))) {
            oVar.e(new Function1() { // from class: bo2.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    e.this.f23609c.removeCallbacks(xVar);
                    return Unit.f80348a;
                }
            });
        } else {
            o(oVar.f20185e, xVar);
        }
    }

    @Override // ao2.f0
    public final void g(CoroutineContext coroutineContext, Runnable runnable) {
        if (this.f23609c.post(runnable)) {
            return;
        }
        o(coroutineContext, runnable);
    }

    public final int hashCode() {
        return System.identityHashCode(this.f23609c) ^ (this.f23611e ? 1231 : 1237);
    }

    @Override // ao2.f0
    public final boolean k(CoroutineContext coroutineContext) {
        return (this.f23611e && Intrinsics.d(Looper.myLooper(), this.f23609c.getLooper())) ? false : true;
    }

    public final void o(CoroutineContext coroutineContext, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        o1 o1Var = (o1) coroutineContext.get(g0.f20154b);
        if (o1Var != null) {
            o1Var.cancel(cancellationException);
        }
        ko2.f fVar = v0.f20219a;
        ko2.e.f80326c.g(coroutineContext, runnable);
    }

    @Override // ao2.f0
    public final String toString() {
        e eVar;
        String str;
        ko2.f fVar = v0.f20219a;
        e2 e2Var = q.f69782a;
        if (this == e2Var) {
            str = "Dispatchers.Main";
        } else {
            try {
                eVar = ((e) e2Var).f23612f;
            } catch (UnsupportedOperationException unused) {
                eVar = null;
            }
            str = this == eVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.f23610d;
        if (str2 == null) {
            str2 = this.f23609c.toString();
        }
        return this.f23611e ? a.a.C(str2, ".immediate") : str2;
    }

    public e(Handler handler, String str, boolean z13) {
        this.f23609c = handler;
        this.f23610d = str;
        this.f23611e = z13;
        this.f23612f = z13 ? this : new e(handler, str, true);
    }
}
