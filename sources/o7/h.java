package o7;

import d7.n0;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f93100a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qq2.c f93101b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Exception f93102c;

    public /* synthetic */ h(qq2.c cVar, Exception exc, int i13) {
        this.f93100a = i13;
        this.f93101b = cVar;
        this.f93102c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f93100a;
        Exception exc = this.f93102c;
        qq2.c cVar = this.f93101b;
        switch (i13) {
            case 0:
                m7.i0 i0Var = (m7.i0) cVar.f104884c;
                int i14 = n0.f53866a;
                n7.c0 c0Var = (n7.c0) i0Var.f86205a.f86285t;
                n7.b w13 = c0Var.w();
                c0Var.x(w13, 1029, new n7.v(w13, exc, 1));
                break;
            default:
                m7.i0 i0Var2 = (m7.i0) cVar.f104884c;
                int i15 = n0.f53866a;
                n7.c0 c0Var2 = (n7.c0) i0Var2.f86205a.f86285t;
                n7.b w14 = c0Var2.w();
                c0Var2.x(w14, 1014, new n7.v(w14, exc, 3));
                break;
        }
    }
}
