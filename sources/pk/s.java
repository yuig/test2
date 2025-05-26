package pk;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public class s extends q implements List {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f100477f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(d dVar, Object obj, List list, q qVar) {
        super(dVar, obj, list, qVar);
        this.f100477f = dVar;
    }

    @Override // java.util.List
    public final void add(int i13, Object obj) {
        c();
        boolean isEmpty = this.f100469b.isEmpty();
        ((List) this.f100469b).add(i13, obj);
        this.f100477f.f100376e++;
        if (isEmpty) {
            b();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i13, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f100469b).addAll(i13, collection);
        if (addAll) {
            this.f100477f.f100376e += this.f100469b.size() - size;
            if (size == 0) {
                b();
            }
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object get(int i13) {
        c();
        return ((List) this.f100469b).get(i13);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        c();
        return ((List) this.f100469b).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        c();
        return ((List) this.f100469b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        c();
        return new r(this);
    }

    @Override // java.util.List
    public final Object remove(int i13) {
        c();
        Object remove = ((List) this.f100469b).remove(i13);
        d dVar = this.f100477f;
        dVar.f100376e--;
        d();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i13, Object obj) {
        c();
        return ((List) this.f100469b).set(i13, obj);
    }

    @Override // java.util.List
    public final List subList(int i13, int i14) {
        c();
        List subList = ((List) this.f100469b).subList(i13, i14);
        q qVar = this.f100470c;
        if (qVar == null) {
            qVar = this;
        }
        d dVar = this.f100477f;
        dVar.getClass();
        boolean z13 = subList instanceof RandomAccess;
        Object obj = this.f100468a;
        return z13 ? new n(dVar, obj, subList, qVar) : new s(dVar, obj, subList, qVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i13) {
        c();
        return new r(this, i13);
    }
}
