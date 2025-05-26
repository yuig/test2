package fk2;

import gk2.w0;

/* loaded from: classes2.dex */
public final class d0 extends uj2.h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f62426b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f62427c;

    public d0(Object obj, int i13) {
        this.f62426b = i13;
        this.f62427c = obj;
    }

    @Override // uj2.h
    public final void m(xp2.b bVar) {
        int i13 = this.f62426b;
        Object obj = this.f62427c;
        switch (i13) {
            case 0:
                ((uj2.b) ((uj2.f) obj)).j(new ek2.l(bVar));
                break;
            case 1:
                ((uj2.q) obj).d(new w0(bVar));
                break;
            case 2:
                ((xp2.a) obj).b(bVar);
                break;
            case 3:
                ((uj2.l) ((uj2.n) obj)).f(new hk2.c0(bVar));
                break;
            default:
                ((uj2.b0) ((uj2.f0) obj)).p(new kk2.z(bVar));
                break;
        }
    }
}
