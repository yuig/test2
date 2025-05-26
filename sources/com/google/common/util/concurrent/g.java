package com.google.common.util.concurrent;

import df.j1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public abstract class g extends s implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public c0 f33560e;

    /* renamed from: f, reason: collision with root package name */
    public Object f33561f;

    public g(c0 c0Var, Object obj) {
        c0Var.getClass();
        this.f33560e = c0Var;
        this.f33561f = obj;
    }

    public static f A(c0 c0Var, ok.t tVar, Executor executor) {
        f fVar = new f(c0Var, tVar);
        c0Var.d(fVar, j1.v1(executor, fVar));
        return fVar;
    }

    public static e B(c0 c0Var, m mVar, Executor executor) {
        executor.getClass();
        e eVar = new e(c0Var, mVar);
        c0Var.d(eVar, j1.v1(executor, eVar));
        return eVar;
    }

    public abstract Object C(Object obj, Object obj2);

    public abstract void D(Object obj);

    @Override // com.google.common.util.concurrent.b
    public final void k() {
        c0 c0Var = this.f33560e;
        if ((c0Var != null) & isCancelled()) {
            c0Var.cancel(y());
        }
        this.f33560e = null;
        this.f33561f = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c0 c0Var = this.f33560e;
        Object obj = this.f33561f;
        if ((isCancelled() | (c0Var == null)) || (obj == null)) {
            return;
        }
        this.f33560e = null;
        if (c0Var.isCancelled()) {
            x(c0Var);
            return;
        }
        try {
            try {
                Object C = C(obj, dl2.b.H0(c0Var));
                this.f33561f = null;
                D(C);
            } catch (Throwable th3) {
                try {
                    if (th3 instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    w(th3);
                } finally {
                    this.f33561f = null;
                }
            }
        } catch (Error e13) {
            w(e13);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e14) {
            w(e14.getCause());
        } catch (Exception e15) {
            w(e15);
        }
    }

    @Override // com.google.common.util.concurrent.b
    public final String t() {
        String str;
        c0 c0Var = this.f33560e;
        Object obj = this.f33561f;
        String t13 = super.t();
        if (c0Var != null) {
            str = "inputFuture=[" + c0Var + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (t13 != null) {
                return a.a.C(str, t13);
            }
            return null;
        }
        return str + "function=[" + obj + "]";
    }
}
