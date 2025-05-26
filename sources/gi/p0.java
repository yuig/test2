package gi;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class p0 extends b0 {

    /* renamed from: d, reason: collision with root package name */
    public final transient Object f65105d;

    public p0(Object obj) {
        this.f65105d = obj;
    }

    @Override // gi.u
    public final int b(Object[] objArr) {
        objArr[0] = this.f65105d;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f65105d.equals(obj);
    }

    @Override // gi.u
    public final r0 e() {
        return new g0(this.f65105d);
    }

    @Override // gi.b0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f65105d.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new g0(this.f65105d);
    }

    @Override // gi.b0
    public final z n() {
        Object[] objArr = {this.f65105d};
        for (int i13 = 0; i13 < 1; i13++) {
            v vVar = z.f65142b;
            if (objArr[i13] == null) {
                throw new NullPointerException(a.a.d("at index ", i13));
            }
        }
        return z.l(1, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return a.a.k("[", this.f65105d.toString(), "]");
    }
}
