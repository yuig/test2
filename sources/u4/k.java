package u4;

import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class k extends r {

    /* renamed from: f1, reason: collision with root package name */
    public h[] f120270f1;
    public int I0 = -1;
    public int J0 = -1;
    public int K0 = -1;
    public int L0 = -1;
    public int M0 = -1;
    public int N0 = -1;
    public float O0 = 0.5f;
    public float P0 = 0.5f;
    public float Q0 = 0.5f;
    public float R0 = 0.5f;
    public float S0 = 0.5f;
    public float T0 = 0.5f;
    public int U0 = 0;
    public int V0 = 0;
    public int W0 = 2;
    public int X0 = 2;
    public int Y0 = 0;
    public int Z0 = -1;

    /* renamed from: a1, reason: collision with root package name */
    public int f120265a1 = 0;

    /* renamed from: b1, reason: collision with root package name */
    public final ArrayList f120266b1 = new ArrayList();

    /* renamed from: c1, reason: collision with root package name */
    public h[] f120267c1 = null;

    /* renamed from: d1, reason: collision with root package name */
    public h[] f120268d1 = null;

    /* renamed from: e1, reason: collision with root package name */
    public int[] f120269e1 = null;

    /* renamed from: g1, reason: collision with root package name */
    public int f120271g1 = 0;

    @Override // u4.h
    public final void c(s4.d dVar, boolean z13) {
        h hVar;
        float f13;
        int i13;
        super.c(dVar, z13);
        h hVar2 = this.V;
        boolean z14 = hVar2 != null && ((i) hVar2).A0;
        int i14 = this.Y0;
        ArrayList arrayList = this.f120266b1;
        if (i14 != 0) {
            if (i14 == 1) {
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    ((j) arrayList.get(i15)).b(i15, z14, i15 == size + (-1));
                    i15++;
                }
            } else if (i14 != 2) {
                if (i14 == 3) {
                    int size2 = arrayList.size();
                    int i16 = 0;
                    while (i16 < size2) {
                        ((j) arrayList.get(i16)).b(i16, z14, i16 == size2 + (-1));
                        i16++;
                    }
                }
            } else if (this.f120269e1 != null && this.f120268d1 != null && this.f120267c1 != null) {
                for (int i17 = 0; i17 < this.f120271g1; i17++) {
                    this.f120270f1[i17].M();
                }
                int[] iArr = this.f120269e1;
                int i18 = iArr[0];
                int i19 = iArr[1];
                float f14 = this.O0;
                h hVar3 = null;
                int i23 = 0;
                while (i23 < i18) {
                    if (z14) {
                        i13 = (i18 - i23) - 1;
                        f13 = 1.0f - this.O0;
                    } else {
                        f13 = f14;
                        i13 = i23;
                    }
                    h hVar4 = this.f120268d1[i13];
                    if (hVar4 != null && hVar4.f120213i0 != 8) {
                        e eVar = hVar4.f120195J;
                        if (i23 == 0) {
                            hVar4.g(eVar, this.f120195J, this.B0);
                            hVar4.f120221m0 = this.I0;
                            hVar4.f120207f0 = f13;
                        }
                        if (i23 == i18 - 1) {
                            hVar4.g(hVar4.L, this.L, this.C0);
                        }
                        if (i23 > 0 && hVar3 != null) {
                            int i24 = this.U0;
                            e eVar2 = hVar3.L;
                            hVar4.g(eVar, eVar2, i24);
                            hVar3.g(eVar2, eVar, 0);
                        }
                        hVar3 = hVar4;
                    }
                    i23++;
                    f14 = f13;
                }
                for (int i25 = 0; i25 < i19; i25++) {
                    h hVar5 = this.f120267c1[i25];
                    if (hVar5 != null && hVar5.f120213i0 != 8) {
                        e eVar3 = hVar5.K;
                        if (i25 == 0) {
                            hVar5.g(eVar3, this.K, this.f120281x0);
                            hVar5.f120223n0 = this.J0;
                            hVar5.f120209g0 = this.P0;
                        }
                        if (i25 == i19 - 1) {
                            hVar5.g(hVar5.M, this.M, this.f120282y0);
                        }
                        if (i25 > 0 && hVar3 != null) {
                            int i26 = this.V0;
                            e eVar4 = hVar3.M;
                            hVar5.g(eVar3, eVar4, i26);
                            hVar3.g(eVar4, eVar3, 0);
                        }
                        hVar3 = hVar5;
                    }
                }
                for (int i27 = 0; i27 < i18; i27++) {
                    for (int i28 = 0; i28 < i19; i28++) {
                        int i29 = (i28 * i18) + i27;
                        if (this.f120265a1 == 1) {
                            i29 = (i27 * i19) + i28;
                        }
                        h[] hVarArr = this.f120270f1;
                        if (i29 < hVarArr.length && (hVar = hVarArr[i29]) != null && hVar.f120213i0 != 8) {
                            h hVar6 = this.f120268d1[i27];
                            h hVar7 = this.f120267c1[i28];
                            if (hVar != hVar6) {
                                hVar.g(hVar.f120195J, hVar6.f120195J, 0);
                                hVar.g(hVar.L, hVar6.L, 0);
                            }
                            if (hVar != hVar7) {
                                hVar.g(hVar.K, hVar7.K, 0);
                                hVar.g(hVar.M, hVar7.M, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((j) arrayList.get(0)).b(0, z14, true);
        }
        this.D0 = false;
    }

    @Override // u4.o, u4.h
    public final void i(h hVar, HashMap hashMap) {
        super.i(hVar, hashMap);
        k kVar = (k) hVar;
        this.I0 = kVar.I0;
        this.J0 = kVar.J0;
        this.K0 = kVar.K0;
        this.L0 = kVar.L0;
        this.M0 = kVar.M0;
        this.N0 = kVar.N0;
        this.O0 = kVar.O0;
        this.P0 = kVar.P0;
        this.Q0 = kVar.Q0;
        this.R0 = kVar.R0;
        this.S0 = kVar.S0;
        this.T0 = kVar.T0;
        this.U0 = kVar.U0;
        this.V0 = kVar.V0;
        this.W0 = kVar.W0;
        this.X0 = kVar.X0;
        this.Y0 = kVar.Y0;
        this.Z0 = kVar.Z0;
        this.f120265a1 = kVar.f120265a1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0772  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0792  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0761  */
    @Override // u4.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i0(int r37, int r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 1942
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.k.i0(int, int, int, int):void");
    }

    public final int k0(int i13, h hVar) {
        if (hVar == null) {
            return 0;
        }
        if (hVar.U[1] == g.MATCH_CONSTRAINT) {
            int i14 = hVar.f120232s;
            if (i14 == 0) {
                return 0;
            }
            if (i14 == 2) {
                int i15 = (int) (hVar.f120242z * i13);
                if (i15 != hVar.o()) {
                    hVar.f120208g = true;
                    j0(hVar, hVar.U[0], hVar.y(), g.FIXED, i15);
                }
                return i15;
            }
            if (i14 == 1) {
                return hVar.o();
            }
            if (i14 == 3) {
                return (int) ((hVar.y() * hVar.Y) + 0.5f);
            }
        }
        return hVar.o();
    }

    public final int l0(int i13, h hVar) {
        if (hVar == null) {
            return 0;
        }
        if (hVar.U[0] == g.MATCH_CONSTRAINT) {
            int i14 = hVar.f120230r;
            if (i14 == 0) {
                return 0;
            }
            if (i14 == 2) {
                int i15 = (int) (hVar.f120239w * i13);
                if (i15 != hVar.y()) {
                    hVar.f120208g = true;
                    j0(hVar, g.FIXED, i15, hVar.U[1], hVar.o());
                }
                return i15;
            }
            if (i14 == 1) {
                return hVar.y();
            }
            if (i14 == 3) {
                return (int) ((hVar.o() * hVar.Y) + 0.5f);
            }
        }
        return hVar.y();
    }
}
