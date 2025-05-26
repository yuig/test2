package v4;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final u f124006a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f124007b = new ArrayList();

    public o(u uVar) {
        this.f124006a = null;
        this.f124006a = uVar;
    }

    public static long c(h hVar, long j13) {
        u uVar = hVar.f123993d;
        if (uVar instanceof l) {
            return j13;
        }
        ArrayList arrayList = hVar.f124000k;
        int size = arrayList.size();
        long j14 = j13;
        for (int i13 = 0; i13 < size; i13++) {
            e eVar = (e) arrayList.get(i13);
            if (eVar instanceof h) {
                h hVar2 = (h) eVar;
                if (hVar2.f123993d != uVar) {
                    j14 = Math.min(j14, c(hVar2, hVar2.f123995f + j13));
                }
            }
        }
        if (hVar != uVar.f124026i) {
            return j14;
        }
        long j15 = uVar.j();
        long j16 = j13 - j15;
        return Math.min(Math.min(j14, c(uVar.f124025h, j16)), j16 - r9.f123995f);
    }

    public static long d(h hVar, long j13) {
        u uVar = hVar.f123993d;
        if (uVar instanceof l) {
            return j13;
        }
        ArrayList arrayList = hVar.f124000k;
        int size = arrayList.size();
        long j14 = j13;
        for (int i13 = 0; i13 < size; i13++) {
            e eVar = (e) arrayList.get(i13);
            if (eVar instanceof h) {
                h hVar2 = (h) eVar;
                if (hVar2.f123993d != uVar) {
                    j14 = Math.max(j14, d(hVar2, hVar2.f123995f + j13));
                }
            }
        }
        if (hVar != uVar.f124025h) {
            return j14;
        }
        long j15 = uVar.j();
        long j16 = j13 + j15;
        return Math.max(Math.max(j14, d(uVar.f124026i, j16)), j16 - r9.f123995f);
    }

    public final void a(u uVar) {
        this.f124007b.add(uVar);
    }

    public final long b(u4.i iVar, int i13) {
        float f13;
        u uVar = this.f124006a;
        if (uVar instanceof d) {
            if (((d) uVar).f124023f != i13) {
                return 0L;
            }
        } else if (i13 == 0) {
            if (!(uVar instanceof n)) {
                return 0L;
            }
        } else if (!(uVar instanceof q)) {
            return 0L;
        }
        h hVar = (i13 == 0 ? iVar.f120202d : iVar.f120204e).f124025h;
        h hVar2 = (i13 == 0 ? iVar.f120202d : iVar.f120204e).f124026i;
        boolean contains = uVar.f124025h.f124001l.contains(hVar);
        boolean contains2 = uVar.f124026i.f124001l.contains(hVar2);
        long j13 = uVar.j();
        if (!contains || !contains2) {
            if (contains) {
                return Math.max(d(uVar.f124025h, r13.f123995f), uVar.f124025h.f123995f + j13);
            }
            if (!contains2) {
                return (uVar.j() + uVar.f124025h.f123995f) - uVar.f124026i.f123995f;
            }
            return Math.max(-c(uVar.f124026i, r13.f123995f), (-uVar.f124026i.f123995f) + j13);
        }
        long d2 = d(uVar.f124025h, 0L);
        long c13 = c(uVar.f124026i, 0L);
        long j14 = d2 - j13;
        int i14 = uVar.f124026i.f123995f;
        if (j14 >= (-i14)) {
            j14 += i14;
        }
        long j15 = uVar.f124025h.f123995f;
        long j16 = ((-c13) - j13) - j15;
        if (j16 >= j15) {
            j16 -= j15;
        }
        u4.h hVar3 = uVar.f124019b;
        if (i13 == 0) {
            f13 = hVar3.f120207f0;
        } else if (i13 == 1) {
            f13 = hVar3.f120209g0;
        } else {
            hVar3.getClass();
            f13 = -1.0f;
        }
        float f14 = f13 > 0.0f ? (long) ((j14 / (1.0f - f13)) + (j16 / f13)) : 0L;
        return (uVar.f124025h.f123995f + ((((long) ((f14 * f13) + 0.5f)) + j13) + ((long) ep.b.a(1.0f, f13, f14, 0.5f)))) - uVar.f124026i.f123995f;
    }
}
