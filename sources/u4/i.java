package u4;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import kh2.c3;
import v4.u;

/* loaded from: classes.dex */
public final class i extends s {
    public boolean A0;
    public final s4.d B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public b[] G0;
    public b[] H0;
    public int I0;
    public boolean J0;
    public boolean K0;
    public WeakReference L0;
    public WeakReference M0;
    public WeakReference N0;
    public WeakReference O0;
    public final HashSet P0;
    public final v4.b Q0;

    /* renamed from: w0, reason: collision with root package name */
    public final x92.b f120243w0;

    /* renamed from: x0, reason: collision with root package name */
    public final v4.f f120244x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f120245y0;

    /* renamed from: z0, reason: collision with root package name */
    public v4.c f120246z0;

    public i() {
        this.f120284v0 = new ArrayList();
        this.f120243w0 = new x92.b(this);
        v4.f fVar = new v4.f();
        fVar.f123981a = true;
        fVar.f123982b = true;
        fVar.f123985e = new ArrayList();
        fVar.f123986f = new ArrayList();
        fVar.f123988h = null;
        fVar.f123989i = new v4.b();
        fVar.f123987g = new ArrayList();
        fVar.f123983c = this;
        fVar.f123984d = this;
        this.f120244x0 = fVar;
        this.f120246z0 = null;
        this.A0 = false;
        this.B0 = new s4.d();
        this.E0 = 0;
        this.F0 = 0;
        this.G0 = new b[4];
        this.H0 = new b[4];
        this.I0 = RecyclerViewTypes.VIEW_TYPE_COMMENT_STICKER;
        this.J0 = false;
        this.K0 = false;
        this.L0 = null;
        this.M0 = null;
        this.N0 = null;
        this.O0 = null;
        this.P0 = new HashSet();
        this.Q0 = new v4.b();
    }

    public static void m0(h hVar, v4.c cVar, v4.b bVar) {
        int i13;
        int i14;
        if (cVar == null) {
            return;
        }
        if (hVar.f120213i0 == 8 || (hVar instanceof m) || (hVar instanceof a)) {
            bVar.f123973e = 0;
            bVar.f123974f = 0;
            return;
        }
        g[] gVarArr = hVar.U;
        bVar.f123969a = gVarArr[0];
        bVar.f123970b = gVarArr[1];
        bVar.f123971c = hVar.y();
        bVar.f123972d = hVar.o();
        bVar.f123977i = false;
        bVar.f123978j = 0;
        g gVar = bVar.f123969a;
        g gVar2 = g.MATCH_CONSTRAINT;
        boolean z13 = gVar == gVar2;
        boolean z14 = bVar.f123970b == gVar2;
        boolean z15 = z13 && hVar.Y > 0.0f;
        boolean z16 = z14 && hVar.Y > 0.0f;
        if (z13 && hVar.B(0) && hVar.f120230r == 0 && !z15) {
            bVar.f123969a = g.WRAP_CONTENT;
            if (z14 && hVar.f120232s == 0) {
                bVar.f123969a = g.FIXED;
            }
            z13 = false;
        }
        if (z14 && hVar.B(1) && hVar.f120232s == 0 && !z16) {
            bVar.f123970b = g.WRAP_CONTENT;
            if (z13 && hVar.f120230r == 0) {
                bVar.f123970b = g.FIXED;
            }
            z14 = false;
        }
        if (hVar.J()) {
            bVar.f123969a = g.FIXED;
            z13 = false;
        }
        if (hVar.K()) {
            bVar.f123970b = g.FIXED;
            z14 = false;
        }
        int[] iArr = hVar.f120234t;
        if (z15) {
            if (iArr[0] == 4) {
                bVar.f123969a = g.FIXED;
            } else if (!z14) {
                g gVar3 = bVar.f123970b;
                g gVar4 = g.FIXED;
                if (gVar3 == gVar4) {
                    i14 = bVar.f123972d;
                } else {
                    bVar.f123969a = g.WRAP_CONTENT;
                    ((androidx.constraintlayout.widget.f) cVar).b(hVar, bVar);
                    i14 = bVar.f123974f;
                }
                bVar.f123969a = gVar4;
                bVar.f123971c = (int) (hVar.Y * i14);
            }
        }
        if (z16) {
            if (iArr[1] == 4) {
                bVar.f123970b = g.FIXED;
            } else if (!z13) {
                g gVar5 = bVar.f123969a;
                g gVar6 = g.FIXED;
                if (gVar5 == gVar6) {
                    i13 = bVar.f123971c;
                } else {
                    bVar.f123970b = g.WRAP_CONTENT;
                    ((androidx.constraintlayout.widget.f) cVar).b(hVar, bVar);
                    i13 = bVar.f123973e;
                }
                bVar.f123970b = gVar6;
                if (hVar.Z == -1) {
                    bVar.f123972d = (int) (i13 / hVar.Y);
                } else {
                    bVar.f123972d = (int) (hVar.Y * i13);
                }
            }
        }
        ((androidx.constraintlayout.widget.f) cVar).b(hVar, bVar);
        hVar.b0(bVar.f123973e);
        hVar.W(bVar.f123974f);
        hVar.E = bVar.f123976h;
        hVar.R(bVar.f123975g);
        bVar.f123978j = 0;
    }

