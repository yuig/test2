package v4;

import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final b f124003a = new b();

    public static boolean a(u4.h hVar) {
        u4.g gVar;
        u4.g gVar2;
        u4.g[] gVarArr = hVar.U;
        u4.g gVar3 = gVarArr[0];
        u4.g gVar4 = gVarArr[1];
        u4.h hVar2 = hVar.V;
        u4.i iVar = hVar2 != null ? (u4.i) hVar2 : null;
        if (iVar != null) {
            u4.g gVar5 = iVar.U[0];
            u4.g gVar6 = u4.g.FIXED;
        }
        if (iVar != null) {
            u4.g gVar7 = iVar.U[1];
            u4.g gVar8 = u4.g.FIXED;
        }
        u4.g gVar9 = u4.g.FIXED;
        boolean z13 = gVar3 == gVar9 || hVar.J() || gVar3 == u4.g.WRAP_CONTENT || (gVar3 == (gVar2 = u4.g.MATCH_CONSTRAINT) && hVar.f120230r == 0 && hVar.Y == 0.0f && hVar.B(0)) || (gVar3 == gVar2 && hVar.f120230r == 1 && hVar.C(0, hVar.y()));
        boolean z14 = gVar4 == gVar9 || hVar.K() || gVar4 == u4.g.WRAP_CONTENT || (gVar4 == (gVar = u4.g.MATCH_CONSTRAINT) && hVar.f120232s == 0 && hVar.Y == 0.0f && hVar.B(1)) || (gVar4 == gVar && hVar.f120232s == 1 && hVar.C(1, hVar.o()));
        if (hVar.Y <= 0.0f || !(z13 || z14)) {
            return z13 && z14;
        }
        return true;
    }

    public static void b(int i13, u4.h hVar, c cVar, boolean z13) {
        u4.e eVar;
        u4.e eVar2;
        u4.e eVar3;
        u4.e eVar4;
        if (hVar.f120220m) {
            return;
        }
        if (!(hVar instanceof u4.i) && hVar.I() && a(hVar)) {
            u4.i.m0(hVar, cVar, new b());
        }
        u4.e l13 = hVar.l(u4.d.LEFT);
        u4.e l14 = hVar.l(u4.d.RIGHT);
        int d2 = l13.d();
        int d13 = l14.d();
        HashSet hashSet = l13.f120184a;
        char c13 = 0;
        if (hashSet != null && l13.f120186c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                u4.e eVar5 = (u4.e) it.next();
                u4.h hVar2 = eVar5.f120187d;
                int i14 = i13 + 1;
                boolean a13 = a(hVar2);
                if (hVar2.I() && a13) {
                    u4.i.m0(hVar2, cVar, new b());
                }
                u4.e eVar6 = hVar2.f120195J;
                u4.e eVar7 = hVar2.L;
                char c14 = ((eVar5 == eVar6 && (eVar4 = eVar7.f120189f) != null && eVar4.f120186c) || (eVar5 == eVar7 && (eVar3 = eVar6.f120189f) != null && eVar3.f120186c)) ? (char) 1 : c13;
                u4.g gVar = hVar2.U[c13];
                u4.g gVar2 = u4.g.MATCH_CONSTRAINT;
                if (gVar != gVar2 || a13) {
                    if (!hVar2.I()) {
                        if (eVar5 == eVar6 && eVar7.f120189f == null) {
                            int e13 = eVar6.e() + d2;
                            hVar2.U(e13, hVar2.y() + e13);
                            b(i14, hVar2, cVar, z13);
                        } else if (eVar5 == eVar7 && eVar6.f120189f == null) {
                            int e14 = d2 - eVar7.e();
                            hVar2.U(e14 - hVar2.y(), e14);
                            b(i14, hVar2, cVar, z13);
                        } else if (c14 != 0 && !hVar2.F()) {
                            d(i14, hVar2, cVar, z13);
                        }
                    }
                } else if (gVar == gVar2 && hVar2.f120238v >= 0 && hVar2.f120236u >= 0 && ((hVar2.f120213i0 == 8 || (hVar2.f120230r == 0 && hVar2.Y == 0.0f)) && !hVar2.F() && !hVar2.G && c14 != 0 && !hVar2.F())) {
                    e(i14, hVar, cVar, hVar2, z13);
                }
                c13 = 0;
            }
        }
        if (hVar instanceof u4.m) {
            return;
        }
        HashSet hashSet2 = l14.f120184a;
        if (hashSet2 != null && l14.f120186c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                u4.e eVar8 = (u4.e) it2.next();
                u4.h hVar3 = eVar8.f120187d;
                int i15 = i13 + 1;
                boolean a14 = a(hVar3);
                if (hVar3.I() && a14) {
                    u4.i.m0(hVar3, cVar, new b());
                }
                u4.e eVar9 = hVar3.f120195J;
                u4.e eVar10 = hVar3.L;
                boolean z14 = (eVar8 == eVar9 && (eVar2 = eVar10.f120189f) != null && eVar2.f120186c) || (eVar8 == eVar10 && (eVar = eVar9.f120189f) != null && eVar.f120186c);
                u4.g gVar3 = hVar3.U[0];
                u4.g gVar4 = u4.g.MATCH_CONSTRAINT;
                if (gVar3 != gVar4 || a14) {
                    if (!hVar3.I()) {
                        if (eVar8 == eVar9 && eVar10.f120189f == null) {
                            int e15 = eVar9.e() + d13;
                            hVar3.U(e15, hVar3.y() + e15);
                            b(i15, hVar3, cVar, z13);
                        } else if (eVar8 == eVar10 && eVar9.f120189f == null) {
                            int e16 = d13 - eVar10.e();
                            hVar3.U(e16 - hVar3.y(), e16);
                            b(i15, hVar3, cVar, z13);
                        } else if (z14 && !hVar3.F()) {
                            d(i15, hVar3, cVar, z13);
                        }
                    }
                } else if (gVar3 == gVar4 && hVar3.f120238v >= 0 && hVar3.f120236u >= 0) {
                    if (hVar3.f120213i0 != 8) {
                        if (hVar3.f120230r == 0) {
                            if (hVar3.Y == 0.0f) {
                            }
                        }
                    }
                    if (!hVar3.F() && !hVar3.G && z14 && !hVar3.F()) {
                        e(i15, hVar, cVar, hVar3, z13);
                    }
                }
            }
        }
        hVar.f120220m = true;
    }

    public static void c(u4.a aVar, c cVar, int i13, boolean z13) {
        if (aVar.h0()) {
            if (i13 == 0) {
                b(1, aVar, cVar, z13);
            } else {
                h(1, aVar, cVar);
            }
        }
    }

    public static void d(int i13, u4.h hVar, c cVar, boolean z13) {
        float f13 = hVar.f120207f0;
        u4.e eVar = hVar.f120195J;
        int d2 = eVar.f120189f.d();
        u4.e eVar2 = hVar.L;
        int d13 = eVar2.f120189f.d();
        int e13 = eVar.e() + d2;
        int e14 = d13 - eVar2.e();
        if (d2 == d13) {
            f13 = 0.5f;
        } else {
            d2 = e13;
            d13 = e14;
        }
        int y13 = hVar.y();
        int i14 = (d13 - d2) - y13;
        if (d2 > d13) {
            i14 = (d2 - d13) - y13;
        }
        int i15 = ((int) (i14 > 0 ? (f13 * i14) + 0.5f : f13 * i14)) + d2;
        int i16 = i15 + y13;
        if (d2 > d13) {
            i16 = i15 - y13;
        }
        hVar.U(i15, i16);
        b(i13 + 1, hVar, cVar, z13);
    }

    public static void e(int i13, u4.h hVar, c cVar, u4.h hVar2, boolean z13) {
        float f13 = hVar2.f120207f0;
        u4.e eVar = hVar2.f120195J;
        int e13 = eVar.e() + eVar.f120189f.d();
        u4.e eVar2 = hVar2.L;
        int d2 = eVar2.f120189f.d() - eVar2.e();
        if (d2 >= e13) {
            int y13 = hVar2.y();
            if (hVar2.f120213i0 != 8) {
                int i14 = hVar2.f120230r;
                if (i14 == 2) {
                    y13 = (int) (hVar2.f120207f0 * 0.5f * (hVar instanceof u4.i ? hVar.y() : hVar.V.y()));
                } else if (i14 == 0) {
                    y13 = d2 - e13;
                }
                y13 = Math.max(hVar2.f120236u, y13);
                int i15 = hVar2.f120238v;
                if (i15 > 0) {
                    y13 = Math.min(i15, y13);
                }
            }
            int i16 = e13 + ((int) ((f13 * ((d2 - e13) - y13)) + 0.5f));
            hVar2.U(i16, y13 + i16);
            b(i13 + 1, hVar2, cVar, z13);
        }
    }

    public static void f(int i13, u4.h hVar, c cVar) {
        float f13 = hVar.f120209g0;
        u4.e eVar = hVar.K;
        int d2 = eVar.f120189f.d();
        u4.e eVar2 = hVar.M;
        int d13 = eVar2.f120189f.d();
        int e13 = eVar.e() + d2;
        int e14 = d13 - eVar2.e();
        if (d2 == d13) {
            f13 = 0.5f;
        } else {
            d2 = e13;
            d13 = e14;
        }
        int o13 = hVar.o();
        int i14 = (d13 - d2) - o13;
        if (d2 > d13) {
            i14 = (d2 - d13) - o13;
        }
        int i15 = (int) (i14 > 0 ? (f13 * i14) + 0.5f : f13 * i14);
        int i16 = d2 + i15;
        int i17 = i16 + o13;
        if (d2 > d13) {
            i16 = d2 - i15;
            i17 = i16 - o13;
        }
        hVar.V(i16, i17);
        h(i13 + 1, hVar, cVar);
    }

    public static void g(int i13, u4.h hVar, c cVar, u4.h hVar2) {
        float f13 = hVar2.f120209g0;
        u4.e eVar = hVar2.K;
        int e13 = eVar.e() + eVar.f120189f.d();
        u4.e eVar2 = hVar2.M;
        int d2 = eVar2.f120189f.d() - eVar2.e();
        if (d2 >= e13) {
            int o13 = hVar2.o();
            if (hVar2.f120213i0 != 8) {
                int i14 = hVar2.f120232s;
                if (i14 == 2) {
                    o13 = (int) (f13 * 0.5f * (hVar instanceof u4.i ? hVar.o() : hVar.V.o()));
                } else if (i14 == 0) {
                    o13 = d2 - e13;
                }
                o13 = Math.max(hVar2.f120240x, o13);
                int i15 = hVar2.f120241y;
                if (i15 > 0) {
                    o13 = Math.min(i15, o13);
                }
            }
            int i16 = e13 + ((int) ((f13 * ((d2 - e13) - o13)) + 0.5f));
            hVar2.V(i16, o13 + i16);
            h(i13 + 1, hVar2, cVar);
        }
    }

    public static void h(int i13, u4.h hVar, c cVar) {
        u4.e eVar;
        u4.e eVar2;
        u4.e eVar3;
        u4.e eVar4;
        if (hVar.f120222n) {
            return;
        }
        if (!(hVar instanceof u4.i) && hVar.I() && a(hVar)) {
            u4.i.m0(hVar, cVar, new b());
        }
        u4.e l13 = hVar.l(u4.d.TOP);
        u4.e l14 = hVar.l(u4.d.BOTTOM);
        int d2 = l13.d();
        int d13 = l14.d();
        HashSet hashSet = l13.f120184a;
        char c13 = 1;
        if (hashSet != null && l13.f120186c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                u4.e eVar5 = (u4.e) it.next();
                u4.h hVar2 = eVar5.f120187d;
                int i14 = i13 + 1;
                boolean a13 = a(hVar2);
                if (hVar2.I() && a13) {
                    u4.i.m0(hVar2, cVar, new b());
                }
                u4.e eVar6 = hVar2.K;
                u4.e eVar7 = hVar2.M;
                char c14 = ((eVar5 == eVar6 && (eVar4 = eVar7.f120189f) != null && eVar4.f120186c) || (eVar5 == eVar7 && (eVar3 = eVar6.f120189f) != null && eVar3.f120186c)) ? c13 : (char) 0;
                u4.g gVar = hVar2.U[c13];
                u4.g gVar2 = u4.g.MATCH_CONSTRAINT;
                if (gVar != gVar2 || a13) {
                    if (!hVar2.I()) {
                        if (eVar5 == eVar6 && eVar7.f120189f == null) {
                            int e13 = eVar6.e() + d2;
                            hVar2.V(e13, hVar2.o() + e13);
                            h(i14, hVar2, cVar);
                        } else if (eVar5 == eVar7 && eVar6.f120189f == null) {
                            int e14 = d2 - eVar7.e();
                            hVar2.V(e14 - hVar2.o(), e14);
                            h(i14, hVar2, cVar);
                        } else if (c14 != 0 && !hVar2.H()) {
                            f(i14, hVar2, cVar);
                        }
                    }
                } else if (gVar == gVar2 && hVar2.f120241y >= 0 && hVar2.f120240x >= 0 && ((hVar2.f120213i0 == 8 || (hVar2.f120232s == 0 && hVar2.Y == 0.0f)) && !hVar2.H() && !hVar2.G && c14 != 0 && !hVar2.H())) {
                    g(i14, hVar, cVar, hVar2);
                }
                c13 = 1;
            }
        }
        if (hVar instanceof u4.m) {
            return;
        }
        HashSet hashSet2 = l14.f120184a;
        if (hashSet2 != null && l14.f120186c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                u4.e eVar8 = (u4.e) it2.next();
                u4.h hVar3 = eVar8.f120187d;
                int i15 = i13 + 1;
                boolean a14 = a(hVar3);
                if (hVar3.I() && a14) {
                    u4.i.m0(hVar3, cVar, new b());
                }
                u4.e eVar9 = hVar3.K;
                u4.e eVar10 = hVar3.M;
                boolean z13 = (eVar8 == eVar9 && (eVar2 = eVar10.f120189f) != null && eVar2.f120186c) || (eVar8 == eVar10 && (eVar = eVar9.f120189f) != null && eVar.f120186c);
                u4.g gVar3 = hVar3.U[1];
                u4.g gVar4 = u4.g.MATCH_CONSTRAINT;
                if (gVar3 != gVar4 || a14) {
                    if (!hVar3.I()) {
                        if (eVar8 == eVar9 && eVar10.f120189f == null) {
                            int e15 = eVar9.e() + d13;
                            hVar3.V(e15, hVar3.o() + e15);
                            h(i15, hVar3, cVar);
                        } else if (eVar8 == eVar10 && eVar9.f120189f == null) {
                            int e16 = d13 - eVar10.e();
                            hVar3.V(e16 - hVar3.o(), e16);
                            h(i15, hVar3, cVar);
                        } else if (z13 && !hVar3.H()) {
                            f(i15, hVar3, cVar);
                        }
                    }
                } else if (gVar3 == gVar4 && hVar3.f120241y >= 0 && hVar3.f120240x >= 0) {
                    if (hVar3.f120213i0 != 8) {
                        if (hVar3.f120232s == 0) {
                            if (hVar3.Y == 0.0f) {
                            }
                        }
                    }
                    if (!hVar3.H() && !hVar3.G && z13 && !hVar3.H()) {
                        g(i15, hVar, cVar, hVar3);
                    }
                }
            }
        }
        u4.e l15 = hVar.l(u4.d.BASELINE);
        if (l15.f120184a != null && l15.f120186c) {
            int d14 = l15.d();
            Iterator it3 = l15.f120184a.iterator();
            while (it3.hasNext()) {
                u4.e eVar11 = (u4.e) it3.next();
                u4.h hVar4 = eVar11.f120187d;
                int i16 = i13 + 1;
                boolean a15 = a(hVar4);
                if (hVar4.I() && a15) {
                    u4.i.m0(hVar4, cVar, new b());
                }
                if (hVar4.U[1] != u4.g.MATCH_CONSTRAINT || a15) {
                    if (!hVar4.I() && eVar11 == hVar4.N) {
                        hVar4.T(eVar11.e() + d14);
                        h(i16, hVar4, cVar);
                    }
                }
            }
        }
        hVar.f120222n = true;
    }
}
