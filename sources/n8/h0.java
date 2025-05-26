package n8;

import d7.n0;
import m7.l0;

/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89813a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tb.c f89814b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m7.i f89815c;

    public /* synthetic */ h0(tb.c cVar, m7.i iVar, int i13) {
        this.f89813a = i13;
        this.f89814b = cVar;
        this.f89815c = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f89813a) {
            case 0:
                i0 i0Var = (i0) this.f89814b.f116960b;
                int i13 = n0.f53866a;
                l0 l0Var = ((m7.i0) i0Var).f86205a;
                l0Var.getClass();
                n7.c0 c0Var = (n7.c0) l0Var.f86285t;
                final n7.b w13 = c0Var.w();
                final int i14 = 1;
                final m7.i iVar = this.f89815c;
                c0Var.x(w13, 1015, new d7.r() { // from class: n7.i
                    @Override // d7.r
                    /* renamed from: invoke */
                    public final void mo0invoke(Object obj) {
                        int i15 = i14;
                        b bVar = w13;
                        c cVar = (c) obj;
                        switch (i15) {
                            case 0:
                                cVar.k(bVar, iVar);
                                break;
                            default:
                                cVar.B(bVar);
                                break;
                        }
                    }
                });
                break;
            default:
                tb.c cVar = this.f89814b;
                final m7.i iVar2 = this.f89815c;
                cVar.getClass();
                synchronized (iVar2) {
                }
                i0 i0Var2 = (i0) cVar.f116960b;
                int i15 = n0.f53866a;
                l0 l0Var2 = ((m7.i0) i0Var2).f86205a;
                n7.c0 c0Var2 = (n7.c0) l0Var2.f86285t;
                final n7.b u13 = c0Var2.u(c0Var2.f89397d.f89392e);
                final int i16 = 0;
                c0Var2.x(u13, 1020, new d7.r() { // from class: n7.i
                    @Override // d7.r
                    /* renamed from: invoke */
                    public final void mo0invoke(Object obj) {
                        int i152 = i16;
                        b bVar = u13;
                        c cVar2 = (c) obj;
                        switch (i152) {
                            case 0:
                                cVar2.k(bVar, iVar2);
                                break;
                            default:
                                cVar2.B(bVar);
                                break;
                        }
                    }
                });
                l0Var2.S = null;
                break;
        }
    }
}
