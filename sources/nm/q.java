package nm;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class q extends s implements Iterable {

    /* renamed from: a */
    public final ArrayList f91364a = new ArrayList();

    @Override // nm.s
    public final boolean b() {
        return v().b();
    }

    @Override // nm.s
    public final double c() {
        return v().c();
    }

    @Override // nm.s
    public final float d() {
        return v().d();
    }

    @Override // nm.s
    public final int e() {
        return v().e();
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof q) && ((q) obj).f91364a.equals(this.f91364a));
    }

    public final int hashCode() {
        return this.f91364a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f91364a.iterator();
    }

    @Override // nm.s
    public final long l() {
        return v().l();
    }

    @Override // nm.s
    public final Number n() {
        return v().n();
    }

    @Override // nm.s
    public final String p() {
        return v().p();
    }

    public final void r(Number number) {
        this.f91364a.add(new v(number));
    }

    public final void s(String str) {
        this.f91364a.add(str == null ? t.f91365a : new v(str));
    }

    public final void t(s sVar) {
        if (sVar == null) {
            sVar = t.f91365a;
        }
        this.f91364a.add(sVar);
    }

    public final s u(int i13) {
        return (s) this.f91364a.get(i13);
    }

    public final s v() {
        ArrayList arrayList = this.f91364a;
        int size = arrayList.size();
        if (size == 1) {
            return (s) arrayList.get(0);
        }
        throw new IllegalStateException(a.a.d("Array must have size 1, but has size ", size));
    }
}
