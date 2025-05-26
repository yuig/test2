package v4;

/* loaded from: classes3.dex */
public final class k extends u {
    public k(u4.h hVar) {
        super(hVar);
        hVar.f120202d.f();
        hVar.f120204e.f();
        this.f124023f = ((u4.m) hVar).f120277z0;
    }

    @Override // v4.e
    public final void a(e eVar) {
        h hVar = this.f124025h;
        if (hVar.f123992c && !hVar.f123999j) {
            hVar.d((int) ((((h) hVar.f124001l.get(0)).f123996g * ((u4.m) this.f124019b).f120273v0) + 0.5f));
        }
    }

    @Override // v4.u
    public final void d() {
        u4.h hVar = this.f124019b;
        u4.m mVar = (u4.m) hVar;
        int i13 = mVar.f120274w0;
        int i14 = mVar.f120275x0;
        int i15 = mVar.f120277z0;
        h hVar2 = this.f124025h;
        if (i15 == 1) {
            if (i13 != -1) {
                hVar2.f124001l.add(hVar.V.f120202d.f124025h);
                this.f124019b.V.f120202d.f124025h.f124000k.add(hVar2);
                hVar2.f123995f = i13;
            } else if (i14 != -1) {
                hVar2.f124001l.add(hVar.V.f120202d.f124026i);
                this.f124019b.V.f120202d.f124026i.f124000k.add(hVar2);
                hVar2.f123995f = -i14;
            } else {
                hVar2.f123991b = true;
                hVar2.f124001l.add(hVar.V.f120202d.f124026i);
                this.f124019b.V.f120202d.f124026i.f124000k.add(hVar2);
            }
            m(this.f124019b.f120202d.f124025h);
            m(this.f124019b.f120202d.f124026i);
            return;
        }
        if (i13 != -1) {
            hVar2.f124001l.add(hVar.V.f120204e.f124025h);
            this.f124019b.V.f120204e.f124025h.f124000k.add(hVar2);
            hVar2.f123995f = i13;
        } else if (i14 != -1) {
            hVar2.f124001l.add(hVar.V.f120204e.f124026i);
            this.f124019b.V.f120204e.f124026i.f124000k.add(hVar2);
            hVar2.f123995f = -i14;
        } else {
            hVar2.f123991b = true;
            hVar2.f124001l.add(hVar.V.f120204e.f124026i);
            this.f124019b.V.f120204e.f124026i.f124000k.add(hVar2);
        }
        m(this.f124019b.f120204e.f124025h);
        m(this.f124019b.f120204e.f124026i);
    }

    @Override // v4.u
    public final void e() {
        u4.h hVar = this.f124019b;
        int i13 = ((u4.m) hVar).f120277z0;
        h hVar2 = this.f124025h;
        if (i13 == 1) {
            hVar.f120197a0 = hVar2.f123996g;
        } else {
            hVar.f120199b0 = hVar2.f123996g;
        }
    }

    @Override // v4.u
    public final void f() {
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
