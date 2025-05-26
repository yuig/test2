package o7;

import d7.n0;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f93112a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qq2.c f93113b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m7.i f93114c;

    public /* synthetic */ j(qq2.c cVar, m7.i iVar, int i13) {
        this.f93112a = i13;
        this.f93113b = cVar;
        this.f93114c = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f93112a) {
            case 0:
                m7.i0 i0Var = (m7.i0) this.f93113b.f104884c;
                int i13 = n0.f53866a;
                m7.l0 l0Var = i0Var.f86205a;
                l0Var.getClass();
                n7.c0 c0Var = (n7.c0) l0Var.f86285t;
                final n7.b w13 = c0Var.w();
                final int i14 = 0;
                final m7.i iVar = this.f93114c;
                c0Var.x(w13, 1007, new d7.r(w13, iVar, i14) { // from class: n7.k

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f89468a;

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ b f89469b;

                    {
                        this.f89468a = i14;
                    }

                    @Override // d7.r
                    /* renamed from: invoke */
                    public final void mo0invoke(Object obj) {
                        int i15 = this.f89468a;
                        b bVar = this.f89469b;
                        c cVar = (c) obj;
                        switch (i15) {
                            case 0:
                                cVar.U(bVar);
                                break;
                            default:
                                cVar.p(bVar);
                                break;
                        }
                    }
                });
                break;
            default:
                qq2.c cVar = this.f93113b;
                final m7.i iVar2 = this.f93114c;
                cVar.getClass();
                synchronized (iVar2) {
                }
                m7.i0 i0Var2 = (m7.i0) cVar.f104884c;
                int i15 = n0.f53866a;
                n7.c0 c0Var2 = (n7.c0) i0Var2.f86205a.f86285t;
                final n7.b u13 = c0Var2.u(c0Var2.f89397d.f89392e);
                final int i16 = 1;
                c0Var2.x(u13, 1013, new d7.r(u13, iVar2, i16) { // from class: n7.k

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f89468a;

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ b f89469b;

                    {
                        this.f89468a = i16;
                    }

                    @Override // d7.r
                    /* renamed from: invoke */
                    public final void mo0invoke(Object obj) {
                        int i152 = this.f89468a;
                        b bVar = this.f89469b;
                        c cVar2 = (c) obj;
                        switch (i152) {
                            case 0:
                                cVar2.U(bVar);
                                break;
                            default:
                                cVar2.p(bVar);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
