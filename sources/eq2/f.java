package eq2;

import yp2.i;

/* loaded from: classes4.dex */
public final class f extends yp2.b implements g {

    /* renamed from: a, reason: collision with root package name */
    public yp2.c f59944a = g.Sn;

    /* renamed from: b, reason: collision with root package name */
    public yp2.e f59945b;

    public f(int i13, int i14, int i15, int i16) {
        yp2.d dVar = new yp2.d();
        dVar.a(new yp2.a(i13));
        if (i15 == 0) {
            if (i16 != 0) {
                throw new IllegalArgumentException("inconsistent k values");
            }
            dVar.a(g.Tn);
            dVar.a(new yp2.a(i14));
        } else {
            if (i15 <= i14 || i16 <= i15) {
                throw new IllegalArgumentException("inconsistent k values");
            }
            dVar.a(g.Un);
            yp2.d dVar2 = new yp2.d();
            dVar2.a(new yp2.a(i14));
            dVar2.a(new yp2.a(i15));
            dVar2.a(new yp2.a(i16));
            dVar.a(new i(dVar2));
        }
        this.f59945b = new i(dVar);
    }

    @Override // yp2.b
    public final yp2.e b() {
        yp2.d dVar = new yp2.d();
        dVar.a(this.f59944a);
        dVar.a(this.f59945b);
        return new i(dVar);
    }
}
