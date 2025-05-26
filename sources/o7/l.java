package o7;

import d7.n0;

/* loaded from: classes3.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f93134a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qq2.c f93135b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f93136c;

    public /* synthetic */ l(qq2.c cVar, m mVar, int i13) {
        this.f93134a = i13;
        this.f93135b = cVar;
        this.f93136c = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f93134a;
        final m mVar = this.f93136c;
        qq2.c cVar = this.f93135b;
        switch (i13) {
            case 0:
                m7.i0 i0Var = (m7.i0) cVar.f104884c;
                int i14 = n0.f53866a;
                n7.c0 c0Var = (n7.c0) i0Var.f86205a.f86285t;
                final n7.b w13 = c0Var.w();
                final int i15 = 0;
                c0Var.x(w13, 1032, new d7.r() { // from class: n7.s
                    @Override // d7.r
                    /* renamed from: invoke */
                    public final void mo0invoke(Object obj) {
                        int i16 = i15;
                        o7.m mVar2 = mVar;
                        b bVar = w13;
                        c cVar2 = (c) obj;
                        switch (i16) {
                            case 0:
                                cVar2.J(bVar, mVar2);
                                break;
                            default:
                                cVar2.N(bVar, mVar2);
                                break;
                        }
                    }
                });
                break;
            default:
                m7.i0 i0Var2 = (m7.i0) cVar.f104884c;
                int i16 = n0.f53866a;
                n7.c0 c0Var2 = (n7.c0) i0Var2.f86205a.f86285t;
                final n7.b w14 = c0Var2.w();
                final int i17 = 1;
                c0Var2.x(w14, 1031, new d7.r() { // from class: n7.s
                    @Override // d7.r
                    /* renamed from: invoke */
                    public final void mo0invoke(Object obj) {
                        int i162 = i17;
                        o7.m mVar2 = mVar;
                        b bVar = w14;
                        c cVar2 = (c) obj;
                        switch (i162) {
                            case 0:
                                cVar2.J(bVar, mVar2);
                                break;
                            default:
                                cVar2.N(bVar, mVar2);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
