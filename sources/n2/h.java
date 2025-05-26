package n2;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class h extends a {

    /* renamed from: a, reason: collision with root package name */
    public final f f88945a;

    public h(f fVar) {
        this.f88945a = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.collections.q
    public final int b() {
        return this.f88945a.d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f88945a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new i(this.f88945a);
    }
}