    @Override // u4.s, u4.h
    public final void L() {
        this.B0.w();
        this.C0 = 0;
        this.D0 = 0;
        super.L();
    }

    @Override // u4.h
    public final void d0(boolean z13, boolean z14) {
        super.d0(z13, z14);
        int size = this.f120284v0.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((h) this.f120284v0.get(i13)).d0(z13, z14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:200:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x06a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0828  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0842 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x08dc  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0930  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0931 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:312:0x08ea  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0804  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0940  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x063a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:604:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:618:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x0664  */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v13 */
    @Override // u4.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f0() {
        /*
            Method dump skipped, instructions count: 2382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.i.f0():void");
    }

    public final void h0(int i13, h hVar) {
        if (i13 == 0) {
            int i14 = this.E0 + 1;
            b[] bVarArr = this.H0;
            if (i14 >= bVarArr.length) {
                this.H0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.H0;
            int i15 = this.E0;
            bVarArr2[i15] = new b(hVar, 0, this.A0);
            this.E0 = i15 + 1;
            return;
        }
        if (i13 == 1) {
            int i16 = this.F0 + 1;
            b[] bVarArr3 = this.G0;
            if (i16 >= bVarArr3.length) {
                this.G0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.G0;
            int i17 = this.F0;
            bVarArr4[i17] = new b(hVar, 1, this.A0);
            this.F0 = i17 + 1;
        }
    }

    public final void i0(s4.d dVar) {
        boolean n03 = n0(64);
        c(dVar, n03);
        int size = this.f120284v0.size();
        boolean z13 = false;
        for (int i13 = 0; i13 < size; i13++) {
            h hVar = (h) this.f120284v0.get(i13);
            boolean[] zArr = hVar.T;
            zArr[0] = false;
            zArr[1] = false;
            if (hVar instanceof a) {
                z13 = true;
            }
        }
        if (z13) {
            for (int i14 = 0; i14 < size; i14++) {
                h hVar2 = (h) this.f120284v0.get(i14);
                if (hVar2 instanceof a) {
                    ((a) hVar2).j0();
                }
            }
        }
        HashSet hashSet = this.P0;
        hashSet.clear();
        for (int i15 = 0; i15 < size; i15++) {
            h hVar3 = (h) this.f120284v0.get(i15);
            hVar3.getClass();
            boolean z14 = hVar3 instanceof r;
            if (z14 || (hVar3 instanceof m)) {
                if (z14) {
                    hashSet.add(hVar3);
                } else {
                    hVar3.c(dVar, n03);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                r rVar = (r) ((h) it.next());
                if (rVar.h0(hashSet)) {
                    rVar.c(dVar, n03);
                    hashSet.remove(rVar);
                    break;
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((h) it2.next()).c(dVar, n03);
                }
                hashSet.clear();
            }
        }
        if (s4.d.f111074p) {
            HashSet hashSet2 = new HashSet();
            for (int i16 = 0; i16 < size; i16++) {
                h hVar4 = (h) this.f120284v0.get(i16);
                hVar4.getClass();
                if (!(hVar4 instanceof r) && !(hVar4 instanceof m)) {
                    hashSet2.add(hVar4);
                }
            }
            b(this, dVar, hashSet2, this.U[0] == g.WRAP_CONTENT ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                h hVar5 = (h) it3.next();
                p.a(this, dVar, hVar5);
                hVar5.c(dVar, n03);
            }
        } else {
            for (int i17 = 0; i17 < size; i17++) {
                h hVar6 = (h) this.f120284v0.get(i17);
                if (hVar6 instanceof i) {
                    g[] gVarArr = hVar6.U;
                    g gVar = gVarArr[0];
                    g gVar2 = gVarArr[1];
                    g gVar3 = g.WRAP_CONTENT;
                    if (gVar == gVar3) {
                        hVar6.X(g.FIXED);
                    }
                    if (gVar2 == gVar3) {
                        hVar6.a0(g.FIXED);
                    }
                    hVar6.c(dVar, n03);
                    if (gVar == gVar3) {
                        hVar6.X(gVar);
                    }
                    if (gVar2 == gVar3) {
                        hVar6.a0(gVar2);
                    }
                } else {
                    p.a(this, dVar, hVar6);
                    if (!(hVar6 instanceof r) && !(hVar6 instanceof m)) {
                        hVar6.c(dVar, n03);
                    }
                }
            }
        }
        if (this.E0 > 0) {
            c3.k(this, dVar, null, 0);
        }
        if (this.F0 > 0) {
            c3.k(this, dVar, null, 1);
        }
    }

    public final void j0(e eVar) {
        WeakReference weakReference = this.O0;
        if (weakReference == null || weakReference.get() == null || eVar.d() > ((e) this.O0.get()).d()) {
            this.O0 = new WeakReference(eVar);
        }
    }

    public final void k0(e eVar) {
        WeakReference weakReference = this.M0;
        if (weakReference == null || weakReference.get() == null || eVar.d() > ((e) this.M0.get()).d()) {
            this.M0 = new WeakReference(eVar);
        }
    }

    public final boolean l0(int i13, boolean z13) {
        boolean z14;
        g gVar;
        boolean z15 = true;
        boolean z16 = z13 & true;
        v4.f fVar = this.f120244x0;
        i iVar = (i) fVar.f123983c;
        g n13 = iVar.n(0);
        g n14 = iVar.n(1);
        int z17 = iVar.z();
        int A = iVar.A();
        Object obj = fVar.f123985e;
        if (z16 && (n13 == (gVar = g.WRAP_CONTENT) || n14 == gVar)) {
            Iterator it = ((ArrayList) obj).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                u uVar = (u) it.next();
                if (uVar.f124023f == i13 && !uVar.k()) {
                    z16 = false;
                    break;
                }
            }
            if (i13 == 0) {
                if (z16 && n13 == g.WRAP_CONTENT) {
                    iVar.X(g.FIXED);
                    iVar.b0(fVar.e(iVar, 0));
                    iVar.f120202d.f124022e.d(iVar.y());
                }
            } else if (z16 && n14 == g.WRAP_CONTENT) {
                iVar.a0(g.FIXED);
                iVar.W(fVar.e(iVar, 1));
                iVar.f120204e.f124022e.d(iVar.o());
            }
        }
        if (i13 == 0) {
            g gVar2 = iVar.U[0];
            if (gVar2 == g.FIXED || gVar2 == g.MATCH_PARENT) {
                int y13 = iVar.y() + z17;
                iVar.f120202d.f124026i.d(y13);
                iVar.f120202d.f124022e.d(y13 - z17);
                z14 = true;
            }
            z14 = false;
        } else {
            g gVar3 = iVar.U[1];
            if (gVar3 == g.FIXED || gVar3 == g.MATCH_PARENT) {
                int o13 = iVar.o() + A;
                iVar.f120204e.f124026i.d(o13);
                iVar.f120204e.f124022e.d(o13 - A);
                z14 = true;
            }
            z14 = false;
        }
        fVar.i();
        ArrayList arrayList = (ArrayList) obj;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            u uVar2 = (u) it2.next();
            if (uVar2.f124023f == i13 && (uVar2.f124019b != iVar || uVar2.f124024g)) {
                uVar2.e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            u uVar3 = (u) it3.next();
            if (uVar3.f124023f == i13 && (z14 || uVar3.f124019b != iVar)) {
                if (!uVar3.f124025h.f123999j || !uVar3.f124026i.f123999j || (!(uVar3 instanceof v4.d) && !uVar3.f124022e.f123999j)) {
                    z15 = false;
                    break;
                }
            }
        }
        iVar.X(n13);
        iVar.a0(n14);
        return z15;
    }

    public final boolean n0(int i13) {
        return (this.I0 & i13) == i13;
    }

    @Override // u4.h
    public final void u(StringBuilder sb3) {
        sb3.append(this.f120214j + ":{\n");
        StringBuilder sb4 = new StringBuilder("  actualWidth:");
        sb4.append(this.W);
        sb3.append(sb4.toString());
        sb3.append("\n");
        sb3.append("  actualHeight:" + this.X);
        sb3.append("\n");
        Iterator it = this.f120284v0.iterator();
        while (it.hasNext()) {
            ((h) it.next()).u(sb3);
            sb3.append(",\n");
        }
        sb3.append("}");
    }
}
