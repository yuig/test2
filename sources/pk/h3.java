package pk;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* loaded from: classes3.dex */
public final class h3 extends g3 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f100405a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f100405a.iterator();
        it.getClass();
        ok.w wVar = this.f100406b;
        wVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (wVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new h3(((SortedSet) this.f100405a).headSet(obj), this.f100406b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.f100405a;
        while (true) {
            Object last = sortedSet.last();
            if (this.f100406b.apply(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new h3(((SortedSet) this.f100405a).subSet(obj, obj2), this.f100406b);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new h3(((SortedSet) this.f100405a).tailSet(obj), this.f100406b);
    }
}
