package a7;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseBooleanArray;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1154a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1155b;

    public o(int i13) {
        if (i13 == 1) {
            this.f1155b = d7.e.f53809a;
            return;
        }
        if (i13 != 2) {
            if (i13 == 3) {
                this.f1155b = new Handler(Looper.getMainLooper(), new pd.j0());
            } else if (i13 != 4) {
                this.f1155b = new SparseBooleanArray();
            } else {
                this.f1155b = "";
            }
        }
    }

    public final void a(int i13) {
        bf.b.t(!this.f1154a);
        ((SparseBooleanArray) this.f1155b).append(i13, true);
    }

    public final synchronized void b() {
        while (!this.f1154a) {
            wait();
        }
    }

    public final synchronized boolean c(long j13) {
        if (j13 <= 0) {
            return this.f1154a;
        }
        ((d7.g0) ((d7.e) this.f1155b)).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j14 = j13 + elapsedRealtime;
        if (j14 < elapsedRealtime) {
            b();
        } else {
            while (!this.f1154a && elapsedRealtime < j14) {
                wait(j14 - elapsedRealtime);
                ((d7.g0) ((d7.e) this.f1155b)).getClass();
                elapsedRealtime = SystemClock.elapsedRealtime();
            }
        }
        return this.f1154a;
    }

    public final synchronized void d() {
        boolean z13 = false;
        while (!this.f1154a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z13 = true;
            }
        }
        if (z13) {
            Thread.currentThread().interrupt();
        }
    }

    public final p e() {
        bf.b.t(!this.f1154a);
        this.f1154a = true;
        return new p((SparseBooleanArray) this.f1155b);
    }

    public final synchronized void f() {
        this.f1154a = false;
    }

    public final sq0.h0 g(int i13) {
        sq0.g0 g0Var = (sq0.g0) ((g1.p0) this.f1155b).g(i13);
        if (g0Var == null) {
            return null;
        }
        Object obj = g0Var.f115000b;
        if (obj == null) {
            obj = g0Var.f114999a.invoke();
            g0Var.f115000b = obj;
        }
        return (sq0.h0) obj;
    }

    public final synchronized boolean h() {
        if (this.f1154a) {
            return false;
        }
        this.f1154a = true;
        notifyAll();
        return true;
    }

    public final synchronized void i(pd.g0 g0Var, boolean z13) {
        try {
            if (!this.f1154a && !z13) {
                this.f1154a = true;
                g0Var.c();
                this.f1154a = false;
            }
            ((Handler) this.f1155b).obtainMessage(1, g0Var).sendToTarget();
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void j(int i13, sq0.h0 instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (!this.f1154a) {
            sq0.g0 g0Var = (sq0.g0) ((g1.p0) this.f1155b).g(i13);
            Object g13 = ((g1.p0) this.f1155b).g(i13);
            String errorMessage = "Trying to register " + instance + " but id " + i13 + " is already registered to " + g0Var;
            Object[] args = new Object[0];
            m60.f0 f0Var = vb0.j.f125466a;
            f0Var.getClass();
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            Intrinsics.checkNotNullParameter(args, "args");
            if (g13 != null) {
                f0Var.s0(df.j1.W(errorMessage, args), tb0.p.UNSPECIFIED);
            }
        }
        ((g1.p0) this.f1155b).j(i13, new sq0.g0(new nx.r0(instance, 7)));
    }

    public o(boolean z13) {
        this.f1154a = z13;
        this.f1155b = new g1.p0(0);
    }
}
