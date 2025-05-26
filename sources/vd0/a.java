package vd0;

import df.j1;
import java.util.ArrayList;
import java.util.Iterator;
import nm.q;
import nm.s;
import nm.t;
import nm.u;

/* loaded from: classes.dex */
public final class a implements Iterable {

    /* renamed from: a */
    public final q f125618a;

    public a() {
        this.f125618a = new q();
    }

    public final c b(int i13) {
        q qVar = this.f125618a;
        if (qVar == null || qVar.f91364a.size() <= i13 || qVar.u(i13) == null) {
            return null;
        }
        s u13 = qVar.u(i13);
        u13.getClass();
        if (u13 instanceof u) {
            return new c((u) qVar.u(i13));
        }
        return null;
    }

    public final String c(String str) {
        q qVar = this.f125618a;
        if (qVar == null) {
            return null;
        }
        ArrayList arrayList = qVar.f91364a;
        if (arrayList.size() <= 0) {
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            sb3.append(qVar.u(i13));
            if (i13 < size - 1) {
                sb3.append(str);
            }
        }
        return sb3.toString();
    }

    public final int d() {
        q qVar = this.f125618a;
        if (qVar == null) {
            return 0;
        }
        return qVar.f91364a.size();
    }

    public final Float e(int i13) {
        return Float.valueOf(this.f125618a.u(i13).d());
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof a) && ((a) obj).f125618a.equals(this.f125618a));
    }

    public final int f(int i13) {
        return this.f125618a.u(i13).e();
    }

    public final int hashCode() {
        return this.f125618a.f91364a.hashCode();
    }

    public final a i(int i13) {
        q qVar = this.f125618a;
        if (qVar == null || qVar.f91364a.size() <= i13 || qVar.u(i13) == null) {
            return null;
        }
        s u13 = qVar.u(i13);
        u13.getClass();
        if (u13 instanceof q) {
            return new a(qVar.u(i13).f());
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f125618a.f91364a.iterator();
        while (it.hasNext()) {
            s sVar = (s) it.next();
            sVar.getClass();
            if (sVar instanceof u) {
                arrayList.add(new c((u) sVar));
            }
        }
        return arrayList.iterator();
    }

    public final c j(int i13) {
        q qVar = this.f125618a;
        if (qVar != null && qVar.f91364a.size() > i13 && qVar.u(i13) != null) {
            s u13 = qVar.u(i13);
            u13.getClass();
            if (u13 instanceof u) {
                return new c((u) qVar.u(i13));
            }
        }
        return new c();
    }

    public final String l(int i13) {
        q qVar = this.f125618a;
        s u13 = qVar.u(i13);
        u13.getClass();
        if (u13 instanceof t) {
            return null;
        }
        return qVar.u(i13).p();
    }

    public final String toString() {
        return this.f125618a.toString();
    }

    public a(String str) {
        this.f125618a = j1.p1(str).f();
    }

    public a(q qVar) {
        this.f125618a = qVar;
    }
}
