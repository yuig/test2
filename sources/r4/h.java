package r4;

import com.google.common.util.concurrent.c0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class h implements c0 {

    /* renamed from: d */
    public static final boolean f106115d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e */
    public static final Logger f106116e = Logger.getLogger(h.class.getName());

    /* renamed from: f */
    public static final tb.f f106117f;

    /* renamed from: g */
    public static final Object f106118g;

    /* renamed from: a */
    public volatile Object f106119a;

    /* renamed from: b */
    public volatile d f106120b;

    /* renamed from: c */
    public volatile g f106121c;

    static {
        tb.f fVar;
        try {
            fVar = new e(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "c"), AtomicReferenceFieldUpdater.newUpdater(h.class, d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "a"));
            th = null;
        } catch (Throwable th3) {
            th = th3;
            fVar = new f();
        }
        f106117f = fVar;
        if (th != null) {
            f106116e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f106118g = new Object();
    }

    public static void c(h hVar) {
        g gVar;
        d dVar;
        d dVar2;
        d dVar3;
        do {
            gVar = hVar.f106121c;
        } while (!f106117f.z(hVar, gVar, g.f106112c));
        while (true) {
            dVar = null;
            if (gVar == null) {
                break;
            }
            Thread thread = gVar.f106113a;
            if (thread != null) {
                gVar.f106113a = null;
                LockSupport.unpark(thread);
            }
            gVar = gVar.f106114b;
        }
        hVar.b();
        do {
            dVar2 = hVar.f106120b;
        } while (!f106117f.x(hVar, dVar2, d.f106103d));
        while (true) {
            dVar3 = dVar;
            dVar = dVar2;
            if (dVar == null) {
                break;
            }
            dVar2 = dVar.f106106c;
            dVar.f106106c = dVar3;
        }
        while (dVar3 != null) {
            d dVar4 = dVar3.f106106c;
            e(dVar3.f106104a, dVar3.f106105b);
            dVar3 = dVar4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e13) {
            f106116e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e13);
        }
    }

    public static Object f(Object obj) {
        if (obj instanceof a) {
            Throwable th3 = ((a) obj).f106100b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th3);
            throw cancellationException;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f106102a);
        }
        if (obj == f106118g) {
            return null;
        }
        return obj;
    }

    public static Object g(Future future) {
        Object obj;
        boolean z13 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z13 = true;
            } catch (Throwable th3) {
                if (z13) {
                    Thread.currentThread().interrupt();
                }
                throw th3;
            }
        }
        if (z13) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb3) {
        try {
            Object g13 = g(this);
            sb3.append("SUCCESS, result=[");
            sb3.append(g13 == this ? "this future" : String.valueOf(g13));
            sb3.append("]");
        } catch (CancellationException unused) {
            sb3.append("CANCELLED");
        } catch (RuntimeException e13) {
            sb3.append("UNKNOWN, cause=[");
            sb3.append(e13.getClass());
            sb3.append(" thrown from get()]");
        } catch (ExecutionException e14) {
            sb3.append("FAILURE, cause=[");
            sb3.append(e14.getCause());
            sb3.append("]");
        }
    }

    public void b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z13) {
        Object obj = this.f106119a;
        if (obj == null) {
            if (f106117f.y(this, obj, f106115d ? new a(z13, new CancellationException("Future.cancel() was called.")) : z13 ? a.f106097c : a.f106098d)) {
                c(this);
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.util.concurrent.c0
    public final void d(Runnable runnable, Executor executor) {
        executor.getClass();
        d dVar = this.f106120b;
        d dVar2 = d.f106103d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f106106c = dVar;
                if (f106117f.x(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.f106120b;
                }
            } while (dVar != dVar2);
        }
        e(runnable, executor);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ac  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x009f -> B:33:0x006e). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(long r20, java.util.concurrent.TimeUnit r22) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.h.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String h() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void i(g gVar) {
        gVar.f106113a = null;
        while (true) {
            g gVar2 = this.f106121c;
            if (gVar2 == g.f106112c) {
                return;
            }
            g gVar3 = null;
            while (gVar2 != null) {
                g gVar4 = gVar2.f106114b;
                if (gVar2.f106113a != null) {
                    gVar3 = gVar2;
                } else if (gVar3 != null) {
                    gVar3.f106114b = gVar4;
                    if (gVar3.f106113a == null) {
                        break;
                    }
                } else if (!f106117f.z(this, gVar2, gVar4)) {
                    break;
                }
                gVar2 = gVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f106119a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.f106119a != null) & true;
    }

    public boolean j(Object obj) {
        if (obj == null) {
            obj = f106118g;
        }
        if (!f106117f.y(this, null, obj)) {
            return false;
        }
        c(this);
        return true;
    }

    public boolean k(Throwable th3) {
        th3.getClass();
        if (!f106117f.y(this, null, new c(th3))) {
            return false;
        }
        c(this);
        return true;
    }

    public final String toString() {
        String str;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(super.toString());
        sb3.append("[status=");
        if (this.f106119a instanceof a) {
            sb3.append("CANCELLED");
        } else if (isDone()) {
            a(sb3);
        } else {
            try {
                str = h();
            } catch (RuntimeException e13) {
                str = "Exception thrown from implementation: " + e13.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb3.append("PENDING, info=[");
                sb3.append(str);
                sb3.append("]");
            } else if (isDone()) {
                a(sb3);
            } else {
                sb3.append("PENDING");
            }
        }
        sb3.append("]");
        return sb3.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f106119a;
            if ((obj2 != null) & true) {
                return f(obj2);
            }
            g gVar = this.f106121c;
            g gVar2 = g.f106112c;
            if (gVar != gVar2) {
                g gVar3 = new g();
                do {
                    tb.f fVar = f106117f;
                    fVar.a0(gVar3, gVar);
                    if (fVar.z(this, gVar, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f106119a;
                            } else {
                                i(gVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & true));
                        return f(obj);
                    }
                    gVar = this.f106121c;
                } while (gVar != gVar2);
            }
            return f(this.f106119a);
        }
        throw new InterruptedException();
    }
}
