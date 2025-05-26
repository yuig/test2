package u4;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f120280a = new boolean[3];

    public static void a(i iVar, s4.d dVar, h hVar) {
        hVar.f120224o = -1;
        hVar.f120226p = -1;
        g gVar = iVar.U[0];
        g gVar2 = g.WRAP_CONTENT;
        if (gVar != gVar2 && hVar.U[0] == g.MATCH_PARENT) {
            e eVar = hVar.f120195J;
            int i13 = eVar.f120190g;
            int y13 = iVar.y();
            e eVar2 = hVar.L;
            int i14 = y13 - eVar2.f120190g;
            eVar.f120192i = dVar.n(eVar);
            eVar2.f120192i = dVar.n(eVar2);
            dVar.e(eVar.f120192i, i13);
            dVar.e(eVar2.f120192i, i14);
            hVar.f120224o = 2;
            hVar.f120197a0 = i13;
            int i15 = i14 - i13;
            hVar.W = i15;
            int i16 = hVar.f120203d0;
            if (i15 < i16) {
                hVar.W = i16;
            }
        }
        if (iVar.U[1] == gVar2 || hVar.U[1] != g.MATCH_PARENT) {
            return;
        }
        e eVar3 = hVar.K;
        int i17 = eVar3.f120190g;
        int o13 = iVar.o();
        e eVar4 = hVar.M;
        int i18 = o13 - eVar4.f120190g;
        eVar3.f120192i = dVar.n(eVar3);
        eVar4.f120192i = dVar.n(eVar4);
        dVar.e(eVar3.f120192i, i17);
        dVar.e(eVar4.f120192i, i18);
        if (hVar.f120201c0 > 0 || hVar.f120213i0 == 8) {
            e eVar5 = hVar.N;
            eVar5.f120192i = dVar.n(eVar5);
            dVar.e(eVar5.f120192i, hVar.f120201c0 + i17);
        }
        hVar.f120226p = 2;
        hVar.Z(i17, i18);
    }

    public static final boolean b(int i13, int i14) {
        return (i13 & i14) == i14;
    }
}
