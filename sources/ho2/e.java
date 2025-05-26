package ho2;

import ao2.f0;
import ao2.f1;
import ao2.m0;
import ao2.o2;
import ao2.t0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes2.dex */
public final class e extends t0 implements dl2.e, bl2.c {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f69753h = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final f0 f69754d;

    /* renamed from: e, reason: collision with root package name */
    public final bl2.c f69755e;

    /* renamed from: f, reason: collision with root package name */
    public Object f69756f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f69757g;

    public e(f0 f0Var, bl2.c cVar) {
        super(-1);
        this.f69754d = f0Var;
        this.f69755e = cVar;
        this.f69756f = f.f69758a;
        this.f69757g = y.b(cVar.getContext());
    }

    @Override // ao2.t0
    public final bl2.c c() {
        return this;
    }

    @Override // dl2.e
    public final dl2.e getCallerFrame() {
        bl2.c cVar = this.f69755e;
        if (cVar instanceof dl2.e) {
            return (dl2.e) cVar;
        }
        return null;
    }

    @Override // bl2.c
    public final CoroutineContext getContext() {
        return this.f69755e.getContext();
    }

    @Override // ao2.t0
    public final Object l() {
        Object obj = this.f69756f;
        this.f69756f = f.f69758a;
        return obj;
    }

    @Override // bl2.c
    public final void resumeWith(Object obj) {
        Throwable a13 = xk2.s.a(obj);
        Object zVar = a13 == null ? obj : new ao2.z(false, a13);
        bl2.c cVar = this.f69755e;
        CoroutineContext context = cVar.getContext();
        f0 f0Var = this.f69754d;
        if (f0Var.k(context)) {
            this.f69756f = zVar;
            this.f20207c = 0;
            f0Var.g(cVar.getContext(), this);
            return;
        }
        f1 a14 = o2.a();
        if (a14.J()) {
            this.f69756f = zVar;
            this.f20207c = 0;
            a14.w(this);
            return;
        }
        a14.A(true);
        try {
            CoroutineContext context2 = cVar.getContext();
            Object c13 = y.c(context2, this.f69757g);
            try {
                cVar.resumeWith(obj);
                Unit unit = Unit.f80348a;
                while (a14.L()) {
                }
            } finally {
                y.a(context2, c13);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f69754d + ", " + m0.q0(this.f69755e) + ']';
    }
}
