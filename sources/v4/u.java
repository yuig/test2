package v4;

/* loaded from: classes.dex */
public abstract class u implements e {

    /* renamed from: a */
    public int f124018a;

    /* renamed from: b */
    public u4.h f124019b;

    /* renamed from: c */
    public o f124020c;

    /* renamed from: d */
    public u4.g f124021d;

    /* renamed from: e */
    public final i f124022e = new i(this);

    /* renamed from: f */
    public int f124023f = 0;

    /* renamed from: g */
    public boolean f124024g = false;

    /* renamed from: h */
    public final h f124025h = new h(this);

    /* renamed from: i */
    public final h f124026i = new h(this);

    /* renamed from: j */
    public t f124027j = t.NONE;

    public u(u4.h hVar) {
        this.f124019b = hVar;
    }

    public static void b(h hVar, h hVar2, int i13) {
        hVar.f124001l.add(hVar2);
        hVar.f123995f = i13;
        hVar2.f124000k.add(hVar);
    }

    public static h h(u4.e eVar) {
        u4.e eVar2 = eVar.f120189f;
        if (eVar2 == null) {
            return null;
        }
        int i13 = s.f124017a[eVar2.f120188e.ordinal()];
        u4.h hVar = eVar2.f120187d;
        if (i13 == 1) {
            return hVar.f120202d.f124025h;
        }
        if (i13 == 2) {
            return hVar.f120202d.f124026i;
        }
        if (i13 == 3) {
            return hVar.f120204e.f124025h;
        }
        if (i13 == 4) {
            return hVar.f120204e.f124009k;
        }
        if (i13 != 5) {
            return null;
        }
        return hVar.f120204e.f124026i;
    }

    public static h i(u4.e eVar, int i13) {
        u4.e eVar2 = eVar.f120189f;
        if (eVar2 == null) {
            return null;
        }
        u4.h hVar = eVar2.f120187d;
        u uVar = i13 == 0 ? hVar.f120202d : hVar.f120204e;
        int i14 = s.f124017a[eVar2.f120188e.ordinal()];
        if (i14 != 1) {
            if (i14 != 2) {
                if (i14 != 3) {
                    if (i14 != 5) {
                        return null;
                    }
                }
            }
            return uVar.f124026i;
        }
        return uVar.f124025h;
    }

    public final void c(h hVar, h hVar2, int i13, i iVar) {
        hVar.f124001l.add(hVar2);
        hVar.f124001l.add(this.f124022e);
        hVar.f123997h = i13;
        hVar.f123998i = iVar;
        hVar2.f124000k.add(hVar);
        iVar.f124000k.add(hVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i13, int i14) {
        int max;
        if (i14 == 0) {
            u4.h hVar = this.f124019b;
            int i15 = hVar.f120238v;
            max = Math.max(hVar.f120236u, i13);
            if (i15 > 0) {
                max = Math.min(i15, i13);
            }
            if (max == i13) {
                return i13;
            }
        } else {
            u4.h hVar2 = this.f124019b;
            int i16 = hVar2.f120241y;
            max = Math.max(hVar2.f120240x, i13);
            if (i16 > 0) {
                max = Math.min(i16, i13);
            }
            if (max == i13) {
                return i13;
            }
        }
        return max;
    }

    public long j() {
        if (this.f124022e.f123999j) {
            return r0.f123996g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r10.f124018a == 3) goto L119;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(u4.e r13, u4.e r14, int r15) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.u.l(u4.e, u4.e, int):void");
    }
}
