package n2;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class j extends kotlin.collections.q {

    /* renamed from: a, reason: collision with root package name */
    public final f f88947a;

    public j(f fVar) {
        this.f88947a = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.collections.q
    public final int b() {
        return this.f88947a.d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f88947a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f88947a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        s[] sVarArr = new s[8];
        for (int i13 = 0; i13 < 8; i13++) {
            sVarArr[i13] = new u();
        }
        return new k(this.f88947a, sVarArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        f fVar = this.f88947a;
        if (!fVar.containsKey(obj)) {
            return false;
        }
        fVar.remove(obj);
        return true;
    }
}
