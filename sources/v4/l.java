package v4;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class l extends u {
    @Override // v4.e
    public final void a(e eVar) {
        u4.a aVar = (u4.a) this.f124019b;
        int i13 = aVar.f120163x0;
        h hVar = this.f124025h;
        Iterator it = hVar.f124001l.iterator();
        int i14 = 0;
        int i15 = -1;
        while (it.hasNext()) {
            int i16 = ((h) it.next()).f123996g;
            if (i15 == -1 || i16 < i15) {
                i15 = i16;
            }
            if (i14 < i16) {
                i14 = i16;
            }
        }
        if (i13 == 0 || i13 == 2) {
            hVar.d(i15 + aVar.f120165z0);
        } else {
            hVar.d(i14 + aVar.f120165z0);
        }
    }

    @Override // v4.u
    public final void d() {
        u4.h hVar = this.f124019b;
        if (hVar instanceof u4.a) {
            h hVar2 = this.f124025h;
            hVar2.f123991b = true;
            u4.a aVar = (u4.a) hVar;
            int i13 = aVar.f120163x0;
            boolean z13 = aVar.f120164y0;
            int i14 = 0;
            if (i13 == 0) {
                hVar2.f123994e = g.LEFT;
                while (i14 < aVar.f120279w0) {
                    u4.h hVar3 = aVar.f120278v0[i14];
                    if (z13 || hVar3.f120213i0 != 8) {
                        h hVar4 = hVar3.f120202d.f124025h;
                        hVar4.f124000k.add(hVar2);
                        hVar2.f124001l.add(hVar4);
                    }
                    i14++;
                }
                m(this.f124019b.f120202d.f124025h);
                m(this.f124019b.f120202d.f124026i);
                return;
            }
            if (i13 == 1) {
                hVar2.f123994e = g.RIGHT;
                while (i14 < aVar.f120279w0) {
                    u4.h hVar5 = aVar.f120278v0[i14];
                    if (z13 || hVar5.f120213i0 != 8) {
                        h hVar6 = hVar5.f120202d.f124026i;
                        hVar6.f124000k.add(hVar2);
                        hVar2.f124001l.add(hVar6);
                    }
                    i14++;
                }
                m(this.f124019b.f120202d.f124025h);
                m(this.f124019b.f120202d.f124026i);
                return;
            }
            if (i13 == 2) {
                hVar2.f123994e = g.TOP;
                while (i14 < aVar.f120279w0) {
                    u4.h hVar7 = aVar.f120278v0[i14];
                    if (z13 || hVar7.f120213i0 != 8) {
                        h hVar8 = hVar7.f120204e.f124025h;
                        hVar8.f124000k.add(hVar2);
                        hVar2.f124001l.add(hVar8);
                    }
                    i14++;
                }
                m(this.f124019b.f120204e.f124025h);
                m(this.f124019b.f120204e.f124026i);
                return;
            }
            if (i13 != 3) {
                return;
            }
            hVar2.f123994e = g.BOTTOM;
            while (i14 < aVar.f120279w0) {
                u4.h hVar9 = aVar.f120278v0[i14];
                if (z13 || hVar9.f120213i0 != 8) {
                    h hVar10 = hVar9.f120204e.f124026i;
                    hVar10.f124000k.add(hVar2);
                    hVar2.f124001l.add(hVar10);
                }
                i14++;
            }
            m(this.f124019b.f120204e.f124025h);
            m(this.f124019b.f120204e.f124026i);
        }
    }

    @Override // v4.u
    public final void e() {
        u4.h hVar = this.f124019b;
        if (hVar instanceof u4.a) {
            int i13 = ((u4.a) hVar).f120163x0;
            h hVar2 = this.f124025h;
            if (i13 == 0 || i13 == 1) {
                hVar.f120197a0 = hVar2.f123996g;
            } else {
                hVar.f120199b0 = hVar2.f123996g;
            }
        }
    }

    @Override // v4.u
    public final void f() {
        this.f124020c = null;
        this.f124025h.c();
    }

    @Override // v4.u
    public final boolean k() {
        return false;
    }

    public final void m(h hVar) {
        h hVar2 = this.f124025h;
        hVar2.f124000k.add(hVar);
        hVar.f124001l.add(hVar2);
    }
}
