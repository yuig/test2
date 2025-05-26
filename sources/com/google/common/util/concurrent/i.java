package com.google.common.util.concurrent;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import pk.c1;
import pk.n3;
import pk.v0;

/* loaded from: classes3.dex */
public abstract class i extends l {

    /* renamed from: j, reason: collision with root package name */
    public static final b0 f33565j = new b0(i.class);

    /* renamed from: g, reason: collision with root package name */
    public v0 f33566g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f33567h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f33568i;

    public i(c1 c1Var, boolean z13, boolean z14) {
        super(c1Var.size());
        this.f33566g = c1Var;
        this.f33567h = z13;
        this.f33568i = z14;
    }

    @Override // com.google.common.util.concurrent.l
    public final void C(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable a13 = a();
        Objects.requireNonNull(a13);
        while (a13 != null && set.add(a13)) {
            a13 = a13.getCause();
        }
    }

    public abstract void F(int i13, Object obj);

    public final void G(v0 v0Var) {
        int u13 = l.f33573e.u(this);
        int i13 = 0;
        bf.b.u("Less than 0 remaining futures", u13 >= 0);
        if (u13 == 0) {
            if (v0Var != null) {
                n3 it = v0Var.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        try {
                            F(i13, com.bumptech.glide.c.c0(future));
                        } catch (ExecutionException e13) {
                            I(e13.getCause());
                        } catch (Throwable th3) {
                            I(th3);
                        }
                    }
                    i13++;
                }
            }
            D();
            H();
            L(h.ALL_INPUT_FUTURES_PROCESSED);
        }
    }

    public abstract void H();

    public final void I(Throwable th3) {
        th3.getClass();
        boolean z13 = this.f33567h;
        b0 b0Var = f33565j;
        if (z13 && !w(th3)) {
            Set E = E();
            for (Throwable th4 = th3; th4 != null; th4 = th4.getCause()) {
                if (E.add(th4)) {
                }
            }
            b0Var.a().log(Level.SEVERE, th3 instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th3);
            return;
        }
        boolean z14 = th3 instanceof Error;
        if (z14) {
            b0Var.a().log(Level.SEVERE, z14 ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th3);
        }
    }

    public final void J() {
        Objects.requireNonNull(this.f33566g);
        if (this.f33566g.isEmpty()) {
            H();
            return;
        }
        if (this.f33567h) {
            n3 it = this.f33566g.iterator();
            int i13 = 0;
            while (it.hasNext()) {
                c0 c0Var = (c0) it.next();
                int i14 = i13 + 1;
                if (c0Var.isDone()) {
                    K(i13, c0Var);
                } else {
                    c0Var.d(new v.j(this, i13, c0Var, 8), r.INSTANCE);
                }
                i13 = i14;
            }
            return;
        }
        v0 v0Var = this.f33566g;
        v0 v0Var2 = this.f33568i ? v0Var : null;
        androidx.media3.ui.z zVar = new androidx.media3.ui.z(21, this, v0Var2);
        n3 it2 = v0Var.iterator();
        while (it2.hasNext()) {
            c0 c0Var2 = (c0) it2.next();
            if (c0Var2.isDone()) {
                G(v0Var2);
            } else {
                c0Var2.d(zVar, r.INSTANCE);
            }
        }
    }

    public final void K(int i13, c0 c0Var) {
        try {
            if (c0Var.isCancelled()) {
                this.f33566g = null;
                cancel(false);
            } else {
                try {
                    F(i13, com.bumptech.glide.c.c0(c0Var));
                } catch (ExecutionException e13) {
                    I(e13.getCause());
                } catch (Throwable th3) {
                    I(th3);
                }
            }
        } finally {
            G(null);
        }
    }

    public abstract void L(h hVar);

    @Override // com.google.common.util.concurrent.b
    public final void k() {
        v0 v0Var = this.f33566g;
        L(h.OUTPUT_FUTURE_DONE);
        if (isCancelled() && (v0Var != null)) {
            boolean y13 = y();
            n3 it = v0Var.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(y13);
            }
        }
    }

    @Override // com.google.common.util.concurrent.b
    public final String t() {
        v0 v0Var = this.f33566g;
        if (v0Var == null) {
            return super.t();
        }
        return "futures=" + v0Var;
    }
}
