package zm2;

import androidx.datastore.preferences.protobuf.a2;
import androidx.datastore.preferences.protobuf.z1;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class k0 extends AbstractList implements RandomAccess, y {

    /* renamed from: a, reason: collision with root package name */
    public final y f142234a;

    public k0(y yVar) {
        this.f142234a = yVar;
    }

    @Override // zm2.y
    public final void A1(z zVar) {
        throw new UnsupportedOperationException();
    }

    @Override // zm2.y
    public final g E0(int i13) {
        return this.f142234a.E0(i13);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        return (String) this.f142234a.get(i13);
    }

    @Override // zm2.y
    public final List h() {
        return this.f142234a.h();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new a2(this);
    }

    @Override // zm2.y
    public final k0 k() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i13) {
        return new z1(this, i13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f142234a.size();
    }
}
