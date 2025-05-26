package u4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class h {
    public int A;
    public float B;
    public int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public final e f120195J;
    public final e K;
    public final e L;
    public final e M;
    public final e N;
    public final e O;
    public final e P;
    public final e Q;
    public final e[] R;
    public final ArrayList S;
    public final boolean[] T;
    public g[] U;
    public h V;
    public int W;
    public int X;
    public float Y;
    public int Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f120197a0;

    /* renamed from: b, reason: collision with root package name */
    public v4.d f120198b;

    /* renamed from: b0, reason: collision with root package name */
    public int f120199b0;

    /* renamed from: c, reason: collision with root package name */
    public v4.d f120200c;

    /* renamed from: c0, reason: collision with root package name */
    public int f120201c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f120203d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f120205e0;

    /* renamed from: f0, reason: collision with root package name */
    public float f120207f0;

    /* renamed from: g0, reason: collision with root package name */
    public float f120209g0;

    /* renamed from: h0, reason: collision with root package name */
    public Object f120211h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f120213i0;

    /* renamed from: j, reason: collision with root package name */
    public String f120214j;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f120215j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f120216k;

    /* renamed from: k0, reason: collision with root package name */
    public String f120217k0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f120218l;

    /* renamed from: l0, reason: collision with root package name */
    public String f120219l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f120220m;

    /* renamed from: m0, reason: collision with root package name */
    public int f120221m0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f120222n;

    /* renamed from: n0, reason: collision with root package name */
    public int f120223n0;

    /* renamed from: o, reason: collision with root package name */
    public int f120224o;

    /* renamed from: o0, reason: collision with root package name */
    public final float[] f120225o0;

    /* renamed from: p, reason: collision with root package name */
    public int f120226p;

    /* renamed from: p0, reason: collision with root package name */
    public final h[] f120227p0;

    /* renamed from: q, reason: collision with root package name */
    public int f120228q;

    /* renamed from: q0, reason: collision with root package name */
    public final h[] f120229q0;

    /* renamed from: r, reason: collision with root package name */
    public int f120230r;

    /* renamed from: r0, reason: collision with root package name */
    public h f120231r0;

    /* renamed from: s, reason: collision with root package name */
    public int f120232s;

    /* renamed from: s0, reason: collision with root package name */
    public h f120233s0;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f120234t;

    /* renamed from: t0, reason: collision with root package name */
    public int f120235t0;

    /* renamed from: u, reason: collision with root package name */
    public int f120236u;

    /* renamed from: u0, reason: collision with root package name */
    public int f120237u0;

    /* renamed from: v, reason: collision with root package name */
    public int f120238v;

    /* renamed from: w, reason: collision with root package name */
    public float f120239w;

    /* renamed from: x, reason: collision with root package name */
    public int f120240x;

    /* renamed from: y, reason: collision with root package name */
    public int f120241y;

    /* renamed from: z, reason: collision with root package name */
    public float f120242z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f120196a = false;

    /* renamed from: d, reason: collision with root package name */
    public v4.n f120202d = null;

    /* renamed from: e, reason: collision with root package name */
    public v4.q f120204e = null;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f120206f = {true, true};

    /* renamed from: g, reason: collision with root package name */
    public boolean f120208g = true;

    /* renamed from: h, reason: collision with root package name */
    public int f120210h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f120212i = -1;

    public h() {
        new HashMap();
        this.f120216k = false;
        this.f120218l = false;
        this.f120220m = false;
        this.f120222n = false;
        this.f120224o = -1;
        this.f120226p = -1;
        this.f120228q = 0;
        this.f120230r = 0;
        this.f120232s = 0;
        this.f120234t = new int[2];
        this.f120236u = 0;
        this.f120238v = 0;
        this.f120239w = 1.0f;
        this.f120240x = 0;
        this.f120241y = 0;
        this.f120242z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.D = 0.0f;
        this.E = false;
        this.G = false;
        this.H = 0;
        this.I = 0;
        e eVar = new e(this, d.LEFT);
        this.f120195J = eVar;
        e eVar2 = new e(this, d.TOP);
        this.K = eVar2;
        e eVar3 = new e(this, d.RIGHT);
        this.L = eVar3;
        e eVar4 = new e(this, d.BOTTOM);
        this.M = eVar4;
        e eVar5 = new e(this, d.BASELINE);
        this.N = eVar5;
        e eVar6 = new e(this, d.CENTER_X);
        this.O = eVar6;
        e eVar7 = new e(this, d.CENTER_Y);
        this.P = eVar7;
        e eVar8 = new e(this, d.CENTER);
        this.Q = eVar8;
        this.R = new e[]{eVar, eVar3, eVar2, eVar4, eVar5, eVar8};
        ArrayList arrayList = new ArrayList();
        this.S = arrayList;
        this.T = new boolean[2];
        g gVar = g.FIXED;
        this.U = new g[]{gVar, gVar};
        this.V = null;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.f120197a0 = 0;
        this.f120199b0 = 0;
        this.f120201c0 = 0;
        this.f120207f0 = 0.5f;
        this.f120209g0 = 0.5f;
        this.f120213i0 = 0;
        this.f120215j0 = false;
        this.f120217k0 = null;
        this.f120219l0 = null;
        this.f120221m0 = 0;
        this.f120223n0 = 0;
        this.f120225o0 = new float[]{-1.0f, -1.0f};
        this.f120227p0 = new h[]{null, null};
        this.f120229q0 = new h[]{null, null};
        this.f120231r0 = null;
        this.f120233s0 = null;
        this.f120235t0 = -1;
        this.f120237u0 = -1;
        arrayList.add(eVar);
        arrayList.add(eVar2);
        arrayList.add(eVar3);
        arrayList.add(eVar4);
        arrayList.add(eVar6);
        arrayList.add(eVar7);
        arrayList.add(eVar8);
        arrayList.add(eVar5);
    }

    public static void P(int i13, int i14, String str, StringBuilder sb3) {
        if (i13 == i14) {
            return;
        }
        sb3.append(str);
        sb3.append(" :   ");
        sb3.append(i13);
        sb3.append(",\n");
    }

    public static void Q(StringBuilder sb3, String str, float f13, float f14) {
        if (f13 == f14) {
            return;
        }
        sb3.append(str);
        sb3.append(" :   ");
        sb3.append(f13);
        sb3.append(",\n");
    }

    public static void v(StringBuilder sb3, String str, int i13, int i14, int i15, int i16, int i17, float f13) {
        sb3.append(str);
        sb3.append(" :  {\n");
        P(i13, 0, "      size", sb3);
        P(i14, 0, "      min", sb3);
        P(i15, Integer.MAX_VALUE, "      max", sb3);
        P(i16, 0, "      matchMin", sb3);
        P(i17, 0, "      matchDef", sb3);
        Q(sb3, "      matchPercent", f13, 1.0f);
        sb3.append("    },\n");
    }

    public static void w(StringBuilder sb3, String str, e eVar) {
        if (eVar.f120189f == null) {
            return;
        }
        sb3.append("    ");
        sb3.append(str);
        sb3.append(" : [ '");
        sb3.append(eVar.f120189f);
        sb3.append("'");
        if (eVar.f120191h != Integer.MIN_VALUE || eVar.f120190g != 0) {
            sb3.append(",");
            sb3.append(eVar.f120190g);
            if (eVar.f120191h != Integer.MIN_VALUE) {
                sb3.append(",");
                sb3.append(eVar.f120191h);
                sb3.append(",");
            }
        }
        sb3.append(" ] ,\n");
    }

    public final int A() {
        h hVar = this.V;
        return (hVar == null || !(hVar instanceof i)) ? this.f120199b0 : ((i) hVar).D0 + this.f120199b0;
    }

    public final boolean B(int i13) {
        if (i13 == 0) {
            return (this.f120195J.f120189f != null ? 1 : 0) + (this.L.f120189f != null ? 1 : 0) < 2;
        }
        return ((this.K.f120189f != null ? 1 : 0) + (this.M.f120189f != null ? 1 : 0)) + (this.N.f120189f != null ? 1 : 0) < 2;
    }

    public final boolean C(int i13, int i14) {
        e eVar;
        e eVar2;
        e eVar3;
        e eVar4;
        if (i13 == 0) {
            e eVar5 = this.f120195J;
            e eVar6 = eVar5.f120189f;
            if (eVar6 != null && eVar6.f120186c && (eVar4 = (eVar3 = this.L).f120189f) != null && eVar4.f120186c) {
                return (eVar4.d() - eVar3.e()) - (eVar5.e() + eVar5.f120189f.d()) >= i14;
            }
        } else {
            e eVar7 = this.K;
            e eVar8 = eVar7.f120189f;
            if (eVar8 != null && eVar8.f120186c && (eVar2 = (eVar = this.M).f120189f) != null && eVar2.f120186c) {
                return (eVar2.d() - eVar.e()) - (eVar7.e() + eVar7.f120189f.d()) >= i14;
            }
        }
        return false;
    }

    public final void D(d dVar, h hVar, d dVar2, int i13, int i14) {
        l(dVar).b(hVar.l(dVar2), i13, i14, true);
    }

    public final boolean E(int i13) {
        e eVar;
        e eVar2;
        int i14 = i13 * 2;
        e[] eVarArr = this.R;
        e eVar3 = eVarArr[i14];
        e eVar4 = eVar3.f120189f;
        return (eVar4 == null || eVar4.f120189f == eVar3 || (eVar2 = (eVar = eVarArr[i14 + 1]).f120189f) == null || eVar2.f120189f != eVar) ? false : true;
    }

    public final boolean F() {
        e eVar = this.f120195J;
        e eVar2 = eVar.f120189f;
        if (eVar2 != null && eVar2.f120189f == eVar) {
            return true;
        }
        e eVar3 = this.L;
        e eVar4 = eVar3.f120189f;
        return eVar4 != null && eVar4.f120189f == eVar3;
    }

    public final boolean G() {
        return this.F;
    }

    public final boolean H() {
        e eVar = this.K;
        e eVar2 = eVar.f120189f;
        if (eVar2 != null && eVar2.f120189f == eVar) {
            return true;
        }
        e eVar3 = this.M;
        e eVar4 = eVar3.f120189f;
        return eVar4 != null && eVar4.f120189f == eVar3;
    }

    public final boolean I() {
        return this.f120208g && this.f120213i0 != 8;
    }

    public boolean J() {
        return this.f120216k || (this.f120195J.f120186c && this.L.f120186c);
    }

    public boolean K() {
        return this.f120218l || (this.K.f120186c && this.M.f120186c);
    }

    public void L() {
        this.f120195J.l();
        this.K.l();
        this.L.l();
        this.M.l();
        this.N.l();
        this.O.l();
        this.P.l();
        this.Q.l();
        this.V = null;
        this.D = 0.0f;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.f120197a0 = 0;
        this.f120199b0 = 0;
        this.f120201c0 = 0;
        this.f120203d0 = 0;
        this.f120205e0 = 0;
        this.f120207f0 = 0.5f;
        this.f120209g0 = 0.5f;
        g[] gVarArr = this.U;
        g gVar = g.FIXED;
        gVarArr[0] = gVar;
        gVarArr[1] = gVar;
        this.f120211h0 = null;
        this.f120213i0 = 0;
        this.f120219l0 = null;
        this.f120221m0 = 0;
        this.f120223n0 = 0;
        float[] fArr = this.f120225o0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f120224o = -1;
        this.f120226p = -1;
        int[] iArr = this.C;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f120230r = 0;
        this.f120232s = 0;
        this.f120239w = 1.0f;
        this.f120242z = 1.0f;
        this.f120238v = Integer.MAX_VALUE;
        this.f120241y = Integer.MAX_VALUE;
        this.f120236u = 0;
        this.f120240x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f120206f;
        zArr[0] = true;
        zArr[1] = true;
        this.G = false;
        boolean[] zArr2 = this.T;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f120208g = true;
        int[] iArr2 = this.f120234t;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f120210h = -1;
        this.f120212i = -1;
    }

    public final void M() {
        h hVar = this.V;
        if (hVar != null && (hVar instanceof i)) {
            ((i) hVar).getClass();
        }
        ArrayList arrayList = this.S;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((e) arrayList.get(i13)).l();
        }
    }

    public final void N() {
        this.f120216k = false;
        this.f120218l = false;
        this.f120220m = false;
        this.f120222n = false;
        ArrayList arrayList = this.S;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            e eVar = (e) arrayList.get(i13);
            eVar.f120186c = false;
            eVar.f120185b = 0;
        }
    }

    public void O(com.google.firebase.messaging.q qVar) {
        this.f120195J.m();
        this.K.m();
        this.L.m();
        this.M.m();
        this.N.m();
        this.Q.m();
        this.O.m();
        this.P.m();
    }

    public final void R(int i13) {
        this.f120201c0 = i13;
        this.E = i13 > 0;
    }

    public final void S(String str) {
        this.f120217k0 = str;
    }

    public final void T(int i13) {
        if (this.E) {
            int i14 = i13 - this.f120201c0;
            int i15 = this.X + i14;
            this.f120199b0 = i14;
            this.K.n(i14);
            this.M.n(i15);
            this.N.n(i13);
            this.f120218l = true;
        }
    }

    public final void U(int i13, int i14) {
        if (this.f120216k) {
            return;
        }
        this.f120195J.n(i13);
        this.L.n(i14);
        this.f120197a0 = i13;
        this.W = i14 - i13;
        this.f120216k = true;
    }

    public final void V(int i13, int i14) {
        if (this.f120218l) {
            return;
        }
        this.K.n(i13);
        this.M.n(i14);
        this.f120199b0 = i13;
        this.X = i14 - i13;
        if (this.E) {
            this.N.n(i13 + this.f120201c0);
        }
        this.f120218l = true;
    }

    public final void W(int i13) {
        this.X = i13;
        int i14 = this.f120205e0;
        if (i13 < i14) {
            this.X = i14;
        }
    }

    public final void X(g gVar) {
        this.U[0] = gVar;
    }

    public final void Y(int i13, int i14) {
        this.f120197a0 = i13;
        this.f120199b0 = i14;
    }

    public final void Z(int i13, int i14) {
        this.f120199b0 = i13;
        int i15 = i14 - i13;
        this.X = i15;
        int i16 = this.f120205e0;
        if (i15 < i16) {
            this.X = i16;
        }
    }

    public final void a0(g gVar) {
        this.U[1] = gVar;
    }

    public final void b(i iVar, s4.d dVar, HashSet hashSet, int i13, boolean z13) {
        if (z13) {
            if (!hashSet.contains(this)) {
                return;
            }
            p.a(iVar, dVar, this);
            hashSet.remove(this);
            c(dVar, iVar.n0(64));
        }
        if (i13 == 0) {
            HashSet hashSet2 = this.f120195J.f120184a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).f120187d.b(iVar, dVar, hashSet, i13, true);
                }
            }
            HashSet hashSet3 = this.L.f120184a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).f120187d.b(iVar, dVar, hashSet, i13, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.K.f120184a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((e) it3.next()).f120187d.b(iVar, dVar, hashSet, i13, true);
            }
        }
        HashSet hashSet5 = this.M.f120184a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((e) it4.next()).f120187d.b(iVar, dVar, hashSet, i13, true);
            }
        }
        HashSet hashSet6 = this.N.f120184a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((e) it5.next()).f120187d.b(iVar, dVar, hashSet, i13, true);
            }
        }
    }

    public final void b0(int i13) {
        this.W = i13;
        int i14 = this.f120203d0;
        if (i13 < i14) {
            this.W = i14;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(s4.d r55, boolean r56) {
        /*
            Method dump skipped, instructions count: 1533
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.h.c(s4.d, boolean):void");
    }

    public final void c0(boolean z13, boolean z14) {
        if (this.A == -1) {
            if (z13 && !z14) {
                this.A = 0;
            } else if (!z13 && z14) {
                this.A = 1;
                if (this.Z == -1) {
                    this.B = 1.0f / this.B;
                }
            }
        }
        int i13 = this.A;
        e eVar = this.L;
        e eVar2 = this.f120195J;
        e eVar3 = this.M;
        e eVar4 = this.K;
        if (i13 == 0 && (!eVar4.j() || !eVar3.j())) {
            this.A = 1;
        } else if (this.A == 1 && (!eVar2.j() || !eVar.j())) {
            this.A = 0;
        }
        if (this.A == -1 && (!eVar4.j() || !eVar3.j() || !eVar2.j() || !eVar.j())) {
            if (eVar4.j() && eVar3.j()) {
                this.A = 0;
            } else if (eVar2.j() && eVar.j()) {
                this.B = 1.0f / this.B;
                this.A = 1;
            }
        }
        if (this.A == -1) {
            int i14 = this.f120236u;
            if (i14 > 0 && this.f120240x == 0) {
                this.A = 0;
            } else {
                if (i14 != 0 || this.f120240x <= 0) {
                    return;
                }
                this.B = 1.0f / this.B;
                this.A = 1;
            }
        }
    }

    public boolean d() {
        return this.f120213i0 != 8;
    }

    public void d0(boolean z13, boolean z14) {
        int i13;
        int i14;
        v4.n nVar = this.f120202d;
        boolean z15 = z13 & nVar.f124024g;
        v4.q qVar = this.f120204e;
        boolean z16 = z14 & qVar.f124024g;
        int i15 = nVar.f124025h.f123996g;
        int i16 = qVar.f124025h.f123996g;
        int i17 = nVar.f124026i.f123996g;
        int i18 = qVar.f124026i.f123996g;
        int i19 = i18 - i16;
        if (i17 - i15 < 0 || i19 < 0 || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE || i16 == Integer.MIN_VALUE || i16 == Integer.MAX_VALUE || i17 == Integer.MIN_VALUE || i17 == Integer.MAX_VALUE || i18 == Integer.MIN_VALUE || i18 == Integer.MAX_VALUE) {
            i17 = 0;
            i18 = 0;
            i15 = 0;
            i16 = 0;
        }
        int i23 = i17 - i15;
        int i24 = i18 - i16;
        if (z15) {
            this.f120197a0 = i15;
        }
        if (z16) {
            this.f120199b0 = i16;
        }
        if (this.f120213i0 == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        if (z15) {
            if (this.U[0] == g.FIXED && i23 < (i14 = this.W)) {
                i23 = i14;
            }
            this.W = i23;
            int i25 = this.f120203d0;
            if (i23 < i25) {
                this.W = i25;
            }
        }
        if (z16) {
            if (this.U[1] == g.FIXED && i24 < (i13 = this.X)) {
                i24 = i13;
            }
            this.X = i24;
            int i26 = this.f120205e0;
            if (i24 < i26) {
                this.X = i26;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x046d, code lost:
    
        if ((r5 instanceof u4.a) != false) goto L261;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0497 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x050e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0556 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(s4.d r38, boolean r39, boolean r40, boolean r41, boolean r42, s4.j r43, s4.j r44, u4.g r45, boolean r46, u4.e r47, u4.e r48, int r49, int r50, int r51, int r52, float r53, boolean r54, boolean r55, boolean r56, boolean r57, boolean r58, int r59, int r60, int r61, int r62, float r63, boolean r64) {
        /*
            Method dump skipped, instructions count: 1425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.h.e(s4.d, boolean, boolean, boolean, boolean, s4.j, s4.j, u4.g, boolean, u4.e, u4.e, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public void e0(s4.d dVar, boolean z13) {
        int i13;
        int i14;
        v4.q qVar;
        v4.n nVar;
        e eVar = this.f120195J;
        dVar.getClass();
        int q13 = s4.d.q(eVar);
        int q14 = s4.d.q(this.K);
        int q15 = s4.d.q(this.L);
        int q16 = s4.d.q(this.M);
        if (z13 && (nVar = this.f120202d) != null) {
            v4.h hVar = nVar.f124025h;
            if (hVar.f123999j) {
                v4.h hVar2 = nVar.f124026i;
                if (hVar2.f123999j) {
                    q13 = hVar.f123996g;
                    q15 = hVar2.f123996g;
                }
            }
        }
        if (z13 && (qVar = this.f120204e) != null) {
            v4.h hVar3 = qVar.f124025h;
            if (hVar3.f123999j) {
                v4.h hVar4 = qVar.f124026i;
                if (hVar4.f123999j) {
                    q14 = hVar3.f123996g;
                    q16 = hVar4.f123996g;
                }
            }
        }
        int i15 = q16 - q14;
        if (q15 - q13 < 0 || i15 < 0 || q13 == Integer.MIN_VALUE || q13 == Integer.MAX_VALUE || q14 == Integer.MIN_VALUE || q14 == Integer.MAX_VALUE || q15 == Integer.MIN_VALUE || q15 == Integer.MAX_VALUE || q16 == Integer.MIN_VALUE || q16 == Integer.MAX_VALUE) {
            q13 = 0;
            q14 = 0;
            q15 = 0;
            q16 = 0;
        }
        int i16 = q15 - q13;
        int i17 = q16 - q14;
        this.f120197a0 = q13;
        this.f120199b0 = q14;
        if (this.f120213i0 == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        g[] gVarArr = this.U;
        g gVar = gVarArr[0];
        g gVar2 = g.FIXED;
        if (gVar == gVar2 && i16 < (i14 = this.W)) {
            i16 = i14;
        }
        if (gVarArr[1] == gVar2 && i17 < (i13 = this.X)) {
            i17 = i13;
        }
        this.W = i16;
        this.X = i17;
        int i18 = this.f120205e0;
        if (i17 < i18) {
            this.X = i18;
        }
        int i19 = this.f120203d0;
        if (i16 < i19) {
            this.W = i19;
        }
        int i23 = this.f120238v;
        if (i23 > 0 && gVar == g.MATCH_CONSTRAINT) {
            this.W = Math.min(this.W, i23);
        }
        int i24 = this.f120241y;
        if (i24 > 0 && this.U[1] == g.MATCH_CONSTRAINT) {
            this.X = Math.min(this.X, i24);
        }
        int i25 = this.W;
        if (i16 != i25) {
            this.f120210h = i25;
        }
        int i26 = this.X;
        if (i17 != i26) {
            this.f120212i = i26;
        }
    }

    public final void f(d dVar, h hVar, d dVar2, int i13) {
        d dVar3;
        d dVar4;
        boolean z13;
        d dVar5 = d.CENTER;
        if (dVar == dVar5) {
            if (dVar2 != dVar5) {
                d dVar6 = d.LEFT;
                if (dVar2 == dVar6 || dVar2 == d.RIGHT) {
                    f(dVar6, hVar, dVar2, 0);
                    f(d.RIGHT, hVar, dVar2, 0);
                    l(dVar5).a(hVar.l(dVar2), 0);
                    return;
                }
                d dVar7 = d.TOP;
                if (dVar2 == dVar7 || dVar2 == d.BOTTOM) {
                    f(dVar7, hVar, dVar2, 0);
                    f(d.BOTTOM, hVar, dVar2, 0);
                    l(dVar5).a(hVar.l(dVar2), 0);
                    return;
                }
                return;
            }
            d dVar8 = d.LEFT;
            e l13 = l(dVar8);
            d dVar9 = d.RIGHT;
            e l14 = l(dVar9);
            d dVar10 = d.TOP;
            e l15 = l(dVar10);
            d dVar11 = d.BOTTOM;
            e l16 = l(dVar11);
            boolean z14 = true;
            if ((l13 == null || !l13.j()) && (l14 == null || !l14.j())) {
                f(dVar8, hVar, dVar8, 0);
                f(dVar9, hVar, dVar9, 0);
                z13 = true;
            } else {
                z13 = false;
            }
            if ((l15 == null || !l15.j()) && (l16 == null || !l16.j())) {
                f(dVar10, hVar, dVar10, 0);
                f(dVar11, hVar, dVar11, 0);
            } else {
                z14 = false;
            }
            if (z13 && z14) {
                l(dVar5).a(hVar.l(dVar5), 0);
                return;
            }
            if (z13) {
                d dVar12 = d.CENTER_X;
                l(dVar12).a(hVar.l(dVar12), 0);
                return;
            } else {
                if (z14) {
                    d dVar13 = d.CENTER_Y;
                    l(dVar13).a(hVar.l(dVar13), 0);
                    return;
                }
                return;
            }
        }
        d dVar14 = d.CENTER_X;
        if (dVar == dVar14 && (dVar2 == (dVar4 = d.LEFT) || dVar2 == d.RIGHT)) {
            e l17 = l(dVar4);
            e l18 = hVar.l(dVar2);
            e l19 = l(d.RIGHT);
            l17.a(l18, 0);
            l19.a(l18, 0);
            l(dVar14).a(l18, 0);
            return;
        }
        d dVar15 = d.CENTER_Y;
        if (dVar == dVar15 && (dVar2 == (dVar3 = d.TOP) || dVar2 == d.BOTTOM)) {
            e l23 = hVar.l(dVar2);
            l(dVar3).a(l23, 0);
            l(d.BOTTOM).a(l23, 0);
            l(dVar15).a(l23, 0);
            return;
        }
        if (dVar == dVar14 && dVar2 == dVar14) {
            d dVar16 = d.LEFT;
            l(dVar16).a(hVar.l(dVar16), 0);
            d dVar17 = d.RIGHT;
            l(dVar17).a(hVar.l(dVar17), 0);
            l(dVar14).a(hVar.l(dVar2), 0);
            return;
        }
        if (dVar == dVar15 && dVar2 == dVar15) {
            d dVar18 = d.TOP;
            l(dVar18).a(hVar.l(dVar18), 0);
            d dVar19 = d.BOTTOM;
            l(dVar19).a(hVar.l(dVar19), 0);
            l(dVar15).a(hVar.l(dVar2), 0);
            return;
        }
        e l24 = l(dVar);
        e l25 = hVar.l(dVar2);
        if (l24.k(l25)) {
            d dVar20 = d.BASELINE;
            if (dVar == dVar20) {
                e l26 = l(d.TOP);
                e l27 = l(d.BOTTOM);
                if (l26 != null) {
                    l26.l();
                }
                if (l27 != null) {
                    l27.l();
                }
            } else if (dVar == d.TOP || dVar == d.BOTTOM) {
                e l28 = l(dVar20);
                if (l28 != null) {
                    l28.l();
                }
                e l29 = l(dVar5);
                if (l29.f120189f != l25) {
                    l29.l();
                }
                e f13 = l(dVar).f();
                e l33 = l(dVar15);
                if (l33.j()) {
                    f13.l();
                    l33.l();
                }
            } else if (dVar == d.LEFT || dVar == d.RIGHT) {
                e l34 = l(dVar5);
                if (l34.f120189f != l25) {
                    l34.l();
                }
                e f14 = l(dVar).f();
                e l35 = l(dVar14);
                if (l35.j()) {
                    f14.l();
                    l35.l();
                }
            }
            l24.a(l25, i13);
        }
    }

    public final void g(e eVar, e eVar2, int i13) {
        if (eVar.f120187d == this) {
            f(eVar.f120188e, eVar2.f120187d, eVar2.f120188e, i13);
        }
    }

    public final void h(h hVar, float f13, int i13) {
        d dVar = d.CENTER;
        D(dVar, hVar, dVar, i13, 0);
        this.D = f13;
    }

    public void i(h hVar, HashMap hashMap) {
        this.f120224o = hVar.f120224o;
        this.f120226p = hVar.f120226p;
        this.f120230r = hVar.f120230r;
        this.f120232s = hVar.f120232s;
        int[] iArr = hVar.f120234t;
        int i13 = iArr[0];
        int[] iArr2 = this.f120234t;
        iArr2[0] = i13;
        iArr2[1] = iArr[1];
        this.f120236u = hVar.f120236u;
        this.f120238v = hVar.f120238v;
        this.f120240x = hVar.f120240x;
        this.f120241y = hVar.f120241y;
        this.f120242z = hVar.f120242z;
        this.A = hVar.A;
        this.B = hVar.B;
        int[] iArr3 = hVar.C;
        this.C = Arrays.copyOf(iArr3, iArr3.length);
        this.D = hVar.D;
        this.E = hVar.E;
        this.F = hVar.F;
        this.f120195J.l();
        this.K.l();
        this.L.l();
        this.M.l();
        this.N.l();
        this.O.l();
        this.P.l();
        this.Q.l();
        this.U = (g[]) Arrays.copyOf(this.U, 2);
        this.V = this.V == null ? null : (h) hashMap.get(hVar.V);
        this.W = hVar.W;
        this.X = hVar.X;
        this.Y = hVar.Y;
        this.Z = hVar.Z;
        this.f120197a0 = hVar.f120197a0;
        this.f120199b0 = hVar.f120199b0;
        this.f120201c0 = hVar.f120201c0;
        this.f120203d0 = hVar.f120203d0;
        this.f120205e0 = hVar.f120205e0;
        this.f120207f0 = hVar.f120207f0;
        this.f120209g0 = hVar.f120209g0;
        this.f120211h0 = hVar.f120211h0;
        this.f120213i0 = hVar.f120213i0;
        this.f120215j0 = hVar.f120215j0;
        this.f120217k0 = hVar.f120217k0;
        this.f120219l0 = hVar.f120219l0;
        this.f120221m0 = hVar.f120221m0;
        this.f120223n0 = hVar.f120223n0;
        float[] fArr = hVar.f120225o0;
        float f13 = fArr[0];
        float[] fArr2 = this.f120225o0;
        fArr2[0] = f13;
        fArr2[1] = fArr[1];
        h[] hVarArr = hVar.f120227p0;
        h hVar2 = hVarArr[0];
        h[] hVarArr2 = this.f120227p0;
        hVarArr2[0] = hVar2;
        hVarArr2[1] = hVarArr[1];
        h[] hVarArr3 = hVar.f120229q0;
        h hVar3 = hVarArr3[0];
        h[] hVarArr4 = this.f120229q0;
        hVarArr4[0] = hVar3;
        hVarArr4[1] = hVarArr3[1];
        h hVar4 = hVar.f120231r0;
        this.f120231r0 = hVar4 == null ? null : (h) hashMap.get(hVar4);
        h hVar5 = hVar.f120233s0;
        this.f120233s0 = hVar5 != null ? (h) hashMap.get(hVar5) : null;
    }

    public final void j(s4.d dVar) {
        dVar.n(this.f120195J);
        dVar.n(this.K);
        dVar.n(this.L);
        dVar.n(this.M);
        if (this.f120201c0 > 0) {
            dVar.n(this.N);
        }
    }

    public final void k() {
        if (this.f120202d == null) {
            this.f120202d = new v4.n(this);
        }
        if (this.f120204e == null) {
            this.f120204e = new v4.q(this);
        }
    }

    public e l(d dVar) {
        switch (f.f120193a[dVar.ordinal()]) {
            case 1:
                return this.f120195J;
            case 2:
                return this.K;
            case 3:
                return this.L;
            case 4:
                return this.M;
            case 5:
                return this.N;
            case 6:
                return this.Q;
            case 7:
                return this.O;
            case 8:
                return this.P;
            case 9:
                return null;
            default:
                throw new AssertionError(dVar.name());
        }
    }

    public final int m() {
        return A() + this.X;
    }

    public final g n(int i13) {
        if (i13 == 0) {
            return this.U[0];
        }
        if (i13 == 1) {
            return this.U[1];
        }
        return null;
    }

    public final int o() {
        if (this.f120213i0 == 8) {
            return 0;
        }
        return this.X;
    }

    public final int p() {
        return this.H;
    }

    public final int q() {
        return this.I;
    }

    public final h r(int i13) {
        e eVar;
        e eVar2;
        if (i13 != 0) {
            if (i13 == 1 && (eVar2 = (eVar = this.M).f120189f) != null && eVar2.f120189f == eVar) {
                return eVar2.f120187d;
            }
            return null;
        }
        e eVar3 = this.L;
        e eVar4 = eVar3.f120189f;
        if (eVar4 == null || eVar4.f120189f != eVar3) {
            return null;
        }
        return eVar4.f120187d;
    }

    public final h s(int i13) {
        e eVar;
        e eVar2;
        if (i13 != 0) {
            if (i13 == 1 && (eVar2 = (eVar = this.K).f120189f) != null && eVar2.f120189f == eVar) {
                return eVar2.f120187d;
            }
            return null;
        }
        e eVar3 = this.f120195J;
        e eVar4 = eVar3.f120189f;
        if (eVar4 == null || eVar4.f120189f != eVar3) {
            return null;
        }
        return eVar4.f120187d;
    }

    public final int t() {
        return z() + this.W;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f120219l0 != null ? a.a.p(new StringBuilder("type: "), this.f120219l0, " ") : "");
        sb3.append(this.f120217k0 != null ? a.a.p(new StringBuilder("id: "), this.f120217k0, " ") : "");
        sb3.append("(");
        sb3.append(this.f120197a0);
        sb3.append(", ");
        sb3.append(this.f120199b0);
        sb3.append(") - (");
        sb3.append(this.W);
        sb3.append(" x ");
        return a.a.n(sb3, this.X, ")");
    }

    public void u(StringBuilder sb3) {
        sb3.append("  " + this.f120214j + ":{\n");
        StringBuilder sb4 = new StringBuilder("    actualWidth:");
        sb4.append(this.W);
        sb3.append(sb4.toString());
        sb3.append("\n");
        sb3.append("    actualHeight:" + this.X);
        sb3.append("\n");
        sb3.append("    actualLeft:" + this.f120197a0);
        sb3.append("\n");
        sb3.append("    actualTop:" + this.f120199b0);
        sb3.append("\n");
        w(sb3, "left", this.f120195J);
        w(sb3, "top", this.K);
        w(sb3, "right", this.L);
        w(sb3, "bottom", this.M);
        w(sb3, "baseline", this.N);
        w(sb3, "centerX", this.O);
        w(sb3, "centerY", this.P);
        int i13 = this.W;
        int i14 = this.f120203d0;
        int i15 = this.C[0];
        int i16 = this.f120236u;
        int i17 = this.f120230r;
        float f13 = this.f120239w;
        float[] fArr = this.f120225o0;
        float f14 = fArr[0];
        v(sb3, "    width", i13, i14, i15, i16, i17, f13);
        int i18 = this.X;
        int i19 = this.f120205e0;
        int i23 = this.C[1];
        int i24 = this.f120240x;
        int i25 = this.f120232s;
        float f15 = this.f120242z;
        float f16 = fArr[1];
        v(sb3, "    height", i18, i19, i23, i24, i25, f15);
        float f17 = this.Y;
        int i26 = this.Z;
        if (f17 != 0.0f) {
            sb3.append("    dimensionRatio");
            sb3.append(" :  [");
            sb3.append(f17);
            sb3.append(",");
            sb3.append(i26);
            sb3.append("");
            sb3.append("],\n");
        }
        Q(sb3, "    horizontalBias", this.f120207f0, 0.5f);
        Q(sb3, "    verticalBias", this.f120209g0, 0.5f);
        P(this.f120221m0, 0, "    horizontalChainStyle", sb3);
        P(this.f120223n0, 0, "    verticalChainStyle", sb3);
        sb3.append("  }");
    }

    public final int x() {
        int i13 = this.f120195J != null ? this.K.f120190g : 0;
        return this.L != null ? i13 + this.M.f120190g : i13;
    }

    public final int y() {
        if (this.f120213i0 == 8) {
            return 0;
        }
        return this.W;
    }

    public final int z() {
        h hVar = this.V;
        return (hVar == null || !(hVar instanceof i)) ? this.f120197a0 : ((i) hVar).C0 + this.f120197a0;
    }
}
