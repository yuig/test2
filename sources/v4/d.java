package v4;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class d extends u {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f123979k;

    /* renamed from: l, reason: collision with root package name */
    public int f123980l;

    public d(int i13, u4.h hVar) {
        super(hVar);
        u4.h hVar2;
        this.f123979k = new ArrayList();
        this.f124023f = i13;
        u4.h hVar3 = this.f124019b;
        u4.h s13 = hVar3.s(i13);
        while (true) {
            hVar2 = hVar3;
            hVar3 = s13;
            if (hVar3 == null) {
                break;
            } else {
                s13 = hVar3.s(this.f124023f);
            }
        }
        this.f124019b = hVar2;
        int i14 = this.f124023f;
        u uVar = i14 == 0 ? hVar2.f120202d : i14 == 1 ? hVar2.f120204e : null;
        ArrayList arrayList = this.f123979k;
        arrayList.add(uVar);
        u4.h r13 = hVar2.r(this.f124023f);
        while (r13 != null) {
            int i15 = this.f124023f;
            arrayList.add(i15 == 0 ? r13.f120202d : i15 == 1 ? r13.f120204e : null);
            r13 = r13.r(this.f124023f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u uVar2 = (u) it.next();
            int i16 = this.f124023f;
            if (i16 == 0) {
                uVar2.f124019b.f120198b = this;
            } else if (i16 == 1) {
                uVar2.f124019b.f120200c = this;
            }
        }
        if (this.f124023f == 0 && ((u4.i) this.f124019b.V).A0 && arrayList.size() > 1) {
            this.f124019b = ((u) ep.b.h(arrayList, 1)).f124019b;
        }
        this.f123980l = this.f124023f == 0 ? this.f124019b.f120221m0 : this.f124019b.f120223n0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:291:0x03ae, code lost:
    
        r2 = r2 - r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00db  */
    @Override // v4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(v4.e r27) {
        /*
            Method dump skipped, instructions count: 973
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.d.a(v4.e):void");
    }

    @Override // v4.u
    public final void d() {
        ArrayList arrayList = this.f123979k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((u) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        u4.h hVar = ((u) arrayList.get(0)).f124019b;
        u4.h hVar2 = ((u) arrayList.get(size - 1)).f124019b;
        int i13 = this.f124023f;
        h hVar3 = this.f124026i;
        h hVar4 = this.f124025h;
        if (i13 == 0) {
            u4.e eVar = hVar.f120195J;
            u4.e eVar2 = hVar2.L;
            h i14 = u.i(eVar, 0);
            int e13 = eVar.e();
            u4.h m13 = m();
            if (m13 != null) {
                e13 = m13.f120195J.e();
            }
            if (i14 != null) {
                u.b(hVar4, i14, e13);
            }
            h i15 = u.i(eVar2, 0);
            int e14 = eVar2.e();
            u4.h n13 = n();
            if (n13 != null) {
                e14 = n13.L.e();
            }
            if (i15 != null) {
                u.b(hVar3, i15, -e14);
            }
        } else {
            u4.e eVar3 = hVar.K;
            u4.e eVar4 = hVar2.M;
            h i16 = u.i(eVar3, 1);
            int e15 = eVar3.e();
            u4.h m14 = m();
            if (m14 != null) {
                e15 = m14.K.e();
            }
            if (i16 != null) {
                u.b(hVar4, i16, e15);
            }
            h i17 = u.i(eVar4, 1);
            int e16 = eVar4.e();
            u4.h n14 = n();
            if (n14 != null) {
                e16 = n14.M.e();
            }
            if (i17 != null) {
                u.b(hVar3, i17, -e16);
            }
        }
        hVar4.f123990a = this;
        hVar3.f123990a = this;
    }

    @Override // v4.u
    public final void e() {
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f123979k;
            if (i13 >= arrayList.size()) {
                return;
            }
            ((u) arrayList.get(i13)).e();
            i13++;
        }
    }

    @Override // v4.u
    public final void f() {
        this.f124020c = null;
        Iterator it = this.f123979k.iterator();
        while (it.hasNext()) {
            ((u) it.next()).f();
        }
    }

    @Override // v4.u
    public final long j() {
        ArrayList arrayList = this.f123979k;
        int size = arrayList.size();
        long j13 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            j13 = r5.f124026i.f123995f + ((u) arrayList.get(i13)).j() + j13 + r5.f124025h.f123995f;
        }
        return j13;
    }

    @Override // v4.u
    public final boolean k() {
        ArrayList arrayList = this.f123979k;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (!((u) arrayList.get(i13)).k()) {
                return false;
            }
        }
        return true;
    }

    public final u4.h m() {
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f123979k;
            if (i13 >= arrayList.size()) {
                return null;
            }
            u4.h hVar = ((u) arrayList.get(i13)).f124019b;
            if (hVar.f120213i0 != 8) {
                return hVar;
            }
            i13++;
        }
    }

    public final u4.h n() {
        ArrayList arrayList = this.f123979k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u4.h hVar = ((u) arrayList.get(size)).f124019b;
            if (hVar.f120213i0 != 8) {
                return hVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ChainRun ");
        sb3.append(this.f124023f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.f123979k.iterator();
        while (it.hasNext()) {
            u uVar = (u) it.next();
            sb3.append("<");
            sb3.append(uVar);
            sb3.append("> ");
        }
        return sb3.toString();
    }
}
