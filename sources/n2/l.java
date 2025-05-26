package n2;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class l extends kotlin.collections.n {

    /* renamed from: a, reason: collision with root package name */
    public final f f88948a;

    public l(f fVar) {
        this.f88948a = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.collections.n
    public final int b() {
        return this.f88948a.d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f88948a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f88948a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        s[] sVarArr = new s[8];
        for (int i13 = 0; i13 < 8; i13++) {
            sVarArr[i13] = new w();
        }
        return new k(this.f88948a, sVarArr);
    }
}
