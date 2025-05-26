package u4;

/* loaded from: classes3.dex */
public final class q extends r {
    @Override // u4.h
    public final void c(s4.d dVar, boolean z13) {
        super.c(dVar, z13);
        if (this.f120279w0 > 0) {
            h hVar = this.f120278v0[0];
            hVar.M();
            hVar.f120209g0 = 0.5f;
            hVar.f120207f0 = 0.5f;
            d dVar2 = d.LEFT;
            hVar.f(dVar2, this, dVar2, 0);
            d dVar3 = d.RIGHT;
            hVar.f(dVar3, this, dVar3, 0);
            d dVar4 = d.TOP;
            hVar.f(dVar4, this, dVar4, 0);
            d dVar5 = d.BOTTOM;
            hVar.f(dVar5, this, dVar5, 0);
        }
    }

    @Override // u4.r
    public final void i0(int i13, int i14, int i15, int i16) {
        int i17 = this.B0 + this.C0;
        int i18 = this.f120281x0 + this.f120282y0;
        if (this.f120279w0 > 0) {
            i17 += this.f120278v0[0].y();
            i18 += this.f120278v0[0].o();
        }
        int max = Math.max(this.f120203d0, i17);
        int max2 = Math.max(this.f120205e0, i18);
        if (i13 != 1073741824) {
            i14 = i13 == Integer.MIN_VALUE ? Math.min(max, i14) : i13 == 0 ? max : 0;
        }
        if (i15 != 1073741824) {
            i16 = i15 == Integer.MIN_VALUE ? Math.min(max2, i16) : i15 == 0 ? max2 : 0;
        }
        this.E0 = i14;
        this.F0 = i16;
        b0(i14);
        W(i16);
        this.D0 = this.f120279w0 > 0;
    }
}
