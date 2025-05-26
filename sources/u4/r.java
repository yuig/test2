package u4;

import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class r extends o {

    /* renamed from: x0, reason: collision with root package name */
    public int f120281x0 = 0;

    /* renamed from: y0, reason: collision with root package name */
    public int f120282y0 = 0;

    /* renamed from: z0, reason: collision with root package name */
    public int f120283z0 = 0;
    public int A0 = 0;
    public int B0 = 0;
    public int C0 = 0;
    public boolean D0 = false;
    public int E0 = 0;
    public int F0 = 0;
    public final v4.b G0 = new v4.b();
    public v4.c H0 = null;

    @Override // u4.o, u4.n
    public final void a() {
        for (int i13 = 0; i13 < this.f120279w0; i13++) {
            h hVar = this.f120278v0[i13];
            if (hVar != null) {
                hVar.G = true;
            }
        }
    }

    public final boolean h0(HashSet hashSet) {
        for (int i13 = 0; i13 < this.f120279w0; i13++) {
            if (hashSet.contains(this.f120278v0[i13])) {
                return true;
            }
        }
        return false;
    }

    public abstract void i0(int i13, int i14, int i15, int i16);

    public final void j0(h hVar, g gVar, int i13, g gVar2, int i14) {
        v4.c cVar;
        h hVar2;
        while (true) {
            cVar = this.H0;
            if (cVar != null || (hVar2 = this.V) == null) {
                break;
            } else {
                this.H0 = ((i) hVar2).f120246z0;
            }
        }
        v4.b bVar = this.G0;
        bVar.f123969a = gVar;
        bVar.f123970b = gVar2;
        bVar.f123971c = i13;
        bVar.f123972d = i14;
        ((androidx.constraintlayout.widget.f) cVar).b(hVar, bVar);
        hVar.b0(bVar.f123973e);
        hVar.W(bVar.f123974f);
        hVar.E = bVar.f123976h;
        hVar.R(bVar.f123975g);
    }
}
