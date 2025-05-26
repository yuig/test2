package y0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import kh2.m0;

/* loaded from: classes2.dex */
public final /* synthetic */ class u implements r4.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136365a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f136366b;

    public /* synthetic */ u(x xVar, int i13) {
        this.f136365a = i13;
        this.f136366b = xVar;
    }

    @Override // r4.j
    public final Object C(final r4.i iVar) {
        int i13 = this.f136365a;
        final x xVar = this.f136366b;
        switch (i13) {
            case 0:
                final int i14 = 0;
                xVar.f136376d.f136284h.execute(new Runnable() { // from class: y0.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i15 = i14;
                        r4.i iVar2 = iVar;
                        final x xVar2 = xVar;
                        switch (i15) {
                            case 0:
                                iVar2.b(xVar2.f136374b);
                                break;
                            default:
                                t0.b bVar = xVar2.f136374b;
                                if (bVar != t0.b.ACTIVE) {
                                    if (bVar != t0.b.INACTIVE) {
                                        iVar2.d(new IllegalStateException("Unknown state: " + xVar2.f136374b));
                                        break;
                                    } else {
                                        iVar2.d(new IllegalStateException("BufferProvider is not active."));
                                        break;
                                    }
                                } else {
                                    c0 c0Var = xVar2.f136376d;
                                    final com.google.common.util.concurrent.c0 a13 = c0Var.a();
                                    g0.m.g(a13, iVar2);
                                    final int i16 = 0;
                                    iVar2.a(new Runnable() { // from class: y0.w
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i17 = i16;
                                            com.google.common.util.concurrent.c0 c0Var2 = a13;
                                            x xVar3 = xVar2;
                                            switch (i17) {
                                                case 0:
                                                    xVar3.getClass();
                                                    if (!c0Var2.cancel(true)) {
                                                        com.bumptech.glide.d.v(null, c0Var2.isDone());
                                                        try {
                                                            ((d0) c0Var2.get()).a();
                                                            break;
                                                        } catch (InterruptedException | CancellationException | ExecutionException e13) {
                                                            m0.X0(xVar3.f136376d.f136277a, "Unable to cancel the input buffer: " + e13);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    xVar3.f136375c.remove(c0Var2);
                                                    break;
                                            }
                                        }
                                    }, l3.c.s());
                                    xVar2.f136375c.add(a13);
                                    final int i17 = 1;
                                    a13.d(new Runnable() { // from class: y0.w
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i172 = i17;
                                            com.google.common.util.concurrent.c0 c0Var2 = a13;
                                            x xVar3 = xVar2;
                                            switch (i172) {
                                                case 0:
                                                    xVar3.getClass();
                                                    if (!c0Var2.cancel(true)) {
                                                        com.bumptech.glide.d.v(null, c0Var2.isDone());
                                                        try {
                                                            ((d0) c0Var2.get()).a();
                                                            break;
                                                        } catch (InterruptedException | CancellationException | ExecutionException e13) {
                                                            m0.X0(xVar3.f136376d.f136277a, "Unable to cancel the input buffer: " + e13);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    xVar3.f136375c.remove(c0Var2);
                                                    break;
                                            }
                                        }
                                    }, c0Var.f136284h);
                                    break;
                                }
                        }
                    }
                });
                return "fetchData";
            default:
                final int i15 = 1;
                xVar.f136376d.f136284h.execute(new Runnable() { // from class: y0.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i152 = i15;
                        r4.i iVar2 = iVar;
                        final x xVar2 = xVar;
                        switch (i152) {
                            case 0:
                                iVar2.b(xVar2.f136374b);
                                break;
                            default:
                                t0.b bVar = xVar2.f136374b;
                                if (bVar != t0.b.ACTIVE) {
                                    if (bVar != t0.b.INACTIVE) {
                                        iVar2.d(new IllegalStateException("Unknown state: " + xVar2.f136374b));
                                        break;
                                    } else {
                                        iVar2.d(new IllegalStateException("BufferProvider is not active."));
                                        break;
                                    }
                                } else {
                                    c0 c0Var = xVar2.f136376d;
                                    final com.google.common.util.concurrent.c0 a13 = c0Var.a();
                                    g0.m.g(a13, iVar2);
                                    final int i16 = 0;
                                    iVar2.a(new Runnable() { // from class: y0.w
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i172 = i16;
                                            com.google.common.util.concurrent.c0 c0Var2 = a13;
                                            x xVar3 = xVar2;
                                            switch (i172) {
                                                case 0:
                                                    xVar3.getClass();
                                                    if (!c0Var2.cancel(true)) {
                                                        com.bumptech.glide.d.v(null, c0Var2.isDone());
                                                        try {
                                                            ((d0) c0Var2.get()).a();
                                                            break;
                                                        } catch (InterruptedException | CancellationException | ExecutionException e13) {
                                                            m0.X0(xVar3.f136376d.f136277a, "Unable to cancel the input buffer: " + e13);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    xVar3.f136375c.remove(c0Var2);
                                                    break;
                                            }
                                        }
                                    }, l3.c.s());
                                    xVar2.f136375c.add(a13);
                                    final int i17 = 1;
                                    a13.d(new Runnable() { // from class: y0.w
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i172 = i17;
                                            com.google.common.util.concurrent.c0 c0Var2 = a13;
                                            x xVar3 = xVar2;
                                            switch (i172) {
                                                case 0:
                                                    xVar3.getClass();
                                                    if (!c0Var2.cancel(true)) {
                                                        com.bumptech.glide.d.v(null, c0Var2.isDone());
                                                        try {
                                                            ((d0) c0Var2.get()).a();
                                                            break;
                                                        } catch (InterruptedException | CancellationException | ExecutionException e13) {
                                                            m0.X0(xVar3.f136376d.f136277a, "Unable to cancel the input buffer: " + e13);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    xVar3.f136375c.remove(c0Var2);
                                                    break;
                                            }
                                        }
                                    }, c0Var.f136284h);
                                    break;
                                }
                        }
                    }
                });
                return "acquireBuffer";
        }
    }
}
